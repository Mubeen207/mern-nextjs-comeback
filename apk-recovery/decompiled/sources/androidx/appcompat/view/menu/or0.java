package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class or0 {
    public final ClassLoader a;
    public final qf b;
    public final nr0 c;

    /* loaded from: classes.dex */
    public static final class a extends j80 implements iw {
        public a() {
            super(0);
        }

        @Override // androidx.appcompat.view.menu.iw
        /* renamed from: a */
        public final Boolean d() {
            Class f = or0.this.f();
            boolean z = false;
            Method method = f.getMethod("getBounds", new Class[0]);
            Method method2 = f.getMethod("getType", new Class[0]);
            Method method3 = f.getMethod("getState", new Class[0]);
            io0 io0Var = io0.a;
            c60.d(method, "getBoundsMethod");
            if (io0Var.b(method, go0.b(Rect.class)) && io0Var.d(method)) {
                c60.d(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (io0Var.b(method2, go0.b(cls)) && io0Var.d(method2)) {
                    c60.d(method3, "getStateMethod");
                    if (io0Var.b(method3, go0.b(cls)) && io0Var.d(method3)) {
                        z = true;
                    }
                }
            }
            return Boolean.valueOf(z);
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
            Class<?> b = or0.this.b.b();
            if (b == null) {
                return Boolean.FALSE;
            }
            Class h = or0.this.h();
            boolean z = false;
            Method method = h.getMethod("addWindowLayoutInfoListener", Activity.class, b);
            Method method2 = h.getMethod("removeWindowLayoutInfoListener", b);
            io0 io0Var = io0.a;
            c60.d(method, "addListenerMethod");
            if (io0Var.d(method)) {
                c60.d(method2, "removeListenerMethod");
                if (io0Var.d(method2)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends j80 implements iw {
        public c() {
            super(0);
        }

        @Override // androidx.appcompat.view.menu.iw
        /* renamed from: a */
        public final Boolean d() {
            Class h = or0.this.h();
            boolean z = false;
            Method method = h.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
            Method method2 = h.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            io0 io0Var = io0.a;
            c60.d(method, "addListenerMethod");
            if (io0Var.d(method)) {
                c60.d(method2, "removeListenerMethod");
                if (io0Var.d(method2)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends j80 implements iw {
        public d() {
            super(0);
        }

        @Override // androidx.appcompat.view.menu.iw
        /* renamed from: a */
        public final Boolean d() {
            boolean z = false;
            Method method = or0.this.c.c().getMethod("getWindowLayoutComponent", new Class[0]);
            Class h = or0.this.h();
            io0 io0Var = io0.a;
            c60.d(method, "getWindowLayoutComponentMethod");
            if (io0Var.d(method) && io0Var.c(method, h)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public or0(ClassLoader classLoader, qf qfVar) {
        c60.e(classLoader, "loader");
        c60.e(qfVar, "consumerAdapter");
        this.a = classLoader;
        this.b = qfVar;
        this.c = new nr0(classLoader);
    }

    public final boolean e() {
        if (n()) {
            int a2 = nq.a.a();
            if (a2 == 1) {
                return i();
            }
            if (2 > a2 || a2 > Integer.MAX_VALUE) {
                return false;
            }
            return j();
        }
        return false;
    }

    public final Class f() {
        Class<?> loadClass = this.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        c60.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return loadClass;
    }

    public final WindowLayoutComponent g() {
        if (e()) {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
        return null;
    }

    public final Class h() {
        Class<?> loadClass = this.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        c60.d(loadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return loadClass;
    }

    public final boolean i() {
        return l();
    }

    public final boolean j() {
        return i() && m();
    }

    public final boolean k() {
        return io0.e("FoldingFeature class is not valid", new a());
    }

    public final boolean l() {
        return io0.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new b());
    }

    public final boolean m() {
        return io0.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new c());
    }

    public final boolean n() {
        return this.c.f() && o() && k();
    }

    public final boolean o() {
        return io0.e("WindowExtensions#getWindowLayoutComponent is not valid", new d());
    }
}
