package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class jx extends l9 implements ix, q70 {
    public final int t;
    public final int u;

    public jx(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.t = i;
        this.u = i2 >> 1;
    }

    @Override // androidx.appcompat.view.menu.l9
    public m70 b() {
        return go0.a(this);
    }

    @Override // androidx.appcompat.view.menu.ix
    public int e() {
        return this.t;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jx) {
            jx jxVar = (jx) obj;
            return f().equals(jxVar.f()) && j().equals(jxVar.j()) && this.u == jxVar.u && this.t == jxVar.t && c60.a(c(), jxVar.c()) && c60.a(g(), jxVar.g());
        } else if (obj instanceof q70) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((g() == null ? 0 : g().hashCode() * 31) + f().hashCode()) * 31) + j().hashCode();
    }

    public String toString() {
        m70 a = a();
        if (a != this) {
            return a.toString();
        }
        if ("<init>".equals(f())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + f() + " (Kotlin reflection is not available)";
    }
}
