package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class lw0 {
    public static final a a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public static /* synthetic */ lw0 b(a aVar, Object obj, String str, h51 h51Var, oa0 oa0Var, int i, Object obj2) {
            if ((i & 2) != 0) {
                h51Var = z8.a.a();
            }
            if ((i & 4) != 0) {
                oa0Var = g2.a;
            }
            return aVar.a(obj, str, h51Var, oa0Var);
        }

        public final lw0 a(Object obj, String str, h51 h51Var, oa0 oa0Var) {
            c60.e(obj, "<this>");
            c60.e(str, "tag");
            c60.e(h51Var, "verificationMode");
            c60.e(oa0Var, "logger");
            return new y41(obj, str, h51Var, oa0Var);
        }
    }

    public abstract Object a();

    public final String b(Object obj, String str) {
        c60.e(obj, "value");
        c60.e(str, "message");
        return str + " value: " + obj;
    }

    public abstract lw0 c(String str, kw kwVar);
}
