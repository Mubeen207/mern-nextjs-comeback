package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class vy0 implements dc {
    public static vy0 a;

    public static vy0 b() {
        if (a == null) {
            a = new vy0();
        }
        return a;
    }

    @Override // androidx.appcompat.view.menu.dc
    public long a() {
        return System.currentTimeMillis();
    }
}
