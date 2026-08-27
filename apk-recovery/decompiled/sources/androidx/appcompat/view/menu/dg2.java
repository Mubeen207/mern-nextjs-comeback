package androidx.appcompat.view.menu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class dg2 extends jg1 {
    public final f52 o;
    public final Map p;

    public dg2(f52 f52Var) {
        super("require");
        this.p = new HashMap();
        this.o = f52Var;
    }

    @Override // androidx.appcompat.view.menu.jg1
    public final tg1 a(sw1 sw1Var, List list) {
        lu1.g("require", 1, list);
        String g = sw1Var.b((tg1) list.get(0)).g();
        if (this.p.containsKey(g)) {
            return (tg1) this.p.get(g);
        }
        tg1 a = this.o.a(g);
        if (a instanceof jg1) {
            this.p.put(g, (jg1) a);
        }
        return a;
    }
}
