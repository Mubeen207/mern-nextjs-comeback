package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.kh;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class dd implements kh, Serializable {
    public final kh m;
    public final kh.b n;

    /* loaded from: classes.dex */
    public static final class a extends j80 implements yw {
        public static final a n = new a();

        public a() {
            super(2);
        }

        @Override // androidx.appcompat.view.menu.yw
        /* renamed from: a */
        public final String h(String str, kh.b bVar) {
            c60.e(str, "acc");
            c60.e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public dd(kh khVar, kh.b bVar) {
        c60.e(khVar, "left");
        c60.e(bVar, "element");
        this.m = khVar;
        this.n = bVar;
    }

    public final boolean b(kh.b bVar) {
        return c60.a(d(bVar.getKey()), bVar);
    }

    @Override // androidx.appcompat.view.menu.kh
    public kh.b d(kh.c cVar) {
        c60.e(cVar, "key");
        dd ddVar = this;
        while (true) {
            kh.b d = ddVar.n.d(cVar);
            if (d != null) {
                return d;
            }
            kh khVar = ddVar.m;
            if (!(khVar instanceof dd)) {
                return khVar.d(cVar);
            }
            ddVar = (dd) khVar;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dd) {
                dd ddVar = (dd) obj;
                if (ddVar.g() != g() || !ddVar.f(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(dd ddVar) {
        while (b(ddVar.n)) {
            kh khVar = ddVar.m;
            if (!(khVar instanceof dd)) {
                c60.c(khVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((kh.b) khVar);
            }
            ddVar = (dd) khVar;
        }
        return false;
    }

    public final int g() {
        int i = 2;
        dd ddVar = this;
        while (true) {
            kh khVar = ddVar.m;
            ddVar = khVar instanceof dd ? (dd) khVar : null;
            if (ddVar == null) {
                return i;
            }
            i++;
        }
    }

    public int hashCode() {
        return this.m.hashCode() + this.n.hashCode();
    }

    @Override // androidx.appcompat.view.menu.kh
    public kh j(kh.c cVar) {
        c60.e(cVar, "key");
        if (this.n.d(cVar) != null) {
            return this.m;
        }
        kh j = this.m.j(cVar);
        return j == this.m ? this : j == bo.m ? this.n : new dd(j, this.n);
    }

    @Override // androidx.appcompat.view.menu.kh
    public kh o(kh khVar) {
        return kh.a.a(this, khVar);
    }

    @Override // androidx.appcompat.view.menu.kh
    public Object p(Object obj, yw ywVar) {
        c60.e(ywVar, "operation");
        return ywVar.h(this.m.p(obj, ywVar), this.n);
    }

    public String toString() {
        return '[' + ((String) p("", a.n)) + ']';
    }
}
