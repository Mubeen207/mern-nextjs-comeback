package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class g60 extends h60 {
    public static int a(int i, int i2, int i3) {
        qj0.f(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }
}
