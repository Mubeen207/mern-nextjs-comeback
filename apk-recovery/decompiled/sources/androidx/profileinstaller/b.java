package androidx.profileinstaller;

import android.content.pm.PackageParser;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.appcompat.view.menu.mo;
import androidx.appcompat.view.menu.qk0;
import androidx.appcompat.view.menu.rk0;
import androidx.appcompat.view.menu.sl;
import androidx.profileinstaller.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class b {
    public final AssetManager a;
    public final Executor b;
    public final c.InterfaceC0050c c;
    public final File e;
    public final String f;
    public final String g;
    public final String h;
    public sl[] j;
    public byte[] k;
    public boolean i = false;
    public final byte[] d = d();

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0050c interfaceC0050c, String str, String str2, String str3, File file) {
        this.a = assetManager;
        this.b = executor;
        this.c = interfaceC0050c;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.e = file;
    }

    public static byte[] d() {
        int i = Build.VERSION.SDK_INT;
        if (i > 34) {
            return null;
        }
        switch (i) {
            case 28:
            case 29:
            case 30:
                return rk0.b;
            case 31:
            case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
            case 33:
            case 34:
                return rk0.a;
            default:
                return null;
        }
    }

    public static boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (i > 34) {
            return false;
        }
        switch (i) {
            case 31:
            case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
            case 33:
            case 34:
                return true;
            default:
                return false;
        }
    }

    public final b b(sl[] slVarArr, byte[] bArr) {
        InputStream h;
        try {
            h = h(this.a, this.h);
        } catch (FileNotFoundException e) {
            this.c.b(9, e);
        } catch (IOException e2) {
            this.c.b(7, e2);
        } catch (IllegalStateException e3) {
            this.j = null;
            this.c.b(8, e3);
        }
        if (h == null) {
            if (h != null) {
                h.close();
            }
            return null;
        }
        try {
            this.j = qk0.q(h, qk0.o(h, qk0.b), bArr, slVarArr);
            h.close();
            return this;
        } catch (Throwable th) {
            try {
                h.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (!this.i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.e.exists()) {
            try {
                this.e.createNewFile();
            } catch (IOException unused) {
                l(4, null);
                return false;
            }
        } else if (!this.e.canWrite()) {
            l(4, null);
            return false;
        }
        this.i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.g);
        } catch (FileNotFoundException e) {
            this.c.b(6, e);
            return null;
        } catch (IOException e2) {
            this.c.b(7, e2);
            return null;
        }
    }

    public final /* synthetic */ void g(int i, Object obj) {
        this.c.b(i, obj);
    }

    public final InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.c.a(5, null);
            }
            return null;
        }
    }

    public b i() {
        b b;
        c();
        if (this.d == null) {
            return this;
        }
        InputStream f = f(this.a);
        if (f != null) {
            this.j = j(f);
        }
        sl[] slVarArr = this.j;
        return (slVarArr == null || !k() || (b = b(slVarArr, this.d)) == null) ? this : b;
    }

    public final sl[] j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        sl[] w = qk0.w(inputStream, qk0.o(inputStream, qk0.a), this.f);
                        try {
                            inputStream.close();
                            return w;
                        } catch (IOException e) {
                            this.c.b(7, e);
                            return w;
                        }
                    } catch (IOException e2) {
                        this.c.b(7, e2);
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    this.c.b(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e4) {
                this.c.b(7, e4);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.c.b(7, e5);
            }
            throw th;
        }
    }

    public final void l(final int i, final Object obj) {
        this.b.execute(new Runnable() { // from class: androidx.appcompat.view.menu.ql
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.b.this.g(i, obj);
            }
        });
    }

    public b m() {
        ByteArrayOutputStream byteArrayOutputStream;
        sl[] slVarArr = this.j;
        byte[] bArr = this.d;
        if (slVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    qk0.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.c.b(7, e);
            } catch (IllegalStateException e2) {
                this.c.b(8, e2);
            }
            if (!qk0.B(byteArrayOutputStream, bArr, slVarArr)) {
                this.c.b(5, null);
                this.j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.j = null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.appcompat.view.menu.sl[], byte[]] */
    public boolean n() {
        byte[] bArr = this.k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                    mo.l(byteArrayInputStream, fileOutputStream);
                    l(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.k = null;
                this.j = null;
            }
        } catch (FileNotFoundException e) {
            l(6, e);
            return false;
        } catch (IOException e2) {
            l(7, e2);
            return false;
        }
    }
}
