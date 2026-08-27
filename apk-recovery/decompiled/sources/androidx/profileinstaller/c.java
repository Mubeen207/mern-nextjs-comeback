package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.res.AssetManager;
import androidx.appcompat.view.menu.lc0;
import androidx.appcompat.view.menu.t02;
import androidx.profileinstaller.c;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class c {
    public static final InterfaceC0050c a = new a();
    public static final InterfaceC0050c b = new b();

    /* loaded from: classes.dex */
    public class a implements InterfaceC0050c {
        @Override // androidx.profileinstaller.c.InterfaceC0050c
        public void a(int i, Object obj) {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0050c
        public void b(int i, Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements InterfaceC0050c {
        @Override // androidx.profileinstaller.c.InterfaceC0050c
        public void a(int i, Object obj) {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0050c
        public void b(int i, Object obj) {
            switch (i) {
                case 1:
                case 2:
                case t02.c.c /* 3 */:
                case 4:
                case t02.c.e /* 5 */:
                case t02.c.f /* 6 */:
                case t02.c.g /* 7 */:
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                case 9:
                case 10:
                case 11:
                default:
                    if (i == 6 || i == 7 || i == 8) {
                        Throwable th = (Throwable) obj;
                        return;
                    }
                    return;
            }
        }
    }

    /* renamed from: androidx.profileinstaller.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0050c {
        void a(int i, Object obj);

        void b(int i, Object obj);
    }

    public static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    public static void c(Context context, Executor executor, InterfaceC0050c interfaceC0050c) {
        b(context.getFilesDir());
        g(executor, interfaceC0050c, 11, null);
    }

    public static boolean d(PackageInfo packageInfo, File file, InterfaceC0050c interfaceC0050c) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (file2.exists()) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z = readLong == packageInfo.lastUpdateTime;
                if (z) {
                    interfaceC0050c.b(2, null);
                }
                return z;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    public static void f(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static void g(Executor executor, final InterfaceC0050c interfaceC0050c, final int i, final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.appcompat.view.menu.lk0
            @Override // java.lang.Runnable
            public final void run() {
                c.InterfaceC0050c.this.b(i, obj);
            }
        });
    }

    public static boolean h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, InterfaceC0050c interfaceC0050c) {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, interfaceC0050c, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (bVar.e()) {
            boolean n = bVar.i().m().n();
            if (n) {
                f(packageInfo, file);
            }
            return n;
        }
        return false;
    }

    public static void i(Context context) {
        j(context, new lc0(), a);
    }

    public static void j(Context context, Executor executor, InterfaceC0050c interfaceC0050c) {
        k(context, executor, interfaceC0050c, false);
    }

    public static void k(Context context, Executor executor, InterfaceC0050c interfaceC0050c, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z && d(packageInfo, filesDir, interfaceC0050c)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Skipping profile installation for ");
                sb.append(context.getPackageName());
                d.c(context, false);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Installing profile for ");
            sb2.append(context.getPackageName());
            if (h(assets, packageName, packageInfo, filesDir, name, executor, interfaceC0050c) && z) {
                z2 = true;
            }
            d.c(context, z2);
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC0050c.b(7, e);
            d.c(context, false);
        }
    }

    public static void l(Context context, Executor executor, InterfaceC0050c interfaceC0050c) {
        try {
            f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            g(executor, interfaceC0050c, 10, null);
        } catch (PackageManager.NameNotFoundException e) {
            g(executor, interfaceC0050c, 7, e);
        }
    }
}
