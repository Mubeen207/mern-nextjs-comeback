package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class k11 {
    public static WeakReference d;
    public final SharedPreferences a;
    public du0 b;
    public final Executor c;

    public k11(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    public static synchronized k11 a(Context context, Executor executor) {
        k11 k11Var;
        synchronized (k11.class) {
            try {
                WeakReference weakReference = d;
                k11Var = weakReference != null ? (k11) weakReference.get() : null;
                if (k11Var == null) {
                    k11Var = new k11(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    k11Var.c();
                    d = new WeakReference(k11Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k11Var;
    }

    public synchronized j11 b() {
        return j11.a(this.b.e());
    }

    public final synchronized void c() {
        this.b = du0.c(this.a, "topic_operation_queue", ",", this.c);
    }

    public synchronized boolean d(j11 j11Var) {
        return this.b.f(j11Var.e());
    }
}
