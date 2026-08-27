package androidx.appcompat.view.menu;

import android.os.IBinder;
import androidx.appcompat.view.menu.q20;
/* loaded from: classes.dex */
public class r20 extends j8 {
    public r20() {
        super((IBinder) et0.c.b("popup_camera_service"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return q20.a.b.b(et0.c.b("popup_camera_service"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("popup_camera_service");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        d(new gi0("notifyCameraStatus"));
    }
}
