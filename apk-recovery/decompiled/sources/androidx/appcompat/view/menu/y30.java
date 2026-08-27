package androidx.appcompat.view.menu;

import android.os.IBinder;
import androidx.appcompat.view.menu.z30;
/* loaded from: classes.dex */
public class y30 extends j8 {
    public y30() {
        super((IBinder) et0.c.b("vivo_permission_service"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return z30.a.b.b(et0.c.b("vivo_permission_service"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("vivo_permission_service");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        d(new gi0("checkPermission"));
        d(new gi0("getAppPermission"));
        d(new gi0("setAppPermission"));
        d(new gi0("setWhiteListApp"));
        d(new gi0("setBlackListApp"));
        d(new gi0("noteStartActivityProcess"));
        d(new gi0("isBuildInThirdPartApp"));
    }
}
