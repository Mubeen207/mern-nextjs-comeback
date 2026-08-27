package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.c2;
/* loaded from: classes.dex */
public final class m5 extends c2 {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    /* loaded from: classes.dex */
    public static final class b extends c2.a {
        public Integer a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;

        @Override // androidx.appcompat.view.menu.c2.a
        public c2 a() {
            return new m5(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @Override // androidx.appcompat.view.menu.c2.a
        public c2.a b(String str) {
            this.l = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.c2.a
        public c2.a c(String str) {
            this.j = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.c2.a
        public c2.a d(String str) {
            this.d = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.c2.a
        public c2.a e(String str) {
            this.h = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.c2.a
        public c2.a f(String str) {
            this.c = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.c2.a
        public c2.a g(String str) {
            this.i = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.c2.a
        public c2.a h(String str) {
            this.g = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.c2.a
        public c2.a i(String str) {
            this.k = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.c2.a
        public c2.a j(String str) {
            this.b = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.c2.a
        public c2.a k(String str) {
            this.f = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.c2.a
        public c2.a l(String str) {
            this.e = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.c2.a
        public c2.a m(Integer num) {
            this.a = num;
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.c2
    public String b() {
        return this.l;
    }

    @Override // androidx.appcompat.view.menu.c2
    public String c() {
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.c2
    public String d() {
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.c2
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            Integer num = this.a;
            if (num != null ? num.equals(c2Var.m()) : c2Var.m() == null) {
                String str = this.b;
                if (str != null ? str.equals(c2Var.j()) : c2Var.j() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(c2Var.f()) : c2Var.f() == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(c2Var.d()) : c2Var.d() == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(c2Var.l()) : c2Var.l() == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(c2Var.k()) : c2Var.k() == null) {
                                    String str6 = this.g;
                                    if (str6 != null ? str6.equals(c2Var.h()) : c2Var.h() == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(c2Var.e()) : c2Var.e() == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(c2Var.g()) : c2Var.g() == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(c2Var.c()) : c2Var.c() == null) {
                                                    String str10 = this.k;
                                                    if (str10 != null ? str10.equals(c2Var.i()) : c2Var.i() == null) {
                                                        String str11 = this.l;
                                                        if (str11 == null) {
                                                            if (c2Var.b() == null) {
                                                                return true;
                                                            }
                                                        } else if (str11.equals(c2Var.b())) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.c2
    public String f() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.c2
    public String g() {
        return this.i;
    }

    @Override // androidx.appcompat.view.menu.c2
    public String h() {
        return this.g;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // androidx.appcompat.view.menu.c2
    public String i() {
        return this.k;
    }

    @Override // androidx.appcompat.view.menu.c2
    public String j() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.c2
    public String k() {
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.c2
    public String l() {
        return this.e;
    }

    @Override // androidx.appcompat.view.menu.c2
    public Integer m() {
        return this.a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.a + ", model=" + this.b + ", hardware=" + this.c + ", device=" + this.d + ", product=" + this.e + ", osBuild=" + this.f + ", manufacturer=" + this.g + ", fingerprint=" + this.h + ", locale=" + this.i + ", country=" + this.j + ", mccMnc=" + this.k + ", applicationBuild=" + this.l + "}";
    }

    public m5(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }
}
