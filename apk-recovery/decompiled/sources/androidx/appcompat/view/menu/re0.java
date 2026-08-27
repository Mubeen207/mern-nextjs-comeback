package androidx.appcompat.view.menu;

import android.os.Build;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* loaded from: classes.dex */
public abstract class re0 {
    public static void a(File file, File file2) {
        System.currentTimeMillis();
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ZipFile zipFile = new ZipFile(file.getAbsolutePath());
        try {
            if (c(zipFile, Build.CPU_ABI, file2)) {
                zipFile.close();
                return;
            }
            c(zipFile, "armeabi", file2);
            zipFile.close();
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void b(byte[] bArr, InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read <= 0) {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                outputStream.close();
                bufferedInputStream.close();
                inputStream.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, read);
        }
    }

    public static boolean c(ZipFile zipFile, String str, File file) {
        String str2 = "lib/" + str + "/";
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        boolean z = false;
        byte[] bArr = null;
        boolean z2 = false;
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            String name = nextElement.getName();
            if (z || name.startsWith("lib/")) {
                if (name.endsWith(".so") && name.startsWith(str2)) {
                    if (bArr == null) {
                        bArr = new byte[8192];
                        z2 = true;
                    }
                    File file2 = new File(file, name.substring(name.lastIndexOf(47) + 1));
                    if (!file2.exists() || file2.length() != nextElement.getSize()) {
                        b(bArr, zipFile.getInputStream(nextElement), new FileOutputStream(file2));
                    }
                }
                z = true;
            }
        }
        if (z) {
            return z2;
        }
        return true;
    }
}
