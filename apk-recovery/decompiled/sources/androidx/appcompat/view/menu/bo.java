package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.kh;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class bo implements kh, Serializable {
    public static final bo m = new bo();

    @Override // androidx.appcompat.view.menu.kh
    public kh.b d(kh.c cVar) {
        c60.e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.kh
    public kh j(kh.c cVar) {
        c60.e(cVar, "key");
        return this;
    }

    @Override // androidx.appcompat.view.menu.kh
    public kh o(kh khVar) {
        c60.e(khVar, "context");
        return khVar;
    }

    @Override // androidx.appcompat.view.menu.kh
    public Object p(Object obj, yw ywVar) {
        c60.e(ywVar, "operation");
        return obj;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
