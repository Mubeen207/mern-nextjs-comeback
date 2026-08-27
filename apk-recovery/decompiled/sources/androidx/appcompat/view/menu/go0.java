package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class go0 {
    public static final ho0 a;
    public static final n70[] b;

    static {
        ho0 ho0Var = null;
        try {
            ho0Var = (ho0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ho0Var == null) {
            ho0Var = new ho0();
        }
        a = ho0Var;
        b = new n70[0];
    }

    public static q70 a(jx jxVar) {
        return a.a(jxVar);
    }

    public static n70 b(Class cls) {
        return a.b(cls);
    }

    public static p70 c(Class cls) {
        return a.c(cls, "");
    }

    public static r70 d(tk0 tk0Var) {
        return a.d(tk0Var);
    }

    public static String e(ix ixVar) {
        return a.e(ixVar);
    }

    public static String f(j80 j80Var) {
        return a.f(j80Var);
    }
}
