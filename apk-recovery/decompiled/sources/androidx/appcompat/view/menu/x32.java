package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class x32 {
    public static final t32 a = c();
    public static final t32 b = new r32();

    public static t32 a() {
        return a;
    }

    public static t32 b() {
        return b;
    }

    public static t32 c() {
        try {
            return (t32) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
