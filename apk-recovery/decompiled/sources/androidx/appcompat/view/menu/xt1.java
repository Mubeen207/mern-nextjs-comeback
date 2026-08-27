package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class xt1 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ st1 r;

    public xt1(st1 st1Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.r = st1Var;
        this.m = i;
        this.n = str;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        wu1 F = this.r.a.F();
        if (!F.r()) {
            this.r.y(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c = this.r.c;
        if (c == 0) {
            if (this.r.e().T()) {
                this.r.c = 'C';
            } else {
                this.r.c = 'c';
            }
        }
        j = this.r.d;
        if (j < 0) {
            this.r.d = 82001L;
        }
        char charAt = "01VDIWEA?".charAt(this.m);
        c2 = this.r.c;
        j2 = this.r.d;
        String str = "2" + charAt + c2 + j2 + ":" + st1.x(true, this.n, this.o, this.p, this.q);
        if (str.length() > 1024) {
            str = this.n.substring(0, 1024);
        }
        ev1 ev1Var = F.d;
        if (ev1Var != null) {
            ev1Var.b(str, 1L);
        }
    }
}
