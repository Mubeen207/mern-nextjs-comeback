package androidx.appcompat.view.menu;

import android.content.pm.ApplicationInfo;
/* loaded from: classes.dex */
public abstract class j71 {
    public static String a;
    public static String b;

    public static void a(String str, ApplicationInfo applicationInfo) {
        if (b != null) {
            return;
        }
        a = applicationInfo.packageName;
        b = str;
        zj0.b.b(str);
        cj.b.b(str, 0);
    }
}
