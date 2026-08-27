package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class mt1 extends t02 implements d42 {
    private static final mt1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private q12 zzf = t02.B();
    private kt1 zzg;

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(mt1.zzc);
        }

        public /* synthetic */ a(jt1 jt1Var) {
            this();
        }
    }

    static {
        mt1 mt1Var = new mt1();
        zzc = mt1Var;
        t02.t(mt1.class, mt1Var);
    }

    public final kt1 G() {
        kt1 kt1Var = this.zzg;
        return kt1Var == null ? kt1.H() : kt1Var;
    }

    public final List I() {
        return this.zzf;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (jt1.a[i - 1]) {
            case 1:
                return new mt1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", nt1.class, "zzg"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (mt1.class) {
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
