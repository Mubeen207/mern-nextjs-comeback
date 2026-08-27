package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class mh0 implements nb {
    public final Class a;
    public final String b;

    public mh0(Class cls, String str) {
        c60.e(cls, "jClass");
        c60.e(str, "moduleName");
        this.a = cls;
        this.b = str;
    }

    @Override // androidx.appcompat.view.menu.nb
    public Class d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof mh0) && c60.a(d(), ((mh0) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}
