package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.view.menu.tu;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class hq extends b0 {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final tu.a o = new a();
    public static final tu.b p = new b();
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public class a implements tu.a {
        @Override // androidx.appcompat.view.menu.tu.a
        /* renamed from: b */
        public void a(p0 p0Var, Rect rect) {
            p0Var.j(rect);
        }
    }

    /* loaded from: classes.dex */
    public class b implements tu.b {
        @Override // androidx.appcompat.view.menu.tu.b
        /* renamed from: c */
        public p0 a(gw0 gw0Var, int i) {
            return (p0) gw0Var.n(i);
        }

        @Override // androidx.appcompat.view.menu.tu.b
        /* renamed from: d */
        public int b(gw0 gw0Var) {
            return gw0Var.j();
        }
    }

    /* loaded from: classes.dex */
    public class c extends q0 {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.q0
        public p0 b(int i) {
            return p0.U(hq.this.H(i));
        }

        @Override // androidx.appcompat.view.menu.q0
        public p0 d(int i) {
            int i2 = i == 2 ? hq.this.k : hq.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // androidx.appcompat.view.menu.q0
        public boolean f(int i, int i2, Bundle bundle) {
            return hq.this.P(i, i2, bundle);
        }
    }

    public hq(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (p51.v(view) == 0) {
            p51.u0(view, 1);
        }
    }

    public static Rect D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    public static int F(int i) {
        if (i != 19) {
            if (i != 21) {
                return i != 22 ? 130 : 66;
            }
            return 17;
        }
        return 33;
    }

    public final int A() {
        return this.l;
    }

    public abstract int B(float f, float f2);

    public abstract void C(List list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean G(int i, Rect rect) {
        p0 p0Var;
        gw0 y = y();
        int i2 = this.l;
        p0 p0Var2 = i2 == Integer.MIN_VALUE ? null : (p0) y.e(i2);
        if (i == 1 || i == 2) {
            p0Var = (p0) tu.d(y, p, o, p0Var2, i, p51.x(this.i) == 1, false);
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i3 = this.l;
            if (i3 != Integer.MIN_VALUE) {
                z(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.i, i, rect2);
            }
            p0Var = (p0) tu.c(y, p, o, p0Var2, rect2, i);
        }
        return T(p0Var != null ? y.h(y.g(p0Var)) : Integer.MIN_VALUE);
    }

    public p0 H(int i) {
        return i == -1 ? u() : t(i);
    }

    public final void I(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (z) {
            G(i, rect);
        }
    }

    public abstract boolean J(int i, int i2, Bundle bundle);

    public void K(AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i, AccessibilityEvent accessibilityEvent) {
    }

    public abstract void M(p0 p0Var);

    public abstract void N(int i, p0 p0Var);

    public abstract void O(int i, boolean z);

    public boolean P(int i, int i2, Bundle bundle) {
        return i != -1 ? Q(i, i2, bundle) : R(i2, bundle);
    }

    public final boolean Q(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? J(i, i2, bundle) : n(i) : S(i) : o(i) : T(i);
    }

    public final boolean R(int i, Bundle bundle) {
        return p51.Z(this.i, i, bundle);
    }

    public final boolean S(int i) {
        int i2;
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled() && (i2 = this.k) != i) {
            if (i2 != Integer.MIN_VALUE) {
                n(i2);
            }
            this.k = i;
            this.i.invalidate();
            U(i, 32768);
            return true;
        }
        return false;
    }

    public final boolean T(int i) {
        int i2;
        if ((this.i.isFocused() || this.i.requestFocus()) && (i2 = this.l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                o(i2);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            this.l = i;
            O(i, true);
            U(i, 8);
            return true;
        }
        return false;
    }

    public final boolean U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.i, q(i, i2));
    }

    public final void V(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        U(i, PackageParser.PARSE_IS_PRIVILEGED);
        U(i2, PackageParser.PARSE_COLLECT_CERTIFICATES);
    }

    @Override // androidx.appcompat.view.menu.b0
    public q0 b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.b0
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.appcompat.view.menu.b0
    public void g(View view, p0 p0Var) {
        super.g(view, p0Var);
        M(p0Var);
    }

    public final boolean n(int i) {
        if (this.k == i) {
            this.k = Integer.MIN_VALUE;
            this.i.invalidate();
            U(i, 65536);
            return true;
        }
        return false;
    }

    public final boolean o(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        O(i, false);
        U(i, 8);
        return true;
    }

    public final boolean p() {
        int i = this.l;
        return i != Integer.MIN_VALUE && J(i, 16, null);
    }

    public final AccessibilityEvent q(int i, int i2) {
        return i != -1 ? r(i, i2) : s(i2);
    }

    public final AccessibilityEvent r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        p0 H = H(i);
        obtain.getText().add(H.w());
        obtain.setContentDescription(H.q());
        obtain.setScrollable(H.N());
        obtain.setPassword(H.M());
        obtain.setEnabled(H.G());
        obtain.setChecked(H.D());
        L(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(H.n());
        r0.c(obtain, this.i, i);
        obtain.setPackageName(this.i.getContext().getPackageName());
        return obtain;
    }

    public final AccessibilityEvent s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public final p0 t(int i) {
        p0 S = p0.S();
        S.h0(true);
        S.j0(true);
        S.c0("android.view.View");
        Rect rect = n;
        S.Y(rect);
        S.Z(rect);
        S.r0(this.i);
        N(i, S);
        if (S.w() == null && S.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        S.j(this.e);
        if (this.e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int h = S.h();
        if ((h & 64) == 0) {
            if ((h & PackageParser.PARSE_IS_PRIVILEGED) == 0) {
                S.p0(this.i.getContext().getPackageName());
                S.w0(this.i, i);
                if (this.k == i) {
                    S.X(true);
                    S.a(PackageParser.PARSE_IS_PRIVILEGED);
                } else {
                    S.X(false);
                    S.a(64);
                }
                boolean z = this.l == i;
                if (z) {
                    S.a(2);
                } else if (S.H()) {
                    S.a(1);
                }
                S.k0(z);
                this.i.getLocationOnScreen(this.g);
                S.k(this.d);
                if (this.d.equals(rect)) {
                    S.j(this.d);
                    if (S.b != -1) {
                        p0 S2 = p0.S();
                        for (int i2 = S.b; i2 != -1; i2 = S2.b) {
                            S2.s0(this.i, -1);
                            S2.Y(n);
                            N(i2, S2);
                            S2.j(this.e);
                            Rect rect2 = this.d;
                            Rect rect3 = this.e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        S2.W();
                    }
                    this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                }
                if (this.i.getLocalVisibleRect(this.f)) {
                    this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    if (this.d.intersect(this.f)) {
                        S.Z(this.d);
                        if (E(this.d)) {
                            S.A0(true);
                        }
                    }
                }
                return S;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    public final p0 u() {
        p0 T = p0.T(this.i);
        p51.X(this.i, T);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (T.m() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                T.c(this.i, ((Integer) arrayList.get(i)).intValue());
            }
            return T;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int B = B(motionEvent.getX(), motionEvent.getY());
                V(B);
                return B != Integer.MIN_VALUE;
            } else if (action == 10 && this.m != Integer.MIN_VALUE) {
                V(Integer.MIN_VALUE);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return G(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return G(1, null);
                }
                return false;
            }
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (keyEvent.hasNoModifiers()) {
                            int F = F(keyCode);
                            int repeatCount = keyEvent.getRepeatCount() + 1;
                            boolean z = false;
                            while (i < repeatCount && G(F, null)) {
                                i++;
                                z = true;
                            }
                            return z;
                        }
                        return false;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                p();
                return true;
            }
            return false;
        }
        return false;
    }

    public final int x() {
        return this.k;
    }

    public final gw0 y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        gw0 gw0Var = new gw0();
        for (int i = 0; i < arrayList.size(); i++) {
            gw0Var.i(((Integer) arrayList.get(i)).intValue(), t(((Integer) arrayList.get(i)).intValue()));
        }
        return gw0Var;
    }

    public final void z(int i, Rect rect) {
        H(i).j(rect);
    }
}
