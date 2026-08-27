package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class s11 implements AutoCloseable {
    public s11(String str) {
        a(str);
    }

    public static void a(String str) {
        o11.c(d(str));
    }

    public static void c(String str, int i) {
        o11.a(d(str), i);
    }

    public static String d(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void e() {
        o11.f();
    }

    public static void h(String str, int i) {
        o11.d(d(str), i);
    }

    public static s11 i(String str) {
        return new s11(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        e();
    }
}
