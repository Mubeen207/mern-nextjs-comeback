package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class o70 {
    public static final Object a(n70 n70Var, Object obj) {
        c60.e(n70Var, "<this>");
        if (n70Var.b(obj)) {
            c60.c(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + n70Var.a());
    }
}
