package androidx.appcompat.view.menu;

import java.util.Locale;
/* loaded from: classes.dex */
public abstract class nl0 {
    public static String a(int i) {
        return String.format(Locale.ENGLISH, "%s.helper.TransparentProxyActivity$P%d", bv0.o(), Integer.valueOf(i));
    }

    public static String b() {
        return bv0.o() + ".helper.SystemCallProvider";
    }

    public static String c(int i) {
        return bv0.o() + ":P" + i;
    }

    public static String d(int i, boolean z) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        objArr[0] = bv0.o();
        objArr[1] = Integer.valueOf(i);
        objArr[2] = z ? "_L" : "";
        return String.format(locale, "%s.helper.ProxyActivity$P%d%s", objArr);
    }

    public static String e(int i) {
        return String.format(Locale.ENGLISH, "%s.proxy_content_provider_%d", bv0.o(), Integer.valueOf(i));
    }

    public static String f() {
        return bv0.o() + ".helper.FileProvider";
    }

    public static String g(int i) {
        return String.format(Locale.ENGLISH, "%s.helper.ProxyJobService$P%d", bv0.o(), Integer.valueOf(i));
    }

    public static String h(int i) {
        return String.format(Locale.ENGLISH, "com.snake.helper.ProxyPendingActivity$P%d", Integer.valueOf(i));
    }

    public static String i(int i) {
        return String.format(Locale.ENGLISH, "%s.helper.ProxyService$P%d", bv0.o(), Integer.valueOf(i));
    }

    public static boolean j(String str) {
        return b().equals(str) || str.contains("proxy_content_provider_");
    }
}
