package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ec2 implements fc2 {
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;
    public static final rv1 d;

    static {
        hw1 e = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = e.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = e.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = e.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // androidx.appcompat.view.menu.fc2
    public final boolean a() {
        return ((Boolean) c.f()).booleanValue();
    }
}
