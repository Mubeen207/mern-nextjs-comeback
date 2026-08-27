package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class sb2 implements tb2 {
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;

    static {
        hw1 e = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.gbraid_campaign.gbraid.client.dev", false);
        b = e.d("measurement.gbraid_campaign.gbraid.service", false);
        c = e.b("measurement.id.gbraid_campaign.service", 0L);
    }

    @Override // androidx.appcompat.view.menu.tb2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.tb2
    public final boolean b() {
        return ((Boolean) a.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.tb2
    public final boolean c() {
        return ((Boolean) b.f()).booleanValue();
    }
}
