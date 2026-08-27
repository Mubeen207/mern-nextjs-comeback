package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class vs1 extends t02 implements d42 {
    private static final vs1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private int zzf;
    private s12 zzg = t02.A();

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(vs1.zzc);
        }

        public final a r(int i) {
            n();
            ((vs1) this.n).L(i);
            return this;
        }

        public final a s(Iterable iterable) {
            n();
            ((vs1) this.n).J(iterable);
            return this;
        }

        public /* synthetic */ a(is1 is1Var) {
            this();
        }
    }

    static {
        vs1 vs1Var = new vs1();
        zzc = vs1Var;
        t02.t(vs1.class, vs1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Iterable iterable) {
        s12 s12Var = this.zzg;
        if (!s12Var.c()) {
            this.zzg = t02.p(s12Var);
        }
        dx1.f(iterable, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(int i) {
        this.zze |= 1;
        this.zzf = i;
    }

    public static a M() {
        return (a) zzc.w();
    }

    public final long G(int i) {
        return this.zzg.j(i);
    }

    public final int K() {
        return this.zzf;
    }

    public final List O() {
        return this.zzg;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzg.size();
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (is1.a[i - 1]) {
            case 1:
                return new vs1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (vs1.class) {
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
