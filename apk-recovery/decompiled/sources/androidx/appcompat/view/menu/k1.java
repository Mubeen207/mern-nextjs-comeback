package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
/* loaded from: classes.dex */
public abstract class k1 {
    public static void a(IBinder iBinder, int i, Intent intent) {
        if (y8.c()) {
            xz.b.b(l1.c.b(new Object[0]), iBinder, Integer.valueOf(i), intent, 0);
        } else if (y8.a()) {
            wz.b.b(l1.c.b(new Object[0]), iBinder, Integer.valueOf(i), intent, Boolean.FALSE);
        }
    }

    public static void b(Activity activity, int i) {
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            th.printStackTrace();
            Activity activity2 = (Activity) c1.d.c(activity);
            while (true) {
                Activity activity3 = (Activity) c1.d.c(activity2);
                if (activity3 == null) {
                    try {
                        vz.c.b(l1.c.b(new Object[0]), (IBinder) c1.g.c(activity2), Integer.valueOf(i));
                        return;
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        return;
                    }
                }
                activity2 = activity3;
            }
        }
    }
}
