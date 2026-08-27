package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class h90 {
    public static final void a(int i) {
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }
}
