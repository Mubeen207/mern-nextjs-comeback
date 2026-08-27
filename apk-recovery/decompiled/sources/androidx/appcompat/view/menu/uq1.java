package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class uq1 extends t02 implements d42 {
    private static final uq1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(uq1.zzc);
        }

        public /* synthetic */ a(qq1 qq1Var) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum b implements k12 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        
        public static final i12 s = new zq1();
        public final int m;

        b(int i) {
            this.m = i;
        }

        public static b c(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return BETWEEN;
                        }
                        return EQUAL;
                    }
                    return GREATER_THAN;
                }
                return LESS_THAN;
            }
            return UNKNOWN_COMPARISON_TYPE;
        }

        public static o12 e() {
            return br1.a;
        }

        @Override // androidx.appcompat.view.menu.k12
        public final int a() {
            return this.m;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.m + " name=" + name() + '>';
        }
    }

    static {
        uq1 uq1Var = new uq1();
        zzc = uq1Var;
        t02.t(uq1.class, uq1Var);
    }

    public static uq1 I() {
        return zzc;
    }

    public final b G() {
        b c = b.c(this.zzf);
        return c == null ? b.UNKNOWN_COMPARISON_TYPE : c;
    }

    public final String J() {
        return this.zzh;
    }

    public final String K() {
        return this.zzj;
    }

    public final String L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final boolean O() {
        return (this.zze & 4) != 0;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final boolean Q() {
        return (this.zze & 16) != 0;
    }

    public final boolean R() {
        return (this.zze & 8) != 0;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (qq1.a[i - 1]) {
            case 1:
                return new uq1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", b.e(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (uq1.class) {
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
