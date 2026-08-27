package androidx.appcompat.view.menu;

import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public class zg0 extends ob {
    public final Object p = v80.b.b();

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Integer.valueOf(zg0.m(((Integer) method.invoke(obj, objArr)).intValue()));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                jo0.w("android.system.StructStat").e("st_uid").e(invoke, Integer.valueOf(zg0.m(-1)));
                return invoke;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                Objects.requireNonNull(cause);
                throw cause;
            }
        }
    }

    public static int m(int i) {
        return (i <= 0 || i > 10000) ? (mv0.T2() && mv0.B2().S2()) ? mv0.I2() : bv0.p() : i;
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return v80.b.b() != g();
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return this.p;
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        v80.b.d(obj2);
    }

    @Override // androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        e("getuid", new a());
        f(new b(), "lstat", "stat");
    }
}
