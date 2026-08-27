package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class v22 implements r52 {
    public static final b42 b = new h32();
    public final b42 a;

    public v22() {
        this(new l32(w02.c(), b()));
    }

    public static b42 b() {
        try {
            return (b42) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    public static boolean c(v32 v32Var) {
        return z22.a[v32Var.b().ordinal()] != 1;
    }

    @Override // androidx.appcompat.view.menu.r52
    public final m52 a(Class cls) {
        p52.o(cls);
        v32 a = this.a.a(cls);
        return a.c() ? t02.class.isAssignableFrom(cls) ? l42.j(p52.u(), a02.b(), a.a()) : l42.j(p52.f(), a02.a(), a.a()) : t02.class.isAssignableFrom(cls) ? c(a) ? h42.n(cls, a, r42.b(), l22.c(), p52.u(), a02.b(), x32.b()) : h42.n(cls, a, r42.b(), l22.c(), p52.u(), null, x32.b()) : c(a) ? h42.n(cls, a, r42.a(), l22.a(), p52.f(), a02.a(), x32.a()) : h42.n(cls, a, r42.a(), l22.a(), p52.f(), null, x32.a());
    }

    public v22(b42 b42Var) {
        this.a = (b42) y02.f(b42Var, "messageInfoFactory");
    }
}
