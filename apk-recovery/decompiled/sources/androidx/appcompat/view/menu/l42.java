package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class l42 implements m52 {
    public final z32 a;
    public final o72 b;
    public final boolean c;
    public final yz1 d;

    public l42(o72 o72Var, yz1 yz1Var, z32 z32Var) {
        this.b = o72Var;
        this.c = yz1Var.d(z32Var);
        this.d = yz1Var;
        this.a = z32Var;
    }

    public static l42 j(o72 o72Var, yz1 yz1Var, z32 z32Var) {
        return new l42(o72Var, yz1Var, z32Var);
    }

    @Override // androidx.appcompat.view.menu.m52
    public final Object a() {
        z32 z32Var = this.a;
        return z32Var instanceof t02 ? ((t02) z32Var).y() : z32Var.d().k();
    }

    @Override // androidx.appcompat.view.menu.m52
    public final int b(Object obj) {
        o72 o72Var = this.b;
        int e = o72Var.e(o72Var.k(obj));
        return this.c ? e + this.d.b(obj).a() : e;
    }

    @Override // androidx.appcompat.view.menu.m52
    public final boolean c(Object obj) {
        return this.d.b(obj).n();
    }

    @Override // androidx.appcompat.view.menu.m52
    public final void d(Object obj, Object obj2) {
        p52.n(this.b, obj, obj2);
        if (this.c) {
            p52.l(this.d, obj, obj2);
        }
    }

    @Override // androidx.appcompat.view.menu.m52
    public final void e(Object obj) {
        this.b.l(obj);
        this.d.f(obj);
    }

    @Override // androidx.appcompat.view.menu.m52
    public final int f(Object obj) {
        int hashCode = this.b.k(obj).hashCode();
        return this.c ? (hashCode * 53) + this.d.b(obj).hashCode() : hashCode;
    }

    @Override // androidx.appcompat.view.menu.m52
    public final void g(Object obj, g92 g92Var) {
        Iterator l = this.d.b(obj).l();
        if (l.hasNext()) {
            my0.a(((Map.Entry) l.next()).getKey());
            throw null;
        }
        o72 o72Var = this.b;
        o72Var.d(o72Var.k(obj), g92Var);
    }

    @Override // androidx.appcompat.view.menu.m52
    public final boolean h(Object obj, Object obj2) {
        if (this.b.k(obj).equals(this.b.k(obj2))) {
            if (this.c) {
                return this.d.b(obj).equals(this.d.b(obj2));
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m52
    public final void i(Object obj, byte[] bArr, int i, int i2, rx1 rx1Var) {
        t02 t02Var = (t02) obj;
        if (t02Var.zzb == g72.k()) {
            t02Var.zzb = g72.l();
        }
        my0.a(obj);
        throw null;
    }
}
