package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.hp;
/* loaded from: classes.dex */
public final class u5 extends hp {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    /* loaded from: classes.dex */
    public static final class b extends hp.a {
        public Long a;
        public Integer b;
        public Integer c;
        public Long d;
        public Integer e;

        @Override // androidx.appcompat.view.menu.hp.a
        public hp a() {
            String str = "";
            if (this.a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new u5(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.appcompat.view.menu.hp.a
        public hp.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.appcompat.view.menu.hp.a
        public hp.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // androidx.appcompat.view.menu.hp.a
        public hp.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.appcompat.view.menu.hp.a
        public hp.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.appcompat.view.menu.hp.a
        public hp.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.hp
    public int b() {
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.hp
    public long c() {
        return this.e;
    }

    @Override // androidx.appcompat.view.menu.hp
    public int d() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.hp
    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hp) {
            hp hpVar = (hp) obj;
            return this.b == hpVar.f() && this.c == hpVar.d() && this.d == hpVar.b() && this.e == hpVar.c() && this.f == hpVar.e();
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.hp
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.d + ", eventCleanUpAge=" + this.e + ", maxBlobByteSizePerRow=" + this.f + "}";
    }

    public u5(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }
}
