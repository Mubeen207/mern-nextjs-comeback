package androidx.appcompat.view.menu;

import android.graphics.Rect;
/* loaded from: classes.dex */
public final class ea1 {
    public final q8 a;
    public final b91 b;

    public ea1(q8 q8Var, b91 b91Var) {
        c60.e(q8Var, "_bounds");
        c60.e(b91Var, "_windowInsetsCompat");
        this.a = q8Var;
        this.b = b91Var;
    }

    public final Rect a() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (c60.a(ea1.class, obj != null ? obj.getClass() : null)) {
            c60.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
            ea1 ea1Var = (ea1) obj;
            return c60.a(this.a, ea1Var.a) && c60.a(this.b, ea1Var.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this.a + ", windowInsetsCompat=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ea1(android.graphics.Rect r1, androidx.appcompat.view.menu.b91 r2, int r3, androidx.appcompat.view.menu.lj r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L12
            androidx.appcompat.view.menu.b91$b r2 = new androidx.appcompat.view.menu.b91$b
            r2.<init>()
            androidx.appcompat.view.menu.b91 r2 = r2.a()
            java.lang.String r3 = "Builder().build()"
            androidx.appcompat.view.menu.c60.d(r2, r3)
        L12:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ea1.<init>(android.graphics.Rect, androidx.appcompat.view.menu.b91, int, androidx.appcompat.view.menu.lj):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ea1(Rect rect, b91 b91Var) {
        this(new q8(rect), b91Var);
        c60.e(rect, "bounds");
        c60.e(b91Var, "insets");
    }
}
