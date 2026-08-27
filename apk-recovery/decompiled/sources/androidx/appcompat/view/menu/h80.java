package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class h80 implements Comparable {
    public static final a q = new a(null);
    public static final h80 r = i80.a();
    public final int m;
    public final int n;
    public final int o;
    public final int p;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }
    }

    public h80(int i, int i2, int i3) {
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = e(i, i2, i3);
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(h80 h80Var) {
        c60.e(h80Var, "other");
        return this.p - h80Var.p;
    }

    public final int e(int i, int i2, int i3) {
        if (new y50(0, 255).i(i) && new y50(0, 255).i(i2) && new y50(0, 255).i(i3)) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h80 h80Var = obj instanceof h80 ? (h80) obj : null;
        return h80Var != null && this.p == h80Var.p;
    }

    public int hashCode() {
        return this.p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append('.');
        sb.append(this.n);
        sb.append('.');
        sb.append(this.o);
        return sb.toString();
    }
}
