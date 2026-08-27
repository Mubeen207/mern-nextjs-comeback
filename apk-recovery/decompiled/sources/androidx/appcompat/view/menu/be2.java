package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class be2 implements yd2 {
    public static final rv1 a;
    public static final rv1 b;

    static {
        hw1 e = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.sgtm.client.dev", false);
        b = e.d("measurement.sgtm.service", false);
    }

    @Override // androidx.appcompat.view.menu.yd2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.yd2
    public final boolean b() {
        return ((Boolean) a.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.yd2
    public final boolean c() {
        return ((Boolean) b.f()).booleanValue();
    }
}
