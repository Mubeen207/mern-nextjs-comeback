package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.t02;
import androidx.appcompat.view.menu.tr1;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ur1 extends t02 implements d42 {
    private static final ur1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private rr1 zzt;
    private vr1 zzu;
    private String zzg = "";
    private q12 zzi = t02.B();
    private q12 zzj = t02.B();
    private q12 zzk = t02.B();
    private String zzl = "";
    private q12 zzn = t02.B();
    private q12 zzo = t02.B();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(ur1.zzc);
        }

        public final int r() {
            return ((ur1) this.n).K();
        }

        public final tr1 s(int i) {
            return ((ur1) this.n).G(i);
        }

        public final a t(int i, tr1.a aVar) {
            n();
            ((ur1) this.n).H(i, (tr1) ((t02) aVar.j()));
            return this;
        }

        public final a u() {
            n();
            ((ur1) this.n).c0();
            return this;
        }

        public final String v() {
            return ((ur1) this.n).T();
        }

        public final List w() {
            return Collections.unmodifiableList(((ur1) this.n).U());
        }

        public final List x() {
            return Collections.unmodifiableList(((ur1) this.n).V());
        }

        public /* synthetic */ a(qr1 qr1Var) {
            this();
        }
    }

    static {
        ur1 ur1Var = new ur1();
        zzc = ur1Var;
        t02.t(ur1.class, ur1Var);
    }

    public static a N() {
        return (a) zzc.w();
    }

    public static ur1 P() {
        return zzc;
    }

    public final tr1 G(int i) {
        return (tr1) this.zzj.get(i);
    }

    public final void H(int i, tr1 tr1Var) {
        tr1Var.getClass();
        q12 q12Var = this.zzj;
        if (!q12Var.c()) {
            this.zzj = t02.o(q12Var);
        }
        this.zzj.set(i, tr1Var);
    }

    public final int K() {
        return this.zzj.size();
    }

    public final long L() {
        return this.zzf;
    }

    public final rr1 M() {
        rr1 rr1Var = this.zzt;
        return rr1Var == null ? rr1.H() : rr1Var;
    }

    public final String Q() {
        return this.zzg;
    }

    public final String R() {
        return this.zzr;
    }

    public final String S() {
        return this.zzq;
    }

    public final String T() {
        return this.zzp;
    }

    public final List U() {
        return this.zzk;
    }

    public final List V() {
        return this.zzo;
    }

    public final List W() {
        return this.zzn;
    }

    public final List X() {
        return this.zzi;
    }

    public final boolean Y() {
        return this.zzm;
    }

    public final boolean Z() {
        return (this.zze & PackageParser.PARSE_TRUSTED_OVERLAY) != 0;
    }

    public final boolean a0() {
        return (this.zze & 2) != 0;
    }

    public final boolean b0() {
        return (this.zze & 1) != 0;
    }

    public final void c0() {
        this.zzk = t02.B();
    }

    public final int j() {
        return this.zzn.size();
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (qr1.a[i - 1]) {
            case 1:
                return new ur1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b\u000fဉ\t\u0010ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", xr1.class, "zzj", tr1.class, "zzk", rq1.class, "zzl", "zzm", "zzn", mt1.class, "zzo", sr1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (ur1.class) {
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
