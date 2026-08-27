package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.kh;
/* loaded from: classes.dex */
public abstract class i implements kh.c {
    public final kw m;
    public final kh.c n;

    public i(kh.c cVar, kw kwVar) {
        c60.e(cVar, "baseKey");
        c60.e(kwVar, "safeCast");
        this.m = kwVar;
        this.n = cVar instanceof i ? ((i) cVar).n : cVar;
    }

    public final boolean a(kh.c cVar) {
        c60.e(cVar, "key");
        return cVar == this || this.n == cVar;
    }

    public final kh.b b(kh.b bVar) {
        c60.e(bVar, "element");
        return (kh.b) this.m.i(bVar);
    }
}
