package androidx.appcompat.view.menu;

import android.os.Build;
import android.view.View;
import android.view.Window;
/* loaded from: classes.dex */
public abstract class f81 {

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static y91 a(Window window, View view) {
        return new y91(window, view);
    }

    public static void b(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z);
        } else {
            a.a(window, z);
        }
    }
}
