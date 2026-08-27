package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class kt1 extends t02 implements d42 {
    private static final kt1 zzc;
    private static volatile w42 zzd;
    private q12 zze = t02.B();

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(kt1.zzc);
        }

        public /* synthetic */ a(jt1 jt1Var) {
            this();
        }
    }

    static {
        kt1 kt1Var = new kt1();
        zzc = kt1Var;
        t02.t(kt1.class, kt1Var);
    }

    public static kt1 H() {
        return zzc;
    }

    public final List I() {
        return this.zze;
    }

    public final int j() {
        return this.zze.size();
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (jt1.a[i - 1]) {
            case 1:
                return new kt1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", lt1.class});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (kt1.class) {
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
