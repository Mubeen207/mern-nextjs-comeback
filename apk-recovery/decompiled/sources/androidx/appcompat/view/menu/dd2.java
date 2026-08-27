package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class dd2 implements ed2 {
    public static final rv1 a;
    public static final rv1 b;

    static {
        hw1 e = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.remove_app_background.client", false);
        b = e.b("measurement.id.remove_app_background.client", 0L);
    }

    @Override // androidx.appcompat.view.menu.ed2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.ed2
    public final boolean b() {
        return ((Boolean) a.f()).booleanValue();
    }
}
