package androidx.appcompat.view.menu;

import java.util.Set;
/* loaded from: classes.dex */
public interface xd {
    default Object a(Class cls) {
        return e(xl0.b(cls));
    }

    hl0 b(xl0 xl0Var);

    default Set c(Class cls) {
        return f(xl0.b(cls));
    }

    default hl0 d(Class cls) {
        return b(xl0.b(cls));
    }

    default Object e(xl0 xl0Var) {
        hl0 b = b(xl0Var);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    default Set f(xl0 xl0Var) {
        return (Set) g(xl0Var).get();
    }

    hl0 g(xl0 xl0Var);
}
