package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class ns0 {
    public static Object a(Object obj) {
        return obj;
    }

    public static final ms0 b(Object obj) {
        if (obj != ye.a) {
            c60.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (ms0) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object obj) {
        return obj == ye.a;
    }
}
