package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class r42 {
    public static final o42 a = c();
    public static final o42 b = new s42();

    public static o42 a() {
        return a;
    }

    public static o42 b() {
        return b;
    }

    public static o42 c() {
        try {
            return (o42) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
