package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ye0;
/* loaded from: classes.dex */
public final class c6 extends ye0 {
    public final ye0.c a;
    public final ye0.b b;

    /* loaded from: classes.dex */
    public static final class b extends ye0.a {
        public ye0.c a;
        public ye0.b b;

        @Override // androidx.appcompat.view.menu.ye0.a
        public ye0 a() {
            return new c6(this.a, this.b);
        }

        @Override // androidx.appcompat.view.menu.ye0.a
        public ye0.a b(ye0.b bVar) {
            this.b = bVar;
            return this;
        }

        @Override // androidx.appcompat.view.menu.ye0.a
        public ye0.a c(ye0.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.ye0
    public ye0.b b() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.ye0
    public ye0.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ye0) {
            ye0 ye0Var = (ye0) obj;
            ye0.c cVar = this.a;
            if (cVar != null ? cVar.equals(ye0Var.c()) : ye0Var.c() == null) {
                ye0.b bVar = this.b;
                if (bVar == null) {
                    if (ye0Var.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(ye0Var.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        ye0.c cVar = this.a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        ye0.b bVar = this.b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }

    public c6(ye0.c cVar, ye0.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }
}
