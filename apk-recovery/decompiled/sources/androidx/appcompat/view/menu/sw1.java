package androidx.appcompat.view.menu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class sw1 {
    public final sw1 a;
    public ii1 b;
    public Map c = new HashMap();
    public Map d = new HashMap();

    public sw1(sw1 sw1Var, ii1 ii1Var) {
        this.a = sw1Var;
        this.b = ii1Var;
    }

    public final tg1 a(sf1 sf1Var) {
        tg1 tg1Var = tg1.e;
        Iterator A = sf1Var.A();
        while (A.hasNext()) {
            tg1Var = this.b.a(this, sf1Var.s(((Integer) A.next()).intValue()));
            if (tg1Var instanceof fg1) {
                break;
            }
        }
        return tg1Var;
    }

    public final tg1 b(tg1 tg1Var) {
        return this.b.a(this, tg1Var);
    }

    public final tg1 c(String str) {
        sw1 sw1Var = this;
        while (!sw1Var.c.containsKey(str)) {
            sw1Var = sw1Var.a;
            if (sw1Var == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return (tg1) sw1Var.c.get(str);
    }

    public final sw1 d() {
        return new sw1(this, this.b);
    }

    public final void e(String str, tg1 tg1Var) {
        if (this.d.containsKey(str)) {
            return;
        }
        if (tg1Var == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, tg1Var);
        }
    }

    public final void f(String str, tg1 tg1Var) {
        e(str, tg1Var);
        this.d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        sw1 sw1Var = this;
        while (!sw1Var.c.containsKey(str)) {
            sw1Var = sw1Var.a;
            if (sw1Var == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, tg1 tg1Var) {
        sw1 sw1Var;
        sw1 sw1Var2 = this;
        while (!sw1Var2.c.containsKey(str) && (sw1Var = sw1Var2.a) != null && sw1Var.g(str)) {
            sw1Var2 = sw1Var2.a;
        }
        if (sw1Var2.d.containsKey(str)) {
            return;
        }
        if (tg1Var == null) {
            sw1Var2.c.remove(str);
        } else {
            sw1Var2.c.put(str, tg1Var);
        }
    }
}
