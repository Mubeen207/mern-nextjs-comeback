package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class ms1 extends t02 implements d42 {
    private static final ms1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(ms1.zzc);
        }

        public final a r(int i) {
            n();
            ((ms1) this.n).G(i);
            return this;
        }

        public final a s(long j) {
            n();
            ((ms1) this.n).H(j);
            return this;
        }

        public /* synthetic */ a(is1 is1Var) {
            this();
        }
    }

    static {
        ms1 ms1Var = new ms1();
        zzc = ms1Var;
        t02.t(ms1.class, ms1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i) {
        this.zze |= 1;
        this.zzf = i;
    }

    public static a L() {
        return (a) zzc.w();
    }

    public final void H(long j) {
        this.zze |= 2;
        this.zzg = j;
    }

    public final long K() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zze & 2) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzf;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (is1.a[i - 1]) {
            case 1:
                return new ms1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (ms1.class) {
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
