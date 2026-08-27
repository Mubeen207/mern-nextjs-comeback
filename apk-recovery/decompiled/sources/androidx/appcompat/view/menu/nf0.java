package androidx.appcompat.view.menu;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class nf0 {
    public static final Object c = new Object();
    public static Set d = new HashSet();
    public static final Object e = new Object();
    public final Context a;
    public final NotificationManager b;

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    public nf0(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static nf0 b(Context context) {
        return new nf0(context);
    }

    public boolean a() {
        return a.a(this.b);
    }
}
