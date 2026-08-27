package androidx.appcompat.view.menu;

import android.app.AppOpsManager;
import android.os.IBinder;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class d00 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.i(objArr);
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            int intValue = ((Integer) objArr[0]).intValue();
            String str = (String) objArr[1];
            if (intValue == bv0.p() && "com.google.android.gms".equals(str)) {
                return null;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public d00() {
        super((IBinder) et0.c.b("appops"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return e00.b.b(et0.c.b("appops"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        if (u3.b != null) {
            try {
                u3.b.e((AppOpsManager) bv0.m().getSystemService("appops"), g());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        l("appops");
    }

    @Override // androidx.appcompat.view.menu.ob, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        rd0.f(objArr);
        rd0.i(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        e("noteProxyOperation", new d());
        e("checkPackage", new b());
        e("checkOperation", new a());
        e("noteOperation", new c());
    }
}
