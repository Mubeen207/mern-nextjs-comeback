package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Color;
/* loaded from: classes.dex */
public class nn {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public nn(Context context) {
        this(jb0.b(context, cm0.l, false), ob0.b(context, cm0.k, 0), ob0.b(context, cm0.j, 0), ob0.b(context, cm0.h, 0), context.getResources().getDisplayMetrics().density);
    }

    public float a(float f2) {
        float f3 = this.e;
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f2) {
        int i2;
        float a = a(f2);
        int alpha = Color.alpha(i);
        int j = ob0.j(cd.k(i, 255), this.b, a);
        if (a > 0.0f && (i2 = this.c) != 0) {
            j = ob0.i(j, cd.k(i2, f));
        }
        return cd.k(j, alpha);
    }

    public int c(int i, float f2) {
        return (this.a && e(i)) ? b(i, f2) : i;
    }

    public boolean d() {
        return this.a;
    }

    public final boolean e(int i) {
        return cd.k(i, 255) == this.d;
    }

    public nn(boolean z, int i, int i2, int i3, float f2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }
}
