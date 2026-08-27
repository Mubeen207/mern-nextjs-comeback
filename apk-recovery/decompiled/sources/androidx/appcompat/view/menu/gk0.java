package androidx.appcompat.view.menu;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class gk0 {
    public static String a;
    public static int b;

    public static String a() {
        BufferedReader bufferedReader;
        if (a == null) {
            int i = b;
            if (i == 0) {
                i = Process.myPid();
                b = i;
            }
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (i > 0) {
                try {
                    String str2 = "/proc/" + i + "/cmdline";
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str2));
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    String readLine = bufferedReader.readLine();
                    pj0.i(readLine);
                    str = readLine.trim();
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    f20.a(bufferedReader2);
                    throw th;
                }
                f20.a(bufferedReader);
            }
            a = str;
        }
        return a;
    }
}
