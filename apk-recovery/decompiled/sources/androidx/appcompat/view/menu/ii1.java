package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class ii1 {
    public Map a = new HashMap();
    public mj1 b = new mj1();

    public ii1() {
        b(new fh1());
        b(new gi1());
        b(new ki1());
        b(new si1());
        b(new wi1());
        b(new ij1());
        b(new sj1());
    }

    public final tg1 a(sw1 sw1Var, tg1 tg1Var) {
        lu1.b(sw1Var);
        if (tg1Var instanceof zg1) {
            zg1 zg1Var = (zg1) tg1Var;
            ArrayList b = zg1Var.b();
            String a = zg1Var.a();
            return (this.a.containsKey(a) ? (jh1) this.a.get(a) : this.b).b(a, sw1Var, b);
        }
        return tg1Var;
    }

    public final void b(jh1 jh1Var) {
        for (wj1 wj1Var : jh1Var.a) {
            this.a.put(wj1Var.toString(), jh1Var);
        }
    }
}
