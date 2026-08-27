package androidx.appcompat.view.menu;

import android.os.Handler;
/* loaded from: classes.dex */
public final class r72 {
    public p72 a;
    public final /* synthetic */ b72 b;

    public r72(b72 b72Var) {
        this.b = b72Var;
    }

    public final void a() {
        Handler handler;
        this.b.n();
        if (this.a != null) {
            handler = this.b.c;
            handler.removeCallbacks(this.a);
        }
        this.b.i().s.a(false);
        this.b.D(false);
    }

    public final void b(long j) {
        Handler handler;
        this.a = new p72(this, this.b.b().a(), j);
        handler = this.b.c;
        handler.postDelayed(this.a, 2000L);
    }
}
