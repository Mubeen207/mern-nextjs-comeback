package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public abstract class qb0 {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = i3.a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : a;
    }

    public static ColorStateList b(Context context, b11 b11Var, int i) {
        int m;
        ColorStateList a;
        return (!b11Var.q(i) || (m = b11Var.m(i, 0)) == 0 || (a = i3.a(context, m)) == null) ? b11Var.c(i) : a;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = i3.b(context, resourceId)) == null) ? typedArray.getDrawable(i) : b;
    }

    public static int d(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    public static tz0 e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new tz0(context, resourceId);
    }

    public static boolean f(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
