package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.os.IBinder;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class j00 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                for (int i = 0; i < objArr.length; i++) {
                    Object obj2 = objArr[i];
                    if (obj2 != null && (obj2 instanceof ComponentName)) {
                        objArr[i] = new ComponentName(bv0.o(), nl0.d(mv0.F2(), false));
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    public j00() {
        super((IBinder) et0.c.b("autofill"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return i00.b.b(et0.c.b("autofill"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("autofill");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        e("startSession", new a());
    }
}
