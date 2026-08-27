package androidx.appcompat.view.menu;

import android.os.Handler;
/* loaded from: classes.dex */
public abstract class eh1 {
    public static volatile Handler d;
    public final lz1 a;
    public final Runnable b;
    public volatile long c;

    public eh1(lz1 lz1Var) {
        pj0.i(lz1Var);
        this.a = lz1Var;
        this.b = new ch1(this, lz1Var);
    }

    public final void a() {
        this.c = 0L;
        f().removeCallbacks(this.b);
    }

    public final void b(long j) {
        a();
        if (j >= 0) {
            this.c = this.a.b().a();
            if (f().postDelayed(this.b, j)) {
                return;
            }
            this.a.l().G().b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.c != 0;
    }

    public final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (eh1.class) {
            try {
                if (d == null) {
                    d = new zl1(this.a.a().getMainLooper());
                }
                handler = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
