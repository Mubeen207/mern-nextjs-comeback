package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.sq1;
import androidx.appcompat.view.menu.t02;
import androidx.appcompat.view.menu.vq1;
import java.util.List;
/* loaded from: classes.dex */
public final class rq1 extends t02 implements d42 {
    private static final rq1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private int zzf;
    private q12 zzg = t02.B();
    private q12 zzh = t02.B();
    private boolean zzi;
    private boolean zzj;

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(rq1.zzc);
        }

        public final int r() {
            return ((rq1) this.n).L();
        }

        public final a s(int i, sq1.a aVar) {
            n();
            ((rq1) this.n).H(i, (sq1) ((t02) aVar.j()));
            return this;
        }

        public final a t(int i, vq1.a aVar) {
            n();
            ((rq1) this.n).I(i, (vq1) ((t02) aVar.j()));
            return this;
        }

        public final sq1 u(int i) {
            return ((rq1) this.n).G(i);
        }

        public final int v() {
            return ((rq1) this.n).N();
        }

        public final vq1 w(int i) {
            return ((rq1) this.n).M(i);
        }

        public /* synthetic */ a(qq1 qq1Var) {
            this();
        }
    }

    static {
        rq1 rq1Var = new rq1();
        zzc = rq1Var;
        t02.t(rq1.class, rq1Var);
    }

    public final sq1 G(int i) {
        return (sq1) this.zzh.get(i);
    }

    public final void H(int i, sq1 sq1Var) {
        sq1Var.getClass();
        q12 q12Var = this.zzh;
        if (!q12Var.c()) {
            this.zzh = t02.o(q12Var);
        }
        this.zzh.set(i, sq1Var);
    }

    public final void I(int i, vq1 vq1Var) {
        vq1Var.getClass();
        q12 q12Var = this.zzg;
        if (!q12Var.c()) {
            this.zzg = t02.o(q12Var);
        }
        this.zzg.set(i, vq1Var);
    }

    public final int L() {
        return this.zzh.size();
    }

    public final vq1 M(int i) {
        return (vq1) this.zzg.get(i);
    }

    public final int N() {
        return this.zzg.size();
    }

    public final List P() {
        return this.zzh;
    }

    public final List Q() {
        return this.zzg;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzf;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (qq1.a[i - 1]) {
            case 1:
                return new rq1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", vq1.class, "zzh", sq1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (rq1.class) {
                        try {
                            w42Var = zzd;
                            if (w42Var == null) {
                                w42Var = new t02.a(zzc);
                                zzd = w42Var;
                            }
                        } finally {
                        }
                    }
                }
                return w42Var;
            case t02.c.f /* 6 */:
                return (byte) 1;
            case t02.c.g /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
