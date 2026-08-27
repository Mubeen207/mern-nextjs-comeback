package androidx.appcompat.view.menu;

import android.os.IBinder;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class c20 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.g(objArr);
            rd0.f(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public c20() {
        super((IBinder) et0.c.b("network_management"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return b20.b.b(et0.c.b("network_management"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("network_management");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        d(new j31("setUidCleartextNetworkPolicy", 0));
        d(new j31("setUidMeteredNetworkBlacklist", 0));
        d(new j31("setUidMeteredNetworkWhitelist", 0));
        e("getNetworkStatsUidDetail", new a());
    }
}
