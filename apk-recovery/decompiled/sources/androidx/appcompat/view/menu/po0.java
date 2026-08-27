package androidx.appcompat.view.menu;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class po0 implements gh {
    public final float a;

    public po0(float f) {
        this.a = f;
    }

    public static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // androidx.appcompat.view.menu.gh
    public float a(RectF rectF) {
        return this.a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof po0) && this.a == ((po0) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
