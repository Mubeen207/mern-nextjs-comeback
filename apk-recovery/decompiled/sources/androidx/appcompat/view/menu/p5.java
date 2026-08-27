package androidx.appcompat.view.menu;

import java.util.List;
/* loaded from: classes.dex */
public final class p5 extends g8 {
    public final List a;

    public p5(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.a = list;
    }

    @Override // androidx.appcompat.view.menu.g8
    public List c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g8) {
            return this.a.equals(((g8) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
