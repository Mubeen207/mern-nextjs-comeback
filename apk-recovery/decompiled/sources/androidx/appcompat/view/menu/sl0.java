package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes.dex */
public abstract class sl0 {
    public static SharedPreferences a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static boolean b(Context context) {
        return a(context).getBoolean("proxy_notification_initialized", false);
    }

    public static void c(Context context, boolean z) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }
}
