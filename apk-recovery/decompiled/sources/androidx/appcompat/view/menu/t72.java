package androidx.appcompat.view.menu;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class t72 {
    public long a;
    public long b;
    public final eh1 c;
    public final /* synthetic */ b72 d;

    public t72(b72 b72Var) {
        this.d = b72Var;
        this.c = new a82(this, b72Var.a);
        long b = b72Var.b().b();
        this.a = b;
        this.b = b;
    }

    public static /* synthetic */ void c(t72 t72Var) {
        t72Var.d.n();
        t72Var.d(false, false, t72Var.d.b().b());
        t72Var.d.o().v(t72Var.d.b().b());
    }

    public final long a(long j) {
        long j2 = j - this.b;
        this.b = j;
        return j2;
    }

    public final void b() {
        this.c.a();
        this.a = 0L;
        this.b = 0L;
    }

    public final boolean d(boolean z, boolean z2, long j) {
        this.d.n();
        this.d.v();
        if (!pb2.a() || !this.d.e().s(vi1.q0) || this.d.a.p()) {
            this.d.i().p.b(this.d.b().a());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            this.d.l().K().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = a(j);
        }
        this.d.l().K().b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        aa2.W(this.d.s().C(!this.d.e().Q()), bundle, true);
        if (!z2) {
            this.d.r().z0("auto", "_e", bundle);
        }
        this.a = j;
        this.c.a();
        this.c.b(3600000L);
        return true;
    }

    public final void e(long j) {
        this.c.a();
    }

    public final void f(long j) {
        this.d.n();
        this.c.a();
        this.a = j;
        this.b = j;
    }
}
