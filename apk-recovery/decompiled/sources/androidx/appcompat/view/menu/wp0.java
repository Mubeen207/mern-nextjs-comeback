package androidx.appcompat.view.menu;

import android.content.res.ColorStateList;
/* loaded from: classes.dex */
public abstract class wp0 {
    public static final boolean a = true;
    public static final int[] b = {16842919};
    public static final int[] c = {16843623, 16842908};
    public static final int[] d = {16842908};
    public static final int[] e = {16843623};
    public static final int[] f = {16842913, 16842919};
    public static final int[] g = {16842913, 16843623, 16842908};
    public static final int[] h = {16842913, 16842908};
    public static final int[] i = {16842913, 16843623};
    public static final int[] j = {16842913};
    public static final int[] k = {16842910, 16842919};
    public static final String l = wp0.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    public static boolean b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
