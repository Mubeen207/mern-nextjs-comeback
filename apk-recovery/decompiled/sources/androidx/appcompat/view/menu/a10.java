package androidx.appcompat.view.menu;

import android.os.IBinder;
/* loaded from: classes.dex */
public class a10 extends j8 {
    public a10() {
        super((IBinder) et0.c.b(m()));
    }

    public static String m() {
        return y8.d() ? "contexthub" : "contexthub_service";
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return z00.b.b(et0.c.b(m()));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l(m());
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        d(new b51("registerCallback", 0));
        d(new b51("getContextHubInfo", null));
        d(new b51("getContextHubHandles", new int[0]));
    }
}
