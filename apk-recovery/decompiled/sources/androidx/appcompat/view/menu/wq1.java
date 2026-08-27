package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class wq1 extends t02 implements d42 {
    private static final wq1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private q12 zzi = t02.B();

    /* loaded from: classes.dex */
    public enum a implements k12 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        
        public static final i12 u = new or1();
        public final int m;

        a(int i) {
            this.m = i;
        }

        public static a c(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case t02.c.c /* 3 */:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case t02.c.e /* 5 */:
                    return EXACT;
                case t02.c.f /* 6 */:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static o12 e() {
            return dr1.a;
        }

        @Override // androidx.appcompat.view.menu.k12
        public final int a() {
            return this.m;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.m + " name=" + name() + '>';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends t02.b implements d42 {
        public b() {
            super(wq1.zzc);
        }

        public /* synthetic */ b(qq1 qq1Var) {
            this();
        }
    }

    static {
        wq1 wq1Var = new wq1();
        zzc = wq1Var;
        t02.t(wq1.class, wq1Var);
    }

    public static wq1 I() {
        return zzc;
    }

    public final a G() {
        a c = a.c(this.zzf);
        return c == null ? a.UNKNOWN_MATCH_TYPE : c;
    }

    public final String J() {
        return this.zzg;
    }

    public final List K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zze & 4) != 0;
    }

    public final boolean N() {
        return (this.zze & 2) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzi.size();
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (qq1.a[i - 1]) {
            case 1:
                return new wq1();
            case 2:
                return new b(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", a.e(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (wq1.class) {
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
