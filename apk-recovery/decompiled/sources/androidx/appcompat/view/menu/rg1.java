package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class rg1 implements hg1, tg1 {
    public final Map m = new HashMap();

    public final List a() {
        return new ArrayList(this.m.keySet());
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final tg1 c() {
        rg1 rg1Var = new rg1();
        for (Map.Entry entry : this.m.entrySet()) {
            if (entry.getValue() instanceof hg1) {
                rg1Var.m.put((String) entry.getKey(), (tg1) entry.getValue());
            } else {
                rg1Var.m.put((String) entry.getKey(), ((tg1) entry.getValue()).c());
            }
        }
        return rg1Var;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rg1) {
            return this.m.equals(((rg1) obj).m);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final String g() {
        return "[object Object]";
    }

    @Override // androidx.appcompat.view.menu.hg1
    public final tg1 h(String str) {
        return this.m.containsKey(str) ? (tg1) this.m.get(str) : tg1.e;
    }

    public int hashCode() {
        return this.m.hashCode();
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Iterator i() {
        return ng1.b(this.m);
    }

    @Override // androidx.appcompat.view.menu.hg1
    public final boolean k(String str) {
        return this.m.containsKey(str);
    }

    @Override // androidx.appcompat.view.menu.hg1
    public final void n(String str, tg1 tg1Var) {
        if (tg1Var == null) {
            this.m.remove(str);
        } else {
            this.m.put(str, tg1Var);
        }
    }

    public tg1 p(String str, sw1 sw1Var, List list) {
        return "toString".equals(str) ? new xg1(toString()) : ng1.a(this, new xg1(str), sw1Var, list);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.m.isEmpty()) {
            for (String str : this.m.keySet()) {
                sb.append(String.format("%s: %s,", str, this.m.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
