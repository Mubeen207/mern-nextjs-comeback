package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
/* loaded from: classes.dex */
public final class mf2 {
    public final Context a;
    public int b;
    public int c = 0;

    public mf2(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = va1.a(this.a).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    public final synchronized int b() {
        try {
            int i = this.c;
            if (i != 0) {
                return i;
            }
            Context context = this.a;
            PackageManager packageManager = context.getPackageManager();
            if (va1.a(context).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                return 0;
            }
            int i2 = 1;
            if (!ti0.h()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    this.c = i2;
                    return i2;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                i2 = 2;
                this.c = i2;
                return i2;
            }
            if (true == ti0.h()) {
                i2 = 2;
            }
            this.c = i2;
            return i2;
        } catch (Throwable th) {
            throw th;
        }
    }
}
