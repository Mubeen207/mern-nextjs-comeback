package androidx.appcompat.view.menu;

import java.io.OutputStream;
/* loaded from: classes.dex */
public final class u80 extends OutputStream {
    public long m = 0;

    public long a() {
        return this.m;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.m++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.m += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.m += i2;
    }
}
