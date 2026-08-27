package androidx.appcompat.view.menu;

import android.view.DisplayCutout;
/* loaded from: classes.dex */
public final class hm {
    public static final hm a = new hm();

    public final int a(DisplayCutout displayCutout) {
        c60.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int b(DisplayCutout displayCutout) {
        c60.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int c(DisplayCutout displayCutout) {
        c60.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int d(DisplayCutout displayCutout) {
        c60.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
