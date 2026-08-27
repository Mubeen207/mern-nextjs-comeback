package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class bh1 implements Iterator {
    public int m = 0;
    public final /* synthetic */ xg1 n;

    public bh1(xg1 xg1Var) {
        this.n = xg1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.m;
        str = this.n.m;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        String str;
        String str2;
        int i = this.m;
        str = this.n.m;
        if (i < str.length()) {
            str2 = this.n.m;
            int i2 = this.m;
            this.m = i2 + 1;
            return new xg1(String.valueOf(str2.charAt(i2)));
        }
        throw new NoSuchElementException();
    }
}
