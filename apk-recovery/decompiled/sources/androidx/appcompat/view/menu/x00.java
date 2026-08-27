package androidx.appcompat.view.menu;

import android.os.IBinder;
/* loaded from: classes.dex */
public class x00 extends j8 {
    public x00() {
        super((IBinder) et0.c.b("connectivity"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return w00.b.b(et0.c.b("connectivity"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("connectivity");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        d(new b51("getAllNetworkInfo", null));
        d(new b51("getAllNetworks", null));
        d(new b51("getNetworkCapabilities", null));
    }
}
