package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class hf2 {
    public static hf2 e;
    public final Context a;
    public final ScheduledExecutorService b;
    public t92 c = new t92(this, null);
    public int d = 1;

    public hf2(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(hf2 hf2Var) {
        return hf2Var.a;
    }

    public static synchronized hf2 b(Context context) {
        hf2 hf2Var;
        synchronized (hf2.class) {
            try {
                if (e == null) {
                    cp1.a();
                    e = new hf2(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new oe0("MessengerIpcClient"))));
                }
                hf2Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hf2Var;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(hf2 hf2Var) {
        return hf2Var.b;
    }

    public final cz0 c(int i, Bundle bundle) {
        return g(new vd2(f(), i, bundle));
    }

    public final cz0 d(int i, Bundle bundle) {
        return g(new bf2(f(), 1, bundle));
    }

    public final synchronized int f() {
        int i;
        i = this.d;
        this.d = i + 1;
        return i;
    }

    public final synchronized cz0 g(qe2 qe2Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(qe2Var.toString());
            }
            if (!this.c.g(qe2Var)) {
                t92 t92Var = new t92(this, null);
                this.c = t92Var;
                t92Var.g(qe2Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return qe2Var.b.a();
    }
}
