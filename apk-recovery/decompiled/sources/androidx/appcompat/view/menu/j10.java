package androidx.appcompat.view.menu;

import android.os.IBinder;
import androidx.appcompat.view.menu.i10;
/* loaded from: classes.dex */
public class j10 extends j8 {
    public j10() {
        super((IBinder) et0.c.b("flyme_permission"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return i10.a.a;
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        d(new gi0("noteIntentOperation"));
    }
}
