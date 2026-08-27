package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class y1 {
    public m8 a;
    public gr1 b;
    public boolean c;
    public final Object d = new Object();
    public ei1 e;
    public final Context f;
    public final long g;

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public y1(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        pj0.i(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.g = j;
    }

    public static a a(Context context) {
        y1 y1Var = new y1(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            y1Var.d(false);
            a f = y1Var.f(-1);
            y1Var.e(f, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return f;
        } finally {
        }
    }

    public static void b(boolean z) {
    }

    public final void c() {
        pj0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        hf.b().c(this.f, this.a);
                    }
                } catch (Throwable unused) {
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(boolean z) {
        pj0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    c();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int h = ey.f().h(context, ky.a);
                    if (h != 0 && h != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    m8 m8Var = new m8();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (!hf.b().a(context, intent, m8Var, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.a = m8Var;
                    try {
                        this.b = bp1.h(m8Var.a(10000L, TimeUnit.MILLISECONDS));
                        this.c = true;
                        if (z) {
                            g();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new iy(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e(a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (aVar != null) {
                hashMap.put("limit_ad_tracking", true != aVar.b() ? "0" : "1");
                String a2 = aVar.a();
                if (a2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(a2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new we1(this, hashMap).start();
            return true;
        }
        return false;
    }

    public final a f(int i) {
        a aVar;
        pj0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        ei1 ei1Var = this.e;
                        if (ei1Var == null || !ei1Var.p) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                pj0.i(this.a);
                pj0.i(this.b);
                try {
                    aVar = new a(this.b.c(), this.b.u0(true));
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return aVar;
    }

    public final void finalize() {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.d) {
            ei1 ei1Var = this.e;
            if (ei1Var != null) {
                ei1Var.o.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new ei1(this, j);
            }
        }
    }
}
