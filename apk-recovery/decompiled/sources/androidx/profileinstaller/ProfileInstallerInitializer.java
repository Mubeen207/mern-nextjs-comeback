package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.appcompat.view.menu.b50;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b50 {

    /* loaded from: classes.dex */
    public static class a {
        public static void c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.appcompat.view.menu.pk0
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    public static void l(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.appcompat.view.menu.ok0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.c.i(context);
            }
        });
    }

    @Override // androidx.appcompat.view.menu.b50
    public List a() {
        return Collections.emptyList();
    }

    @Override // androidx.appcompat.view.menu.b50
    /* renamed from: f */
    public c b(Context context) {
        g(context.getApplicationContext());
        return new c();
    }

    public void g(final Context context) {
        a.c(new Runnable() { // from class: androidx.appcompat.view.menu.mk0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.i(context);
            }
        });
    }

    /* renamed from: h */
    public void i(final Context context) {
        b.a(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: androidx.appcompat.view.menu.nk0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.l(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
