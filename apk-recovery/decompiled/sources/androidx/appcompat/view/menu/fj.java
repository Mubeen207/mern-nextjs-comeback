package androidx.appcompat.view.menu;

import java.lang.reflect.Field;
/* loaded from: classes.dex */
public abstract class fj {
    public static final void a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    public static final ej b(y7 y7Var) {
        return (ej) y7Var.getClass().getAnnotation(ej.class);
    }

    public static final int c(y7 y7Var) {
        try {
            Field declaredField = y7Var.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(y7Var);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(y7 y7Var) {
        String str;
        c60.e(y7Var, "<this>");
        ej b = b(y7Var);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        int c = c(y7Var);
        int i = c < 0 ? -1 : b.l()[c];
        String b2 = vd0.a.b(y7Var);
        if (b2 == null) {
            str = b.c();
        } else {
            str = b2 + '/' + b.c();
        }
        return new StackTraceElement(str, b.m(), b.f(), i);
    }
}
