package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class m20 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
    }

    /* loaded from: classes.dex */
    public static class c extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            try {
                return y8.f() ? "unknown" : method.invoke(obj, method, objArr);
            } catch (Throwable unused) {
                return "unknown";
            }
        }

        public d() {
        }
    }

    /* loaded from: classes.dex */
    public static class e extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return zb0.b(bv0.o());
        }
    }

    public m20() {
        super((IBinder) et0.c.b("iphonesubinfo"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        if (y8.g()) {
            return sz0.d.b();
        }
        return sz0.e.b((TelephonyManager) bv0.m().getSystemService("phone"), new Object[0]);
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        if (y8.g()) {
            sz0.d.d(obj2);
        }
        l("iphonesubinfo");
    }

    @Override // androidx.appcompat.view.menu.ob, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        rd0.h(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        d(new gi0("getNaiForSubscriber"));
        d(new gi0("getDeviceSvn"));
        d(new gi0("getDeviceSvnUsingSubId"));
        d(new gi0("getGroupIdLevel1"));
        d(new gi0("getGroupIdLevel1ForSubscriber"));
        d(new gi0("getLine1AlphaTag"));
        d(new gi0("getLine1AlphaTagForSubscriber"));
        d(new gi0("getMsisdn"));
        d(new gi0("getMsisdnForSubscriber"));
        d(new gi0("getVoiceMailNumber"));
        d(new gi0("getVoiceMailNumberForSubscriber"));
        d(new gi0("getVoiceMailAlphaTag"));
        d(new gi0("getVoiceMailAlphaTagForSubscriber"));
        d(new gi0("getLine1Number"));
        e("getSubscriberId", new d());
        e("getLine1NumberForSubscriber", new c());
        e("getSubscriberIdForSubscriber", new e());
        e("getIccSerialNumber", new a());
        e("getIccSerialNumberForSubscriber", new b());
    }
}
