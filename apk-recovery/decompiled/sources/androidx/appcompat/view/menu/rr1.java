package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class rr1 extends t02 implements d42 {
    private static final rr1 zzc;
    private static volatile w42 zzd;
    private int zze;
    private boolean zzi;
    private q12 zzf = t02.B();
    private q12 zzg = t02.B();
    private q12 zzh = t02.B();
    private q12 zzj = t02.B();

    /* loaded from: classes.dex */
    public static final class a extends t02.b implements d42 {
        public a() {
            super(rr1.zzc);
        }

        public /* synthetic */ a(qr1 qr1Var) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends t02 implements d42 {
        private static final b zzc;
        private static volatile w42 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes.dex */
        public static final class a extends t02.b implements d42 {
            public a() {
                super(b.zzc);
            }

            public /* synthetic */ a(qr1 qr1Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzc = bVar;
            t02.t(b.class, bVar);
        }

        public final d H() {
            d c = d.c(this.zzg);
            return c == null ? d.CONSENT_STATUS_UNSPECIFIED : c;
        }

        public final e I() {
            e c = e.c(this.zzf);
            return c == null ? e.CONSENT_TYPE_UNSPECIFIED : c;
        }

        @Override // androidx.appcompat.view.menu.t02
        public final Object q(int i, Object obj, Object obj2) {
            switch (qr1.a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(null);
                case t02.c.c /* 3 */:
                    return t02.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.e(), "zzg", d.e()});
                case 4:
                    return zzc;
                case t02.c.e /* 5 */:
                    w42 w42Var = zzd;
                    if (w42Var == null) {
                        synchronized (b.class) {
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

    /* loaded from: classes.dex */
    public static final class c extends t02 implements d42 {
        private static final c zzc;
        private static volatile w42 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes.dex */
        public static final class a extends t02.b implements d42 {
            public a() {
                super(c.zzc);
            }

            public /* synthetic */ a(qr1 qr1Var) {
                this();
            }
        }

        static {
            c cVar = new c();
            zzc = cVar;
            t02.t(c.class, cVar);
        }

        public final e H() {
            e c = e.c(this.zzg);
            return c == null ? e.CONSENT_TYPE_UNSPECIFIED : c;
        }

        public final e I() {
            e c = e.c(this.zzf);
            return c == null ? e.CONSENT_TYPE_UNSPECIFIED : c;
        }

        @Override // androidx.appcompat.view.menu.t02
        public final Object q(int i, Object obj, Object obj2) {
            switch (qr1.a[i - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case t02.c.c /* 3 */:
                    return t02.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.e(), "zzg", e.e()});
                case 4:
                    return zzc;
                case t02.c.e /* 5 */:
                    w42 w42Var = zzd;
                    if (w42Var == null) {
                        synchronized (c.class) {
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

    /* loaded from: classes.dex */
    public enum d implements k12 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);
        
        public static final i12 q = new as1();
        public final int m;

        d(int i) {
            this.m = i;
        }

        public static d c(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return DENIED;
                }
                return GRANTED;
            }
            return CONSENT_STATUS_UNSPECIFIED;
        }

        public static o12 e() {
            return cs1.a;
        }

        @Override // androidx.appcompat.view.menu.k12
        public final int a() {
            return this.m;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.m + " name=" + name() + '>';
        }
    }

    /* loaded from: classes.dex */
    public enum e implements k12 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);
        
        public static final i12 s = new gs1();
        public final int m;

        e(int i) {
            this.m = i;
        }

        public static e c(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return AD_PERSONALIZATION;
                        }
                        return AD_USER_DATA;
                    }
                    return ANALYTICS_STORAGE;
                }
                return AD_STORAGE;
            }
            return CONSENT_TYPE_UNSPECIFIED;
        }

        public static o12 e() {
            return es1.a;
        }

        @Override // androidx.appcompat.view.menu.k12
        public final int a() {
            return this.m;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.m + " name=" + name() + '>';
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends t02 implements d42 {
        private static final f zzc;
        private static volatile w42 zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* loaded from: classes.dex */
        public static final class a extends t02.b implements d42 {
            public a() {
                super(f.zzc);
            }

            public /* synthetic */ a(qr1 qr1Var) {
                this();
            }
        }

        static {
            f fVar = new f();
            zzc = fVar;
            t02.t(f.class, fVar);
        }

        public final String H() {
            return this.zzf;
        }

        @Override // androidx.appcompat.view.menu.t02
        public final Object q(int i, Object obj, Object obj2) {
            switch (qr1.a[i - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a(null);
                case t02.c.c /* 3 */:
                    return t02.r(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case t02.c.e /* 5 */:
                    w42 w42Var = zzd;
                    if (w42Var == null) {
                        synchronized (f.class) {
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

    static {
        rr1 rr1Var = new rr1();
        zzc = rr1Var;
        t02.t(rr1.class, rr1Var);
    }

    public static rr1 H() {
        return zzc;
    }

    public final List I() {
        return this.zzh;
    }

    public final List J() {
        return this.zzf;
    }

    public final List K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzi;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    @Override // androidx.appcompat.view.menu.t02
    public final Object q(int i, Object obj, Object obj2) {
        switch (qr1.a[i - 1]) {
            case 1:
                return new rr1();
            case 2:
                return new a(null);
            case t02.c.c /* 3 */:
                return t02.r(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", b.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", b.class});
            case 4:
                return zzc;
            case t02.c.e /* 5 */:
                w42 w42Var = zzd;
                if (w42Var == null) {
                    synchronized (rr1.class) {
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
