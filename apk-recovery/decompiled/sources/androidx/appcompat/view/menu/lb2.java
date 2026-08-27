package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class lb2 implements ib2 {
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;
    public static final rv1 d;

    static {
        hw1 e = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        b = e.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        c = e.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = e.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // androidx.appcompat.view.menu.ib2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.ib2
    public final boolean b() {
        return ((Boolean) b.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.ib2
    public final boolean c() {
        return ((Boolean) c.f()).booleanValue();
    }

    @Override // androidx.appcompat.view.menu.ib2
    public final boolean d() {
        return ((Boolean) d.f()).booleanValue();
    }
}
