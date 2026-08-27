package androidx.appcompat.view.menu;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
/* loaded from: classes.dex */
public abstract class e9 {
    public static IBinder a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        if (bundleExtra != null) {
            return b(bundleExtra, "binder");
        }
        return null;
    }

    public static IBinder b(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static void c(Intent intent, String str, IBinder iBinder) {
        Bundle bundle = new Bundle();
        d(bundle, "binder", iBinder);
        intent.putExtra(str, bundle);
    }

    public static void d(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
        d9.c.b(bundle, str, iBinder);
    }
}
