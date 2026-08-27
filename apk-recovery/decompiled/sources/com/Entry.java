package com;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.appcompat.view.menu.bv0;
import androidx.appcompat.view.menu.cz0;
import androidx.appcompat.view.menu.f1;
import androidx.appcompat.view.menu.jg0;
import androidx.appcompat.view.menu.jt;
import androidx.appcompat.view.menu.ld0;
import androidx.appcompat.view.menu.lg;
import androidx.appcompat.view.menu.nd0;
import androidx.appcompat.view.menu.s2;
import androidx.appcompat.view.menu.tr;
import androidx.core.content.FileProvider;
import com.Entry;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.snake.helper.DaemonService;
import com.snake.helper.Native;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/* loaded from: classes.dex */
public class Entry extends jt implements nd0.c {
    public static final String h = "A";
    public static String i;
    public static FirebaseAnalytics j;
    public nd0.d f;
    public nd0 g;

    public static /* synthetic */ void f0(cz0 cz0Var) {
        if (cz0Var.m()) {
            i = (String) cz0Var.i();
        }
    }

    @Override // androidx.appcompat.view.menu.nd0.c
    public void C(ld0 ld0Var, nd0.d dVar) {
        if (ld0Var.a.equals("0")) {
            dVar.c(Native.djp(((Integer) ld0Var.b()).intValue()));
        } else if (ld0Var.a.equals("A")) {
            Toast.makeText(this, (String) ld0Var.a("A"), 1).show();
            dVar.c(null);
        } else if (ld0Var.a.equals("F")) {
            dVar.c(i);
        } else if (ld0Var.a.equals("B")) {
            Object obj = ld0Var.b;
            if (obj instanceof Map) {
                SharedPreferences.Editor edit = getSharedPreferences(getPackageName(), 0).edit();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    edit.putString((String) entry.getKey(), (String) entry.getValue());
                }
                edit.apply();
                dVar.c(Boolean.TRUE);
            }
        } else if (ld0Var.a.equals("D")) {
            if (ld0Var.b instanceof String) {
                dVar.c(getSharedPreferences(getPackageName(), 0).getString((String) ld0Var.b, ""));
            }
        } else if (ld0Var.a.equals("C")) {
            this.f = dVar;
            i0();
        } else if (ld0Var.a.equals("E")) {
            if (ld0Var.b instanceof String) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) ld0Var.b)));
            }
        } else if (ld0Var.a.equals("G")) {
            List list = (List) ld0Var.b();
            if (list == null || list.size() < 2) {
                return;
            }
            String str = (String) list.get(0);
            int parseInt = Integer.parseInt((String) list.get(1));
            if (bv0.h().A(str, parseInt) || bv0.h().x(str, parseInt).m) {
                dVar.c(Integer.valueOf(bv0.h().C(str, parseInt) ? 1 : 0));
            }
        } else if (ld0Var.a.equals("H")) {
            String str2 = (String) ld0Var.b();
            if (str2 == null) {
                return;
            }
            dVar.c(s2.a(this, str2).b());
        } else if (!ld0Var.a.equals("I")) {
            if (ld0Var.a.equals("J")) {
                dVar.c(Boolean.valueOf(j0(this, (String) ld0Var.b())));
            }
        } else {
            Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            dVar.c(new int[]{point.x, point.y});
        }
    }

    public void a0() {
        tr.p(this);
        j = FirebaseAnalytics.getInstance(this);
        FirebaseMessaging.l().A(true);
        FirebaseMessaging.l().o().b(new jg0() { // from class: androidx.appcompat.view.menu.to
            @Override // androidx.appcompat.view.menu.jg0
            public final void a(cz0 cz0Var) {
                Entry.f0(cz0Var);
            }
        });
    }

    public void b0() {
        runOnUiThread(new Runnable() { // from class: androidx.appcompat.view.menu.so
            @Override // java.lang.Runnable
            public final void run() {
                Entry.this.g0();
            }
        });
    }

    public void c0() {
        if (Build.VERSION.SDK_INT < 33 || lg.a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            return;
        }
        f1.n(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1002);
    }

    public final boolean d0() {
        NotificationChannel notificationChannel = ((NotificationManager) getSystemService(NotificationManager.class)).getNotificationChannel(DaemonService.a(this));
        return !e0() || (notificationChannel != null && notificationChannel.getImportance() == 0);
    }

    public final boolean e0() {
        return Build.VERSION.SDK_INT < 33 || lg.a(this, "android.permission.POST_NOTIFICATIONS") == 0;
    }

    public final /* synthetic */ void g0() {
        nd0 nd0Var = new nd0(O().k().f(), h);
        this.g = nd0Var;
        nd0Var.e(this);
    }

    public final void h0() {
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
        startActivity(intent);
    }

    public final void i0() {
        startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 1000);
    }

    public boolean j0(Context context, String str) {
        try {
            File file = new File(str);
            File cacheDir = context.getCacheDir();
            File file2 = new File(cacheDir, file.getName() + ".zip");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        zipOutputStream.closeEntry();
                        fileInputStream.close();
                        zipOutputStream.close();
                        fileOutputStream.close();
                        Uri h2 = FileProvider.h(context, context.getPackageName() + ".fileprovider", file2);
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("application/zip");
                        intent.putExtra("android.intent.extra.STREAM", h2);
                        intent.addFlags(1);
                        context.startActivity(Intent.createChooser(intent, "Share zipped file"));
                        return true;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.appcompat.view.menu.jt, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        Uri data;
        super.onActivityResult(i2, i3, intent);
        if (i2 != 1000 || i3 != -1 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(getContentResolver().openInputStream(data));
            int width = decodeStream.getWidth();
            int height = decodeStream.getHeight();
            int min = Math.min(width, height);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(Bitmap.createBitmap(decodeStream, (width - min) / 2, (height - min) / 2, min, min), PackageParser.PARSE_IS_PRIVILEGED, PackageParser.PARSE_IS_PRIVILEGED, true);
            int i4 = 85;
            while (i4 > 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                i4 -= 5;
                if (byteArray.length <= 10240) {
                    this.f.c(byteArray);
                    return;
                }
            }
            this.f.c(null);
        } catch (Exception unused) {
            this.f.c(null);
        }
    }

    @Override // androidx.appcompat.view.menu.jt, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c0();
        a0();
        b0();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        super.onPointerCaptureChanged(z);
    }

    @Override // androidx.appcompat.view.menu.jt, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 1001) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                this.f.b("PERMISSION_DENIED", "Storage permission denied", null);
            } else {
                i0();
            }
        } else if (i2 != 1002 || iArr.length <= 0 || iArr[0] == 0 || !d0()) {
        } else {
            h0();
        }
    }

    @Override // androidx.appcompat.view.menu.jt, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.view.menu.jt, android.app.Activity
    public void onStop() {
        super.onStop();
        this.g.c(h, null);
    }
}
