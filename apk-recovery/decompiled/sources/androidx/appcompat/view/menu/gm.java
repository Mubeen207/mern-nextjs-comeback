package androidx.appcompat.view.menu;

import android.graphics.Point;
import android.view.Display;
/* loaded from: classes.dex */
public final class gm {
    public static final gm a = new gm();

    public final void a(Display display, Point point) {
        c60.e(display, "display");
        c60.e(point, "point");
        display.getRealSize(point);
    }
}
