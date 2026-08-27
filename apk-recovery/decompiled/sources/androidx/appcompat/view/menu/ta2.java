package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ta2 implements ua2 {
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;

    static {
        hw1 e = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.collection.event_safelist", true);
        b = e.d("measurement.service.store_null_safelist", true);
        c = e.d("measurement.service.store_safelist", true);
    }

    @Override // androidx.appcompat.view.menu.ua2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.ua2
    public final boolean b() {
        return ((Boolean) b.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.ua2
    public final boolean c() {
        return ((Boolean) c.f()).booleanValue();
    }
}
