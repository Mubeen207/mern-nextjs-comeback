package androidx.appcompat.view.menu;

import android.os.IInterface;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class zy0 extends ob {
    public IInterface p;
    public String q;

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

    @Override // androidx.appcompat.view.menu.ob, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if ("asBinder".equals(method.getName())) {
            return method.invoke(this.p, objArr);
        }
        if (objArr != null && objArr.length > 0) {
            Object obj2 = objArr[0];
            if (obj2 instanceof String) {
                objArr[0] = this.q;
            } else if (obj2.getClass().getName().equals(f5.a.p().getName())) {
                mg.b(obj2, bv0.p());
            }
        }
        return method.invoke(this.p, objArr);
    }

    public IInterface l(IInterface iInterface, String str) {
        this.p = iInterface;
        this.q = str;
        b();
        return (IInterface) g();
    }
}
