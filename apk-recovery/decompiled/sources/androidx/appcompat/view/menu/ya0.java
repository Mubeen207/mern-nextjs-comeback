package androidx.appcompat.view.menu;

import android.os.Build;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class ya0 {
    public static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean b() {
        return a().equals("meizu");
    }
}
