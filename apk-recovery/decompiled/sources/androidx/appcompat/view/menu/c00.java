package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.WorkSource;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class c00 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object b(Object obj, Method method, Object[] objArr) {
            if (objArr[0] instanceof String) {
                objArr[0] = bv0.o();
            }
            int a = r4.a(objArr, WorkSource.class);
            if (a >= 0) {
                objArr[a] = null;
            }
            return Boolean.TRUE;
        }

        @Override // androidx.appcompat.view.menu.pd0
        public String c() {
            return "set";
        }

        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, method, objArr);
            } catch (Throwable th) {
                th.printStackTrace();
                return 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public String c() {
            return "setTime";
        }

        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Boolean.FALSE;
        }
    }

    public c00() {
        super((IBinder) et0.c.b("alarm"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return b00.b.b(et0.c.b("alarm"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("alarm");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        d(new b51("setTimeZone", null));
        e("set", new a());
        e("setTime", new b());
    }
}
