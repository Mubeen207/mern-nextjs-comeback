package androidx.appcompat.view.menu;

import android.os.Build;
import android.os.ext.SdkExtensions;
/* loaded from: classes.dex */
public final class w1 {
    public static final w1 a = new w1();

    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a();

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a.a();
        }
        return 0;
    }
}
