package androidx.appcompat.view.menu;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class tx1 implements Serializable, Iterable {
    public static final tx1 n = new ny1(y02.d);
    public static final hy1 o = new ty1();
    public static final Comparator p = new xx1();
    public int m = 0;

    public static /* synthetic */ int g(byte b) {
        return b & 255;
    }

    public static int h(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
            } else if (i2 < i) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
        }
        return i4;
    }

    public static tx1 k(String str) {
        return new ny1(str.getBytes(y02.b));
    }

    public static tx1 n(byte[] bArr, int i, int i2) {
        h(i, i + i2, bArr.length);
        return new ny1(o.a(bArr, i, i2));
    }

    public static ly1 v(int i) {
        return new ly1(i);
    }

    public abstract byte d(int i);

    public abstract boolean equals(Object obj);

    public final int f() {
        return this.m;
    }

    public final int hashCode() {
        int i = this.m;
        if (i == 0) {
            int t = t();
            i = u(t, 0, t);
            if (i == 0) {
                i = 1;
            }
            this.m = i;
        }
        return i;
    }

    public abstract tx1 i(int i, int i2);

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new zx1(this);
    }

    public abstract String p(Charset charset);

    public abstract void r(vx1 vx1Var);

    public abstract byte s(int i);

    public abstract int t();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(t());
        if (t() <= 50) {
            str = a72.a(this);
        } else {
            str = a72.a(i(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract int u(int i, int i2, int i3);

    public final String w() {
        return t() == 0 ? "" : p(y02.b);
    }

    public abstract boolean x();
}
