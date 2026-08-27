package androidx.appcompat.view.menu;

import android.os.IBinder;
import androidx.appcompat.view.menu.j30;
/* loaded from: classes.dex */
public class k30 extends j8 {
    public k30() {
        super((IBinder) et0.c.b("SuperResolutionManager"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return j30.a.b.b(et0.c.b("SuperResolutionManager"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("SuperResolutionManager");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        d(new gi0("registerPackageSettingStateChangeListener"));
        d(new gi0("unRegisterPackageSettingStateChangeListener"));
        d(new gi0("registerSuperResolutionStateChange"));
        d(new gi0("unRegisterSuperResolutionStateChange"));
        d(new gi0("getPackageSettingState"));
        d(new gi0("putPackageSettingState"));
    }
}
