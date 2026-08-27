package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qs0;
/* loaded from: classes.dex */
public final class i6 extends qs0 {
    public final g21 a;
    public final String b;
    public final wo c;
    public final u11 d;
    public final lo e;

    /* loaded from: classes.dex */
    public static final class b extends qs0.a {
        public g21 a;
        public String b;
        public wo c;
        public u11 d;
        public lo e;

        @Override // androidx.appcompat.view.menu.qs0.a
        public qs0 a() {
            String str = "";
            if (this.a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.d == null) {
                str = str + " transformer";
            }
            if (this.e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new i6(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.appcompat.view.menu.qs0.a
        public qs0.a b(lo loVar) {
            if (loVar != null) {
                this.e = loVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // androidx.appcompat.view.menu.qs0.a
        public qs0.a c(wo woVar) {
            if (woVar != null) {
                this.c = woVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // androidx.appcompat.view.menu.qs0.a
        public qs0.a d(u11 u11Var) {
            if (u11Var != null) {
                this.d = u11Var;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // androidx.appcompat.view.menu.qs0.a
        public qs0.a e(g21 g21Var) {
            if (g21Var != null) {
                this.a = g21Var;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // androidx.appcompat.view.menu.qs0.a
        public qs0.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // androidx.appcompat.view.menu.qs0
    public lo b() {
        return this.e;
    }

    @Override // androidx.appcompat.view.menu.qs0
    public wo c() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.qs0
    public u11 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qs0) {
            qs0 qs0Var = (qs0) obj;
            return this.a.equals(qs0Var.f()) && this.b.equals(qs0Var.g()) && this.c.equals(qs0Var.c()) && this.d.equals(qs0Var.e()) && this.e.equals(qs0Var.b());
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.qs0
    public g21 f() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.qs0
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }

    public i6(g21 g21Var, String str, wo woVar, u11 u11Var, lo loVar) {
        this.a = g21Var;
        this.b = str;
        this.c = woVar;
        this.d = u11Var;
        this.e = loVar;
    }
}
