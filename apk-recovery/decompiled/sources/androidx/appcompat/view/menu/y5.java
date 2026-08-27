package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class y5 extends w80 {
    public final String a;
    public final String b;

    public y5(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    @Override // androidx.appcompat.view.menu.w80
    public String b() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.w80
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w80) {
            w80 w80Var = (w80) obj;
            return this.a.equals(w80Var.b()) && this.b.equals(w80Var.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
