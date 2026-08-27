package androidx.appcompat.view.menu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.v11;
/* loaded from: classes.dex */
public abstract class k71 extends v11 {
    public static final String[] W = {"android:visibility:visibility", "android:visibility:parent"};
    public int V = 3;

    /* loaded from: classes.dex */
    public class a extends w11 {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        @Override // androidx.appcompat.view.menu.w11, androidx.appcompat.view.menu.v11.f
        public void b(v11 v11Var) {
            z51.a(this.a).c(this.b);
        }

        @Override // androidx.appcompat.view.menu.w11, androidx.appcompat.view.menu.v11.f
        public void d(v11 v11Var) {
            if (this.b.getParent() == null) {
                z51.a(this.a).a(this.b);
            } else {
                k71.this.f();
            }
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void e(v11 v11Var) {
            this.c.setTag(um0.a, null);
            z51.a(this.a).c(this.b);
            v11Var.S(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements v11.f {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public final boolean d;
        public boolean e;
        public boolean f = false;

        public b(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            g(true);
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void a(v11 v11Var) {
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void b(v11 v11Var) {
            g(false);
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void c(v11 v11Var) {
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void d(v11 v11Var) {
            g(true);
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void e(v11 v11Var) {
            f();
            v11Var.S(this);
        }

        public final void f() {
            if (!this.f) {
                q61.h(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            z51.c(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f) {
                return;
            }
            q61.h(this.a, this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f) {
                return;
            }
            q61.h(this.a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    private void f0(b21 b21Var) {
        b21Var.a.put("android:visibility:visibility", Integer.valueOf(b21Var.b.getVisibility()));
        b21Var.a.put("android:visibility:parent", b21Var.b.getParent());
        int[] iArr = new int[2];
        b21Var.b.getLocationOnScreen(iArr);
        b21Var.a.put("android:visibility:screenLocation", iArr);
    }

    @Override // androidx.appcompat.view.menu.v11
    public String[] G() {
        return W;
    }

    @Override // androidx.appcompat.view.menu.v11
    public boolean I(b21 b21Var, b21 b21Var2) {
        if (b21Var == null && b21Var2 == null) {
            return false;
        }
        if (b21Var == null || b21Var2 == null || b21Var2.a.containsKey("android:visibility:visibility") == b21Var.a.containsKey("android:visibility:visibility")) {
            c g0 = g0(b21Var, b21Var2);
            if (g0.a) {
                return g0.c == 0 || g0.d == 0;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.v11
    public void g(b21 b21Var) {
        f0(b21Var);
    }

    public final c g0(b21 b21Var, b21 b21Var2) {
        c cVar = new c();
        cVar.a = false;
        cVar.b = false;
        if (b21Var == null || !b21Var.a.containsKey("android:visibility:visibility")) {
            cVar.c = -1;
            cVar.e = null;
        } else {
            cVar.c = ((Integer) b21Var.a.get("android:visibility:visibility")).intValue();
            cVar.e = (ViewGroup) b21Var.a.get("android:visibility:parent");
        }
        if (b21Var2 == null || !b21Var2.a.containsKey("android:visibility:visibility")) {
            cVar.d = -1;
            cVar.f = null;
        } else {
            cVar.d = ((Integer) b21Var2.a.get("android:visibility:visibility")).intValue();
            cVar.f = (ViewGroup) b21Var2.a.get("android:visibility:parent");
        }
        if (b21Var != null && b21Var2 != null) {
            int i = cVar.c;
            int i2 = cVar.d;
            if (i == i2 && cVar.e == cVar.f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.b = false;
                    cVar.a = true;
                } else if (i2 == 0) {
                    cVar.b = true;
                    cVar.a = true;
                }
            } else if (cVar.f == null) {
                cVar.b = false;
                cVar.a = true;
            } else if (cVar.e == null) {
                cVar.b = true;
                cVar.a = true;
            }
        } else if (b21Var == null && cVar.d == 0) {
            cVar.b = true;
            cVar.a = true;
        } else if (b21Var2 == null && cVar.c == 0) {
            cVar.b = false;
            cVar.a = true;
        }
        return cVar;
    }

    public abstract Animator h0(ViewGroup viewGroup, View view, b21 b21Var, b21 b21Var2);

    public Animator i0(ViewGroup viewGroup, b21 b21Var, int i, b21 b21Var2, int i2) {
        if ((this.V & 1) != 1 || b21Var2 == null) {
            return null;
        }
        if (b21Var == null) {
            View view = (View) b21Var2.b.getParent();
            if (g0(w(view, false), H(view, false)).a) {
                return null;
            }
        }
        return h0(viewGroup, b21Var2.b, b21Var, b21Var2);
    }

    @Override // androidx.appcompat.view.menu.v11
    public void j(b21 b21Var) {
        f0(b21Var);
    }

    public abstract Animator j0(ViewGroup viewGroup, View view, b21 b21Var, b21 b21Var2);

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
        if (r10.I != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator k0(android.view.ViewGroup r11, androidx.appcompat.view.menu.b21 r12, int r13, androidx.appcompat.view.menu.b21 r14, int r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k71.k0(android.view.ViewGroup, androidx.appcompat.view.menu.b21, int, androidx.appcompat.view.menu.b21, int):android.animation.Animator");
    }

    public void l0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.V = i;
    }

    @Override // androidx.appcompat.view.menu.v11
    public Animator q(ViewGroup viewGroup, b21 b21Var, b21 b21Var2) {
        c g0 = g0(b21Var, b21Var2);
        if (g0.a) {
            if (g0.e == null && g0.f == null) {
                return null;
            }
            return g0.b ? i0(viewGroup, b21Var, g0.c, b21Var2, g0.d) : k0(viewGroup, b21Var, g0.c, b21Var2, g0.d);
        }
        return null;
    }
}
