package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class ff1 {
    public kf1 a;
    public kf1 b;
    public List c;

    public ff1() {
        this.a = new kf1("", 0L, null);
        this.b = new kf1("", 0L, null);
        this.c = new ArrayList();
    }

    public final kf1 a() {
        return this.a;
    }

    public final void b(kf1 kf1Var) {
        this.a = kf1Var;
        this.b = (kf1) kf1Var.clone();
        this.c.clear();
    }

    public final void c(String str, long j, Map map) {
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            hashMap.put(str2, kf1.c(str2, this.a.b(str2), map.get(str2)));
        }
        this.c.add(new kf1(str, j, hashMap));
    }

    public final /* synthetic */ Object clone() {
        ff1 ff1Var = new ff1((kf1) this.a.clone());
        for (kf1 kf1Var : this.c) {
            ff1Var.c.add((kf1) kf1Var.clone());
        }
        return ff1Var;
    }

    public final kf1 d() {
        return this.b;
    }

    public final void e(kf1 kf1Var) {
        this.b = kf1Var;
    }

    public final List f() {
        return this.c;
    }

    public ff1(kf1 kf1Var) {
        this.a = kf1Var;
        this.b = (kf1) kf1Var.clone();
        this.c = new ArrayList();
    }
}
