package androidx.appcompat.view.menu;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class x50 extends v50 {
    public final int m;
    public final int n;
    public boolean o;
    public int p;

    public x50(int i, int i2, int i3) {
        this.m = i3;
        this.n = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.o = z;
        this.p = z ? i : i2;
    }

    @Override // androidx.appcompat.view.menu.v50
    public int b() {
        int i = this.p;
        if (i != this.n) {
            this.p = this.m + i;
        } else if (!this.o) {
            throw new NoSuchElementException();
        } else {
            this.o = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.o;
    }
}
