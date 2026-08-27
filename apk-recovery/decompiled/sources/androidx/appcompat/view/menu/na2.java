package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class na2 implements oa2 {
    public static final rv1 a;
    public static final rv1 b;

    static {
        hw1 e = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.service.deferred_first_open", false);
        b = e.b("measurement.id.service.deferred_first_open", 0L);
    }

    @Override // androidx.appcompat.view.menu.oa2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.oa2
    public final boolean b() {
        return ((Boolean) a.f()).booleanValue();
    }
}
