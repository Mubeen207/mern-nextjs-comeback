package androidx.appcompat.view.menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public class c5 {
    public final File a;
    public final File b;
    public final File c;

    public c5(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".new");
        this.c = new File(file.getPath() + ".bak");
    }

    public static void c(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete file which is a directory ");
            sb.append(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to rename ");
        sb2.append(file);
        sb2.append(" to ");
        sb2.append(file2);
    }

    public static boolean e(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        e(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        if (this.b.delete()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to delete new file ");
        sb.append(this.b);
    }

    public void b(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        e(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        c(this.b, this.a);
    }

    public FileOutputStream d() {
        if (this.c.exists()) {
            c(this.c, this.a);
        }
        try {
            return new FileOutputStream(this.b);
        } catch (FileNotFoundException unused) {
            if (!this.b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.b);
            }
            try {
                return new FileOutputStream(this.b);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + this.b, e);
            }
        }
    }
}
