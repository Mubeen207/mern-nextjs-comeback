package androidx.appcompat.view.menu;

import android.os.IBinder;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class q30 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (qv0.l()) {
                return qv0.f().g(mv0.N2(), mv0.E2());
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (!qv0.l() || qv0.f().h(mv0.N2(), mv0.E2()) == null) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return zb0.b(bv0.o());
        }
    }

    /* loaded from: classes.dex */
    public static class d extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return zb0.b(bv0.o());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return zb0.b(bv0.o());
        }
    }

    /* loaded from: classes.dex */
    public static class f extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return zb0.b(bv0.o());
        }
    }

    /* loaded from: classes.dex */
    public static class h extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return qv0.l() ? qv0.f().j(mv0.N2(), mv0.E2()) : method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable unused) {
                return 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class k extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return zb0.b(bv0.o());
        }
    }

    /* loaded from: classes.dex */
    public static class l extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    public q30() {
        super((IBinder) et0.c.b("phone"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return p30.b.b(et0.c.b("phone"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("phone");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        e("getDeviceId", new c());
        e("getImeiForSlot", new e());
        e("getMeidForSlot", new g());
        e("isUserDataEnabled", new l());
        e("getLine1NumberForDisplay", new f());
        e("getSubscriberId", new k());
        e("getDeviceIdWithFeature", new d());
        e("getCellLocation", new b());
        e("getAllCellInfo", new a());
        e("getNetworkOperator", new i());
        e("getNetworkTypeForSubscriber", new j());
        e("getNeighboringCellInfo", new h());
    }
}
