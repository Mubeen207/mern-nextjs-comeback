package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
/* loaded from: classes.dex */
public abstract class cu1 {
    public static UserManager a;
    public static volatile boolean b = !a();
    public static boolean c = false;

    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    public static boolean d(Context context) {
        if (b) {
            return true;
        }
        synchronized (cu1.class) {
            try {
                if (b) {
                    return true;
                }
                boolean e = e(context);
                if (e) {
                    b = e;
                }
                return e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean e(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (a == null) {
                a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                } else if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException unused) {
                a = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            a = null;
        }
        return z;
    }
}
