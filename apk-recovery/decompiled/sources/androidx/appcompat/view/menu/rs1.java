package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ss1;
import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class rs1 extends t02 implements d42 {
    private static final rs1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private q12 zzf = t02.B();
    private String zzg = "";

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(rs1.zzc);
        }

        public final int r() {
            return ((rs1) this.n).j();
        }

        public final a s(ss1.a aVar) {
            n();
            ((rs1) this.n).I((ss1) ((t02) aVar.j()));
            return this;
        }

        public final ss1 t(int i) {
            return ((rs1) this.n).G(0);
        }

        public /* synthetic */ a(is1 is1Var) {
            this();
        }
    }

    static {
        rs1 rs1Var = new rs1();
        zzc = rs1Var;
        t02.t(rs1.class, rs1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(ss1 ss1Var) {
        ss1Var.getClass();
        q12 q12Var = this.zzf;
        if (!q12Var.c()) {
            this.zzf = t02.o(q12Var);
        }
        this.zzf.add(ss1Var);
    }

    public static a J() {
        return (a) zzc.w();
    }

    public final ss1 G(int i) {
        return (ss1) this.zzf.get(0);
    }

    public final List L() {
        return this.zzf;
    }

    public final int j() {
        return this.zzf.size();
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (is1.a[i - 1]) {
            case 1:
                return new rs1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000", new Object[]{"zze", "zzf", ss1.class, "zzg"});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (rs1.class) {
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
