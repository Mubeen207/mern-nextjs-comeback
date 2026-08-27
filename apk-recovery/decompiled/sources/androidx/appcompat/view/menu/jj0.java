package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class jj0 implements hj0 {
    public final Object[] a;
    public int b;

    public jj0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.a = new Object[i];
    }

    @Override // androidx.appcompat.view.menu.hj0
    public boolean a(Object obj) {
        c60.e(obj, "instance");
        if (!c(obj)) {
            int i = this.b;
            Object[] objArr = this.a;
            if (i < objArr.length) {
                objArr[i] = obj;
                this.b = i + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!".toString());
    }

    @Override // androidx.appcompat.view.menu.hj0
    public Object b() {
        int i = this.b;
        if (i > 0) {
            int i2 = i - 1;
            Object obj = this.a[i2];
            c60.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.a[i2] = null;
            this.b--;
            return obj;
        }
        return null;
    }

    public final boolean c(Object obj) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == obj) {
                return true;
            }
        }
        return false;
    }
}
