package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t7;
/* loaded from: classes.dex */
public final class o5 extends t7 {
    public final t7.a a;
    public final long b;

    public o5(t7.a aVar, long j) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.a = aVar;
        this.b = j;
    }

    @Override // androidx.appcompat.view.menu.t7
    public long b() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.t7
    public t7.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t7) {
            t7 t7Var = (t7) obj;
            return this.a.equals(t7Var.c()) && this.b == t7Var.b();
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.a + ", nextRequestWaitMillis=" + this.b + "}";
    }
}
