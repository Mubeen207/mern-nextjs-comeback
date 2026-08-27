package androidx.appcompat.view.menu;

import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class jy0 {

    /* loaded from: classes.dex */
    public static class a implements hy0, Serializable {
        public final hy0 m;
        public volatile transient boolean n;
        public transient Object o;

        public a(hy0 hy0Var) {
            this.m = (hy0) qj0.i(hy0Var);
        }

        @Override // androidx.appcompat.view.menu.hy0
        public Object get() {
            if (!this.n) {
                synchronized (this) {
                    try {
                        if (!this.n) {
                            Object obj = this.m.get();
                            this.o = obj;
                            this.n = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return tf0.a(this.o);
        }

        public String toString() {
            Object obj;
            if (this.n) {
                String valueOf = String.valueOf(this.o);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            } else {
                obj = this.m;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements hy0 {
        public volatile hy0 m;
        public volatile boolean n;
        public Object o;

        public b(hy0 hy0Var) {
            this.m = (hy0) qj0.i(hy0Var);
        }

        @Override // androidx.appcompat.view.menu.hy0
        public Object get() {
            if (!this.n) {
                synchronized (this) {
                    try {
                        if (!this.n) {
                            hy0 hy0Var = this.m;
                            Objects.requireNonNull(hy0Var);
                            Object obj = hy0Var.get();
                            this.o = obj;
                            this.n = true;
                            this.m = null;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return tf0.a(this.o);
        }

        public String toString() {
            Object obj = this.m;
            if (obj == null) {
                String valueOf = String.valueOf(this.o);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class c implements hy0, Serializable {
        public final Object m;

        public c(Object obj) {
            this.m = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return ag0.a(this.m, ((c) obj).m);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.hy0
        public Object get() {
            return this.m;
        }

        public int hashCode() {
            return ag0.b(this.m);
        }

        public String toString() {
            String valueOf = String.valueOf(this.m);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static hy0 a(hy0 hy0Var) {
        return ((hy0Var instanceof b) || (hy0Var instanceof a)) ? hy0Var : hy0Var instanceof Serializable ? new a(hy0Var) : new b(hy0Var);
    }

    public static hy0 b(Object obj) {
        return new c(obj);
    }
}
