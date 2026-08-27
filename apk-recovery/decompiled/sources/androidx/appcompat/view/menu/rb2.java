package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class rb2 implements ob2 {
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;

    static {
        hw1 e = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        b = e.d("measurement.client.sessions.check_on_startup", true);
        c = e.d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // androidx.appcompat.view.menu.ob2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.ob2
    public final boolean b() {
        return ((Boolean) a.f()).booleanValue();
    }
}
