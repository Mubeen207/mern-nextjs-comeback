package androidx.appcompat.view.menu;

import android.os.Parcel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
/* loaded from: classes.dex */
public abstract class qr {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void b(File file, File file2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    FileChannel channel = fileInputStream2.getChannel();
                    FileChannel channel2 = fileOutputStream.getChannel();
                    ByteBuffer allocate = ByteBuffer.allocate(1024);
                    while (true) {
                        allocate.clear();
                        if (channel.read(allocate) == -1) {
                            a(fileInputStream2);
                            a(fileOutputStream);
                            return;
                        }
                        allocate.limit(allocate.position());
                        allocate.position(0);
                        channel2.write(allocate);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    a(fileInputStream);
                    a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static void c(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable unused) {
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    a(inputStream);
                    a(fileOutputStream);
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable unused2) {
            fileOutputStream2 = fileOutputStream;
            a(inputStream);
            a(fileOutputStream2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (f(r6) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(java.io.File r6) {
        /*
            boolean r0 = r6.isDirectory()
            r1 = 0
            if (r0 == 0) goto L25
            boolean r0 = f(r6)     // Catch: java.lang.Exception -> Ld
            if (r0 != 0) goto L25
        Ld:
            java.lang.String[] r0 = r6.list()
            int r2 = r0.length
            r3 = r1
        L13:
            if (r1 >= r2) goto L24
            r4 = r0[r1]
            java.io.File r5 = new java.io.File
            r5.<init>(r6, r4)
            int r4 = d(r5)
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L13
        L24:
            r1 = r3
        L25:
            boolean r6 = r6.delete()
            if (r6 == 0) goto L2d
            int r1 = r1 + 1
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.qr.d(java.io.File):int");
    }

    public static boolean e(String str) {
        return new File(str).exists();
    }

    public static boolean f(File file) {
        if (file != null) {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        }
        throw new NullPointerException("File must not be null");
    }

    public static void g(File file) {
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void h(String str) {
        g(new File(str));
    }

    public static boolean i(File file, File file2) {
        return file.renameTo(file2);
    }

    public static byte[] j(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return k(fileInputStream);
        } finally {
            a(fileInputStream);
        }
    }

    public static byte[] k(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[100];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static void l(Parcel parcel, FileOutputStream fileOutputStream) {
        fileOutputStream.write(parcel.marshall());
    }

    public static void m(byte[] bArr, File file) {
        ReadableByteChannel newChannel = Channels.newChannel(new ByteArrayInputStream(bArr));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileChannel channel = fileOutputStream.getChannel();
            try {
                channel.transferFrom(newChannel, 0L, bArr.length);
                channel.close();
                fileOutputStream.close();
                if (newChannel != null) {
                    newChannel.close();
                }
            } catch (Throwable th) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (newChannel != null) {
                try {
                    newChannel.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
