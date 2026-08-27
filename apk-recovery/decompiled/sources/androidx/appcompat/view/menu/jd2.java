package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class jd2 implements kd2 {
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;
    public static final rv1 d;

    static {
        hw1 e = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        b = e.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        c = e.d("measurement.session_stitching_token_enabled", false);
        d = e.d("measurement.link_sst_to_sid", true);
    }

    @Override // androidx.appcompat.view.menu.kd2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.kd2
    public final boolean b() {
        return ((Boolean) a.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.kd2
    public final boolean c() {
        return ((Boolean) b.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.kd2
    public final boolean d() {
        return ((Boolean) c.f()).booleanValue();
    }
}
