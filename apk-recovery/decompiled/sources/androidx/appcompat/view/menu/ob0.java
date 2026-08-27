package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes.dex */
public abstract class ob0 {
    public static int a(int i, int i2) {
        return cd.k(i, (Color.alpha(i) * i2) / 255);
    }

    public static int b(Context context, int i, int i2) {
        Integer f = f(context, i);
        return f != null ? f.intValue() : i2;
    }

    public static int c(Context context, int i, String str) {
        return l(context, jb0.e(context, i, str));
    }

    public static int d(View view, int i) {
        return l(view.getContext(), jb0.f(view, i));
    }

    public static int e(View view, int i, int i2) {
        return b(view.getContext(), i, i2);
    }

    public static Integer f(Context context, int i) {
        TypedValue a = jb0.a(context, i);
        if (a != null) {
            return Integer.valueOf(l(context, a));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i) {
        TypedValue a = jb0.a(context, i);
        if (a == null) {
            return null;
        }
        int i2 = a.resourceId;
        if (i2 != 0) {
            return lg.d(context, i2);
        }
        int i3 = a.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    public static boolean h(int i) {
        return i != 0 && cd.d(i) > 0.5d;
    }

    public static int i(int i, int i2) {
        return cd.g(i2, i);
    }

    public static int j(int i, int i2, float f) {
        return i(i, cd.k(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int k(View view, int i, int i2, float f) {
        return j(d(view, i), d(view, i2), f);
    }

    public static int l(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? lg.c(context, i) : typedValue.data;
    }
}
