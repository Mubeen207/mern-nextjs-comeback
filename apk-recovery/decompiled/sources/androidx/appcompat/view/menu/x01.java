package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class x01 {
    public static final x01 c = new a().a();
    public final long a;
    public final long b;

    /* loaded from: classes.dex */
    public static final class a {
        public long a = 0;
        public long b = 0;

        public x01 a() {
            return new x01(this.a, this.b);
        }

        public a b(long j) {
            this.b = j;
            return this;
        }

        public a c(long j) {
            this.a = j;
            return this;
        }
    }

    public x01(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }
}
