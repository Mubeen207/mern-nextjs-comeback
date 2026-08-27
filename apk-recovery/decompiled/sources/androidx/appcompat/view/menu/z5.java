package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ia0;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class z5 extends ia0 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final ye0 g;

    /* loaded from: classes.dex */
    public static final class b extends ia0.a {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public ye0 g;

        @Override // androidx.appcompat.view.menu.ia0.a
        public ia0 a() {
            String str = "";
            if (this.a == null) {
                str = " eventTimeMs";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new z5(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.appcompat.view.menu.ia0.a
        public ia0.a b(Integer num) {
            this.b = num;
            return this;
        }

        @Override // androidx.appcompat.view.menu.ia0.a
        public ia0.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // androidx.appcompat.view.menu.ia0.a
        public ia0.a d(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // androidx.appcompat.view.menu.ia0.a
        public ia0.a e(ye0 ye0Var) {
            this.g = ye0Var;
            return this;
        }

        @Override // androidx.appcompat.view.menu.ia0.a
        public ia0.a f(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @Override // androidx.appcompat.view.menu.ia0.a
        public ia0.a g(String str) {
            this.e = str;
            return this;
        }

        @Override // androidx.appcompat.view.menu.ia0.a
        public ia0.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.ia0
    public Integer b() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.ia0
    public long c() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.ia0
    public long d() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.ia0
    public ye0 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ia0) {
            ia0 ia0Var = (ia0) obj;
            if (this.a == ia0Var.c() && ((num = this.b) != null ? num.equals(ia0Var.b()) : ia0Var.b() == null) && this.c == ia0Var.d()) {
                if (Arrays.equals(this.d, ia0Var instanceof z5 ? ((z5) ia0Var).d : ia0Var.f()) && ((str = this.e) != null ? str.equals(ia0Var.g()) : ia0Var.g() == null) && this.f == ia0Var.h()) {
                    ye0 ye0Var = this.g;
                    if (ye0Var == null) {
                        if (ia0Var.e() == null) {
                            return true;
                        }
                    } else if (ye0Var.equals(ia0Var.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.ia0
    public byte[] f() {
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.ia0
    public String g() {
        return this.e;
    }

    @Override // androidx.appcompat.view.menu.ia0
    public long h() {
        return this.f;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i2 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        ye0 ye0Var = this.g;
        return i2 ^ (ye0Var != null ? ye0Var.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }

    public z5(long j, Integer num, long j2, byte[] bArr, String str, long j3, ye0 ye0Var) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = ye0Var;
    }
}
