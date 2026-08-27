package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public class g40 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            IInterface iInterface = (IInterface) method.invoke(obj, objArr);
            Objects.requireNonNull(iInterface);
            h40 h40Var = new h40(iInterface);
            h40Var.b();
            return h40Var.g();
        }
    }

    public g40() {
        super((IBinder) et0.c.b("window"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return f40.b.b(et0.c.b("window"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("window");
        ca1.b.d(null);
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        e("openSession", new a());
    }
}
