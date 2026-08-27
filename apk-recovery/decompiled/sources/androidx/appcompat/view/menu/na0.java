package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import java.io.Writer;
/* loaded from: classes.dex */
public final class na0 extends Writer {
    public final String m;
    public StringBuilder n = new StringBuilder((int) PackageParser.PARSE_IS_PRIVILEGED);

    public na0(String str) {
        this.m = str;
    }

    public final void a() {
        if (this.n.length() > 0) {
            this.n.toString();
            StringBuilder sb = this.n;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.n.append(c);
            }
        }
    }
}
