package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class r32 implements t32 {
    @Override // androidx.appcompat.view.menu.t32
    public final p32 b(Object obj) {
        my0.a(obj);
        throw new NoSuchMethodError();
    }

    @Override // androidx.appcompat.view.menu.t32
    public final Map c(Object obj) {
        return (n32) obj;
    }

    @Override // androidx.appcompat.view.menu.t32
    public final Object d(Object obj, Object obj2) {
        n32 n32Var = (n32) obj;
        n32 n32Var2 = (n32) obj2;
        if (!n32Var2.isEmpty()) {
            if (!n32Var.f()) {
                n32Var = n32Var.d();
            }
            n32Var.c(n32Var2);
        }
        return n32Var;
    }

    @Override // androidx.appcompat.view.menu.t32
    public final Object e(Object obj) {
        ((n32) obj).e();
        return obj;
    }

    @Override // androidx.appcompat.view.menu.t32
    public final Object f(Object obj) {
        return n32.b().d();
    }

    @Override // androidx.appcompat.view.menu.t32
    public final boolean g(Object obj) {
        return !((n32) obj).f();
    }

    @Override // androidx.appcompat.view.menu.t32
    public final Map h(Object obj) {
        return (n32) obj;
    }

    @Override // androidx.appcompat.view.menu.t32
    public final int i(int i, Object obj, Object obj2) {
        n32 n32Var = (n32) obj;
        my0.a(obj2);
        if (n32Var.isEmpty()) {
            return 0;
        }
        Iterator it = n32Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }
}
