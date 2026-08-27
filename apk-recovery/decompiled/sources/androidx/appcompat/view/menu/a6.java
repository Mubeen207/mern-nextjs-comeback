package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ka0;
import java.util.List;
/* loaded from: classes.dex */
public final class a6 extends ka0 {
    public final long a;
    public final long b;
    public final yb c;
    public final Integer d;
    public final String e;
    public final List f;
    public final wl0 g;

    /* loaded from: classes.dex */
    public static final class b extends ka0.a {
        public Long a;
        public Long b;
        public yb c;
        public Integer d;
        public String e;
        public List f;
        public wl0 g;

        @Override // androidx.appcompat.view.menu.ka0.a
        public ka0 a() {
            String str = "";
            if (this.a == null) {
                str = " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new a6(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.appcompat.view.menu.ka0.a
        public ka0.a b(yb ybVar) {
            this.c = ybVar;
            return this;
        }

        @Override // androidx.appcompat.view.menu.ka0.a
        public ka0.a c(List list) {
            this.f = list;
            return this;
        }

        @Override // androidx.appcompat.view.menu.ka0.a
        public ka0.a d(Integer num) {
            this.d = num;
            return this;
        }

        @Override // androidx.appcompat.view.menu.ka0.a
        public ka0.a e(String str) {
            this.e = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.ka0.a
        public ka0.a f(wl0 wl0Var) {
            this.g = wl0Var;
            return this;
        }

        @Override // androidx.appcompat.view.menu.ka0.a
        public ka0.a g(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // androidx.appcompat.view.menu.ka0.a
        public ka0.a h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.ka0
    public yb b() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.ka0
    public List c() {
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.ka0
    public Integer d() {
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.ka0
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        yb ybVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ka0) {
            ka0 ka0Var = (ka0) obj;
            if (this.a == ka0Var.g() && this.b == ka0Var.h() && ((ybVar = this.c) != null ? ybVar.equals(ka0Var.b()) : ka0Var.b() == null) && ((num = this.d) != null ? num.equals(ka0Var.d()) : ka0Var.d() == null) && ((str = this.e) != null ? str.equals(ka0Var.e()) : ka0Var.e() == null) && ((list = this.f) != null ? list.equals(ka0Var.c()) : ka0Var.c() == null)) {
                wl0 wl0Var = this.g;
                if (wl0Var == null) {
                    if (ka0Var.f() == null) {
                        return true;
                    }
                } else if (wl0Var.equals(ka0Var.f())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.ka0
    public wl0 f() {
        return this.g;
    }

    @Override // androidx.appcompat.view.menu.ka0
    public long g() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.ka0
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        yb ybVar = this.c;
        int hashCode = (i ^ (ybVar == null ? 0 : ybVar.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        wl0 wl0Var = this.g;
        return hashCode4 ^ (wl0Var != null ? wl0Var.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }

    public a6(long j, long j2, yb ybVar, Integer num, String str, List list, wl0 wl0Var) {
        this.a = j;
        this.b = j2;
        this.c = ybVar;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = wl0Var;
    }
}
