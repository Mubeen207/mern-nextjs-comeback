package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class wd2 implements xd2 {
    public static final rv1 a;
    public static final rv1 b;

    static {
        hw1 e = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.sfmc.client", true);
        b = e.d("measurement.sfmc.service", true);
    }

    @Override // androidx.appcompat.view.menu.xd2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.xd2
    public final boolean b() {
        return ((Boolean) a.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.xd2
    public final boolean c() {
        return ((Boolean) b.f()).booleanValue();
    }
}
