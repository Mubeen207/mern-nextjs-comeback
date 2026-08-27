package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class vq1 extends t02 implements d42 {
    private static final vq1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private tq1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(vq1.zzc);
        }

        public final a r(String str) {
            n();
            ((vq1) this.n).H(str);
            return this;
        }

        public /* synthetic */ a(qq1 qq1Var) {
            this();
        }
    }

    static {
        vq1 vq1Var = new vq1();
        zzc = vq1Var;
        t02.t(vq1.class, vq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a J() {
        return (a) zzc.w();
    }

    public final tq1 I() {
        tq1 tq1Var = this.zzh;
        return tq1Var == null ? tq1.J() : tq1Var;
    }

    public final String L() {
        return this.zzg;
    }

    public final boolean M() {
        return this.zzi;
    }

    public final boolean N() {
        return this.zzj;
    }

    public final boolean O() {
        return this.zzk;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
    }

    public final boolean Q() {
        return (this.zze & 32) != 0;
    }

    public final int j() {
        return this.zzf;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (qq1.a[i - 1]) {
            case 1:
                return new vq1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (vq1.class) {
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
