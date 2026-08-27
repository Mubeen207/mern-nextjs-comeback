package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class t92 implements ServiceConnection {
    public oc2 n;
    public final /* synthetic */ hf2 q;
    public int l = 0;
    public final Messenger m = new Messenger(new hr1(Looper.getMainLooper(), new Handler.Callback() { // from class: androidx.appcompat.view.menu.f32
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Received response to request: ");
                sb.append(i);
            }
            t92 t92Var = t92.this;
            synchronized (t92Var) {
                try {
                    qe2 qe2Var = (qe2) t92Var.p.get(i);
                    if (qe2Var == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Received response for unknown request: ");
                        sb2.append(i);
                        return true;
                    }
                    t92Var.p.remove(i);
                    t92Var.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        qe2Var.c(new ve2(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    qe2Var.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));
    public final Queue o = new ArrayDeque();
    public final SparseArray p = new SparseArray();

    public /* synthetic */ t92(hf2 hf2Var, m72 m72Var) {
        this.q = hf2Var;
    }

    public final synchronized void a(int i, String str) {
        b(i, str, null);
    }

    public final synchronized void b(int i, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i2 = this.l;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.l = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.l = 4;
            hf.b().c(hf2.a(this.q), this);
            ve2 ve2Var = new ve2(i, str, th);
            for (qe2 qe2Var : this.o) {
                qe2Var.c(ve2Var);
            }
            this.o.clear();
            for (int i3 = 0; i3 < this.p.size(); i3++) {
                ((qe2) this.p.valueAt(i3)).c(ve2Var);
            }
            this.p.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        hf2.e(this.q).execute(new Runnable() { // from class: androidx.appcompat.view.menu.ww1
            @Override // java.lang.Runnable
            public final void run() {
                final qe2 qe2Var;
                while (true) {
                    final t92 t92Var = t92.this;
                    synchronized (t92Var) {
                        try {
                            if (t92Var.l != 2) {
                                return;
                            }
                            if (t92Var.o.isEmpty()) {
                                t92Var.f();
                                return;
                            }
                            qe2Var = (qe2) t92Var.o.poll();
                            t92Var.p.put(qe2Var.a, qe2Var);
                            hf2.e(t92Var.q).schedule(new Runnable() { // from class: androidx.appcompat.view.menu.i52
                                @Override // java.lang.Runnable
                                public final void run() {
                                    t92.this.e(qe2Var.a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(qe2Var));
                    }
                    hf2 hf2Var = t92Var.q;
                    Messenger messenger = t92Var.m;
                    int i = qe2Var.c;
                    Context a = hf2.a(hf2Var);
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = qe2Var.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", qe2Var.b());
                    bundle.putString("pkg", a.getPackageName());
                    bundle.putBundle("data", qe2Var.d);
                    obtain.setData(bundle);
                    try {
                        t92Var.n.a(obtain);
                    } catch (RemoteException e) {
                        t92Var.a(2, e.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void d() {
        if (this.l == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void e(int i) {
        qe2 qe2Var = (qe2) this.p.get(i);
        if (qe2Var != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Timing out request: ");
            sb.append(i);
            this.p.remove(i);
            qe2Var.c(new ve2(3, "Timed out waiting for response", null));
            f();
        }
    }

    public final synchronized void f() {
        if (this.l == 2 && this.o.isEmpty() && this.p.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.l = 3;
            hf.b().c(hf2.a(this.q), this);
        }
    }

    public final synchronized boolean g(qe2 qe2Var) {
        int i = this.l;
        if (i != 0) {
            if (i == 1) {
                this.o.add(qe2Var);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                this.o.add(qe2Var);
                c();
                return true;
            }
        }
        this.o.add(qe2Var);
        pj0.l(this.l == 0);
        Log.isLoggable("MessengerIpcClient", 2);
        this.l = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (hf.b().a(hf2.a(this.q), intent, this, 1)) {
                hf2.e(this.q).schedule(new Runnable() { // from class: androidx.appcompat.view.menu.bz1
                    @Override // java.lang.Runnable
                    public final void run() {
                        t92.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            b(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        hf2.e(this.q).execute(new Runnable() { // from class: androidx.appcompat.view.menu.pu1
            @Override // java.lang.Runnable
            public final void run() {
                t92 t92Var = t92.this;
                IBinder iBinder2 = iBinder;
                synchronized (t92Var) {
                    if (iBinder2 == null) {
                        t92Var.a(0, "Null service connection");
                        return;
                    }
                    try {
                        t92Var.n = new oc2(iBinder2);
                        t92Var.l = 2;
                        t92Var.c();
                    } catch (RemoteException e) {
                        t92Var.a(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        hf2.e(this.q).execute(new Runnable() { // from class: androidx.appcompat.view.menu.e12
            @Override // java.lang.Runnable
            public final void run() {
                t92.this.a(2, "Service disconnected");
            }
        });
    }
}
