package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.q50;
/* loaded from: classes.dex */
public final class w5 extends q50 {
    public final String a;
    public final String b;
    public final String c;
    public final d11 d;
    public final q50.b e;

    /* loaded from: classes.dex */
    public static final class b extends q50.a {
        public String a;
        public String b;
        public String c;
        public d11 d;
        public q50.b e;

        @Override // androidx.appcompat.view.menu.q50.a
        public q50 a() {
            return new w5(this.a, this.b, this.c, this.d, this.e);
        }

        @Override // androidx.appcompat.view.menu.q50.a
        public q50.a b(d11 d11Var) {
            this.d = d11Var;
            return this;
        }

        @Override // androidx.appcompat.view.menu.q50.a
        public q50.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.q50.a
        public q50.a d(String str) {
            this.c = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.q50.a
        public q50.a e(q50.b bVar) {
            this.e = bVar;
            return this;
        }

        @Override // androidx.appcompat.view.menu.q50.a
        public q50.a f(String str) {
            this.a = str;
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.q50
    public d11 b() {
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.q50
    public String c() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.q50
    public String d() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.q50
    public q50.b e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q50) {
            q50 q50Var = (q50) obj;
            String str = this.a;
            if (str != null ? str.equals(q50Var.f()) : q50Var.f() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(q50Var.c()) : q50Var.c() == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(q50Var.d()) : q50Var.d() == null) {
                        d11 d11Var = this.d;
                        if (d11Var != null ? d11Var.equals(q50Var.b()) : q50Var.b() == null) {
                            q50.b bVar = this.e;
                            if (bVar == null) {
                                if (q50Var.e() == null) {
                                    return true;
                                }
                            } else if (bVar.equals(q50Var.e())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.q50
    public String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        d11 d11Var = this.d;
        int hashCode4 = (hashCode3 ^ (d11Var == null ? 0 : d11Var.hashCode())) * 1000003;
        q50.b bVar = this.e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }

    public w5(String str, String str2, String str3, d11 d11Var, q50.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d11Var;
        this.e = bVar;
    }
}
