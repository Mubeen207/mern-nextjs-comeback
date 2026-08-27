package androidx.appcompat.view.menu;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class ey {
    public static final int a = ky.a;
    public static final ey b = new ey();

    public static ey f() {
        return b;
    }

    public int a(Context context) {
        return ky.a(context);
    }

    public Intent b(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            return xe2.c("com.google.android.gms");
        } else if (context == null || !rl.d(context)) {
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(va1.a(context).e(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return xe2.b("com.google.android.gms", sb.toString());
        } else {
            return xe2.a();
        }
    }

    public PendingIntent c(Context context, int i, int i2) {
        return d(context, i, i2, null);
    }

    public PendingIntent d(Context context, int i, int i2, String str) {
        Intent b2 = b(context, i, str);
        if (b2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, b2, bn1.a | 134217728);
    }

    public String e(int i) {
        return ky.b(i);
    }

    public int g(Context context) {
        return h(context, a);
    }

    public int h(Context context, int i) {
        int e = ky.e(context, i);
        if (ky.f(context, e)) {
            return 18;
        }
        return e;
    }

    public boolean i(Context context, String str) {
        return ky.j(context, str);
    }

    public boolean j(int i) {
        return ky.h(i);
    }
}
