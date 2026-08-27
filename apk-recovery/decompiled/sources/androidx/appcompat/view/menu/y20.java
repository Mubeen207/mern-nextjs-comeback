package androidx.appcompat.view.menu;

import android.os.IBinder;
/* loaded from: classes.dex */
public class y20 extends j8 {
    public y20() {
        super((IBinder) et0.c.b("search"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return x20.b.b(et0.c.b("search"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("search");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        d(new gi0("launchLegacyAssist"));
    }
}
