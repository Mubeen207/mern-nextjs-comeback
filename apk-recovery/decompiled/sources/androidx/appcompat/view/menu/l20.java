package androidx.appcompat.view.menu;

import android.os.IBinder;
/* loaded from: classes.dex */
public class l20 extends j8 {
    public l20() {
        super((IBinder) et0.c.b("persistent_data_block"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return k20.b.b(et0.c.b("persistent_data_block"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("persistent_data_block");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        d(new b51("write", -1));
        d(new b51("read", new byte[0]));
        d(new b51("wipe", null));
        d(new b51("getDataBlockSize", 0));
        d(new b51("getMaximumDataBlockSize", 0));
        d(new b51("setOemUnlockEnabled", 0));
        d(new b51("getOemUnlockEnabled", Boolean.FALSE));
    }
}
