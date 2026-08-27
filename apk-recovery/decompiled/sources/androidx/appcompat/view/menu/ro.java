package androidx.appcompat.view.menu;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.appcompat.view.menu.ja1;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public abstract class ro extends Service {
    public Binder b;
    public int d;
    public final ExecutorService a = kr.d();
    public final Object c = new Object();
    public int e = 0;

    /* loaded from: classes.dex */
    public class a implements ja1.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.ja1.a
        public cz0 a(Intent intent) {
            return ro.this.j(intent);
        }
    }

    public final void d(Intent intent) {
        if (intent != null) {
            t71.c(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    k(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Intent e(Intent intent);

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    public final /* synthetic */ void h(Intent intent, cz0 cz0Var) {
        d(intent);
    }

    public final /* synthetic */ void i(Intent intent, ez0 ez0Var) {
        try {
            f(intent);
        } finally {
            ez0Var.c(null);
        }
    }

    public final cz0 j(final Intent intent) {
        if (g(intent)) {
            return mz0.e(null);
        }
        final ez0 ez0Var = new ez0();
        this.a.execute(new Runnable() { // from class: androidx.appcompat.view.menu.qo
            @Override // java.lang.Runnable
            public final void run() {
                ro.this.i(intent, ez0Var);
            }
        });
        return ez0Var.a();
    }

    public boolean k(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.b == null) {
                this.b = new ja1(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent e = e(intent);
        if (e == null) {
            d(intent);
            return 2;
        }
        cz0 j = j(e);
        if (j.l()) {
            d(intent);
            return 2;
        }
        j.c(new lc0(), new jg0() { // from class: androidx.appcompat.view.menu.po
            @Override // androidx.appcompat.view.menu.jg0
            public final void a(cz0 cz0Var) {
                ro.this.h(intent, cz0Var);
            }
        });
        return 3;
    }
}
