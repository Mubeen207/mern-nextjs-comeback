package androidx.appcompat.view.menu;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public abstract class t02 extends dx1 {
    private static Map<Object, t02> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected g72 zzb = g72.k();

    /* loaded from: classes.dex */
    public static class a extends kx1 {
        public final t02 b;

        public a(t02 t02Var) {
            this.b = t02Var;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends gx1 {
        public final t02 m;
        public t02 n;

        public b(t02 t02Var) {
            this.m = t02Var;
            if (t02Var.F()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.n = t02Var.y();
        }

        public static void h(Object obj, Object obj2) {
            y42.a().c(obj).d(obj, obj2);
        }

        @Override // androidx.appcompat.view.menu.gx1
        public /* synthetic */ Object clone() {
            b bVar = (b) this.m.q(c.e, null, null);
            bVar.n = (t02) k();
            return bVar;
        }

        @Override // androidx.appcompat.view.menu.gx1
        public final /* synthetic */ gx1 e(byte[] bArr, int i, int i2) {
            return p(bArr, 0, i2, tz1.c);
        }

        @Override // androidx.appcompat.view.menu.gx1
        public final /* synthetic */ gx1 f(byte[] bArr, int i, int i2, tz1 tz1Var) {
            return p(bArr, 0, i2, tz1Var);
        }

        public final b g(t02 t02Var) {
            if (this.m.equals(t02Var)) {
                return this;
            }
            if (!this.n.F()) {
                o();
            }
            h(this.n, t02Var);
            return this;
        }

        @Override // androidx.appcompat.view.menu.f42
        /* renamed from: i */
        public t02 k() {
            if (this.n.F()) {
                this.n.C();
                return this.n;
            }
            return this.n;
        }

        public final void n() {
            if (this.n.F()) {
                return;
            }
            o();
        }

        public void o() {
            t02 y = this.m.y();
            h(y, this.n);
            this.n = y;
        }

        public final b p(byte[] bArr, int i, int i2, tz1 tz1Var) {
            if (!this.n.F()) {
                o();
            }
            try {
                y42.a().c(this.n).i(this.n, bArr, 0, i2, new rx1(tz1Var));
                return this;
            } catch (v12 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw v12.f();
            }
        }

        /* renamed from: q */
        public final t02 j() {
            t02 t02Var = (t02) k();
            if (t02Var.E()) {
                return t02Var;
            }
            throw new c72(t02Var);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends wz1 {
    }

    public static s12 A() {
        return x22.g();
    }

    public static q12 B() {
        return k52.h();
    }

    private final int j() {
        return y42.a().c(this).f(this);
    }

    public static t02 n(Class cls) {
        t02 t02Var = zzc.get(cls);
        if (t02Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t02Var = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t02Var == null) {
            t02Var = (t02) ((t02) z72.b(cls)).q(c.f, null, null);
            if (t02Var == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, t02Var);
        }
        return t02Var;
    }

    public static q12 o(q12 q12Var) {
        int size = q12Var.size();
        return q12Var.e(size == 0 ? 10 : size << 1);
    }

    public static s12 p(s12 s12Var) {
        int size = s12Var.size();
        return s12Var.a(size == 0 ? 10 : size << 1);
    }

    public static Object r(z32 z32Var, String str, Object[] objArr) {
        return new c52(z32Var, str, objArr);
    }

    public static Object s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void t(Class cls, t02 t02Var) {
        t02Var.D();
        zzc.put(cls, t02Var);
    }

    public static final boolean u(t02 t02Var, boolean z) {
        byte byteValue = ((Byte) t02Var.q(c.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = y42.a().c(t02Var).c(t02Var);
        if (z) {
            t02Var.q(c.b, c2 ? t02Var : null, null);
        }
        return c2;
    }

    public static m12 z() {
        return g12.g();
    }

    public final void C() {
        y42.a().c(this).e(this);
        D();
    }

    public final void D() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean E() {
        return u(this, true);
    }

    public final boolean F() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // androidx.appcompat.view.menu.z32
    public final int a() {
        return e(null);
    }

    @Override // androidx.appcompat.view.menu.d42
    public final /* synthetic */ z32 b() {
        return (t02) q(c.f, null, null);
    }

    @Override // androidx.appcompat.view.menu.z32
    public final void c(mz1 mz1Var) {
        y42.a().c(this).g(this, sz1.P(mz1Var));
    }

    @Override // androidx.appcompat.view.menu.z32
    public final /* synthetic */ f42 d() {
        return (b) q(c.e, null, null);
    }

    @Override // androidx.appcompat.view.menu.dx1
    public final int e(m52 m52Var) {
        if (!F()) {
            if (g() != Integer.MAX_VALUE) {
                return g();
            }
            int v = v(m52Var);
            i(v);
            return v;
        }
        int v2 = v(m52Var);
        if (v2 >= 0) {
            return v2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + v2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return y42.a().c(this).h(this, (t02) obj);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.dx1
    public final int g() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public int hashCode() {
        if (F()) {
            return j();
        }
        if (this.zza == 0) {
            this.zza = j();
        }
        return this.zza;
    }

    @Override // androidx.appcompat.view.menu.dx1
    public final void i(int i) {
        if (i >= 0) {
            this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    public abstract Object q(int i, Object obj, Object obj2);

    public String toString() {
        return j42.a(this, super.toString());
    }

    public final int v(m52 m52Var) {
        return m52Var == null ? y42.a().c(this).b(this) : m52Var.b(this);
    }

    public final b w() {
        return (b) q(c.e, null, null);
    }

    public final b x() {
        return ((b) q(c.e, null, null)).g(this);
    }

    public final t02 y() {
        return (t02) q(c.d, null, null);
    }
}
