package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class wx {
    public static int a = 4225;
    public static final Object b = new Object();
    public static le2 c = null;
    public static HandlerThread d = null;
    public static boolean e = false;

    public static int a() {
        return a;
    }

    public static wx b(Context context) {
        synchronized (b) {
            try {
                if (c == null) {
                    c = new le2(context.getApplicationContext(), e ? c().getLooper() : context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static HandlerThread c() {
        synchronized (b) {
            try {
                HandlerThread handlerThread = d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                d = handlerThread2;
                handlerThread2.start();
                return d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void d(o92 o92Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        d(new o92(str, str2, i, z), serviceConnection, str3);
    }

    public abstract boolean f(o92 o92Var, ServiceConnection serviceConnection, String str, Executor executor);
}
