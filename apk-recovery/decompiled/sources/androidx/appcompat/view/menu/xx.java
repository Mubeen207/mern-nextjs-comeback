package androidx.appcompat.view.menu;

import java.util.HashSet;
/* loaded from: classes.dex */
public abstract class xx {
    public static final HashSet a;
    public static final HashSet b;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        HashSet hashSet2 = new HashSet();
        b = hashSet2;
        hashSet.add("com.android.vending");
        hashSet.add("com.google.android.play.games");
        hashSet.add("com.google.android.wearable.app");
        hashSet.add("com.google.android.wearable.app.cn");
        hashSet2.add("com.google.android.gms");
        hashSet2.add("com.google.android.gsf");
        hashSet2.add("com.google.android.gsf.login");
        hashSet2.add("com.google.android.backuptransport");
        hashSet2.add("com.google.android.backup");
        hashSet2.add("com.google.android.configupdater");
        hashSet2.add("com.google.android.syncadapters.contacts");
        hashSet2.add("com.google.android.feedback");
        hashSet2.add("com.google.android.onetimeinitializer");
        hashSet2.add("com.google.android.partnersetup");
        hashSet2.add("com.google.android.setupwizard");
        hashSet2.add("com.google.android.syncadapters.calendar");
    }

    public static boolean a(String str) {
        return a.contains(str) || b.contains(str);
    }
}
