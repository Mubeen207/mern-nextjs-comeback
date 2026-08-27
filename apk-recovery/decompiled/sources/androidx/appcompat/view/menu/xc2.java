package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class xc2 implements yc2 {
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;
    public static final rv1 d;
    public static final rv1 e;
    public static final rv1 f;

    static {
        hw1 e2 = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.rb.attribution.client2", false);
        b = e2.d("measurement.rb.attribution.followup1.service", false);
        c = e2.d("measurement.rb.attribution.service", false);
        d = e2.d("measurement.rb.attribution.enable_trigger_redaction", true);
        e = e2.d("measurement.rb.attribution.uuid_generation", true);
        f = e2.b("measurement.id.rb.attribution.service", 0L);
    }

    @Override // androidx.appcompat.view.menu.yc2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.yc2
    public final boolean b() {
        return ((Boolean) a.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.yc2
    public final boolean c() {
        return ((Boolean) b.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.yc2
    public final boolean d() {
        return ((Boolean) c.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.yc2
    public final boolean f() {
        return ((Boolean) d.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.yc2
    public final boolean g() {
        return ((Boolean) e.f()).booleanValue();
    }
}
