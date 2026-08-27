package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class gb {
    public static final int a(int i) {
        if (new y50(2, 36).i(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new y50(2, 36));
    }

    public static final int b(char c, int i) {
        return Character.digit((int) c, i);
    }

    public static final boolean c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
