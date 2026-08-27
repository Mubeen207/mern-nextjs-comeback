package androidx.appcompat.view.menu;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class y3 {
    public static final List a;
    public static final List b;
    public static final List c;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        b = arrayList2;
        c = new ArrayList();
        arrayList.add("android");
        arrayList.add("com.google.android.webview");
        arrayList.add("com.google.android.webview.dev");
        arrayList.add("com.google.android.webview.beta");
        arrayList.add("com.google.android.webview.canary");
        arrayList.add("com.android.webview");
        arrayList.add("com.android.camera");
        arrayList.add("com.android.talkback");
        arrayList.add("com.miui.gallery");
        arrayList.add("com.google.android.inputmethod.latin");
        arrayList.add("com.huawei.webview");
        arrayList.add("com.miui.contentcatcher");
        arrayList.add("com.miui.catcherpatch");
        arrayList.add("com.coloros.safecenter");
        arrayList2.add("com.noshufou.android.su");
        arrayList2.add("com.noshufou.android.su.elite");
        arrayList2.add("eu.chainfire.supersu");
        arrayList2.add("com.koushikdutta.superuser");
        arrayList2.add("com.thirdparty.superuser");
        arrayList2.add("com.yellowes.su");
    }

    public static List a() {
        return c;
    }

    public static boolean b(String str) {
        return bv0.h().b() && b.contains(str);
    }

    public static boolean c(ComponentName componentName) {
        return componentName != null && d(componentName.getPackageName());
    }

    public static boolean d(String str) {
        return a.contains(str);
    }
}
