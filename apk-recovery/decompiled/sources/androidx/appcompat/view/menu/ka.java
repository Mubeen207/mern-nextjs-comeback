package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.xc0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ka extends uc0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int B = zm0.e;
    public boolean A;
    public final Context b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public View o;
    public View p;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean w;
    public xc0.a x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;
    public final List h = new ArrayList();
    public final List i = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    public final View.OnAttachStateChangeListener k = new b();
    public final sc0 l = new c();
    public int m = 0;
    public int n = 0;
    public boolean v = false;
    public int q = D();

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ka.this.i() || ka.this.i.size() <= 0 || ((d) ka.this.i.get(0)).a.n()) {
                return;
            }
            View view = ka.this.p;
            if (view == null || !view.isShown()) {
                ka.this.dismiss();
                return;
            }
            for (d dVar : ka.this.i) {
                dVar.a.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ka.this.y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ka.this.y = view.getViewTreeObserver();
                }
                ka kaVar = ka.this;
                kaVar.y.removeGlobalOnLayoutListener(kaVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements sc0 {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ d m;
            public final /* synthetic */ MenuItem n;
            public final /* synthetic */ pc0 o;

            public a(d dVar, MenuItem menuItem, pc0 pc0Var) {
                this.m = dVar;
                this.n = menuItem;
                this.o = pc0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.m;
                if (dVar != null) {
                    ka.this.A = true;
                    dVar.b.d(false);
                    ka.this.A = false;
                }
                if (this.n.isEnabled() && this.n.hasSubMenu()) {
                    this.o.I(this.n, 4);
                }
            }
        }

        public c() {
        }

        @Override // androidx.appcompat.view.menu.sc0
        public void b(pc0 pc0Var, MenuItem menuItem) {
            ka.this.g.removeCallbacksAndMessages(null);
            int size = ka.this.i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (pc0Var == ((d) ka.this.i.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            ka.this.g.postAtTime(new a(i2 < ka.this.i.size() ? (d) ka.this.i.get(i2) : null, menuItem, pc0Var), pc0Var, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.view.menu.sc0
        public void c(pc0 pc0Var, MenuItem menuItem) {
            ka.this.g.removeCallbacksAndMessages(pc0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final wc0 a;
        public final pc0 b;
        public final int c;

        public d(wc0 wc0Var, pc0 pc0Var, int i) {
            this.a = wc0Var;
            this.b = pc0Var;
            this.c = i;
        }

        public ListView a() {
            return this.a.d();
        }
    }

    public ka(Context context, View view, int i, int i2, boolean z) {
        this.b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(im0.b));
        this.g = new Handler();
    }

    public final int A(pc0 pc0Var) {
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            if (pc0Var == ((d) this.i.get(i)).b) {
                return i;
            }
        }
        return -1;
    }

    public final MenuItem B(pc0 pc0Var, pc0 pc0Var2) {
        int size = pc0Var.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = pc0Var.getItem(i);
            if (item.hasSubMenu() && pc0Var2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View C(d dVar, pc0 pc0Var) {
        oc0 oc0Var;
        int i;
        int firstVisiblePosition;
        MenuItem B2 = B(dVar.b, pc0Var);
        if (B2 == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            oc0Var = (oc0) headerViewListAdapter.getWrappedAdapter();
        } else {
            oc0Var = (oc0) adapter;
            i = 0;
        }
        int count = oc0Var.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (B2 == oc0Var.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int D() {
        return this.o.getLayoutDirection() == 1 ? 0 : 1;
    }

    public final int E(int i) {
        List list = this.i;
        ListView a2 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.p.getWindowVisibleDisplayFrame(rect);
        return this.q == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    public final void F(pc0 pc0Var) {
        d dVar;
        View view;
        LayoutInflater from = LayoutInflater.from(this.b);
        oc0 oc0Var = new oc0(pc0Var, from, this.f, B);
        if (!i() && this.v) {
            oc0Var.d(true);
        } else if (i()) {
            oc0Var.d(uc0.x(pc0Var));
        }
        int o = uc0.o(oc0Var, null, this.b, this.c);
        wc0 z = z();
        z.p(oc0Var);
        z.s(o);
        z.t(this.n);
        if (this.i.size() > 0) {
            List list = this.i;
            dVar = (d) list.get(list.size() - 1);
            view = C(dVar, pc0Var);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z.H(false);
            z.E(null);
            int E = E(o);
            boolean z2 = E == 1;
            this.q = E;
            z.q(view);
            if ((this.n & 5) != 5) {
                o = z2 ? view.getWidth() : 0 - o;
            } else if (!z2) {
                o = 0 - view.getWidth();
            }
            z.v(o);
            z.A(true);
            z.C(0);
        } else {
            if (this.r) {
                z.v(this.t);
            }
            if (this.s) {
                z.C(this.u);
            }
            z.u(n());
        }
        this.i.add(new d(z, pc0Var, this.q));
        z.a();
        ListView d2 = z.d();
        d2.setOnKeyListener(this);
        if (dVar == null && this.w && pc0Var.u() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(zm0.i, (ViewGroup) d2, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(pc0Var.u());
            d2.addHeaderView(frameLayout, null, false);
            z.a();
        }
    }

    @Override // androidx.appcompat.view.menu.hu0
    public void a() {
        if (i()) {
            return;
        }
        for (pc0 pc0Var : this.h) {
            F(pc0Var);
        }
        this.h.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    @Override // androidx.appcompat.view.menu.xc0
    public void b(pc0 pc0Var, boolean z) {
        int A = A(pc0Var);
        if (A < 0) {
            return;
        }
        int i = A + 1;
        if (i < this.i.size()) {
            ((d) this.i.get(i)).b.d(false);
        }
        d dVar = (d) this.i.remove(A);
        dVar.b.L(this);
        if (this.A) {
            dVar.a.F(null);
            dVar.a.r(0);
        }
        dVar.a.dismiss();
        int size = this.i.size();
        if (size > 0) {
            this.q = ((d) this.i.get(size - 1)).c;
        } else {
            this.q = D();
        }
        if (size != 0) {
            if (z) {
                ((d) this.i.get(0)).b.d(false);
                return;
            }
            return;
        }
        dismiss();
        xc0.a aVar = this.x;
        if (aVar != null) {
            aVar.b(pc0Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.j);
            }
            this.y = null;
        }
        this.p.removeOnAttachStateChangeListener(this.k);
        this.z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.hu0
    public ListView d() {
        if (this.i.isEmpty()) {
            return null;
        }
        List list = this.i;
        return ((d) list.get(list.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.hu0
    public void dismiss() {
        int size = this.i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.i.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.i()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.xc0
    public boolean e(dy0 dy0Var) {
        for (d dVar : this.i) {
            if (dy0Var == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (dy0Var.hasVisibleItems()) {
            l(dy0Var);
            xc0.a aVar = this.x;
            if (aVar != null) {
                aVar.c(dy0Var);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.xc0
    public void f(boolean z) {
        for (d dVar : this.i) {
            uc0.y(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.xc0
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.hu0
    public boolean i() {
        return this.i.size() > 0 && ((d) this.i.get(0)).a.i();
    }

    @Override // androidx.appcompat.view.menu.xc0
    public void k(xc0.a aVar) {
        this.x = aVar;
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void l(pc0 pc0Var) {
        pc0Var.b(this, this.b);
        if (i()) {
            F(pc0Var);
        } else {
            this.h.add(pc0Var);
        }
    }

    @Override // androidx.appcompat.view.menu.uc0
    public boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.i.get(i);
            if (!dVar.a.i()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.b.d(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void p(View view) {
        if (this.o != view) {
            this.o = view;
            this.n = my.b(this.m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void r(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void s(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = my.b(i, this.o.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void t(int i) {
        this.r = true;
        this.t = i;
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void v(boolean z) {
        this.w = z;
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void w(int i) {
        this.s = true;
        this.u = i;
    }

    public final wc0 z() {
        wc0 wc0Var = new wc0(this.b, null, this.d, this.e);
        wc0Var.G(this.l);
        wc0Var.z(this);
        wc0Var.y(this);
        wc0Var.q(this.o);
        wc0Var.t(this.n);
        wc0Var.x(true);
        wc0Var.w(2);
        return wc0Var;
    }
}
