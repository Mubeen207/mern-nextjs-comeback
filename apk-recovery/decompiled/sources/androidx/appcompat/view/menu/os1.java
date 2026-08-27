package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class os1 extends t02 implements d42 {
    private static final os1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(os1.zzc);
        }

        public final a r(long j) {
            n();
            ((os1) this.n).H(j);
            return this;
        }

        public final a s(String str) {
            n();
            ((os1) this.n).K(str);
            return this;
        }

        public /* synthetic */ a(is1 is1Var) {
            this();
        }
    }

    static {
        os1 os1Var = new os1();
        zzc = os1Var;
        t02.t(os1.class, os1Var);
    }

    public static a G() {
        return (a) zzc.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(long j) {
        this.zze |= 2;
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (is1.a[i - 1]) {
            case 1:
                return new os1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (os1.class) {
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
