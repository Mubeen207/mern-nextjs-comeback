package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class ks1 extends t02 implements d42 {
    private static final ks1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(ks1.zzc);
        }

        public final a r(boolean z) {
            n();
            ((ks1) this.n).I(z);
            return this;
        }

        public final a s(boolean z) {
            n();
            ((ks1) this.n).L(z);
            return this;
        }

        public final a t(boolean z) {
            n();
            ((ks1) this.n).O(z);
            return this;
        }

        public final a u(boolean z) {
            n();
            ((ks1) this.n).Q(z);
            return this;
        }

        public final a v(boolean z) {
            n();
            ((ks1) this.n).T(z);
            return this;
        }

        public final a w(boolean z) {
            n();
            ((ks1) this.n).W(z);
            return this;
        }

        public final a x(boolean z) {
            n();
            ((ks1) this.n).Z(z);
            return this;
        }

        public /* synthetic */ a(is1 is1Var) {
            this();
        }
    }

    static {
        ks1 ks1Var = new ks1();
        zzc = ks1Var;
        t02.t(ks1.class, ks1Var);
    }

    public static a G() {
        return (a) zzc.w();
    }

    public static ks1 M() {
        return zzc;
    }

    public final void I(boolean z) {
        this.zze |= 32;
        this.zzk = z;
    }

    public final void L(boolean z) {
        this.zze |= 16;
        this.zzj = z;
    }

    public final void O(boolean z) {
        this.zze |= 1;
        this.zzf = z;
    }

    public final void Q(boolean z) {
        this.zze |= 64;
        this.zzl = z;
    }

    public final boolean R() {
        return this.zzk;
    }

    public final void T(boolean z) {
        this.zze |= 2;
        this.zzg = z;
    }

    public final boolean U() {
        return this.zzj;
    }

    public final void W(boolean z) {
        this.zze |= 4;
        this.zzh = z;
    }

    public final boolean X() {
        return this.zzf;
    }

    public final void Z(boolean z) {
        this.zze |= 8;
        this.zzi = z;
    }

    public final boolean a0() {
        return this.zzl;
    }

    public final boolean b0() {
        return this.zzg;
    }

    public final boolean c0() {
        return this.zzh;
    }

    public final boolean d0() {
        return this.zzi;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (is1.a[i - 1]) {
            case 1:
                return new ks1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (ks1.class) {
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
