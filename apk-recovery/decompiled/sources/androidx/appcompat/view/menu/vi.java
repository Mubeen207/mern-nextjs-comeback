package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.os.Bundle;
/* loaded from: classes.dex */
public class vi {
    public final Context a;
    public final SharedPreferences b;
    public final vl0 c;
    public boolean d;

    public vi(Context context, String str, vl0 vl0Var) {
        Context a = a(context);
        this.a = a;
        this.b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.c = vl0Var;
        this.d = c();
    }

    public static Context a(Context context) {
        return lg.b(context);
    }

    public synchronized boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.b.contains("firebase_data_collection_default_enabled") ? this.b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), PackageParser.PARSE_IS_PRIVILEGED)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
