package androidx.appcompat.view.menu;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class zx1 extends dy1 {
    public int m = 0;
    public final int n;
    public final /* synthetic */ tx1 o;

    public zx1(tx1 tx1Var) {
        this.o = tx1Var;
        this.n = tx1Var.t();
    }

    @Override // androidx.appcompat.view.menu.fy1
    public final byte a() {
        int i = this.m;
        if (i < this.n) {
            this.m = i + 1;
            return this.o.s(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m < this.n;
    }
}
