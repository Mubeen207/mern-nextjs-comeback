package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class j6 extends ww0 {
    public final long a;
    public final long b;
    public final long c;

    public j6(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // androidx.appcompat.view.menu.ww0
    public long b() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.ww0
    public long c() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.ww0
    public long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ww0) {
            ww0 ww0Var = (ww0) obj;
            return this.a == ww0Var.c() && this.b == ww0Var.b() && this.c == ww0Var.d();
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.c + "}";
    }
}
