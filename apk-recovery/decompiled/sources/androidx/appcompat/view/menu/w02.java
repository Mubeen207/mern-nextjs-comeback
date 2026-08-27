package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class w02 implements b42 {
    public static final w02 a = new w02();

    public static w02 c() {
        return a;
    }

    @Override // androidx.appcompat.view.menu.b42
    public final v32 a(Class cls) {
        if (!t02.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException("Unsupported message type: " + name);
        }
        try {
            return (v32) t02.n(cls.asSubclass(t02.class)).q(t02.c.c, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException("Unable to get message info for " + name2, e);
        }
    }

    @Override // androidx.appcompat.view.menu.b42
    public final boolean b(Class cls) {
        return t02.class.isAssignableFrom(cls);
    }
}
