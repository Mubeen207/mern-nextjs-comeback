package androidx.appcompat.view.menu;

import android.os.IBinder;
import androidx.appcompat.view.menu.o20;
/* loaded from: classes.dex */
public class p20 extends j8 {
    public p20() {
        super((IBinder) et0.c.b("physical_fling_service"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return o20.a.b.b(et0.c.b("physical_fling_service"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("physical_fling_service");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        d(new gi0("isSupportPhysicalFling"));
    }
}
