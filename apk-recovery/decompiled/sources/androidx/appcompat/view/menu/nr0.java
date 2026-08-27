package androidx.appcompat.view.menu;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class nr0 {
    public final ClassLoader a;

    /* loaded from: classes.dex */
    public static final class a extends j80 implements iw {
        public a() {
            super(0);
        }

        @Override // androidx.appcompat.view.menu.iw
        /* renamed from: a */
        public final Class d() {
            Class<?> loadClass = nr0.this.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            c60.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            return loadClass;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j80 implements iw {
        public b() {
            super(0);
        }

        @Override // androidx.appcompat.view.menu.iw
        /* renamed from: a */
        public final Boolean d() {
            boolean z = false;
            Method declaredMethod = nr0.this.d().getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class c = nr0.this.c();
            io0 io0Var = io0.a;
            c60.d(declaredMethod, "getWindowExtensionsMethod");
            if (io0Var.c(declaredMethod, c) && io0Var.d(declaredMethod)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public nr0(ClassLoader classLoader) {
        c60.e(classLoader, "loader");
        this.a = classLoader;
    }

    public final Class c() {
        Class<?> loadClass = this.a.loadClass("androidx.window.extensions.WindowExtensions");
        c60.d(loadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        return loadClass;
    }

    public final Class d() {
        Class<?> loadClass = this.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        c60.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return loadClass;
    }

    public final boolean e() {
        return io0.a.a(new a());
    }

    public final boolean f() {
        return e() && io0.e("WindowExtensionsProvider#getWindowExtensions is not valid", new b());
    }
}
