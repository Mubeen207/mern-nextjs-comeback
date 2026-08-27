package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class sq1 extends t02 implements d42 {
    private static final sq1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private q12 zzh = t02.B();
    private boolean zzi;
    private uq1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(sq1.zzc);
        }

        public final int r() {
            return ((sq1) this.n).j();
        }

        public final a s(int i, tq1 tq1Var) {
            n();
            ((sq1) this.n).H(i, tq1Var);
            return this;
        }

        public final a t(String str) {
            n();
            ((sq1) this.n).K(str);
            return this;
        }

        public final tq1 u(int i) {
            return ((sq1) this.n).G(i);
        }

        public final String v() {
            return ((sq1) this.n).P();
        }

        public /* synthetic */ a(qq1 qq1Var) {
            this();
        }
    }

    static {
        sq1 sq1Var = new sq1();
        zzc = sq1Var;
        t02.t(sq1.class, sq1Var);
    }

    public static a M() {
        return (a) zzc.w();
    }

    public final tq1 G(int i) {
        return (tq1) this.zzh.get(i);
    }

    public final void H(int i, tq1 tq1Var) {
        tq1Var.getClass();
        q12 q12Var = this.zzh;
        if (!q12Var.c()) {
            this.zzh = t02.o(q12Var);
        }
        this.zzh.set(i, tq1Var);
    }

    public final void K(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public final int L() {
        return this.zzf;
    }

    public final uq1 O() {
        uq1 uq1Var = this.zzj;
        return uq1Var == null ? uq1.I() : uq1Var;
    }

    public final String P() {
        return this.zzg;
    }

    public final List Q() {
        return this.zzh;
    }

    public final boolean R() {
        return this.zzk;
    }

    public final boolean S() {
        return this.zzl;
    }

    public final boolean T() {
        return this.zzm;
    }

    public final boolean U() {
        return (this.zze & 8) != 0;
    }

    public final boolean V() {
        return (this.zze & 1) != 0;
    }

    public final boolean W() {
        return (this.zze & 64) != 0;
    }

    public final int j() {
        return this.zzh.size();
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (qq1.a[i - 1]) {
            case 1:
                return new sq1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", tq1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (sq1.class) {
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
