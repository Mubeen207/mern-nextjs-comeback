package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ps1;
import androidx.appcompat.view.menu.t02;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ns1 extends t02 implements d42 {
    private static final ns1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private q12 zzf = t02.B();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(ns1.zzc);
        }

        public final long A() {
            return ((ns1) this.n).X();
        }

        public final a B(long j) {
            n();
            ((ns1) this.n).V(j);
            return this;
        }

        public final ps1 C(int i) {
            return ((ns1) this.n).G(i);
        }

        public final long D() {
            return ((ns1) this.n).Y();
        }

        public final a E() {
            n();
            ((ns1) this.n).g0();
            return this;
        }

        public final String F() {
            return ((ns1) this.n).b0();
        }

        public final List G() {
            return Collections.unmodifiableList(((ns1) this.n).c0());
        }

        public final boolean H() {
            return ((ns1) this.n).f0();
        }

        public final int r() {
            return ((ns1) this.n).T();
        }

        public final a s(int i) {
            n();
            ((ns1) this.n).U(i);
            return this;
        }

        public final a t(int i, ps1.a aVar) {
            n();
            ((ns1) this.n).H(i, (ps1) ((t02) aVar.j()));
            return this;
        }

        public final a u(int i, ps1 ps1Var) {
            n();
            ((ns1) this.n).H(i, ps1Var);
            return this;
        }

        public final a v(long j) {
            n();
            ((ns1) this.n).I(j);
            return this;
        }

        public final a w(ps1.a aVar) {
            n();
            ((ns1) this.n).Q((ps1) ((t02) aVar.j()));
            return this;
        }

        public final a x(ps1 ps1Var) {
            n();
            ((ns1) this.n).Q(ps1Var);
            return this;
        }

        public final a y(Iterable iterable) {
            n();
            ((ns1) this.n).R(iterable);
            return this;
        }

        public final a z(String str) {
            n();
            ((ns1) this.n).S(str);
            return this;
        }

        public /* synthetic */ a(is1 is1Var) {
            this();
        }
    }

    static {
        ns1 ns1Var = new ns1();
        zzc = ns1Var;
        t02.t(ns1.class, ns1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(long j) {
        this.zze |= 4;
        this.zzi = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(ps1 ps1Var) {
        ps1Var.getClass();
        h0();
        this.zzf.add(ps1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzg = str;
    }

    public static a Z() {
        return (a) zzc.w();
    }

    public final ps1 G(int i) {
        return (ps1) this.zzf.get(i);
    }

    public final void H(int i, ps1 ps1Var) {
        ps1Var.getClass();
        h0();
        this.zzf.set(i, ps1Var);
    }

    public final void R(Iterable iterable) {
        h0();
        dx1.f(iterable, this.zzf);
    }

    public final int T() {
        return this.zzf.size();
    }

    public final void U(int i) {
        h0();
        this.zzf.remove(i);
    }

    public final void V(long j) {
        this.zze |= 2;
        this.zzh = j;
    }

    public final long X() {
        return this.zzi;
    }

    public final long Y() {
        return this.zzh;
    }

    public final String b0() {
        return this.zzg;
    }

    public final List c0() {
        return this.zzf;
    }

    public final boolean d0() {
        return (this.zze & 8) != 0;
    }

    public final boolean e0() {
        return (this.zze & 4) != 0;
    }

    public final boolean f0() {
        return (this.zze & 2) != 0;
    }

    public final void g0() {
        this.zzf = t02.B();
    }

    public final void h0() {
        q12 q12Var = this.zzf;
        if (q12Var.c()) {
            return;
        }
        this.zzf = t02.o(q12Var);
    }

    public final int j() {
        return this.zzj;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (is1.a[i - 1]) {
            case 1:
                return new ns1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", ps1.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (ns1.class) {
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
