package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.m2;
/* loaded from: classes.dex */
public final class r2 {
    public final int a;
    public final m2 b;
    public final m2.d c;
    public final String d;

    public r2(m2 m2Var, m2.d dVar, String str) {
        this.b = m2Var;
        this.c = dVar;
        this.d = str;
        this.a = zf0.b(m2Var, dVar, str);
    }

    public static r2 a(m2 m2Var, m2.d dVar, String str) {
        return new r2(m2Var, dVar, str);
    }

    public final String b() {
        return this.b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            r2 r2Var = (r2) obj;
            return zf0.a(this.b, r2Var.b) && zf0.a(this.c, r2Var.c) && zf0.a(this.d, r2Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
