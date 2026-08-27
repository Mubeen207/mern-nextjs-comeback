package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public interface uu extends jm {

    /* loaded from: classes.dex */
    public static final class a {
        public static final C0033a b = new C0033a(null);
        public static final a c = new a("NONE");
        public static final a d = new a("FULL");
        public final String a;

        /* renamed from: androidx.appcompat.view.menu.uu$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0033a {
            public C0033a() {
            }

            public /* synthetic */ C0033a(lj ljVar) {
                this();
            }
        }

        public a(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static final a b = new a(null);
        public static final b c = new b("FLAT");
        public static final b d = new b("HALF_OPENED");
        public final String a;

        /* loaded from: classes.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(lj ljVar) {
                this();
            }
        }

        public b(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    a b();

    b getState();
}
