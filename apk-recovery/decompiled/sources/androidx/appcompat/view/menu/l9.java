package androidx.appcompat.view.menu;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class l9 implements m70, Serializable {
    public static final Object s = a.m;
    public transient m70 m;
    public final Object n;
    public final Class o;
    public final String p;
    public final String q;
    public final boolean r;

    /* loaded from: classes.dex */
    public static class a implements Serializable {
        public static final a m = new a();
    }

    public l9(Object obj, Class cls, String str, String str2, boolean z) {
        this.n = obj;
        this.o = cls;
        this.p = str;
        this.q = str2;
        this.r = z;
    }

    public m70 a() {
        m70 m70Var = this.m;
        if (m70Var == null) {
            m70 b = b();
            this.m = b;
            return b;
        }
        return m70Var;
    }

    public abstract m70 b();

    public Object c() {
        return this.n;
    }

    public String f() {
        return this.p;
    }

    public p70 g() {
        Class cls = this.o;
        if (cls == null) {
            return null;
        }
        return this.r ? go0.c(cls) : go0.b(cls);
    }

    public String j() {
        return this.q;
    }
}
