package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class tr1 extends t02 implements d42 {
    private static final tr1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(tr1.zzc);
        }

        public final int r() {
            return ((tr1) this.n).j();
        }

        public final a s(String str) {
            n();
            ((tr1) this.n).H(str);
            return this;
        }

        public final String t() {
            return ((tr1) this.n).J();
        }

        public final boolean u() {
            return ((tr1) this.n).K();
        }

        public final boolean v() {
            return ((tr1) this.n).L();
        }

        public final boolean w() {
            return ((tr1) this.n).M();
        }

        public final boolean x() {
            return ((tr1) this.n).N();
        }

        public final boolean y() {
            return ((tr1) this.n).O();
        }

        public /* synthetic */ a(qr1 qr1Var) {
            this();
        }
    }

    static {
        tr1 tr1Var = new tr1();
        zzc = tr1Var;
        t02.t(tr1.class, tr1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zze & 2) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 8) != 0;
    }

    public final int j() {
        return this.zzi;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (qr1.a[i - 1]) {
            case 1:
                return new tr1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (tr1.class) {
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
