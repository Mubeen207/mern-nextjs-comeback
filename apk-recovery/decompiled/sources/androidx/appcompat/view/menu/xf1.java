package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.os.Bundle;
/* loaded from: classes.dex */
public abstract class xf1 {
    public static final Object a = new Object();
    public static boolean b;
    public static String c;
    public static int d;

    public static int a(Context context) {
        b(context);
        return d;
    }

    public static void b(Context context) {
        Bundle bundle;
        synchronized (a) {
            try {
                if (b) {
                    return;
                }
                b = true;
                try {
                    bundle = va1.a(context).c(context.getPackageName(), PackageParser.PARSE_IS_PRIVILEGED).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (bundle == null) {
                    return;
                }
                c = bundle.getString("com.google.app.id");
                d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
