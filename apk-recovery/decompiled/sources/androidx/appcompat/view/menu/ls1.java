package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import androidx.appcompat.view.menu.us1;
/* loaded from: classes.dex */
public final class ls1 extends t02 implements d42 {
    private static final ls1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private int zzf;
    private us1 zzg;
    private us1 zzh;
    private boolean zzi;

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(ls1.zzc);
        }

        public final a r(int i) {
            n();
            ((ls1) this.n).G(i);
            return this;
        }

        public final a s(us1.a aVar) {
            n();
            ((ls1) this.n).K((us1) ((t02) aVar.j()));
            return this;
        }

        public final a t(us1 us1Var) {
            n();
            ((ls1) this.n).O(us1Var);
            return this;
        }

        public final a u(boolean z) {
            n();
            ((ls1) this.n).L(z);
            return this;
        }

        public /* synthetic */ a(is1 is1Var) {
            this();
        }
    }

    static {
        ls1 ls1Var = new ls1();
        zzc = ls1Var;
        t02.t(ls1.class, ls1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(us1 us1Var) {
        us1Var.getClass();
        this.zzg = us1Var;
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(boolean z) {
        this.zze |= 8;
        this.zzi = z;
    }

    public static a M() {
        return (a) zzc.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(us1 us1Var) {
        us1Var.getClass();
        this.zzh = us1Var;
        this.zze |= 4;
    }

    public final void G(int i) {
        this.zze |= 1;
        this.zzf = i;
    }

    public final us1 Q() {
        us1 us1Var = this.zzg;
        return us1Var == null ? us1.X() : us1Var;
    }

    public final us1 R() {
        us1 us1Var = this.zzh;
        return us1Var == null ? us1.X() : us1Var;
    }

    public final boolean S() {
        return this.zzi;
    }

    public final boolean T() {
        return (this.zze & 1) != 0;
    }

    public final boolean U() {
        return (this.zze & 8) != 0;
    }

    public final boolean V() {
        return (this.zze & 4) != 0;
    }

    public final int j() {
        return this.zzf;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (is1.a[i - 1]) {
            case 1:
                return new ls1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (ls1.class) {
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
