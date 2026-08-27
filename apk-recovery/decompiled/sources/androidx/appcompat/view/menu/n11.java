package androidx.appcompat.view.menu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
/* loaded from: classes.dex */
public class n11 implements Runnable {
    public static final Object r = new Object();
    public static Boolean s;
    public static Boolean t;
    public final Context m;
    public final fd0 n;
    public final PowerManager.WakeLock o;
    public final m11 p;
    public final long q;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public n11 a;

        public a(n11 n11Var) {
            this.a = n11Var;
        }

        public void a() {
            n11.b();
            n11.this.m.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            n11 n11Var = this.a;
            if (n11Var == null) {
                return;
            }
            if (n11Var.i()) {
                n11.b();
                this.a.p.l(this.a, 0L);
                context.unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    public n11(m11 m11Var, Context context, fd0 fd0Var, long j) {
        this.p = m11Var;
        this.m = context;
        this.q = j;
        this.n = fd0Var;
        this.o = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static /* synthetic */ boolean b() {
        return j();
    }

    public static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    public static boolean f(Context context) {
        boolean booleanValue;
        synchronized (r) {
            try {
                Boolean bool = t;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                t = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            e(str);
        }
        return z;
    }

    public static boolean h(Context context) {
        boolean booleanValue;
        synchronized (r) {
            try {
                Boolean bool = s;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                s = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final synchronized boolean i() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.m.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (h(this.m)) {
            this.o.acquire(Cif.a);
        }
        try {
            try {
                this.p.m(true);
            } catch (Throwable th) {
                if (h(this.m)) {
                    try {
                        this.o.release();
                    } catch (RuntimeException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to sync topics. Won't retry sync. ");
            sb.append(e.getMessage());
            this.p.m(false);
            if (!h(this.m)) {
                return;
            }
        }
        if (!this.n.g()) {
            this.p.m(false);
            if (h(this.m)) {
                try {
                    this.o.release();
                } catch (RuntimeException unused2) {
                }
            }
        } else if (f(this.m) && !i()) {
            new a(this).a();
            if (h(this.m)) {
                try {
                    this.o.release();
                } catch (RuntimeException unused3) {
                }
            }
        } else {
            if (this.p.p()) {
                this.p.m(false);
            } else {
                this.p.q(this.q);
            }
            if (!h(this.m)) {
                return;
            }
            try {
                this.o.release();
            } catch (RuntimeException unused4) {
            }
        }
    }
}
