package androidx.appcompat.view.menu;

import android.os.IBinder;
/* loaded from: classes.dex */
public class i30 extends j8 {
    public i30() {
        super((IBinder) et0.c.b("isub"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return h30.b.b(et0.c.b("isub"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("isub");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        d(new b51("getAllSubInfoList", null));
        d(new b51("getAllSubInfoCount", -1));
        d(new b51("getActiveSubscriptionInfo", null));
        d(new b51("getActiveSubscriptionInfoForIccId", null));
        d(new b51("getActiveSubscriptionInfoForSimSlotIndex", null));
        d(new b51("getActiveSubscriptionInfoList", null));
        d(new b51("getActiveSubInfoCount", -1));
        d(new b51("getActiveSubInfoCountMax", -1));
        d(new b51("getAvailableSubscriptionInfoList", null));
        d(new b51("getAccessibleSubscriptionInfoList", null));
        d(new b51("addSubInfoRecord", -1));
        d(new b51("addSubInfo", -1));
        d(new b51("removeSubInfo", -1));
    }
}
