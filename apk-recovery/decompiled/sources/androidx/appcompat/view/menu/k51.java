package androidx.appcompat.view.menu;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class k51 {
    public final o4 a;
    public final o4 b;
    public final o4 c;

    public k51(o4 o4Var, o4 o4Var2, o4 o4Var3) {
        this.a = o4Var;
        this.b = o4Var2;
        this.c = o4Var3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i) {
        w(i);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i) {
        w(i);
        C(charSequence);
    }

    public abstract void E(int i);

    public void F(int i, int i2) {
        w(i2);
        E(i);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i) {
        w(i);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i) {
        w(i);
        I(str);
    }

    public void K(m51 m51Var, k51 k51Var) {
        try {
            e(m51Var.getClass()).invoke(null, m51Var, k51Var);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public void L(m51 m51Var) {
        if (m51Var == null) {
            I(null);
            return;
        }
        N(m51Var);
        k51 b = b();
        K(m51Var, b);
        b.a();
    }

    public void M(m51 m51Var, int i) {
        w(i);
        L(m51Var);
    }

    public final void N(m51 m51Var) {
        try {
            I(c(m51Var.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(m51Var.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    public abstract void a();

    public abstract k51 b();

    public final Class c(Class cls) {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method d(String str) {
        Method method = (Method) this.a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, k51.class.getClassLoader()).getDeclaredMethod("read", k51.class);
            this.a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method e(Class cls) {
        Method method = (Method) this.b.get(cls.getName());
        if (method == null) {
            Class c = c(cls);
            System.currentTimeMillis();
            Method declaredMethod = c.getDeclaredMethod("write", cls, k51.class);
            this.b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z, int i) {
        return !m(i) ? z : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i) {
        return !m(i) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i) {
        return !m(i) ? charSequence : k();
    }

    public abstract boolean m(int i);

    public m51 n(String str, k51 k51Var) {
        try {
            return (m51) d(str).invoke(null, k51Var);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract int o();

    public int p(int i, int i2) {
        return !m(i2) ? i : o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i) {
        return !m(i) ? parcelable : q();
    }

    public abstract String s();

    public String t(String str, int i) {
        return !m(i) ? str : s();
    }

    public m51 u() {
        String s = s();
        if (s == null) {
            return null;
        }
        return n(s, b());
    }

    public m51 v(m51 m51Var, int i) {
        return !m(i) ? m51Var : u();
    }

    public abstract void w(int i);

    public void x(boolean z, boolean z2) {
    }

    public abstract void y(boolean z);

    public void z(boolean z, int i) {
        w(i);
        y(z);
    }
}
