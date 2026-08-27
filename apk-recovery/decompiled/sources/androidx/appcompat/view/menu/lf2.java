package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ls1;
import androidx.appcompat.view.menu.us1;
import androidx.appcompat.view.menu.vs1;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class lf2 {
    public String a;
    public boolean b;
    public us1 c;
    public BitSet d;
    public BitSet e;
    public Map f;
    public Map g;
    public final /* synthetic */ ze2 h;

    public static /* bridge */ /* synthetic */ BitSet b(lf2 lf2Var) {
        return lf2Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    public final ls1 a(int i) {
        ArrayList arrayList;
        ?? arrayList2;
        ls1.a M = ls1.M();
        M.r(i);
        M.u(this.b);
        us1 us1Var = this.c;
        if (us1Var != null) {
            M.t(us1Var);
        }
        us1.a y = us1.V().u(l92.M(this.d)).y(l92.M(this.e));
        if (this.f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f.size());
            for (Integer num : this.f.keySet()) {
                int intValue = num.intValue();
                Long l = (Long) this.f.get(Integer.valueOf(intValue));
                if (l != null) {
                    arrayList.add((ms1) ((t02) ms1.L().r(intValue).s(l.longValue()).j()));
                }
            }
        }
        if (arrayList != null) {
            y.s(arrayList);
        }
        if (this.g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.g.size());
            for (Integer num2 : this.g.keySet()) {
                vs1.a r = vs1.M().r(num2.intValue());
                List list = (List) this.g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    r.s(list);
                }
                arrayList2.add((vs1) ((t02) r.j()));
            }
        }
        y.w(arrayList2);
        M.s(y);
        return (ls1) ((t02) M.j());
    }

    public final void c(gf1 gf1Var) {
        int a = gf1Var.a();
        Boolean bool = gf1Var.c;
        if (bool != null) {
            this.e.set(a, bool.booleanValue());
        }
        Boolean bool2 = gf1Var.d;
        if (bool2 != null) {
            this.d.set(a, bool2.booleanValue());
        }
        if (gf1Var.e != null) {
            Long l = (Long) this.f.get(Integer.valueOf(a));
            long longValue = gf1Var.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f.put(Integer.valueOf(a), Long.valueOf(longValue));
            }
        }
        if (gf1Var.f != null) {
            List list = (List) this.g.get(Integer.valueOf(a));
            if (list == null) {
                list = new ArrayList();
                this.g.put(Integer.valueOf(a), list);
            }
            if (gf1Var.j()) {
                list.clear();
            }
            if (jb2.a() && this.h.e().D(this.a, vi1.j0) && gf1Var.i()) {
                list.clear();
            }
            if (!jb2.a() || !this.h.e().D(this.a, vi1.j0)) {
                list.add(Long.valueOf(gf1Var.f.longValue() / 1000));
                return;
            }
            long longValue2 = gf1Var.f.longValue() / 1000;
            if (list.contains(Long.valueOf(longValue2))) {
                return;
            }
            list.add(Long.valueOf(longValue2));
        }
    }

    public lf2(ze2 ze2Var, String str) {
        this.h = ze2Var;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new o4();
        this.g = new o4();
    }

    public lf2(ze2 ze2Var, String str, us1 us1Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.h = ze2Var;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new o4();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.g.put(num, arrayList);
            }
        }
        this.b = false;
        this.c = us1Var;
    }
}
