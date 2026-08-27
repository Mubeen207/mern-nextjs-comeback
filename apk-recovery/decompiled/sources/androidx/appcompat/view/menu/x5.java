package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.r50;
/* loaded from: classes.dex */
public final class x5 extends r50 {
    public final String a;
    public final long b;
    public final long c;

    /* loaded from: classes.dex */
    public static final class b extends r50.a {
        public String a;
        public Long b;
        public Long c;

        @Override // androidx.appcompat.view.menu.r50.a
        public r50 a() {
            String str = "";
            if (this.a == null) {
                str = " token";
            }
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new x5(this.a, this.b.longValue(), this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.appcompat.view.menu.r50.a
        public r50.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // androidx.appcompat.view.menu.r50.a
        public r50.a c(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // androidx.appcompat.view.menu.r50.a
        public r50.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.r50
    public String b() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.r50
    public long c() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.r50
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r50) {
            r50 r50Var = (r50) obj;
            return this.a.equals(r50Var.b()) && this.b == r50Var.d() && this.c == r50Var.c();
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }

    public x5(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
