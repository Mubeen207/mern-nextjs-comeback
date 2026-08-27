package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class od2 implements ld2 {
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;
    public static final rv1 d;
    public static final rv1 e;
    public static final rv1 f;

    static {
        hw1 e2 = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.client.sessions.background_sessions_enabled", true);
        b = e2.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c = e2.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        d = e2.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e = e2.d("measurement.client.sessions.session_id_enabled", true);
        f = e2.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // androidx.appcompat.view.menu.ld2
    public final boolean a() {
        return ((Boolean) b.f()).booleanValue();
    }
}
