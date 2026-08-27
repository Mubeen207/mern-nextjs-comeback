package androidx.appcompat.view.menu;

import android.graphics.Paint;
/* loaded from: classes.dex */
public abstract class nh0 {
    public static final ThreadLocal a = new ThreadLocal();

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }
}
