package androidx.appcompat.view.menu;

import android.os.IBinder;
/* loaded from: classes.dex */
public class t20 extends j8 {
    public t20() {
        super((IBinder) et0.c.b("power"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return s20.b.b(et0.c.b("power"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("power");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        d(new b51("acquireWakeLock", 0));
        d(new b51("acquireWakeLockWithUid", 0));
        d(new b51("releaseWakeLock", 0));
        d(new b51("updateWakeLockWorkSource", 0));
        d(new b51("isWakeLockLevelSupported", Boolean.TRUE));
        d(new b51("reboot", null));
        d(new b51("rebootSafeMode", null));
        d(new b51("shutdown", null));
    }
}
