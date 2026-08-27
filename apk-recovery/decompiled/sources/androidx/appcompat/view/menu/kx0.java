package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class kx0 {
    public static final int a;
    public static final int b;

    static {
        a = jx0.b.b() == null ? 8192 : ((Integer) jx0.b.b()).intValue();
        b = jx0.c.b() == null ? 67108864 : ((Integer) jx0.c.b()).intValue();
    }

    public static void a() {
        try {
            try {
                jx0.e.b(new Object[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable unused) {
            jx0.d.d(Integer.valueOf(((Integer) jx0.d.b()).intValue() & (~(a | b))));
        }
    }
}
