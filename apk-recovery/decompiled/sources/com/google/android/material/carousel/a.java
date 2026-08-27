package com.google.android.material.carousel;

import android.content.Context;
import androidx.appcompat.view.menu.hm0;
import androidx.appcompat.view.menu.i4;
import androidx.appcompat.view.menu.ja;
import com.google.android.material.carousel.b;
/* loaded from: classes.dex */
public abstract class a {
    public static float a(float f, float f2, int i) {
        return f + (Math.max(0, i - 1) * f2);
    }

    public static float b(float f, float f2, int i) {
        return i > 0 ? f + (f2 / 2.0f) : f;
    }

    public static b c(Context context, float f, float f2, i4 i4Var) {
        float f3;
        float f4;
        float min = Math.min(f(context) + f, i4Var.f);
        float f5 = min / 2.0f;
        float f6 = 0.0f - f5;
        float b = b(0.0f, i4Var.b, i4Var.c);
        float j = j(0.0f, a(b, i4Var.b, (int) Math.floor(i4Var.c / 2.0f)), i4Var.b, i4Var.c);
        float b2 = b(j, i4Var.e, i4Var.d);
        float j2 = j(j, a(b2, i4Var.e, (int) Math.floor(i4Var.d / 2.0f)), i4Var.e, i4Var.d);
        float b3 = b(j2, i4Var.f, i4Var.g);
        float j3 = j(j2, a(b3, i4Var.f, i4Var.g), i4Var.f, i4Var.g);
        float b4 = b(j3, i4Var.e, i4Var.d);
        float b5 = b(j(j3, a(b4, i4Var.e, (int) Math.ceil(i4Var.d / 2.0f)), i4Var.e, i4Var.d), i4Var.b, i4Var.c);
        float f7 = f5 + f2;
        float b6 = ja.b(min, i4Var.f, f);
        float b7 = ja.b(i4Var.b, i4Var.f, f);
        float b8 = ja.b(i4Var.e, i4Var.f, f);
        b.C0060b a = new b.C0060b(i4Var.f, f2).a(f6, b6, min);
        int i = i4Var.c;
        if (i > 0) {
            f3 = f7;
            a.f(b, b7, i4Var.b, (int) Math.floor(i / 2.0f));
        } else {
            f3 = f7;
        }
        int i2 = i4Var.d;
        if (i2 > 0) {
            a.f(b2, b8, i4Var.e, (int) Math.floor(i2 / 2.0f));
        }
        a.g(b3, 0.0f, i4Var.f, i4Var.g, true);
        int i3 = i4Var.d;
        if (i3 > 0) {
            f4 = 2.0f;
            a.f(b4, b8, i4Var.e, (int) Math.ceil(i3 / 2.0f));
        } else {
            f4 = 2.0f;
        }
        int i4 = i4Var.c;
        if (i4 > 0) {
            a.f(b5, b7, i4Var.b, (int) Math.ceil(i4 / f4));
        }
        a.a(f3, b6, min);
        return a.h();
    }

    public static b d(Context context, float f, float f2, i4 i4Var, int i) {
        return i == 1 ? c(context, f, f2, i4Var) : e(context, f, f2, i4Var);
    }

    public static b e(Context context, float f, float f2, i4 i4Var) {
        float min = Math.min(f(context) + f, i4Var.f);
        float f3 = min / 2.0f;
        float f4 = 0.0f - f3;
        float b = b(0.0f, i4Var.f, i4Var.g);
        float j = j(0.0f, a(b, i4Var.f, i4Var.g), i4Var.f, i4Var.g);
        float b2 = b(j, i4Var.e, i4Var.d);
        float b3 = b(j(j, b2, i4Var.e, i4Var.d), i4Var.b, i4Var.c);
        float f5 = f3 + f2;
        float b4 = ja.b(min, i4Var.f, f);
        float b5 = ja.b(i4Var.b, i4Var.f, f);
        float b6 = ja.b(i4Var.e, i4Var.f, f);
        b.C0060b g = new b.C0060b(i4Var.f, f2).a(f4, b4, min).g(b, 0.0f, i4Var.f, i4Var.g, true);
        if (i4Var.d > 0) {
            g.b(b2, b6, i4Var.e);
        }
        int i = i4Var.c;
        if (i > 0) {
            g.f(b3, b5, i4Var.b, i);
        }
        g.a(f5, b4, min);
        return g.h();
    }

    public static float f(Context context) {
        return context.getResources().getDimension(hm0.l);
    }

    public static float g(Context context) {
        return context.getResources().getDimension(hm0.m);
    }

    public static float h(Context context) {
        return context.getResources().getDimension(hm0.n);
    }

    public static int i(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public static float j(float f, float f2, float f3, int i) {
        return i > 0 ? f2 + (f3 / 2.0f) : f;
    }
}
