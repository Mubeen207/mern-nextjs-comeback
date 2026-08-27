package androidx.appcompat.view.menu;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class iv1 {

    /* loaded from: classes.dex */
    public static class a {
        public static volatile ug0 a;

        public static ug0 a(Context context) {
            ug0 ug0Var;
            ug0 a2;
            synchronized (a.class) {
                try {
                    ug0Var = a;
                    if (ug0Var == null) {
                        new iv1();
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if (!str.equals("eng")) {
                            if (str.equals("userdebug")) {
                            }
                            a2 = ug0.a();
                            ug0Var = a2;
                            a = ug0Var;
                        }
                        if (!str2.contains("dev-keys")) {
                            if (str2.contains("test-keys")) {
                            }
                            a2 = ug0.a();
                            ug0Var = a2;
                            a = ug0Var;
                        }
                        if (cu1.a() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        a2 = iv1.a(context);
                        ug0Var = a2;
                        a = ug0Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return ug0Var;
        }
    }

    public static ug0 a(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            ug0 d = d(context);
            ug0 d2 = d.c() ? ug0.d(b(context, (File) d.b())) : ug0.a();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static fv1 b(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            qu0 qu0Var = new qu0();
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    String valueOf = String.valueOf(file);
                    String packageName = context.getPackageName();
                    StringBuilder sb = new StringBuilder("Parsed ");
                    sb.append(valueOf);
                    sb.append(" for Android package ");
                    sb.append(packageName);
                    vu1 vu1Var = new vu1(qu0Var);
                    bufferedReader.close();
                    return vu1Var;
                }
                String[] split = readLine.split(" ", 3);
                if (split.length != 3) {
                    new StringBuilder("Invalid: ").append(readLine);
                } else {
                    String c = c(split[0]);
                    String decode = Uri.decode(c(split[1]));
                    String str = (String) hashMap.get(split[2]);
                    if (str == null) {
                        String c2 = c(split[2]);
                        str = Uri.decode(c2);
                        if (str.length() < 1024 || str == c2) {
                            hashMap.put(c2, str);
                        }
                    }
                    if (!qu0Var.containsKey(c)) {
                        qu0Var.put(c, new qu0());
                    }
                    ((qu0) qu0Var.get(c)).put(decode, str);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static final String c(String str) {
        return new String(str);
    }

    public static ug0 d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? ug0.d(file) : ug0.a();
        } catch (RuntimeException unused) {
            return ug0.a();
        }
    }
}
