package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.appcompat.view.menu.k51;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(k51 k51Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = k51Var.p(iconCompat.a, 1);
        iconCompat.c = k51Var.j(iconCompat.c, 2);
        iconCompat.d = k51Var.r(iconCompat.d, 3);
        iconCompat.e = k51Var.p(iconCompat.e, 4);
        iconCompat.f = k51Var.p(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) k51Var.r(iconCompat.g, 6);
        iconCompat.i = k51Var.t(iconCompat.i, 7);
        iconCompat.j = k51Var.t(iconCompat.j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, k51 k51Var) {
        k51Var.x(true, true);
        iconCompat.k(k51Var.f());
        int i = iconCompat.a;
        if (-1 != i) {
            k51Var.F(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            k51Var.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            k51Var.H(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            k51Var.F(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            k51Var.F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            k51Var.H(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            k51Var.J(str, 7);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            k51Var.J(str2, 8);
        }
    }
}
