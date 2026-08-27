package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class sa2 implements pa2 {
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;
    public static final rv1 d;
    public static final rv1 e;
    public static final rv1 f;
    public static final rv1 g;

    static {
        hw1 e2 = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.dma_consent.client", false);
        b = e2.d("measurement.dma_consent.client_bow_check", false);
        c = e2.d("measurement.dma_consent.service", false);
        d = e2.d("measurement.dma_consent.service_gcs_v2", false);
        e = e2.d("measurement.dma_consent.service_npa_remote_default", false);
        f = e2.d("measurement.dma_consent.service_split_batch_on_consent", false);
        g = e2.b("measurement.id.dma_consent.service", 0L);
    }

    @Override // androidx.appcompat.view.menu.pa2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.pa2
    public final boolean b() {
        return ((Boolean) a.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.pa2
    public final boolean c() {
        return ((Boolean) b.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.pa2
    public final boolean d() {
        return ((Boolean) c.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.pa2
    public final boolean f() {
        return ((Boolean) d.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.pa2
    public final boolean g() {
        return ((Boolean) e.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.pa2
    public final boolean j() {
        return ((Boolean) f.f()).booleanValue();
    }
}
