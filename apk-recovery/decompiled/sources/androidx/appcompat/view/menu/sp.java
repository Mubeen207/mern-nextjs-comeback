package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class sp implements vq {

    /* loaded from: classes.dex */
    public static final class a {
        public static final sp a = new sp();
    }

    public static sp a() {
        return a.a;
    }

    public static Executor b() {
        return (Executor) oj0.c(rp.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // androidx.appcompat.view.menu.gl0
    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
