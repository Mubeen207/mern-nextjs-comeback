package androidx.appcompat.view.menu;

import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b30 extends j8 {

    /* loaded from: classes.dex */
    public class a extends gi0 {
        public a(String str) {
            super(str);
        }

        @Override // androidx.appcompat.view.menu.gi0, androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return qh0.a(new ArrayList());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return new Intent();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends pd0 {
        public int a;
        public Object b;
        public String c;

        public f(String str, int i, Object obj) {
            this.a = i;
            this.b = obj;
            this.c = str;
        }

        @Override // androidx.appcompat.view.menu.pd0
        public String c() {
            return this.c;
        }

        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return f(method, this.b);
        }

        public final Object f(Method method, Object obj) {
            if (method.toString().contains("AndroidFuture")) {
                Object b = f2.c.b(new Object[0]);
                f2.b.b(b, obj);
                return b;
            }
            return obj;
        }
    }

    public b30() {
        super((IBinder) et0.c.b("shortcut"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return c30.b.b(et0.c.b("shortcut"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("shortcut");
    }

    @Override // androidx.appcompat.view.menu.ob, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        rd0.e(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        d(new gi0("getShortcuts"));
        d(new gi0("disableShortcuts"));
        d(new gi0("enableShortcuts"));
        d(new gi0("getRemainingCallCount"));
        d(new gi0("getRateLimitResetTime"));
        d(new gi0("getIconMaxDimensions"));
        d(new gi0("getMaxShortcutCountPerActivity"));
        d(new gi0("reportShortcutUsed"));
        d(new gi0("onApplicationActive"));
        d(new gi0("hasShortcutHostPermission"));
        d(new gi0("removeAllDynamicShortcuts"));
        d(new gi0("removeDynamicShortcuts"));
        d(new gi0("removeLongLivedShortcuts"));
        d(new f("pushDynamicShortcut", 1, null));
        Boolean bool = Boolean.FALSE;
        d(new f("requestPinShortcut", 1, bool));
        d(new f("addDynamicShortcuts", 1, bool));
        d(new f("setDynamicShortcuts", 1, bool));
        e("requestPinShortcut", new d());
        e("setDynamicShortcuts", new e());
        e("createShortcutResultIntent", new b());
        e("getMaxShortcutCountPerActivity", new c());
        d(new a("getManifestShortcuts"));
    }
}
