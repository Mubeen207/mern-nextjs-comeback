package androidx.appcompat.view.menu;

import android.graphics.Rect;
/* loaded from: classes.dex */
public final class q8 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public q8(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i + ", right: " + i3).toString());
        } else if (i2 <= i4) {
        } else {
            throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i2 + ", bottom: " + i4).toString());
        }
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (c60.a(q8.class, obj != null ? obj.getClass() : null)) {
            c60.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
            q8 q8Var = (q8) obj;
            return this.a == q8Var.a && this.b == q8Var.b && this.c == q8Var.c && this.d == q8Var.d;
        }
        return false;
    }

    public final Rect f() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return q8.class.getSimpleName() + " { [" + this.a + ',' + this.b + ',' + this.c + ',' + this.d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q8(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        c60.e(rect, "rect");
    }
}
