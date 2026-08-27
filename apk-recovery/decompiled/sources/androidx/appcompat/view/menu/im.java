package androidx.appcompat.view.menu;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;
/* loaded from: classes.dex */
public final class im {
    public final DisplayCutout a;

    /* loaded from: classes.dex */
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public im(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public static im e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new im(displayCutout);
    }

    public int a() {
        return a.c(this.a);
    }

    public int b() {
        return a.d(this.a);
    }

    public int c() {
        return a.e(this.a);
    }

    public int d() {
        return a.f(this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || im.class != obj.getClass()) {
            return false;
        }
        return bg0.a(this.a, ((im) obj).a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
