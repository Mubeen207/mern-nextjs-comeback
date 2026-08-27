package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class d82 {
    public final cc a;
    public long b;

    public d82(cc ccVar) {
        pj0.i(ccVar);
        this.a = ccVar;
    }

    public final void a() {
        this.b = 0L;
    }

    public final boolean b(long j) {
        return this.b == 0 || this.a.b() - this.b >= 3600000;
    }

    public final void c() {
        this.b = this.a.b();
    }
}
