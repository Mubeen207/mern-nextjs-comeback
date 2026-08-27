package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class k90 implements hu0 {
    public static Method G;
    public static Method H;
    public Runnable A;
    public final Handler B;
    public Rect D;
    public boolean E;
    public PopupWindow F;
    public Context a;
    public ListAdapter b;
    public xm c;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public boolean k;
    public View p;
    public DataSetObserver r;
    public View s;
    public Drawable t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public int d = -2;
    public int e = -2;
    public int h = 1002;
    public int l = 0;
    public boolean m = false;
    public boolean n = false;
    public int o = Integer.MAX_VALUE;
    public int q = 0;
    public final i w = new i();
    public final h x = new h();
    public final g y = new g();
    public final e z = new e();
    public final Rect C = new Rect();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View h = k90.this.h();
            if (h == null || h.getWindowToken() == null) {
                return;
            }
            k90.this.a();
        }
    }

    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            xm xmVar;
            if (i == -1 || (xmVar = k90.this.c) == null) {
                return;
            }
            xmVar.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k90.this.f();
        }
    }

    /* loaded from: classes.dex */
    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (k90.this.i()) {
                k90.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            k90.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || k90.this.m() || k90.this.F.getContentView() == null) {
                return;
            }
            k90 k90Var = k90.this;
            k90Var.B.removeCallbacks(k90Var.w);
            k90.this.w.run();
        }
    }

    /* loaded from: classes.dex */
    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = k90.this.F) != null && popupWindow.isShowing() && x >= 0 && x < k90.this.F.getWidth() && y >= 0 && y < k90.this.F.getHeight()) {
                k90 k90Var = k90.this;
                k90Var.B.postDelayed(k90Var.w, 250L);
                return false;
            } else if (action == 1) {
                k90 k90Var2 = k90.this;
                k90Var2.B.removeCallbacks(k90Var2.w);
                return false;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xm xmVar = k90.this.c;
            if (xmVar == null || !xmVar.isAttachedToWindow() || k90.this.c.getCount() <= k90.this.c.getChildCount()) {
                return;
            }
            int childCount = k90.this.c.getChildCount();
            k90 k90Var = k90.this;
            if (childCount <= k90Var.o) {
                k90Var.F.setInputMethodMode(2);
                k90.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public k90(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pn0.G0, i2, i3);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(pn0.H0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(pn0.I0, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        g3 g3Var = new g3(context, attributeSet, i2, i3);
        this.F = g3Var;
        g3Var.setInputMethodMode(1);
    }

    public void A(boolean z) {
        this.k = true;
        this.j = z;
    }

    public final void B(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.F, z);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    public void C(int i2) {
        this.g = i2;
        this.i = true;
    }

    public void D(int i2) {
        this.e = i2;
    }

    @Override // androidx.appcompat.view.menu.hu0
    public void a() {
        int e2 = e();
        boolean m = m();
        mj0.b(this.F, this.h);
        boolean z = true;
        if (this.F.isShowing()) {
            if (h().isAttachedToWindow()) {
                int i2 = this.e;
                if (i2 == -1) {
                    i2 = -1;
                } else if (i2 == -2) {
                    i2 = h().getWidth();
                }
                int i3 = this.d;
                if (i3 == -1) {
                    if (!m) {
                        e2 = -1;
                    }
                    if (m) {
                        this.F.setWidth(this.e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i3 != -2) {
                    e2 = i3;
                }
                PopupWindow popupWindow = this.F;
                if (this.n || this.m) {
                    z = false;
                }
                popupWindow.setOutsideTouchable(z);
                this.F.update(h(), this.f, this.g, i2 < 0 ? -1 : i2, e2 < 0 ? -1 : e2);
                return;
            }
            return;
        }
        int i4 = this.e;
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = h().getWidth();
        }
        int i5 = this.d;
        if (i5 == -1) {
            e2 = -1;
        } else if (i5 != -2) {
            e2 = i5;
        }
        this.F.setWidth(i4);
        this.F.setHeight(e2);
        B(true);
        this.F.setOutsideTouchable((this.n || this.m) ? false : true);
        this.F.setTouchInterceptor(this.x);
        if (this.k) {
            mj0.a(this.F, this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception unused) {
                }
            }
        } else {
            d.a(this.F, this.D);
        }
        mj0.c(this.F, h(), this.f, this.g, this.l);
        this.c.setSelection(-1);
        if (!this.E || this.c.isInTouchMode()) {
            f();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.z);
    }

    @Override // androidx.appcompat.view.menu.hu0
    public ListView d() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.hu0
    public void dismiss() {
        this.F.dismiss();
        o();
        this.F.setContentView(null);
        this.c = null;
        this.B.removeCallbacks(this.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int e() {
        int i2;
        int i3;
        int makeMeasureSpec;
        int i4;
        if (this.c == null) {
            Context context = this.a;
            this.A = new a();
            xm g2 = g(context, !this.E);
            this.c = g2;
            Drawable drawable = this.t;
            if (drawable != null) {
                g2.setSelector(drawable);
            }
            this.c.setAdapter(this.b);
            this.c.setOnItemClickListener(this.u);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new b());
            this.c.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            xm xmVar = this.c;
            View view = this.p;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.q;
                if (i5 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(xmVar, layoutParams);
                } else if (i5 != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid hint position ");
                    sb.append(this.q);
                } else {
                    linearLayout.addView(xmVar, layoutParams);
                    linearLayout.addView(view);
                }
                int i6 = this.e;
                if (i6 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i4 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i6, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i2 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                xmVar = linearLayout;
            } else {
                i2 = 0;
            }
            this.F.setContentView(xmVar);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.F.getContentView();
            View view2 = this.p;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i2 = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i7 = rect.top;
            i3 = rect.bottom + i7;
            if (!this.i) {
                this.g = -i7;
            }
        } else {
            this.C.setEmpty();
            i3 = 0;
        }
        int k = k(h(), this.g, this.F.getInputMethodMode() == 2);
        if (this.m || this.d == -1) {
            return k + i3;
        }
        int i8 = this.e;
        if (i8 == -2) {
            int i9 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i8 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else {
            int i10 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), 1073741824);
        }
        int d2 = this.c.d(makeMeasureSpec, 0, -1, k - i2, -1);
        if (d2 > 0) {
            i2 += i3 + this.c.getPaddingTop() + this.c.getPaddingBottom();
        }
        return d2 + i2;
    }

    public void f() {
        xm xmVar = this.c;
        if (xmVar != null) {
            xmVar.setListSelectionHidden(true);
            xmVar.requestLayout();
        }
    }

    public abstract xm g(Context context, boolean z);

    public View h() {
        return this.s;
    }

    @Override // androidx.appcompat.view.menu.hu0
    public boolean i() {
        return this.F.isShowing();
    }

    public int j() {
        return this.f;
    }

    public final int k(View view, int i2, boolean z) {
        return c.a(this.F, view, i2, z);
    }

    public int l() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public boolean m() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean n() {
        return this.E;
    }

    public final void o() {
        View view = this.p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.p);
            }
        }
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.r;
        if (dataSetObserver == null) {
            this.r = new f();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.r);
        }
        xm xmVar = this.c;
        if (xmVar != null) {
            xmVar.setAdapter(this.b);
        }
    }

    public void q(View view) {
        this.s = view;
    }

    public void r(int i2) {
        this.F.setAnimationStyle(i2);
    }

    public void s(int i2) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            D(i2);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.e = rect.left + rect.right + i2;
    }

    public void t(int i2) {
        this.l = i2;
    }

    public void u(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void v(int i2) {
        this.f = i2;
    }

    public void w(int i2) {
        this.F.setInputMethodMode(i2);
    }

    public void x(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    public void y(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void z(AdapterView.OnItemClickListener onItemClickListener) {
        this.u = onItemClickListener;
    }
}
