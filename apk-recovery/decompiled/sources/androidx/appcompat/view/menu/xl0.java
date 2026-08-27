package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class xl0 {
    public final Class a;
    public final Class b;

    /* loaded from: classes.dex */
    public @interface a {
    }

    public xl0(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static xl0 a(Class cls, Class cls2) {
        return new xl0(cls, cls2);
    }

    public static xl0 b(Class cls) {
        return new xl0(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xl0.class != obj.getClass()) {
            return false;
        }
        xl0 xl0Var = (xl0) obj;
        if (this.b.equals(xl0Var.b)) {
            return this.a.equals(xl0Var.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        if (this.a == a.class) {
            return this.b.getName();
        }
        return "@" + this.a.getName() + " " + this.b.getName();
    }
}
