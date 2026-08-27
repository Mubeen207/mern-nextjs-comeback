package androidx.appcompat.view.menu;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class qp0 implements Serializable {
    public static final a m = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {
        public final Throwable m;

        public b(Throwable th) {
            c60.e(th, "exception");
            this.m = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && c60.a(this.m, ((b) obj).m);
        }

        public int hashCode() {
            return this.m.hashCode();
        }

        public String toString() {
            return "Failure(" + this.m + ')';
        }
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).m;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
