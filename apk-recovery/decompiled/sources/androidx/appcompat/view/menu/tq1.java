package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class tq1 extends t02 implements d42 {
    private static final tq1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private wq1 zzf;
    private uq1 zzg;
    private boolean zzh;
    private String zzi = "";

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(tq1.zzc);
        }

        public final a r(String str) {
            n();
            ((tq1) this.n).I(str);
            return this;
        }

        public /* synthetic */ a(qq1 qq1Var) {
            this();
        }
    }

    static {
        tq1 tq1Var = new tq1();
        zzc = tq1Var;
        t02.t(tq1.class, tq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String str) {
        str.getClass();
        this.zze |= 8;
        this.zzi = str;
    }

    public static tq1 J() {
        return zzc;
    }

    public final uq1 K() {
        uq1 uq1Var = this.zzg;
        return uq1Var == null ? uq1.I() : uq1Var;
    }

    public final wq1 L() {
        wq1 wq1Var = this.zzf;
        return wq1Var == null ? wq1.I() : wq1Var;
    }

    public final String M() {
        return this.zzi;
    }

    public final boolean N() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zze & 4) != 0;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (qq1.a[i - 1]) {
            case 1:
                return new tq1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (tq1.class) {
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
