package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class ps1 extends t02 implements d42 {
    private static final ps1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private q12 zzk = t02.B();

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(ps1.zzc);
        }

        public final a A() {
            n();
            ((ps1) this.n).m0();
            return this;
        }

        public final a B() {
            n();
            ((ps1) this.n).n0();
            return this;
        }

        public final int r() {
            return ((ps1) this.n).V();
        }

        public final a s(double d) {
            n();
            ((ps1) this.n).H(d);
            return this;
        }

        public final a t(long j) {
            n();
            ((ps1) this.n).I(j);
            return this;
        }

        public final a u(a aVar) {
            n();
            ((ps1) this.n).a0((ps1) ((t02) aVar.j()));
            return this;
        }

        public final a v(Iterable iterable) {
            n();
            ((ps1) this.n).P(iterable);
            return this;
        }

        public final a w(String str) {
            n();
            ((ps1) this.n).Q(str);
            return this;
        }

        public final a x() {
            n();
            ((ps1) this.n).k0();
            return this;
        }

        public final a y(String str) {
            n();
            ((ps1) this.n).U(str);
            return this;
        }

        public final a z() {
            n();
            ((ps1) this.n).l0();
            return this;
        }

        public /* synthetic */ a(is1 is1Var) {
            this();
        }
    }

    static {
        ps1 ps1Var = new ps1();
        zzc = ps1Var;
        t02.t(ps1.class, ps1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(long j) {
        this.zze |= 4;
        this.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Iterable iterable) {
        o0();
        dx1.f(iterable, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    public static a Z() {
        return (a) zzc.w();
    }

    public final double G() {
        return this.zzj;
    }

    public final void H(double d) {
        this.zze |= 16;
        this.zzj = d;
    }

    public final float R() {
        return this.zzi;
    }

    public final void U(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public final int V() {
        return this.zzk.size();
    }

    public final long X() {
        return this.zzh;
    }

    public final void a0(ps1 ps1Var) {
        ps1Var.getClass();
        o0();
        this.zzk.add(ps1Var);
    }

    public final String c0() {
        return this.zzf;
    }

    public final String d0() {
        return this.zzg;
    }

    public final List e0() {
        return this.zzk;
    }

    public final boolean f0() {
        return (this.zze & 16) != 0;
    }

    public final boolean g0() {
        return (this.zze & 8) != 0;
    }

    public final boolean h0() {
        return (this.zze & 4) != 0;
    }

    public final boolean i0() {
        return (this.zze & 1) != 0;
    }

    public final boolean j0() {
        return (this.zze & 2) != 0;
    }

    public final void k0() {
        this.zze &= -17;
        this.zzj = 0.0d;
    }

    public final void l0() {
        this.zze &= -5;
        this.zzh = 0L;
    }

    public final void m0() {
        this.zzk = t02.B();
    }

    public final void n0() {
        this.zze &= -3;
        this.zzg = zzc.zzg;
    }

    public final void o0() {
        q12 q12Var = this.zzk;
        if (q12Var.c()) {
            return;
        }
        this.zzk = t02.o(q12Var);
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (is1.a[i - 1]) {
            case 1:
                return new ps1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", ps1.class});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (ps1.class) {
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
