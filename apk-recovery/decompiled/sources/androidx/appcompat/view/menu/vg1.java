package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class vg1 extends jg1 {
    public final List o;
    public final List p;
    public sw1 q;

    public vg1(vg1 vg1Var) {
        super(vg1Var.m);
        ArrayList arrayList = new ArrayList(vg1Var.o.size());
        this.o = arrayList;
        arrayList.addAll(vg1Var.o);
        ArrayList arrayList2 = new ArrayList(vg1Var.p.size());
        this.p = arrayList2;
        arrayList2.addAll(vg1Var.p);
        this.q = vg1Var.q;
    }

    @Override // androidx.appcompat.view.menu.jg1
    public final tg1 a(sw1 sw1Var, List list) {
        sw1 d = this.q.d();
        for (int i = 0; i < this.o.size(); i++) {
            if (i < list.size()) {
                d.e((String) this.o.get(i), sw1Var.b((tg1) list.get(i)));
            } else {
                d.e((String) this.o.get(i), tg1.e);
            }
        }
        for (tg1 tg1Var : this.p) {
            tg1 b = d.b(tg1Var);
            if (b instanceof zg1) {
                b = d.b(tg1Var);
            }
            if (b instanceof fg1) {
                return ((fg1) b).a();
            }
        }
        return tg1.e;
    }

    @Override // androidx.appcompat.view.menu.jg1, androidx.appcompat.view.menu.tg1
    public final tg1 c() {
        return new vg1(this);
    }

    public vg1(String str, List list, List list2, sw1 sw1Var) {
        super(str);
        this.o = new ArrayList();
        this.q = sw1Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.o.add(((tg1) it.next()).g());
            }
        }
        this.p = new ArrayList(list2);
    }
}
