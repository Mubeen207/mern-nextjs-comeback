package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class rc2 implements sc2 {
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;
    public static final rv1 d;
    public static final rv1 e;

    static {
        hw1 e2 = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.test.boolean_flag", false);
        b = e2.a("measurement.test.double_flag", -3.0d);
        c = e2.b("measurement.test.int_flag", -2L);
        d = e2.b("measurement.test.long_flag", -1L);
        e = e2.c("measurement.test.string_flag", "---");
    }

    @Override // androidx.appcompat.view.menu.sc2
    public final double a() {
        return ((Double) b.f()).doubleValue();
    }

    @Override // androidx.appcompat.view.menu.sc2
    public final long b() {
        return ((Long) c.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.sc2
    public final long c() {
        return ((Long) d.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.sc2
    public final String d() {
        return (String) e.f();
    }

    @Override // androidx.appcompat.view.menu.sc2
    public final boolean f() {
        return ((Boolean) a.f()).booleanValue();
    }
}
