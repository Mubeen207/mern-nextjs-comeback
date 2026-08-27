package androidx.appcompat.view.menu;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class ty0 implements l80, Serializable {
    public iw m;
    public volatile Object n;
    public final Object o;

    public ty0(iw iwVar, Object obj) {
        c60.e(iwVar, "initializer");
        this.m = iwVar;
        this.n = g31.a;
        this.o = obj == null ? this : obj;
    }

    public boolean a() {
        return this.n != g31.a;
    }

    @Override // androidx.appcompat.view.menu.l80
    public Object getValue() {
        Object obj;
        Object obj2 = this.n;
        g31 g31Var = g31.a;
        if (obj2 != g31Var) {
            return obj2;
        }
        synchronized (this.o) {
            obj = this.n;
            if (obj == g31Var) {
                iw iwVar = this.m;
                c60.b(iwVar);
                obj = iwVar.d();
                this.n = obj;
                this.m = null;
            }
        }
        return obj;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ ty0(iw iwVar, Object obj, int i, lj ljVar) {
        this(iwVar, (i & 2) != 0 ? null : obj);
    }
}
