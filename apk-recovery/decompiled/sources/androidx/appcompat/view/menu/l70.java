package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class l70 {
    public static final Class a(n70 n70Var) {
        c60.e(n70Var, "<this>");
        Class d = ((nb) n70Var).d();
        c60.c(d, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return d;
    }

    public static final Class b(n70 n70Var) {
        c60.e(n70Var, "<this>");
        Class d = ((nb) n70Var).d();
        if (!d.isPrimitive()) {
            c60.c(d, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return d;
        }
        String name = d.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    d = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    d = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    d = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    d = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    d = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    d = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    d = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    d = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    d = Short.class;
                    break;
                }
                break;
        }
        c60.c(d, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return d;
    }

    public static final n70 c(Class cls) {
        c60.e(cls, "<this>");
        return go0.b(cls);
    }
}
