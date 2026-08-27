package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class qc2 implements gc2 {
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;

    static {
        hw1 e = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e.b("measurement.id.lifecycle.app_in_background_parameter", 0L);
        b = e.d("measurement.lifecycle.app_backgrounded_tracking", true);
        c = e.d("measurement.lifecycle.app_in_background_parameter", false);
    }

    @Override // androidx.appcompat.view.menu.gc2
    public final boolean a() {
        return ((Boolean) c.f()).booleanValue();
    }
}
