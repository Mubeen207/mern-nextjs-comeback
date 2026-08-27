package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.yb;
/* loaded from: classes.dex */
public final class q5 extends yb {
    public final yb.b a;
    public final c2 b;

    /* loaded from: classes.dex */
    public static final class b extends yb.a {
        public yb.b a;
        public c2 b;

        @Override // androidx.appcompat.view.menu.yb.a
        public yb a() {
            return new q5(this.a, this.b);
        }

        @Override // androidx.appcompat.view.menu.yb.a
        public yb.a b(c2 c2Var) {
            this.b = c2Var;
            return this;
        }

        @Override // androidx.appcompat.view.menu.yb.a
        public yb.a c(yb.b bVar) {
            this.a = bVar;
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.yb
    public c2 b() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.yb
    public yb.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yb) {
            yb ybVar = (yb) obj;
            yb.b bVar = this.a;
            if (bVar != null ? bVar.equals(ybVar.c()) : ybVar.c() == null) {
                c2 c2Var = this.b;
                if (c2Var == null) {
                    if (ybVar.b() == null) {
                        return true;
                    }
                } else if (c2Var.equals(ybVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        yb.b bVar = this.a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        c2 c2Var = this.b;
        return hashCode ^ (c2Var != null ? c2Var.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }

    public q5(yb.b bVar, c2 c2Var) {
        this.a = bVar;
        this.b = c2Var;
    }
}
