package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class dc2 implements ac2 {
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;

    static {
        hw1 e = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.item_scoped_custom_parameters.client", true);
        b = e.d("measurement.item_scoped_custom_parameters.service", false);
        c = e.b("measurement.id.item_scoped_custom_parameters.service", 0L);
    }

    @Override // androidx.appcompat.view.menu.ac2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.ac2
    public final boolean b() {
        return ((Boolean) a.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.ac2
    public final boolean c() {
        return ((Boolean) b.f()).booleanValue();
    }
}
