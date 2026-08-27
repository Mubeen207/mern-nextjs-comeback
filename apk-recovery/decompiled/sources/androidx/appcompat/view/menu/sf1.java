package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class sf1 implements hg1, tg1, Iterable {
    public final SortedMap m;
    public final Map n;

    public sf1() {
        this.m = new TreeMap();
        this.n = new TreeMap();
    }

    public final Iterator A() {
        return this.m.keySet().iterator();
    }

    public final List B() {
        ArrayList arrayList = new ArrayList(v());
        for (int i = 0; i < v(); i++) {
            arrayList.add(s(i));
        }
        return arrayList;
    }

    public final void C() {
        this.m.clear();
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final tg1 c() {
        sf1 sf1Var = new sf1();
        for (Map.Entry entry : this.m.entrySet()) {
            if (entry.getValue() instanceof hg1) {
                sf1Var.m.put((Integer) entry.getKey(), (tg1) entry.getValue());
            } else {
                sf1Var.m.put((Integer) entry.getKey(), ((tg1) entry.getValue()).c());
            }
        }
        return sf1Var;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sf1) {
            sf1 sf1Var = (sf1) obj;
            if (v() != sf1Var.v()) {
                return false;
            }
            if (this.m.isEmpty()) {
                return sf1Var.m.isEmpty();
            }
            for (int intValue = ((Integer) this.m.firstKey()).intValue(); intValue <= ((Integer) this.m.lastKey()).intValue(); intValue++) {
                if (!s(intValue).equals(sf1Var.s(intValue))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Double f() {
        return this.m.size() == 1 ? s(0).f() : this.m.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final String g() {
        return toString();
    }

    @Override // androidx.appcompat.view.menu.hg1
    public final tg1 h(String str) {
        tg1 tg1Var;
        return "length".equals(str) ? new bg1(Double.valueOf(v())) : (!k(str) || (tg1Var = (tg1) this.n.get(str)) == null) ? tg1.e : tg1Var;
    }

    public final int hashCode() {
        return this.m.hashCode() * 31;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Iterator i() {
        return new of1(this, this.m.keySet().iterator(), this.n.keySet().iterator());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new yf1(this);
    }

    @Override // androidx.appcompat.view.menu.hg1
    public final boolean k(String str) {
        return "length".equals(str) || this.n.containsKey(str);
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
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? oi1.d(str, this, sw1Var, list) : ng1.a(this, new xg1(str), sw1Var, list);
    }

    public final int r() {
        return this.m.size();
    }

    public final tg1 s(int i) {
        tg1 tg1Var;
        if (i < v()) {
            return (!z(i) || (tg1Var = (tg1) this.m.get(Integer.valueOf(i))) == null) ? tg1.e : tg1Var;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void t(int i, tg1 tg1Var) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        } else if (i >= v()) {
            y(i, tg1Var);
        } else {
            for (int intValue = ((Integer) this.m.lastKey()).intValue(); intValue >= i; intValue--) {
                tg1 tg1Var2 = (tg1) this.m.get(Integer.valueOf(intValue));
                if (tg1Var2 != null) {
                    y(intValue + 1, tg1Var2);
                    this.m.remove(Integer.valueOf(intValue));
                }
            }
            y(i, tg1Var);
        }
    }

    public final String toString() {
        return w(",");
    }

    public final void u(tg1 tg1Var) {
        y(v(), tg1Var);
    }

    public final int v() {
        if (this.m.isEmpty()) {
            return 0;
        }
        return ((Integer) this.m.lastKey()).intValue() + 1;
    }

    public final String w(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.m.isEmpty()) {
            for (int i = 0; i < v(); i++) {
                tg1 s = s(i);
                sb.append(str);
                if (!(s instanceof hh1) && !(s instanceof pg1)) {
                    sb.append(s.g());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void x(int i) {
        int intValue = ((Integer) this.m.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        this.m.remove(Integer.valueOf(i));
        if (i == intValue) {
            int i2 = i - 1;
            if (this.m.containsKey(Integer.valueOf(i2)) || i2 < 0) {
                return;
            }
            this.m.put(Integer.valueOf(i2), tg1.e);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) this.m.lastKey()).intValue()) {
                return;
            }
            tg1 tg1Var = (tg1) this.m.get(Integer.valueOf(i));
            if (tg1Var != null) {
                this.m.put(Integer.valueOf(i - 1), tg1Var);
                this.m.remove(Integer.valueOf(i));
            }
        }
    }

    public final void y(int i, tg1 tg1Var) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (tg1Var == null) {
            this.m.remove(Integer.valueOf(i));
        } else {
            this.m.put(Integer.valueOf(i), tg1Var);
        }
    }

    public final boolean z(int i) {
        if (i < 0 || i > ((Integer) this.m.lastKey()).intValue()) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        return this.m.containsKey(Integer.valueOf(i));
    }

    public sf1(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                y(i, (tg1) list.get(i));
            }
        }
    }

    public sf1(tg1... tg1VarArr) {
        this(Arrays.asList(tg1VarArr));
    }
}
