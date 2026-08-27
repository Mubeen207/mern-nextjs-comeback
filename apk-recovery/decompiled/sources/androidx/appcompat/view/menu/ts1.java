package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.os1;
import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class ts1 extends t02 implements d42 {
    private static final ts1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private int zzf = 1;
    private q12 zzg = t02.B();

    /* loaded from: classes.dex */
    public enum a implements k12 {
        RADS(1),
        PROVISIONING(2);
        
        public static final i12 p = new ht1();
        public final int m;

        a(int i) {
            this.m = i;
        }

        public static a c(int i) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return PROVISIONING;
            }
            return RADS;
        }

        public static o12 e() {
            return ft1.a;
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
            super(ts1.zzc);
        }

        public final b r(os1.a aVar) {
            n();
            ((ts1) this.n).H((os1) ((t02) aVar.j()));
            return this;
        }

        public /* synthetic */ b(is1 is1Var) {
            this();
        }
    }

    static {
        ts1 ts1Var = new ts1();
        zzc = ts1Var;
        t02.t(ts1.class, ts1Var);
    }

    public static b G() {
        return (b) zzc.w();
    }

    public final void H(os1 os1Var) {
        os1Var.getClass();
        q12 q12Var = this.zzg;
        if (!q12Var.c()) {
            this.zzg = t02.o(q12Var);
        }
        this.zzg.add(os1Var);
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (is1.a[i - 1]) {
            case 1:
                return new ts1();
            case 2:
                return new b(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", a.e(), "zzg", os1.class});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (ts1.class) {
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
