package androidx.appcompat.view.menu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class jg1 implements hg1, tg1 {
    public final String m;
    public final Map n = new HashMap();

    public jg1(String str) {
        this.m = str;
    }

    public abstract tg1 a(sw1 sw1Var, List list);

    public final String b() {
        return this.m;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public tg1 c() {
        return this;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jg1) {
            jg1 jg1Var = (jg1) obj;
            String str = this.m;
            if (str != null) {
                return str.equals(jg1Var.m);
            }
            return false;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final String g() {
        return this.m;
    }

    @Override // androidx.appcompat.view.menu.hg1
    public final tg1 h(String str) {
        return this.n.containsKey(str) ? (tg1) this.n.get(str) : tg1.e;
    }

    public int hashCode() {
        String str = this.m;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Iterator i() {
        return ng1.b(this.n);
    }

    @Override // androidx.appcompat.view.menu.hg1
    public final boolean k(String str) {
        return this.n.containsKey(str);
    }

    @Override // androidx.appcompat.view.menu.hg1
    public final void n(String str, tg1 tg1Var) {
        if (tg1Var == null) {
            this.n.remove(str);
        } else {
            this.n.put(str, tg1Var);
        }
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final tg1 p(String str, sw1 sw1Var, List list) {
        return "toString".equals(str) ? new xg1(this.m) : ng1.a(this, new xg1(str), sw1Var, list);
    }
}
