package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class xj extends yr0 {
    public static final xj u = new xj();

    public xj() {
        super(nz0.c, nz0.d, nz0.e, nz0.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // androidx.appcompat.view.menu.nh
    public String toString() {
        return "Dispatchers.Default";
    }
}
