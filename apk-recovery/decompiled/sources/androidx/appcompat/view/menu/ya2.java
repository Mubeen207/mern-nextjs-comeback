package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ya2 implements va2 {
    public static final rv1 a = new hw1(lv1.a("com.google.android.gms.measurement")).f().e().d("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // androidx.appcompat.view.menu.va2
    public final boolean a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.va2
    public final boolean b() {
        return ((Boolean) a.f()).booleanValue();
    }
}
