package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class t7 {

    /* loaded from: classes.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static t7 a() {
        return new o5(a.FATAL_ERROR, -1L);
    }

    public static t7 d() {
        return new o5(a.INVALID_PAYLOAD, -1L);
    }

    public static t7 e(long j) {
        return new o5(a.OK, j);
    }

    public static t7 f() {
        return new o5(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
