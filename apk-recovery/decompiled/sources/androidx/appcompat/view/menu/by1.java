package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class by1 extends ny1 {
    public final int r;
    public final int s;

    public by1(byte[] bArr, int i, int i2) {
        super(bArr);
        tx1.h(i, i + i2, bArr.length);
        this.r = i;
        this.s = i2;
    }

    @Override // androidx.appcompat.view.menu.ny1, androidx.appcompat.view.menu.tx1
    public final byte d(int i) {
        int t = t();
        if (((t - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + t);
        }
        return this.q[this.r + i];
    }

    @Override // androidx.appcompat.view.menu.ny1, androidx.appcompat.view.menu.tx1
    public final byte s(int i) {
        return this.q[this.r + i];
    }

    @Override // androidx.appcompat.view.menu.ny1, androidx.appcompat.view.menu.tx1
    public final int t() {
        return this.s;
    }

    @Override // androidx.appcompat.view.menu.ny1
    public final int z() {
        return this.r;
    }
}
