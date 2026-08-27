package androidx.appcompat.view.menu;

import android.annotation.SuppressLint;
import android.content.pm.PackageParser;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public class b91 {
    public static final b91 b;
    public final l a;

    /* loaded from: classes.dex */
    public static class a {
        public static Field a;
        public static Field b;
        public static Field c;
        public static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets from AttachInfo ");
                sb.append(e.getMessage());
            }
        }

        public static b91 a(View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            b91 a2 = new b().c(m50.c(rect)).d(m50.c(rect2)).a();
                            a2.q(a2);
                            a2.d(view.getRootView());
                            return a2;
                        }
                    }
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get insets from AttachInfo. ");
                    sb.append(e.getMessage());
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        public e() {
        }

        @Override // androidx.appcompat.view.menu.b91.f
        public void c(int i, m50 m50Var) {
            this.c.setInsets(n.a(i), m50Var.e());
        }

        public e(b91 b91Var) {
            super(b91Var);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public final b91 a;
        public m50[] b;

        public f() {
            this(new b91((b91) null));
        }

        public final void a() {
            m50[] m50VarArr = this.b;
            if (m50VarArr != null) {
                m50 m50Var = m50VarArr[m.d(1)];
                m50 m50Var2 = this.b[m.d(2)];
                if (m50Var2 == null) {
                    m50Var2 = this.a.f(2);
                }
                if (m50Var == null) {
                    m50Var = this.a.f(1);
                }
                g(m50.a(m50Var, m50Var2));
                m50 m50Var3 = this.b[m.d(16)];
                if (m50Var3 != null) {
                    f(m50Var3);
                }
                m50 m50Var4 = this.b[m.d(32)];
                if (m50Var4 != null) {
                    d(m50Var4);
                }
                m50 m50Var5 = this.b[m.d(64)];
                if (m50Var5 != null) {
                    h(m50Var5);
                }
            }
        }

        public abstract b91 b();

        public void c(int i, m50 m50Var) {
            if (this.b == null) {
                this.b = new m50[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[m.d(i2)] = m50Var;
                }
            }
        }

        public void d(m50 m50Var) {
        }

        public abstract void e(m50 m50Var);

        public void f(m50 m50Var) {
        }

        public abstract void g(m50 m50Var);

        public void h(m50 m50Var) {
        }

        public f(b91 b91Var) {
            this.a = b91Var;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends l {
        public static boolean h = false;
        public static Method i;
        public static Class j;
        public static Field k;
        public static Field l;
        public final WindowInsets c;
        public m50[] d;
        public m50 e;
        public b91 f;
        public m50 g;

        public g(b91 b91Var, WindowInsets windowInsets) {
            super(b91Var);
            this.e = null;
            this.c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private m50 t(int i2, boolean z) {
            m50 m50Var = m50.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    m50Var = m50.a(m50Var, u(i3, z));
                }
            }
            return m50Var;
        }

        private m50 v() {
            b91 b91Var = this.f;
            return b91Var != null ? b91Var.g() : m50.e;
        }

        private m50 w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!h) {
                    x();
                }
                Method method = i;
                if (method != null && j != null && k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) k.get(l.get(invoke));
                        if (rect != null) {
                            return m50.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to get visible insets. (Reflection error). ");
                        sb.append(e.getMessage());
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets. (Reflection error). ");
                sb.append(e.getMessage());
            }
            h = true;
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public void d(View view) {
            m50 w = w(view);
            if (w == null) {
                w = m50.e;
            }
            q(w);
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public void e(b91 b91Var) {
            b91Var.q(this.f);
            b91Var.p(this.g);
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.g, ((g) obj).g);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public m50 g(int i2) {
            return t(i2, false);
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public final m50 k() {
            if (this.e == null) {
                this.e = m50.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public b91 m(int i2, int i3, int i4, int i5) {
            b bVar = new b(b91.t(this.c));
            bVar.d(b91.m(k(), i2, i3, i4, i5));
            bVar.c(b91.m(i(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public boolean o() {
            return this.c.isRound();
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public void p(m50[] m50VarArr) {
            this.d = m50VarArr;
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public void q(m50 m50Var) {
            this.g = m50Var;
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public void r(b91 b91Var) {
            this.f = b91Var;
        }

        public m50 u(int i2, boolean z) {
            m50 g;
            int i3;
            if (i2 == 1) {
                return z ? m50.b(0, Math.max(v().b, k().b), 0, 0) : m50.b(0, k().b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    m50 v = v();
                    m50 i4 = i();
                    return m50.b(Math.max(v.a, i4.a), 0, Math.max(v.c, i4.c), Math.max(v.d, i4.d));
                }
                m50 k2 = k();
                b91 b91Var = this.f;
                g = b91Var != null ? b91Var.g() : null;
                int i5 = k2.d;
                if (g != null) {
                    i5 = Math.min(i5, g.d);
                }
                return m50.b(k2.a, 0, k2.c, i5);
            } else if (i2 != 8) {
                if (i2 != 16) {
                    if (i2 != 32) {
                        if (i2 != 64) {
                            if (i2 != 128) {
                                return m50.e;
                            }
                            b91 b91Var2 = this.f;
                            im e = b91Var2 != null ? b91Var2.e() : f();
                            return e != null ? m50.b(e.b(), e.d(), e.c(), e.a()) : m50.e;
                        }
                        return l();
                    }
                    return h();
                }
                return j();
            } else {
                m50[] m50VarArr = this.d;
                g = m50VarArr != null ? m50VarArr[m.d(8)] : null;
                if (g != null) {
                    return g;
                }
                m50 k3 = k();
                m50 v2 = v();
                int i6 = k3.d;
                if (i6 > v2.d) {
                    return m50.b(0, 0, 0, i6);
                }
                m50 m50Var = this.g;
                return (m50Var == null || m50Var.equals(m50.e) || (i3 = this.g.d) <= v2.d) ? m50.e : m50.b(0, 0, 0, i3);
            }
        }

        public g(b91 b91Var, g gVar) {
            this(b91Var, new WindowInsets(gVar.c));
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public m50 m;

        public h(b91 b91Var, WindowInsets windowInsets) {
            super(b91Var, windowInsets);
            this.m = null;
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public b91 b() {
            return b91.t(this.c.consumeStableInsets());
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public b91 c() {
            return b91.t(this.c.consumeSystemWindowInsets());
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public final m50 i() {
            if (this.m == null) {
                this.m = m50.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public boolean n() {
            return this.c.isConsumed();
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public void s(m50 m50Var) {
            this.m = m50Var;
        }

        public h(b91 b91Var, h hVar) {
            super(b91Var, hVar);
            this.m = null;
            this.m = hVar.m;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {
        public i(b91 b91Var, WindowInsets windowInsets) {
            super(b91Var, windowInsets);
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public b91 a() {
            return b91.t(this.c.consumeDisplayCutout());
        }

        @Override // androidx.appcompat.view.menu.b91.g, androidx.appcompat.view.menu.b91.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return Objects.equals(this.c, iVar.c) && Objects.equals(this.g, iVar.g);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public im f() {
            return im.e(this.c.getDisplayCutout());
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public int hashCode() {
            return this.c.hashCode();
        }

        public i(b91 b91Var, i iVar) {
            super(b91Var, iVar);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends i {
        public m50 n;
        public m50 o;
        public m50 p;

        public j(b91 b91Var, WindowInsets windowInsets) {
            super(b91Var, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public m50 h() {
            Insets mandatorySystemGestureInsets;
            if (this.o == null) {
                mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
                this.o = m50.d(mandatorySystemGestureInsets);
            }
            return this.o;
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public m50 j() {
            Insets systemGestureInsets;
            if (this.n == null) {
                systemGestureInsets = this.c.getSystemGestureInsets();
                this.n = m50.d(systemGestureInsets);
            }
            return this.n;
        }

        @Override // androidx.appcompat.view.menu.b91.l
        public m50 l() {
            Insets tappableElementInsets;
            if (this.p == null) {
                tappableElementInsets = this.c.getTappableElementInsets();
                this.p = m50.d(tappableElementInsets);
            }
            return this.p;
        }

        @Override // androidx.appcompat.view.menu.b91.g, androidx.appcompat.view.menu.b91.l
        public b91 m(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            inset = this.c.inset(i, i2, i3, i4);
            return b91.t(inset);
        }

        @Override // androidx.appcompat.view.menu.b91.h, androidx.appcompat.view.menu.b91.l
        public void s(m50 m50Var) {
        }

        public j(b91 b91Var, j jVar) {
            super(b91Var, jVar);
            this.n = null;
            this.o = null;
            this.p = null;
        }
    }

    /* loaded from: classes.dex */
    public static class k extends j {
        public static final b91 q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            q = b91.t(windowInsets);
        }

        public k(b91 b91Var, WindowInsets windowInsets) {
            super(b91Var, windowInsets);
        }

        @Override // androidx.appcompat.view.menu.b91.g, androidx.appcompat.view.menu.b91.l
        public final void d(View view) {
        }

        @Override // androidx.appcompat.view.menu.b91.g, androidx.appcompat.view.menu.b91.l
        public m50 g(int i) {
            Insets insets;
            insets = this.c.getInsets(n.a(i));
            return m50.d(insets);
        }

        public k(b91 b91Var, k kVar) {
            super(b91Var, kVar);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public static final b91 b = new b().a().a().b().c();
        public final b91 a;

        public l(b91 b91Var) {
            this.a = b91Var;
        }

        public b91 a() {
            return this.a;
        }

        public b91 b() {
            return this.a;
        }

        public b91 c() {
            return this.a;
        }

        public void d(View view) {
        }

        public void e(b91 b91Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return o() == lVar.o() && n() == lVar.n() && bg0.a(k(), lVar.k()) && bg0.a(i(), lVar.i()) && bg0.a(f(), lVar.f());
            }
            return false;
        }

        public im f() {
            return null;
        }

        public m50 g(int i) {
            return m50.e;
        }

        public m50 h() {
            return k();
        }

        public int hashCode() {
            return bg0.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        public m50 i() {
            return m50.e;
        }

        public m50 j() {
            return k();
        }

        public m50 k() {
            return m50.e;
        }

        public m50 l() {
            return k();
        }

        public b91 m(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void p(m50[] m50VarArr) {
        }

        public void q(m50 m50Var) {
        }

        public void r(b91 b91Var) {
        }

        public void s(m50 m50Var) {
        }
    }

    /* loaded from: classes.dex */
    public static final class m {
        public static int a() {
            return 4;
        }

        public static int b() {
            return PackageParser.PARSE_IS_PRIVILEGED;
        }

        public static int c() {
            return 8;
        }

        public static int d(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                if (i != 32) {
                                    if (i != 64) {
                                        if (i != 128) {
                                            if (i == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    /* loaded from: classes.dex */
    public static final class n {
        public static int a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = k.q;
        } else {
            b = l.b;
        }
    }

    public b91(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new k(this, windowInsets);
        } else if (i2 >= 29) {
            this.a = new j(this, windowInsets);
        } else {
            this.a = new i(this, windowInsets);
        }
    }

    public static m50 m(m50 m50Var, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, m50Var.a - i2);
        int max2 = Math.max(0, m50Var.b - i3);
        int max3 = Math.max(0, m50Var.c - i4);
        int max4 = Math.max(0, m50Var.d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? m50Var : m50.b(max, max2, max3, max4);
    }

    public static b91 t(WindowInsets windowInsets) {
        return u(windowInsets, null);
    }

    public static b91 u(WindowInsets windowInsets, View view) {
        b91 b91Var = new b91((WindowInsets) tj0.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            b91Var.q(p51.D(view));
            b91Var.d(view.getRootView());
        }
        return b91Var;
    }

    public b91 a() {
        return this.a.a();
    }

    public b91 b() {
        return this.a.b();
    }

    public b91 c() {
        return this.a.c();
    }

    public void d(View view) {
        this.a.d(view);
    }

    public im e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b91) {
            return bg0.a(this.a, ((b91) obj).a);
        }
        return false;
    }

    public m50 f(int i2) {
        return this.a.g(i2);
    }

    public m50 g() {
        return this.a.i();
    }

    public int h() {
        return this.a.k().d;
    }

    public int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.a.k().a;
    }

    public int j() {
        return this.a.k().c;
    }

    public int k() {
        return this.a.k().b;
    }

    public b91 l(int i2, int i3, int i4, int i5) {
        return this.a.m(i2, i3, i4, i5);
    }

    public boolean n() {
        return this.a.n();
    }

    public void o(m50[] m50VarArr) {
        this.a.p(m50VarArr);
    }

    public void p(m50 m50Var) {
        this.a.q(m50Var);
    }

    public void q(b91 b91Var) {
        this.a.r(b91Var);
    }

    public void r(m50 m50Var) {
        this.a.s(m50Var);
    }

    public WindowInsets s() {
        l lVar = this.a;
        if (lVar instanceof g) {
            return ((g) lVar).c;
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static class c extends f {
        public static Field e = null;
        public static boolean f = false;
        public static Constructor g = null;
        public static boolean h = false;
        public WindowInsets c;
        public m50 d;

        public c() {
            this.c = i();
        }

        private static WindowInsets i() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                h = true;
            }
            Constructor constructor = g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.appcompat.view.menu.b91.f
        public b91 b() {
            a();
            b91 t = b91.t(this.c);
            t.o(this.b);
            t.r(this.d);
            return t;
        }

        @Override // androidx.appcompat.view.menu.b91.f
        public void e(m50 m50Var) {
            this.d = m50Var;
        }

        @Override // androidx.appcompat.view.menu.b91.f
        public void g(m50 m50Var) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(m50Var.a, m50Var.b, m50Var.c, m50Var.d);
            }
        }

        public c(b91 b91Var) {
            super(b91Var);
            this.c = b91Var.s();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {
        public final WindowInsets.Builder c;

        public d() {
            this.c = i91.a();
        }

        @Override // androidx.appcompat.view.menu.b91.f
        public b91 b() {
            WindowInsets build;
            a();
            build = this.c.build();
            b91 t = b91.t(build);
            t.o(this.b);
            return t;
        }

        @Override // androidx.appcompat.view.menu.b91.f
        public void d(m50 m50Var) {
            this.c.setMandatorySystemGestureInsets(m50Var.e());
        }

        @Override // androidx.appcompat.view.menu.b91.f
        public void e(m50 m50Var) {
            this.c.setStableInsets(m50Var.e());
        }

        @Override // androidx.appcompat.view.menu.b91.f
        public void f(m50 m50Var) {
            this.c.setSystemGestureInsets(m50Var.e());
        }

        @Override // androidx.appcompat.view.menu.b91.f
        public void g(m50 m50Var) {
            this.c.setSystemWindowInsets(m50Var.e());
        }

        @Override // androidx.appcompat.view.menu.b91.f
        public void h(m50 m50Var) {
            this.c.setTappableElementInsets(m50Var.e());
        }

        public d(b91 b91Var) {
            super(b91Var);
            WindowInsets.Builder a;
            WindowInsets s = b91Var.s();
            if (s != null) {
                a = j91.a(s);
            } else {
                a = i91.a();
            }
            this.c = a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final f a;

        public b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e();
            } else if (i >= 29) {
                this.a = new d();
            } else {
                this.a = new c();
            }
        }

        public b91 a() {
            return this.a.b();
        }

        public b b(int i, m50 m50Var) {
            this.a.c(i, m50Var);
            return this;
        }

        public b c(m50 m50Var) {
            this.a.e(m50Var);
            return this;
        }

        public b d(m50 m50Var) {
            this.a.g(m50Var);
            return this;
        }

        public b(b91 b91Var) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e(b91Var);
            } else if (i >= 29) {
                this.a = new d(b91Var);
            } else {
                this.a = new c(b91Var);
            }
        }
    }

    public b91(b91 b91Var) {
        if (b91Var != null) {
            l lVar = b91Var.a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (lVar instanceof k)) {
                this.a = new k(this, (k) lVar);
            } else if (i2 >= 29 && (lVar instanceof j)) {
                this.a = new j(this, (j) lVar);
            } else if (lVar instanceof i) {
                this.a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.a = new g(this, (g) lVar);
            } else {
                this.a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.a = new l(this);
    }
}
