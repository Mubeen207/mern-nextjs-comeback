package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.d11;
/* loaded from: classes.dex */
public final class k6 extends d11 {
    public final String a;
    public final long b;
    public final d11.b c;

    /* loaded from: classes.dex */
    public static final class b extends d11.a {
        public String a;
        public Long b;
        public d11.b c;

        @Override // androidx.appcompat.view.menu.d11.a
        public d11 a() {
            String str = "";
            if (this.b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new k6(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.appcompat.view.menu.d11.a
        public d11.a b(d11.b bVar) {
            this.c = bVar;
            return this;
        }

        @Override // androidx.appcompat.view.menu.d11.a
        public d11.a c(String str) {
            this.a = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.d11.a
        public d11.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.d11
    public d11.b b() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.d11
    public String c() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.d11
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d11) {
            d11 d11Var = (d11) obj;
            String str = this.a;
            if (str != null ? str.equals(d11Var.c()) : d11Var.c() == null) {
                if (this.b == d11Var.d()) {
                    d11.b bVar = this.c;
                    if (bVar == null) {
                        if (d11Var.b() == null) {
                            return true;
                        }
                    } else if (bVar.equals(d11Var.b())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        d11.b bVar = this.c;
        return i ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }

    public k6(String str, long j, d11.b bVar) {
        this.a = str;
        this.b = j;
        this.c = bVar;
    }
}
