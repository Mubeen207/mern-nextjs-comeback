package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class le2 extends wx {
    public final HashMap f = new HashMap();
    public final Context g;
    public volatile Handler h;
    public final qd2 i;
    public final hf j;
    public final long k;
    public final long l;

    public le2(Context context, Looper looper) {
        qd2 qd2Var = new qd2(this, null);
        this.i = qd2Var;
        this.g = context.getApplicationContext();
        this.h = new wy1(looper, qd2Var);
        this.j = hf.b();
        this.k = 5000L;
        this.l = 300000L;
    }

    @Override // androidx.appcompat.view.menu.wx
    public final void d(o92 o92Var, ServiceConnection serviceConnection, String str) {
        pj0.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            try {
                db2 db2Var = (db2) this.f.get(o92Var);
                if (db2Var == null) {
                    String obj = o92Var.toString();
                    throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
                } else if (!db2Var.h(serviceConnection)) {
                    String obj2 = o92Var.toString();
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
                } else {
                    db2Var.f(serviceConnection, str);
                    if (db2Var.i()) {
                        this.h.sendMessageDelayed(this.h.obtainMessage(0, o92Var), this.k);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.wx
    public final boolean f(o92 o92Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j;
        pj0.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            try {
                db2 db2Var = (db2) this.f.get(o92Var);
                if (db2Var == null) {
                    db2Var = new db2(this, o92Var);
                    db2Var.d(serviceConnection, serviceConnection, str);
                    db2Var.e(str, executor);
                    this.f.put(o92Var, db2Var);
                } else {
                    this.h.removeMessages(0, o92Var);
                    if (db2Var.h(serviceConnection)) {
                        String obj = o92Var.toString();
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                    }
                    db2Var.d(serviceConnection, serviceConnection, str);
                    int a = db2Var.a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(db2Var.b(), db2Var.c());
                    } else if (a == 2) {
                        db2Var.e(str, executor);
                    }
                }
                j = db2Var.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }
}
