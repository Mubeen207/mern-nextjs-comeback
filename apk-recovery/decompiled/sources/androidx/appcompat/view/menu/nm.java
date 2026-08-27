package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class nm implements gl0 {
    public static final Object c = new Object();
    public volatile gl0 a;
    public volatile Object b = c;

    public nm(gl0 gl0Var) {
        this.a = gl0Var;
    }

    public static gl0 a(gl0 gl0Var) {
        oj0.b(gl0Var);
        return gl0Var instanceof nm ? gl0Var : new nm(gl0Var);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // androidx.appcompat.view.menu.gl0
    public Object get() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.a.get();
                        this.b = b(this.b, obj);
                        this.a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
