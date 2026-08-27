package androidx.appcompat.view.menu;

import android.location.Location;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes.dex */
public class x90 extends ob {
    public Object p;

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                list.clear();
                list.add(qv0.f().i(mv0.N2(), mv0.E2()).b());
                objArr[0] = list;
            } else if (obj2 instanceof Location) {
                objArr[0] = qv0.f().i(mv0.N2(), mv0.E2()).b();
            }
            return method.invoke(obj, objArr);
        }
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return this.p;
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
    }

    @Override // androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        e("onLocationChanged", new a());
    }

    public Object l(Object obj) {
        this.p = obj;
        b();
        return g();
    }
}
