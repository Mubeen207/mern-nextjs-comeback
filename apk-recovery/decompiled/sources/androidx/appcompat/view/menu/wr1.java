package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class wr1 extends t02 implements d42 {
    private static final wr1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(wr1.zzc);
        }

        public /* synthetic */ a(qr1 qr1Var) {
            this();
        }
    }

    static {
        wr1 wr1Var = new wr1();
        zzc = wr1Var;
        t02.t(wr1.class, wr1Var);
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (qr1.a[i - 1]) {
            case 1:
                return new wr1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (wr1.class) {
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
