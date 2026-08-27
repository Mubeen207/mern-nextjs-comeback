package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class a02 {
    public static final yz1 a = new c02();
    public static final yz1 b = c();

    public static yz1 a() {
        yz1 yz1Var = b;
        if (yz1Var != null) {
            return yz1Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static yz1 b() {
        return a;
    }

    public static yz1 c() {
        try {
            return (yz1) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
