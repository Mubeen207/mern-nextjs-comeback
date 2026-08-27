package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.p0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.s0;
import androidx.appcompat.view.menu.u51;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.b {
    public u51 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public float d = 0.0f;
    public int f = 2;
    public float g = 0.5f;
    public float h = 0.0f;
    public float i = 0.5f;
    public final u51.c j = new a();

    /* loaded from: classes.dex */
    public class a extends u51.c {
        public int a;
        public int b = -1;

        public a() {
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public int a(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = p51.x(view) == 1;
            int i3 = SwipeDismissBehavior.this.f;
            if (i3 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return SwipeDismissBehavior.H(width, i, width2);
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public void i(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.c = false;
            }
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public void j(int i) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.h;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.i;
            float abs = Math.abs(i - this.a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, abs), 1.0f));
            }
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public void l(View view, float f, float f2) {
            int i;
            boolean z;
            this.b = -1;
            int width = view.getWidth();
            if (n(view, f)) {
                if (f >= 0.0f) {
                    int left = view.getLeft();
                    int i2 = this.a;
                    if (left >= i2) {
                        i = i2 + width;
                        z = true;
                    }
                }
                i = this.a - width;
                z = true;
            } else {
                i = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.F(i, view.getTop())) {
                p51.c0(view, new c(view, z));
            } else if (z) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public boolean m(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.F(view);
        }

        public final boolean n(View view, float f) {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0) {
                return Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.g);
            }
            boolean z = p51.x(view) == 1;
            int i2 = SwipeDismissBehavior.this.f;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (i <= 0) {
                    return false;
                }
                return true;
            } else if (i2 == 1) {
                if (z) {
                    if (i <= 0) {
                        return false;
                    }
                } else if (f >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements s0 {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.s0
        public boolean a(View view, s0.a aVar) {
            if (SwipeDismissBehavior.this.F(view)) {
                boolean z = p51.x(view) == 1;
                int i = SwipeDismissBehavior.this.f;
                p51.U(view, (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
                view.setAlpha(0.0f);
                SwipeDismissBehavior.this.getClass();
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final View m;
        public final boolean n;

        public c(View view, boolean z) {
            this.m = view;
            this.n = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            u51 u51Var = SwipeDismissBehavior.this.a;
            if (u51Var != null && u51Var.k(true)) {
                p51.c0(this.m, this);
            } else if (this.n) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    public static float G(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int H(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static float J(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a != null) {
            if (this.c && motionEvent.getActionMasked() == 3) {
                return true;
            }
            this.a.z(motionEvent);
            return true;
        }
        return false;
    }

    public boolean F(View view) {
        return true;
    }

    public final void I(ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = this.e ? u51.l(viewGroup, this.d, this.j) : u51.m(viewGroup, this.j);
        }
    }

    public void K(float f) {
        this.i = G(0.0f, f, 1.0f);
    }

    public void L(float f) {
        this.h = G(0.0f, f, 1.0f);
    }

    public void M(int i) {
        this.f = i;
    }

    public final void N(View view) {
        p51.e0(view, 1048576);
        if (F(view)) {
            p51.g0(view, p0.a.y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (z) {
            I(coordinatorLayout);
            return !this.c && this.a.G(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean l = super.l(coordinatorLayout, view, i);
        if (p51.v(view) == 0) {
            p51.u0(view, 1);
            N(view);
        }
        return l;
    }
}
