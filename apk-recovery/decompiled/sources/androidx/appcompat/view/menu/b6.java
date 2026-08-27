package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class b6 extends la0 {
    public final long a;

    public b6(long j) {
        this.a = j;
    }

    @Override // androidx.appcompat.view.menu.la0
    public long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof la0) && this.a == ((la0) obj).c();
    }

    public int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.a + "}";
    }
}
