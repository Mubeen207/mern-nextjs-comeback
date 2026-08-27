package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.kh;
/* loaded from: classes.dex */
public abstract class h implements kh.b {
    public final kh.c m;

    public h(kh.c cVar) {
        c60.e(cVar, "key");
        this.m = cVar;
    }

    @Override // androidx.appcompat.view.menu.kh.b, androidx.appcompat.view.menu.kh
    public kh.b d(kh.c cVar) {
        return kh.b.a.b(this, cVar);
    }

    @Override // androidx.appcompat.view.menu.kh.b
    public kh.c getKey() {
        return this.m;
    }

    @Override // androidx.appcompat.view.menu.kh
    public kh j(kh.c cVar) {
        return kh.b.a.c(this, cVar);
    }

    @Override // androidx.appcompat.view.menu.kh
    public kh o(kh khVar) {
        return kh.b.a.d(this, khVar);
    }

    @Override // androidx.appcompat.view.menu.kh
    public Object p(Object obj, yw ywVar) {
        return kh.b.a.a(this, obj, ywVar);
    }
}
