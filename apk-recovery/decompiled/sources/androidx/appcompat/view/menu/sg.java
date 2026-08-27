package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
/* loaded from: classes.dex */
public final class sg {
    public static final sg a = new sg();

    public final Rect a(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        c60.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        c60.d(bounds, "wm.currentWindowMetrics.bounds");
        return bounds;
    }

    public final b91 b(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        c60.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        c60.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        b91 t = b91.t(windowInsets);
        c60.d(t, "toWindowInsetsCompat(platformInsets)");
        return t;
    }

    public final ea1 c(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        c60.e(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        b91 t = b91.t(windowInsets);
        c60.d(t, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        c60.d(bounds, "wm.currentWindowMetrics.bounds");
        return new ea1(bounds, t);
    }

    public final Rect d(Context context) {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        c60.e(context, "context");
        maximumWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        c60.d(bounds, "wm.maximumWindowMetrics.bounds");
        return bounds;
    }
}
