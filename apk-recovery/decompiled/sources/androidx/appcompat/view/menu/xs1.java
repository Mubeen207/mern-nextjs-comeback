package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class xs1 {
    public static final Object h = new Object();
    public final String a;
    public final fs1 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public volatile Object f;
    public volatile Object g;

    public final Object a(Object obj) {
        synchronized (this.e) {
        }
        if (obj != null) {
            return obj;
        }
        if (ds1.a == null) {
            return this.c;
        }
        synchronized (h) {
            try {
                if (pf1.a()) {
                    return this.g == null ? this.c : this.g;
                }
                try {
                    for (xs1 xs1Var : vi1.z0()) {
                        if (pf1.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            fs1 fs1Var = xs1Var.b;
                            if (fs1Var != null) {
                                obj2 = fs1Var.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (h) {
                            xs1Var.g = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                fs1 fs1Var2 = this.b;
                if (fs1Var2 == null) {
                    return this.c;
                }
                try {
                    return fs1Var2.a();
                } catch (IllegalStateException unused3) {
                    return this.c;
                } catch (SecurityException unused4) {
                    return this.c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.a;
    }

    public xs1(String str, Object obj, Object obj2, fs1 fs1Var) {
        this.e = new Object();
        this.f = null;
        this.g = null;
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.b = fs1Var;
    }
}
