package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class pc {
    public static StringBuilder a(int i) {
        mc.b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }
}
