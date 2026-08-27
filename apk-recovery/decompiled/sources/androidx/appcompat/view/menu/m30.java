package androidx.appcompat.view.menu;

import android.os.IBinder;
import androidx.appcompat.view.menu.l30;
/* loaded from: classes.dex */
public class m30 extends j8 {
    public m30() {
        super((IBinder) et0.c.b("system_defence_service"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return l30.a.b.b(et0.c.b("system_defence_service"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("system_defence_service");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        d(new gi0("checkTransitionTimoutErrorDefence"));
        d(new gi0("checkSkipKilledByRemoveTask"));
        d(new gi0("checkSmallIconNULLPackage"));
        d(new gi0("checkDelayUpdate"));
        d(new gi0("onSetActivityResumed"));
        d(new gi0("checkReinstallPacakge"));
        d(new gi0("reportFgCrashData"));
    }
}
