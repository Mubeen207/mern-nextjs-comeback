package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
/* loaded from: classes.dex */
public class fd0 {
    public final Context a;
    public String b;
    public String c;
    public int d;
    public int e = 0;

    public fd0(Context context) {
        this.a = context;
    }

    public static String c(tr trVar) {
        String d = trVar.m().d();
        if (d != null) {
            return d;
        }
        String c = trVar.m().c();
        if (c.startsWith("1:")) {
            String[] split = c.split(":");
            if (split.length < 2) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return c;
    }

    public synchronized String a() {
        try {
            if (this.b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public synchronized String b() {
        try {
            if (this.c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public synchronized int d() {
        PackageInfo f;
        try {
            if (this.d == 0 && (f = f("com.google.android.gms")) != null) {
                this.d = f.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public synchronized int e() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!ti0.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.e = 2;
            return 2;
        }
        if (ti0.h()) {
            this.e = 2;
        } else {
            this.e = 1;
        }
        return this.e;
    }

    public final PackageInfo f(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find package ");
            sb.append(e);
            return null;
        }
    }

    public boolean g() {
        return e() != 0;
    }

    public final synchronized void h() {
        PackageInfo f = f(this.a.getPackageName());
        if (f != null) {
            this.b = Integer.toString(f.versionCode);
            this.c = f.versionName;
        }
    }
}
