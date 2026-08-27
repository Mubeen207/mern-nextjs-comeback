package androidx.appcompat.view.menu;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* loaded from: classes.dex */
public abstract class zk1 {
    public static final int a;
    public static final int b;

    static {
        int i = Build.VERSION.SDK_INT;
        a = 67108864;
        b = i >= 31 ? 33554432 : 0;
    }

    public static PendingIntent a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
