package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ci0;
import androidx.appcompat.view.menu.di0;
/* loaded from: classes.dex */
public final class e6 extends di0 {
    public final String b;
    public final ci0.a c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    /* loaded from: classes.dex */
    public static final class b extends di0.a {
        public String a;
        public ci0.a b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;

        @Override // androidx.appcompat.view.menu.di0.a
        public di0 a() {
            String str = "";
            if (this.b == null) {
                str = " registrationStatus";
            }
            if (this.e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new e6(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.appcompat.view.menu.di0.a
        public di0.a b(String str) {
            this.c = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.di0.a
        public di0.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // androidx.appcompat.view.menu.di0.a
        public di0.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.di0.a
        public di0.a e(String str) {
            this.g = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.di0.a
        public di0.a f(String str) {
            this.d = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.di0.a
        public di0.a g(ci0.a aVar) {
            if (aVar != null) {
                this.b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // androidx.appcompat.view.menu.di0.a
        public di0.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        public b() {
        }

        public b(di0 di0Var) {
            this.a = di0Var.d();
            this.b = di0Var.g();
            this.c = di0Var.b();
            this.d = di0Var.f();
            this.e = Long.valueOf(di0Var.c());
            this.f = Long.valueOf(di0Var.h());
            this.g = di0Var.e();
        }
    }

    @Override // androidx.appcompat.view.menu.di0
    public String b() {
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.di0
    public long c() {
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.di0
    public String d() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.di0
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof di0) {
            di0 di0Var = (di0) obj;
            String str3 = this.b;
            if (str3 != null ? str3.equals(di0Var.d()) : di0Var.d() == null) {
                if (this.c.equals(di0Var.g()) && ((str = this.d) != null ? str.equals(di0Var.b()) : di0Var.b() == null) && ((str2 = this.e) != null ? str2.equals(di0Var.f()) : di0Var.f() == null) && this.f == di0Var.c() && this.g == di0Var.h()) {
                    String str4 = this.h;
                    if (str4 == null) {
                        if (di0Var.e() == null) {
                            return true;
                        }
                    } else if (str4.equals(di0Var.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.di0
    public String f() {
        return this.e;
    }

    @Override // androidx.appcompat.view.menu.di0
    public ci0.a g() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.di0
    public long h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f;
        long j2 = this.g;
        int i = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return i ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // androidx.appcompat.view.menu.di0
    public di0.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.c + ", authToken=" + this.d + ", refreshToken=" + this.e + ", expiresInSecs=" + this.f + ", tokenCreationEpochInSecs=" + this.g + ", fisError=" + this.h + "}";
    }

    public e6(String str, ci0.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }
}
