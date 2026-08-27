package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ja0 {
    public static final ja0 c = new a().a();
    public final long a;
    public final b b;

    /* loaded from: classes.dex */
    public static final class a {
        public long a = 0;
        public b b = b.REASON_UNKNOWN;

        public ja0 a() {
            return new ja0(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b implements zk0 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        public final int m;

        b(int i) {
            this.m = i;
        }

        @Override // androidx.appcompat.view.menu.zk0
        public int c() {
            return this.m;
        }
    }

    public ja0(long j, b bVar) {
        this.a = j;
        this.b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.a;
    }

    public b b() {
        return this.b;
    }
}
