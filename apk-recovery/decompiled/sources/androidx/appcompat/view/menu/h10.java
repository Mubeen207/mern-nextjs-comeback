package androidx.appcompat.view.menu;

import android.os.IBinder;
/* loaded from: classes.dex */
public class h10 extends j8 {
    public h10() {
        super((IBinder) et0.c.b("fingerprint"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return m10.b.b(et0.c.b("fingerprint"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("fingerprint");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        d(new gi0("isHardwareDetected"));
        d(new gi0("hasEnrolledFingerprints"));
        d(new gi0("authenticate"));
        d(new gi0("cancelAuthentication"));
        d(new gi0("getEnrolledFingerprints"));
        d(new gi0("getAuthenticatorId"));
    }
}
