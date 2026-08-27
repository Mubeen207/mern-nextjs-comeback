package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class nt1 extends t02 implements d42 {
    private static final nt1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private int zzf;
    private q12 zzg = t02.B();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(nt1.zzc);
        }

        public /* synthetic */ a(jt1 jt1Var) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum b implements k12 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);
        
        public static final i12 s = new qt1();
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
                            return STATEMENT;
                        }
                        return BOOLEAN;
                    }
                    return NUMBER;
                }
                return STRING;
            }
            return UNKNOWN;
        }

        public static o12 e() {
            return ut1.a;
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
        nt1 nt1Var = new nt1();
        zzc = nt1Var;
        t02.t(nt1.class, nt1Var);
    }

    public final double G() {
        return this.zzk;
    }

    public final b H() {
        b c = b.c(this.zzf);
        return c == null ? b.UNKNOWN : c;
    }

    public final String J() {
        return this.zzh;
    }

    public final String K() {
        return this.zzi;
    }

    public final List L() {
        return this.zzg;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        return (this.zze & 8) != 0;
    }

    public final boolean O() {
        return (this.zze & 16) != 0;
    }

    public final boolean P() {
        return (this.zze & 4) != 0;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (jt1.a[i - 1]) {
            case 1:
                return new nt1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", b.e(), "zzg", nt1.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (nt1.class) {
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
