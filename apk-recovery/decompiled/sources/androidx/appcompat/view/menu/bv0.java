package androidx.appcompat.view.menu;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import com.snake.helper.DaemonService;
import com.snake.helper.Native;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class bv0 extends wb {
    public static final bv0 h = new bv0();
    public static Context i;
    public a a;
    public wb c;
    public final Map b = new HashMap();
    public final List d = new ArrayList();
    public final Handler e = new Handler(Looper.getMainLooper());
    public final int f = Process.myUid();
    public final int g = ((Integer) p41.b.b(new Object[0])).intValue();

    /* loaded from: classes.dex */
    public enum a {
        Server,
        ChildAppClient,
        Main
    }

    public static Object D() {
        return t1.k.b(new Object[0]);
    }

    public static void E(bk0 bk0Var) {
    }

    public static void d(int i2) {
        hy.g(i2);
    }

    public static void e(String str, String str2) {
        hy.b(str, str2);
    }

    public static bv0 h() {
        return h;
    }

    public static gv0 j() {
        return gv0.i();
    }

    public static pv0 k() {
        return pv0.h();
    }

    public static uv0 l() {
        return uv0.f();
    }

    public static Context m() {
        return i;
    }

    public static String o() {
        return h().a();
    }

    public static int p() {
        return h().f;
    }

    public static int q() {
        return h().g;
    }

    public static PackageManager r() {
        return i.getPackageManager();
    }

    public static String s(Context context) {
        String str;
        int myPid = Process.myPid();
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.pid == myPid) {
                str = next.processName;
                break;
            }
        }
        if (str != null) {
            return str;
        }
        throw new RuntimeException("processName = null");
    }

    public static tv0 u() {
        return tv0.g();
    }

    public static boolean y() {
        return y8.b() ? Process.is64Bit() : Build.CPU_ABI.equals("arm64-v8a");
    }

    public boolean A(String str, int i2) {
        return u().t(str, i2);
    }

    public boolean B() {
        return this.a == a.Server;
    }

    public boolean C(String str, int i2) {
        Intent l = u().l(str, i2);
        if (l == null) {
            return false;
        }
        F(l, i2);
        return true;
    }

    public void F(Intent intent, int i2) {
        j().C(intent, i2);
    }

    @Override // androidx.appcompat.view.menu.wb
    public String a() {
        return this.c.a();
    }

    @Override // androidx.appcompat.view.menu.wb
    public boolean b() {
        return this.c.b();
    }

    @Override // androidx.appcompat.view.menu.wb
    public boolean c(File file, int i2) {
        return this.c.c(file, i2);
    }

    public void f(Context context, wb wbVar) {
        if (wbVar == null) {
            throw new IllegalArgumentException("ClientConfiguration is null!");
        }
        if (y8.e()) {
            mz.a("L");
        }
        i = context;
        this.c = wbVar;
        v();
        String s = s(m());
        if (s.equals(o())) {
            this.a = a.Main;
            Native.ic(i);
        } else if (s.endsWith(m().getString(en0.a))) {
            this.a = a.Server;
        } else {
            this.a = a.ChildAppClient;
            Native.ic(i);
        }
        if (h().z()) {
            ov0.x();
        }
        nz.c().d();
    }

    public void g() {
        if (z()) {
            fg.c();
        }
        if (B()) {
            return;
        }
        dt0.d();
    }

    public List i() {
        return this.d;
    }

    public Handler n() {
        return this.e;
    }

    public IBinder t(String str) {
        IBinder iBinder = (IBinder) this.b.get(str);
        if (iBinder == null || !iBinder.isBinderAlive()) {
            Bundle bundle = new Bundle();
            bundle.putString("_S_|_server_name_", str);
            IBinder b = e9.b(jl0.b(nl0.b(), "VM", null, bundle), "_S_|_server_");
            this.b.put(str, b);
            return b;
        }
        return iBinder;
    }

    public final void v() {
        NotificationManager notificationManager = (NotificationManager) m().getSystemService("notification");
        String str = m().getPackageName() + ".SnakeEngine_Core";
        if (y8.d()) {
            NotificationChannel notificationChannel = new NotificationChannel(str, "SnakeEngine_Core", 4);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-65536);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void w() {
        if (B()) {
            Intent intent = new Intent();
            intent.setClass(m(), DaemonService.class);
            if (y8.d()) {
                m().startForegroundService(intent);
            } else {
                m().startService(intent);
            }
        }
    }

    public p50 x(String str, int i2) {
        try {
            return u().s(r().getPackageInfo(str, 0).applicationInfo.sourceDir, o50.a(), i2);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return new p50().a(e.getMessage());
        }
    }

    public boolean z() {
        return this.a == a.ChildAppClient;
    }
}
