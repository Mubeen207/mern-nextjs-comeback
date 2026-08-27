package androidx.appcompat.view.menu;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
/* loaded from: classes.dex */
public final class y91 {
    public final e a;

    /* loaded from: classes.dex */
    public static class a extends e {
        public final Window a;
        public final xv0 b;

        public a(Window window, xv0 xv0Var) {
            this.a = window;
            this.b = xv0Var;
        }

        @Override // androidx.appcompat.view.menu.y91.e
        public void c(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    f(i2);
                }
            }
        }

        public void d(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void e(int i) {
            this.a.addFlags(i);
        }

        public final void f(int i) {
            if (i == 1) {
                g(4);
                h(1024);
            } else if (i == 2) {
                g(2);
            } else if (i != 8) {
            } else {
                this.b.a();
            }
        }

        public void g(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public void h(int i) {
            this.a.clearFlags(i);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(Window window, xv0 xv0Var) {
            super(window, xv0Var);
        }

        @Override // androidx.appcompat.view.menu.y91.e
        public void b(boolean z) {
            if (!z) {
                g(8192);
                return;
            }
            h(67108864);
            e(Integer.MIN_VALUE);
            d(8192);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public c(Window window, xv0 xv0Var) {
            super(window, xv0Var);
        }

        @Override // androidx.appcompat.view.menu.y91.e
        public void a(boolean z) {
            if (!z) {
                g(16);
                return;
            }
            h(134217728);
            e(Integer.MIN_VALUE);
            d(16);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {
        public final y91 a;
        public final WindowInsetsController b;
        public final xv0 c;
        public final qu0 d;
        public Window e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.view.Window r2, androidx.appcompat.view.menu.y91 r3, androidx.appcompat.view.menu.xv0 r4) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.appcompat.view.menu.z91.a(r2)
                r1.<init>(r0, r3, r4)
                r1.e = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.y91.d.<init>(android.view.Window, androidx.appcompat.view.menu.y91, androidx.appcompat.view.menu.xv0):void");
        }

        @Override // androidx.appcompat.view.menu.y91.e
        public void a(boolean z) {
            if (z) {
                if (this.e != null) {
                    d(16);
                }
                this.b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.e != null) {
                e(16);
            }
            this.b.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.appcompat.view.menu.y91.e
        public void b(boolean z) {
            if (z) {
                if (this.e != null) {
                    d(8192);
                }
                this.b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.e != null) {
                e(8192);
            }
            this.b.setSystemBarsAppearance(0, 8);
        }

        @Override // androidx.appcompat.view.menu.y91.e
        public void c(int i) {
            if ((i & 8) != 0) {
                this.c.a();
            }
            this.b.show(i & (-9));
        }

        public void d(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void e(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, y91 y91Var, xv0 xv0Var) {
            this.d = new qu0();
            this.b = windowInsetsController;
            this.a = y91Var;
            this.c = xv0Var;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public abstract void a(boolean z);

        public abstract void b(boolean z);

        public abstract void c(int i);
    }

    public y91(WindowInsetsController windowInsetsController) {
        this.a = new d(windowInsetsController, this, new xv0(windowInsetsController));
    }

    public static y91 d(WindowInsetsController windowInsetsController) {
        return new y91(windowInsetsController);
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public void b(boolean z) {
        this.a.b(z);
    }

    public void c(int i) {
        this.a.c(i);
    }

    public y91(Window window, View view) {
        xv0 xv0Var = new xv0(view);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(window, this, xv0Var);
        } else {
            this.a = new c(window, xv0Var);
        }
    }
}
