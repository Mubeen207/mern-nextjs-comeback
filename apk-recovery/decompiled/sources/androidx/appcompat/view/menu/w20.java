package androidx.appcompat.view.menu;

import android.os.IBinder;
/* loaded from: classes.dex */
public class w20 extends j8 {
    public w20() {
        super((IBinder) et0.c.b("role"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return v20.b.b(et0.c.b("role"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("role");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        d(new gi0("isRoleHeld"));
    }
}
