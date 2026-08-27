package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.view.menu.a61;
import androidx.appcompat.view.menu.am;
import androidx.appcompat.view.menu.b91;
import androidx.appcompat.view.menu.bg0;
import androidx.appcompat.view.menu.dg0;
import androidx.appcompat.view.menu.gn0;
import androidx.appcompat.view.menu.hj0;
import androidx.appcompat.view.menu.kn0;
import androidx.appcompat.view.menu.lg;
import androidx.appcompat.view.menu.lj0;
import androidx.appcompat.view.menu.my;
import androidx.appcompat.view.menu.om;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.ve0;
import androidx.appcompat.view.menu.we0;
import androidx.appcompat.view.menu.xe0;
import androidx.appcompat.view.menu.zl0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements ve0, we0 {
    public static final String u;
    public static final Class[] v;
    public static final ThreadLocal w;
    public static final Comparator x;
    public static final hj0 y;
    public final List a;
    public final am b;
    public final List c;
    public final List d;
    public Paint e;
    public final int[] f;
    public final int[] g;
    public boolean h;
    public boolean i;
    public int[] j;
    public View k;
    public View l;
    public f m;
    public boolean n;
    public b91 o;
    public boolean p;
    public Drawable q;
    public ViewGroup.OnHierarchyChangeListener r;
    public dg0 s;
    public final xe0 t;

    /* loaded from: classes.dex */
    public class a implements dg0 {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.dg0
        public b91 a(View view, b91 b91Var) {
            return CoordinatorLayout.this.U(b91Var);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public b() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i2 == 0) {
                return z(coordinatorLayout, view, view2, view3, i);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            if (i == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public b91 f(CoordinatorLayout coordinatorLayout, View view, b91 b91Var) {
            return b91Var;
        }

        public void g(e eVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                p(coordinatorLayout, view, view2, i, i2, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                r(coordinatorLayout, view, view2, i, i2, i3, i4);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            s(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i2 == 0) {
                u(coordinatorLayout, view, view2, view3, i);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
            return false;
        }

        public b(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface c {
        Class value();
    }

    /* loaded from: classes.dex */
    public class d implements ViewGroup.OnHierarchyChangeListener {
        public d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.F(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.F(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float I = p51.I(view);
            float I2 = p51.I(view2);
            if (I > I2) {
                return -1;
            }
            return I < I2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        u = r0 != null ? r0.getName() : null;
        x = new h();
        v = new Class[]{Context.class, AttributeSet.class};
        w = new ThreadLocal();
        y = new lj0(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zl0.a);
    }

    public static b I(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = w;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (b) constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    public static void M(Rect rect) {
        rect.setEmpty();
        y.a(rect);
    }

    public static int P(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    public static int Q(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    public static int R(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    public static Rect g() {
        Rect rect = (Rect) y.b();
        return rect == null ? new Rect() : rect;
    }

    private static int i(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public final void A(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        Rect g2 = g();
        g2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        if (this.o != null && p51.u(this) && !p51.u(view)) {
            g2.left += this.o.i();
            g2.top += this.o.k();
            g2.right -= this.o.j();
            g2.bottom -= this.o.h();
        }
        Rect g3 = g();
        my.a(Q(eVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), g2, g3, i);
        view.layout(g3.left, g3.top, g3.right, g3.bottom);
        M(g2);
        M(g3);
    }

    public final void B(View view, View view2, int i) {
        Rect g2 = g();
        Rect g3 = g();
        try {
            r(view2, g2);
            s(view, i, g2, g3);
            view.layout(g3.left, g3.top, g3.right, g3.bottom);
        } finally {
            M(g2);
            M(g3);
        }
    }

    public final void C(View view, int i, int i2) {
        e eVar = (e) view.getLayoutParams();
        int b2 = my.b(R(eVar.c), i2);
        int i3 = b2 & 7;
        int i4 = b2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int u2 = u(i) - measuredWidth;
        if (i3 == 1) {
            u2 += measuredWidth / 2;
        } else if (i3 == 5) {
            u2 += measuredWidth;
        }
        int i5 = i4 != 16 ? i4 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(u2, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public final void D(View view, Rect rect, int i) {
        boolean z;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (p51.O(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            e eVar = (e) view.getLayoutParams();
            b e2 = eVar.e();
            Rect g2 = g();
            Rect g3 = g();
            g3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (e2 == null || !e2.b(this, view, g2)) {
                g2.set(g3);
            } else if (!g3.contains(g2)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g2.toShortString() + " | Bounds:" + g3.toShortString());
            }
            M(g3);
            if (g2.isEmpty()) {
                M(g2);
                return;
            }
            int b2 = my.b(eVar.h, i);
            boolean z2 = true;
            if ((b2 & 48) != 48 || (i6 = (g2.top - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - eVar.j) >= (i7 = rect.top)) {
                z = false;
            } else {
                T(view, i7 - i6);
                z = true;
            }
            if ((b2 & 80) == 80 && (height = ((getHeight() - g2.bottom) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) + eVar.j) < (i5 = rect.bottom)) {
                T(view, height - i5);
            } else if (!z) {
                T(view, 0);
            }
            if ((b2 & 3) != 3 || (i3 = (g2.left - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - eVar.i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                S(view, i4 - i3);
            }
            if ((b2 & 5) == 5 && (width = ((getWidth() - g2.right) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + eVar.i) < (i2 = rect.right)) {
                S(view, width - i2);
            } else if (!z2) {
                S(view, 0);
            }
            M(g2);
        }
    }

    public void E(View view, int i) {
        b e2;
        e eVar = (e) view.getLayoutParams();
        if (eVar.k != null) {
            Rect g2 = g();
            Rect g3 = g();
            Rect g4 = g();
            r(eVar.k, g2);
            boolean z = false;
            p(view, false, g3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            t(view, i, g2, g4, eVar, measuredWidth, measuredHeight);
            z = (g4.left == g3.left && g4.top == g3.top) ? true : true;
            j(eVar, g4, measuredWidth, measuredHeight);
            int i2 = g4.left - g3.left;
            int i3 = g4.top - g3.top;
            if (i2 != 0) {
                p51.U(view, i2);
            }
            if (i3 != 0) {
                p51.V(view, i3);
            }
            if (z && (e2 = eVar.e()) != null) {
                e2.h(this, view, eVar.k);
            }
            M(g2);
            M(g3);
            M(g4);
        }
    }

    public final void F(int i) {
        boolean z;
        int x2 = p51.x(this);
        int size = this.a.size();
        Rect g2 = g();
        Rect g3 = g();
        Rect g4 = g();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.a.get(i2);
            e eVar = (e) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (eVar.l == ((View) this.a.get(i3))) {
                        E(view, x2);
                    }
                }
                p(view, true, g3);
                if (eVar.g != 0 && !g3.isEmpty()) {
                    int b2 = my.b(eVar.g, x2);
                    int i4 = b2 & 112;
                    if (i4 == 48) {
                        g2.top = Math.max(g2.top, g3.bottom);
                    } else if (i4 == 80) {
                        g2.bottom = Math.max(g2.bottom, getHeight() - g3.top);
                    }
                    int i5 = b2 & 7;
                    if (i5 == 3) {
                        g2.left = Math.max(g2.left, g3.right);
                    } else if (i5 == 5) {
                        g2.right = Math.max(g2.right, getWidth() - g3.left);
                    }
                }
                if (eVar.h != 0 && view.getVisibility() == 0) {
                    D(view, g2, x2);
                }
                if (i != 2) {
                    v(view, g4);
                    if (!g4.equals(g3)) {
                        L(view, g3);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = (View) this.a.get(i6);
                    e eVar2 = (e) view2.getLayoutParams();
                    b e2 = eVar2.e();
                    if (e2 != null && e2.e(this, view2, view)) {
                        if (i == 0 && eVar2.f()) {
                            eVar2.j();
                        } else {
                            if (i != 2) {
                                z = e2.h(this, view2, view);
                            } else {
                                e2.i(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                eVar2.o(z);
                            }
                        }
                    }
                }
            }
        }
        M(g2);
        M(g3);
        M(g4);
    }

    public void G(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = eVar.k;
        if (view2 != null) {
            B(view, view2, i);
            return;
        }
        int i2 = eVar.e;
        if (i2 >= 0) {
            C(view, i2, i);
        } else {
            A(view, i);
        }
    }

    public void H(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final boolean J(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.c;
        x(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            e eVar = (e) view.getLayoutParams();
            b e2 = eVar.e();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && e2 != null) {
                    if (i == 0) {
                        z = e2.k(this, view, motionEvent);
                    } else if (i == 1) {
                        z = e2.D(this, view, motionEvent);
                    }
                    if (z) {
                        this.k = view;
                    }
                }
                boolean c2 = eVar.c();
                boolean h2 = eVar.h(this, view);
                z2 = h2 && !c2;
                if (h2 && !z2) {
                    break;
                }
            } else if (e2 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    e2.k(this, view, motionEvent2);
                } else if (i == 1) {
                    e2.D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    public final void K() {
        this.a.clear();
        this.b.c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e w2 = w(childAt);
            w2.d(this, childAt);
            this.b.b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (w2.b(this, childAt, childAt2)) {
                        if (!this.b.d(childAt2)) {
                            this.b.b(childAt2);
                        }
                        this.b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.a.addAll(this.b.h());
        Collections.reverse(this.a);
    }

    public void L(View view, Rect rect) {
        ((e) view.getLayoutParams()).p(rect);
    }

    public void N() {
        if (this.i && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        this.n = false;
    }

    public final void O(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b e2 = ((e) childAt.getLayoutParams()).e();
            if (e2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    e2.k(this, childAt, obtain);
                } else {
                    e2.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((e) getChildAt(i2).getLayoutParams()).l();
        }
        this.k = null;
        this.h = false;
    }

    public final void S(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i2 = eVar.i;
        if (i2 != i) {
            p51.U(view, i - i2);
            eVar.i = i;
        }
    }

    public final void T(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i2 = eVar.j;
        if (i2 != i) {
            p51.V(view, i - i2);
            eVar.j = i;
        }
    }

    public final b91 U(b91 b91Var) {
        if (bg0.a(this.o, b91Var)) {
            return b91Var;
        }
        this.o = b91Var;
        boolean z = false;
        boolean z2 = b91Var != null && b91Var.k() > 0;
        this.p = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        b91 k = k(b91Var);
        requestLayout();
        return k;
    }

    public final void V() {
        if (!p51.u(this)) {
            p51.y0(this, null);
            return;
        }
        if (this.s == null) {
            this.s = new a();
        }
        p51.y0(this, this.s);
        setSystemUiVisibility(1280);
    }

    @Override // androidx.appcompat.view.menu.ve0
    public void a(View view, View view2, int i, int i2) {
        b e2;
        this.t.c(view, view2, i, i2);
        this.l = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i2) && (e2 = eVar.e()) != null) {
                e2.v(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.ve0
    public void b(View view, int i) {
        this.t.d(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i)) {
                b e2 = eVar.e();
                if (e2 != null) {
                    e2.C(this, childAt, view, i);
                }
                eVar.k(i);
                eVar.j();
            }
        }
        this.l = null;
    }

    @Override // androidx.appcompat.view.menu.ve0
    public void c(View view, int i, int i2, int[] iArr, int i3) {
        b e2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i3) && (e2 = eVar.e()) != null) {
                    int[] iArr2 = this.f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e2.q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            F(1);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.view.menu.we0
    public void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        b e2;
        boolean z;
        int min;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i5) && (e2 = eVar.e()) != null) {
                    int[] iArr2 = this.f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e2.t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        min = Math.max(i7, this.f[1]);
                    } else {
                        z = true;
                        min = Math.min(i7, this.f[1]);
                    }
                    i7 = min;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            F(1);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        e eVar = (e) view.getLayoutParams();
        b bVar = eVar.a;
        if (bVar != null) {
            float d2 = bVar.d(this, view);
            if (d2 > 0.0f) {
                if (this.e == null) {
                    this.e = new Paint();
                }
                this.e.setColor(eVar.a.c(this, view));
                this.e.setAlpha(i(Math.round(d2 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.e);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // androidx.appcompat.view.menu.ve0
    public void e(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, 0, this.g);
    }

    @Override // androidx.appcompat.view.menu.ve0
    public boolean f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b e2 = eVar.e();
                if (e2 != null) {
                    boolean A = e2.A(this, childAt, view, view2, i, i2);
                    z |= A;
                    eVar.q(i2, A);
                } else {
                    eVar.q(i2, false);
                }
            }
        }
        return z;
    }

    public final List<View> getDependencySortedChildren() {
        K();
        return Collections.unmodifiableList(this.a);
    }

    public final b91 getLastWindowInsets() {
        return this.o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void h() {
        if (this.i) {
            if (this.m == null) {
                this.m = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        this.n = true;
    }

    public final void j(e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final b91 k(b91 b91Var) {
        b e2;
        if (b91Var.n()) {
            return b91Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (p51.u(childAt) && (e2 = ((e) childAt.getLayoutParams()).e()) != null) {
                b91Var = e2.f(this, childAt, b91Var);
                if (b91Var.n()) {
                    break;
                }
            }
        }
        return b91Var;
    }

    public void l() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (y(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z != this.n) {
            if (z) {
                h();
            } else {
                N();
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        O(false);
        if (this.n) {
            if (this.m == null) {
                this.m = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        if (this.o == null && p51.u(this)) {
            p51.h0(this);
        }
        this.i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O(false);
        if (this.n && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        View view = this.l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.p || this.q == null) {
            return;
        }
        b91 b91Var = this.o;
        int k = b91Var != null ? b91Var.k() : 0;
        if (k > 0) {
            this.q.setBounds(0, 0, getWidth(), k);
            this.q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            O(true);
        }
        boolean J = J(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            O(true);
        }
        return J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b e2;
        int x2 = p51.x(this);
        int size = this.a.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.a.get(i5);
            if (view.getVisibility() != 8 && ((e2 = ((e) view.getLayoutParams()).e()) == null || !e2.l(this, view, x2))) {
                G(view, x2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        b e2;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(0) && (e2 = eVar.e()) != null) {
                    z2 |= e2.n(this, childAt, view, f2, f3, z);
                }
            }
        }
        if (z2) {
            F(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        b e2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(0) && (e2 = eVar.e()) != null) {
                    z |= e2.o(this, childAt, view, f2, f3);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        SparseArray sparseArray = gVar.o;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b e2 = w(childAt).e();
            if (id != -1 && e2 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                e2.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable y2;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b e2 = ((e) childAt.getLayoutParams()).e();
            if (id != -1 && e2 != null && (y2 = e2.y(this, childAt)) != null) {
                sparseArray.append(id, y2);
            }
        }
        gVar.o = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.J(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r6 = r6.e()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.k
            boolean r6 = r6.D(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.O(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            r(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List q(View view) {
        List g2 = this.b.g(view);
        this.d.clear();
        if (g2 != null) {
            this.d.addAll(g2);
        }
        return this.d;
    }

    public void r(View view, Rect rect) {
        a61.a(this, view, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        b e2 = ((e) view.getLayoutParams()).e();
        if (e2 == null || !e2.w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.h) {
            return;
        }
        O(false);
        this.h = true;
    }

    public void s(View view, int i, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        t(view, i, rect, rect2, eVar, measuredWidth, measuredHeight);
        j(eVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        V();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                om.g(this.q, p51.x(this));
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            p51.b0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? lg.e(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.q;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.q.setVisible(z, false);
    }

    public final void t(View view, int i, Rect rect, Rect rect2, e eVar, int i2, int i3) {
        int b2 = my.b(P(eVar.c), i);
        int b3 = my.b(Q(eVar.d), i);
        int i4 = b2 & 7;
        int i5 = b2 & 112;
        int i6 = b3 & 7;
        int i7 = b3 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public final int u(int i) {
        int[] iArr = this.j;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            return 0;
        } else if (i < 0 || i >= iArr.length) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            return 0;
        } else {
            return iArr[i];
        }
    }

    public void v(View view, Rect rect) {
        rect.set(((e) view.getLayoutParams()).g());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    public e w(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.b) {
            c cVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (c) cls.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.n((b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Default behavior class ");
                    sb.append(cVar.value().getName());
                    sb.append(" could not be instantiated. Did you forget a default constructor?");
                }
            }
            eVar.b = true;
        }
        return eVar;
    }

    public final void x(List list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator comparator = x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean y(View view) {
        return this.b.i(view);
    }

    public boolean z(View view, int i, int i2) {
        Rect g2 = g();
        r(view, g2);
        try {
            return g2.contains(i, i2);
        } finally {
            M(g2);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public b a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public final Rect q;
        public Object r;

        public e(int i, int i2) {
            super(i, i2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public boolean a() {
            return this.k == null && this.f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            b bVar;
            return view2 == this.l || r(view2, p51.x(coordinatorLayout)) || ((bVar = this.a) != null && bVar.e(coordinatorLayout, view, view2));
        }

        public boolean c() {
            if (this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.k;
        }

        public b e() {
            return this.a;
        }

        public boolean f() {
            return this.p;
        }

        public Rect g() {
            return this.q;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            b bVar = this.a;
            boolean a = (bVar != null ? bVar.a(coordinatorLayout, view) : false) | z;
            this.m = a;
            return a;
        }

        public boolean i(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.o;
            }
            return this.n;
        }

        public void j() {
            this.p = false;
        }

        public void k(int i) {
            q(i, false);
        }

        public void l() {
            this.m = false;
        }

        public final void m(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f);
            this.k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.l = null;
                    this.k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + view);
            } else if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.l = null;
                this.k = null;
            } else {
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                        this.l = null;
                        this.k = null;
                        return;
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.l = findViewById;
            }
        }

        public void n(b bVar) {
            b bVar2 = this.a;
            if (bVar2 != bVar) {
                if (bVar2 != null) {
                    bVar2.j();
                }
                this.a = bVar;
                this.r = null;
                this.b = true;
                if (bVar != null) {
                    bVar.g(this);
                }
            }
        }

        public void o(boolean z) {
            this.p = z;
        }

        public void p(Rect rect) {
            this.q.set(rect);
        }

        public void q(int i, boolean z) {
            if (i == 0) {
                this.n = z;
            } else if (i != 1) {
            } else {
                this.o = z;
            }
        }

        public final boolean r(View view, int i) {
            int b = my.b(((e) view.getLayoutParams()).g, i);
            return b != 0 && (my.b(this.h, i) & b) == b;
        }

        public final boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.l = null;
                    this.k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.l = view2;
            return true;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kn0.e);
            this.c = obtainStyledAttributes.getInteger(kn0.f, 0);
            this.f = obtainStyledAttributes.getResourceId(kn0.g, -1);
            this.d = obtainStyledAttributes.getInteger(kn0.h, 0);
            this.e = obtainStyledAttributes.getInteger(kn0.l, -1);
            this.g = obtainStyledAttributes.getInt(kn0.k, 0);
            this.h = obtainStyledAttributes.getInt(kn0.j, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(kn0.i);
            this.b = hasValue;
            if (hasValue) {
                this.a = CoordinatorLayout.I(context, attributeSet, obtainStyledAttributes.getString(kn0.i));
            }
            obtainStyledAttributes.recycle();
            b bVar = this.a;
            if (bVar != null) {
                bVar.g(this);
            }
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.a = new ArrayList();
        this.b = new am();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new int[2];
        this.g = new int[2];
        this.t = new xe0(this);
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kn0.b, 0, gn0.a);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kn0.b, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, kn0.b, attributeSet, obtainStyledAttributes, 0, gn0.a);
            } else {
                saveAttributeDataForStyleable(context, kn0.b, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(kn0.c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.j = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.j.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.j;
                iArr[i2] = (int) (iArr[i2] * f2);
            }
        }
        this.q = obtainStyledAttributes.getDrawable(kn0.d);
        obtainStyledAttributes.recycle();
        V();
        super.setOnHierarchyChangeListener(new d());
        if (p51.v(this) == 0) {
            p51.u0(this, 1);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends androidx.appcompat.view.menu.c {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public SparseArray o;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.o = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.o.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.appcompat.view.menu.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.o;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.o.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.o.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
