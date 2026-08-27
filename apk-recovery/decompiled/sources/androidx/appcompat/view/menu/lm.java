package androidx.appcompat.view.menu;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.view.menu.ed;
import androidx.appcompat.view.menu.jf0;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class lm {
    public final ExecutorService a;
    public final Context b;
    public final pf0 c;

    public lm(Context context, pf0 pf0Var, ExecutorService executorService) {
        this.a = executorService;
        this.b = context;
        this.c = pf0Var;
    }

    public boolean a() {
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        l40 d = d();
        ed.a e = ed.e(this.b, this.c);
        e(e.a, d);
        c(e);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!ti0.f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.importance == 100;
                }
            }
            return false;
        }
        return false;
    }

    public final void c(ed.a aVar) {
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.b.getSystemService("notification")).notify(aVar.b, aVar.c, aVar.a.b());
    }

    public final l40 d() {
        l40 e = l40.e(this.c.p("gcm.n.image"));
        if (e != null) {
            e.j(this.a);
        }
        return e;
    }

    public final void e(jf0.e eVar, l40 l40Var) {
        if (l40Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) mz0.b(l40Var.h(), 5L, TimeUnit.SECONDS);
            eVar.o(bitmap);
            eVar.x(new jf0.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            l40Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to download image: ");
            sb.append(e.getCause());
        } catch (TimeoutException unused2) {
            l40Var.close();
        }
    }
}
