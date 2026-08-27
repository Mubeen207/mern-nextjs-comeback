package androidx.appcompat.view.menu;

import com.snake.helper.ProxyVpnService;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class m71 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            n71.b.e(objArr[0], ProxyVpnService.class.getName());
            f((List) n71.d.b());
            f((List) n71.c.b());
            return method.invoke(obj, objArr);
        }

        public final void f(List list) {
            if (list != null && list.contains(mv0.E2())) {
                list.add(bv0.o());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.f(objArr);
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.f(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public static Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("setVpnPackageAuthorization", new c());
        hashMap.put("prepareVpn", new b());
        hashMap.put("establishVpn", new a());
        return hashMap;
    }
}
