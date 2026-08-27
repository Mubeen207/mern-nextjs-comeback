package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class bb {
    public static final b a = new b(null);
    public static final c b = new c();

    /* loaded from: classes.dex */
    public static final class a extends c {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && c60.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // androidx.appcompat.view.menu.bb.c
        public String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(lj ljVar) {
            this();
        }

        public final Object a(Throwable th) {
            return bb.b(new a(th));
        }

        public final Object b() {
            return bb.b(bb.b);
        }

        public final Object c(Object obj) {
            return bb.b(obj);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static Object b(Object obj) {
        return obj;
    }

    public static final Throwable c(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public static final boolean d(Object obj) {
        return obj instanceof a;
    }

    public static final boolean e(Object obj) {
        return !(obj instanceof c);
    }
}
