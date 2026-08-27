package androidx.appcompat.view.menu;

import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class u30 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            objArr[0] = bv0.o();
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return q41.b.b(Integer.valueOf(mv0.N2()), "SnakeEngine", q41.c);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return new ArrayList();
        }
    }

    public u30() {
        super((IBinder) et0.c.b("user"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return t30.b.b(et0.c.b("user"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("user");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        d(new b51("getProfileParent", null));
        d(new b51("getUserIcon", null));
        d(new b51("getDefaultGuestRestrictions", null));
        d(new b51("setDefaultGuestRestrictions", null));
        d(new b51("removeRestrictions", null));
        d(new b51("createUser", null));
        d(new b51("createProfileForUser", null));
        e("getApplicationRestrictions", new a());
        e("getProfileParent", new b());
        e("getUsers", new c());
    }
}
