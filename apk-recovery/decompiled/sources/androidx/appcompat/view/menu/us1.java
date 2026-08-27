package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class us1 extends t02 implements d42 {
    private static final us1 zzc;
    private static volatile w42 zzd;
    private s12 zze = t02.A();
    private s12 zzf = t02.A();
    private q12 zzg = t02.B();
    private q12 zzh = t02.B();

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(us1.zzc);
        }

        public final a r() {
            n();
            ((us1) this.n).c0();
            return this;
        }

        public final a s(Iterable iterable) {
            n();
            ((us1) this.n).I(iterable);
            return this;
        }

        public final a t() {
            n();
            ((us1) this.n).d0();
            return this;
        }

        public final a u(Iterable iterable) {
            n();
            ((us1) this.n).M(iterable);
            return this;
        }

        public final a v() {
            n();
            ((us1) this.n).e0();
            return this;
        }

        public final a w(Iterable iterable) {
            n();
            ((us1) this.n).Q(iterable);
            return this;
        }

        public final a x() {
            n();
            ((us1) this.n).f0();
            return this;
        }

        public final a y(Iterable iterable) {
            n();
            ((us1) this.n).U(iterable);
            return this;
        }

        public /* synthetic */ a(is1 is1Var) {
            this();
        }
    }

    static {
        us1 us1Var = new us1();
        zzc = us1Var;
        t02.t(us1.class, us1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(Iterable iterable) {
        q12 q12Var = this.zzg;
        if (!q12Var.c()) {
            this.zzg = t02.o(q12Var);
        }
        dx1.f(iterable, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Iterable iterable) {
        s12 s12Var = this.zzf;
        if (!s12Var.c()) {
            this.zzf = t02.p(s12Var);
        }
        dx1.f(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(Iterable iterable) {
        q12 q12Var = this.zzh;
        if (!q12Var.c()) {
            this.zzh = t02.o(q12Var);
        }
        dx1.f(iterable, this.zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(Iterable iterable) {
        s12 s12Var = this.zze;
        if (!s12Var.c()) {
            this.zze = t02.p(s12Var);
        }
        dx1.f(iterable, this.zze);
    }

    public static a V() {
        return (a) zzc.w();
    }

    public static us1 X() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        this.zzg = t02.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        this.zzf = t02.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        this.zze = t02.A();
    }

    public final int J() {
        return this.zzf.size();
    }

    public final int N() {
        return this.zzh.size();
    }

    public final int R() {
        return this.zze.size();
    }

    public final List Y() {
        return this.zzg;
    }

    public final List Z() {
        return this.zzf;
    }

    public final List a0() {
        return this.zzh;
    }

    public final List b0() {
        return this.zze;
    }

    public final void e0() {
        this.zzh = t02.B();
    }

    public final int j() {
        return this.zzg.size();
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (is1.a[i - 1]) {
            case 1:
                return new us1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", ms1.class, "zzh", vs1.class});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (us1.class) {
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
