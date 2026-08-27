package androidx.appcompat.view.menu;

import android.net.wifi.WifiInfo;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class d40 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            WifiInfo wifiInfo = (WifiInfo) method.invoke(obj, objArr);
            c81.b.e(wifiInfo, "ac:62:5a:82:65:c4");
            c81.c.e(wifiInfo, "ac:62:5a:82:65:c4");
            c81.d.e(wifiInfo, d81.b.b("SnakeEngine_Wifi"));
            return wifiInfo;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return new ArrayList();
        }
    }

    public d40() {
        super((IBinder) et0.c.b("wifi"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return c40.b.b(et0.c.b("wifi"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("wifi");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        e("getConnectionInfo", new a());
        e("getScanResults", new b());
    }
}
