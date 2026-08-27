package androidx.appcompat.view.menu;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class ob implements InvocationHandler, o10 {
    public final Map l = new HashMap();
    public Object m;
    public Object n;
    public boolean o;

    @Override // androidx.appcompat.view.menu.o10
    public void b() {
        Object h = h();
        this.m = h;
        Object newProxyInstance = Proxy.newProxyInstance(h.getClass().getClassLoader(), rd0.a(this.m.getClass()), this);
        this.n = newProxyInstance;
        if (!this.o) {
            i(this.m, newProxyInstance);
        }
        j();
    }

    public void c(Map map) {
        this.l.putAll(map);
    }

    public void d(pd0 pd0Var) {
        this.l.put(pd0Var.c(), pd0Var);
    }

    public void e(String str, pd0 pd0Var) {
        this.l.put(str, pd0Var);
    }

    public void f(pd0 pd0Var, String... strArr) {
        for (String str : strArr) {
            this.l.put(str, pd0Var);
        }
    }

    public Object g() {
        return this.n;
    }

    public abstract Object h();

    public abstract void i(Object obj, Object obj2);

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        pd0 pd0Var = (pd0) this.l.get(method.getName());
        if (pd0Var != null && pd0Var.e()) {
            Object b = pd0Var.b(this.m, method, objArr);
            return b != null ? b : pd0Var.a(pd0Var.d(this.m, method, objArr));
        }
        try {
            return method.invoke(this.m, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            Objects.requireNonNull(cause);
            throw cause;
        }
    }

    public void j() {
    }

    public void k(boolean z) {
        this.o = z;
    }
}
