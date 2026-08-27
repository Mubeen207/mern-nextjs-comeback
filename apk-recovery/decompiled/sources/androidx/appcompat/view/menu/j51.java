package androidx.appcompat.view.menu;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class j51 implements Comparable {
    public static final a r = new a(null);
    public static final j51 s = new j51(0, 0, 0, "");
    public static final j51 t = new j51(0, 1, 0, "");
    public static final j51 u;
    public static final j51 v;
    public final int m;
    public final int n;
    public final int o;
    public final String p;
    public final l80 q;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public final j51 a() {
            return j51.t;
        }

        public final j51 b(String str) {
            boolean d;
            String group;
            if (str != null) {
                d = zx0.d(str);
                if (!d) {
                    Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                    if (matcher.matches() && (group = matcher.group(1)) != null) {
                        int parseInt = Integer.parseInt(group);
                        String group2 = matcher.group(2);
                        if (group2 != null) {
                            int parseInt2 = Integer.parseInt(group2);
                            String group3 = matcher.group(3);
                            if (group3 != null) {
                                int parseInt3 = Integer.parseInt(group3);
                                String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                                c60.d(group4, "description");
                                return new j51(parseInt, parseInt2, parseInt3, group4, null);
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j80 implements iw {
        public b() {
            super(0);
        }

        @Override // androidx.appcompat.view.menu.iw
        /* renamed from: a */
        public final BigInteger d() {
            return BigInteger.valueOf(j51.this.h()).shiftLeft(32).or(BigInteger.valueOf(j51.this.i())).shiftLeft(32).or(BigInteger.valueOf(j51.this.j()));
        }
    }

    static {
        j51 j51Var = new j51(1, 0, 0, "");
        u = j51Var;
        v = j51Var;
    }

    public /* synthetic */ j51(int i, int i2, int i3, String str, lj ljVar) {
        this(i, i2, i3, str);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(j51 j51Var) {
        c60.e(j51Var, "other");
        return g().compareTo(j51Var.g());
    }

    public boolean equals(Object obj) {
        if (obj instanceof j51) {
            j51 j51Var = (j51) obj;
            return this.m == j51Var.m && this.n == j51Var.n && this.o == j51Var.o;
        }
        return false;
    }

    public final BigInteger g() {
        Object value = this.q.getValue();
        c60.d(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public final int h() {
        return this.m;
    }

    public int hashCode() {
        return ((((527 + this.m) * 31) + this.n) * 31) + this.o;
    }

    public final int i() {
        return this.n;
    }

    public final int j() {
        return this.o;
    }

    public String toString() {
        boolean d;
        String str;
        d = zx0.d(this.p);
        if (!d) {
            str = '-' + this.p;
        } else {
            str = "";
        }
        return this.m + '.' + this.n + '.' + this.o + str;
    }

    public j51(int i, int i2, int i3, String str) {
        l80 a2;
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = str;
        a2 = p80.a(new b());
        this.q = a2;
    }
}
