package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class yf1 implements Iterator {
    public int m = 0;
    public final /* synthetic */ sf1 n;

    public yf1(sf1 sf1Var) {
        this.n = sf1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m < this.n.v();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.m < this.n.v()) {
            sf1 sf1Var = this.n;
            int i = this.m;
            this.m = i + 1;
            return sf1Var.s(i);
        }
        int i2 = this.m;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
