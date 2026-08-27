package androidx.appcompat.view.menu;

import android.os.IBinder;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class qz extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                int length = objArr.length - 1;
                if (objArr[length] instanceof Integer) {
                    objArr[length] = Integer.valueOf(d7.c(bv0.m().getApplicationInfo().uid));
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    public qz() {
        super((IBinder) et0.c.b("accessibility"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return pz.b.b(et0.c.b("accessibility"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("accessibility");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        f(new a(), "interrupt", "sendAccessibilityEvent", "addClient", "removeClient", "getInstalledAccessibilityServiceList", "getEnabledAccessibilityServiceList", "addAccessibilityInteractionConnection", "getWindowToken", "setSystemAudioCaptioningEnabled", "isSystemAudioCaptioningUiEnabled", "setSystemAudioCaptioningUiEnabled");
    }
}
