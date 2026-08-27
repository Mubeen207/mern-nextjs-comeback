package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class vk0 extends l9 implements s70 {
    public final boolean t;

    public vk0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.t = (i & 2) == 2;
    }

    @Override // androidx.appcompat.view.menu.l9
    public m70 a() {
        return this.t ? this : super.a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vk0) {
            vk0 vk0Var = (vk0) obj;
            return g().equals(vk0Var.g()) && f().equals(vk0Var.f()) && j().equals(vk0Var.j()) && c60.a(c(), vk0Var.c());
        } else if (obj instanceof s70) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((g().hashCode() * 31) + f().hashCode()) * 31) + j().hashCode();
    }

    public String toString() {
        m70 a = a();
        if (a != this) {
            return a.toString();
        }
        return "property " + f() + " (Kotlin reflection is not available)";
    }
}
