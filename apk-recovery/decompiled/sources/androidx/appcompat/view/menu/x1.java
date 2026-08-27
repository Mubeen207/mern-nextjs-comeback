package androidx.appcompat.view.menu;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class x1 implements gh {
    public final gh a;
    public final float b;

    public x1(float f, gh ghVar) {
        while (ghVar instanceof x1) {
            ghVar = ((x1) ghVar).a;
            f += ((x1) ghVar).b;
        }
        this.a = ghVar;
        this.b = f;
    }

    @Override // androidx.appcompat.view.menu.gh
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x1) {
            x1 x1Var = (x1) obj;
            return this.a.equals(x1Var.a) && this.b == x1Var.b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
