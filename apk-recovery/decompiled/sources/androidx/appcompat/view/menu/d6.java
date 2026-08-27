package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class d6 extends bi0 {
    public final long a;
    public final g21 b;
    public final ap c;

    public d6(long j, g21 g21Var, ap apVar) {
        this.a = j;
        if (g21Var == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = g21Var;
        if (apVar == null) {
            throw new NullPointerException("Null event");
        }
        this.c = apVar;
    }

    @Override // androidx.appcompat.view.menu.bi0
    public ap b() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.bi0
    public long c() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.bi0
    public g21 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bi0) {
            bi0 bi0Var = (bi0) obj;
            return this.a == bi0Var.c() && this.b.equals(bi0Var.d()) && this.c.equals(bi0Var.b());
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
