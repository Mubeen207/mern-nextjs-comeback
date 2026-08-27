package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class w8 {
    public static final db a = new db(-1, null, null, 0);
    public static final int b;
    public static final int c;
    public static final py0 d;
    public static final py0 e;
    public static final py0 f;
    public static final py0 g;
    public static final py0 h;
    public static final py0 i;
    public static final py0 j;
    public static final py0 k;
    public static final py0 l;
    public static final py0 m;
    public static final py0 n;
    public static final py0 o;
    public static final py0 p;
    public static final py0 q;
    public static final py0 r;
    public static final py0 s;

    /* loaded from: classes.dex */
    public /* synthetic */ class a extends kx implements yw {
        public static final a v = new a();

        public a() {
            super(2, w8.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // androidx.appcompat.view.menu.yw
        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            return k(((Number) obj).longValue(), (db) obj2);
        }

        public final db k(long j, db dbVar) {
            return w8.x(j, dbVar);
        }
    }

    static {
        int e2;
        int e3;
        e2 = yy0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        b = e2;
        e3 = yy0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        c = e3;
        d = new py0("BUFFERED");
        e = new py0("SHOULD_BUFFER");
        f = new py0("S_RESUMING_BY_RCV");
        g = new py0("RESUMING_BY_EB");
        h = new py0("POISONED");
        i = new py0("DONE_RCV");
        j = new py0("INTERRUPTED_SEND");
        k = new py0("INTERRUPTED_RCV");
        l = new py0("CHANNEL_CLOSED");
        m = new py0("SUSPEND");
        n = new py0("SUSPEND_NO_WAITER");
        o = new py0("FAILED");
        p = new py0("NO_RECEIVE_RESULT");
        q = new py0("CLOSE_HANDLER_CLOSED");
        r = new py0("CLOSE_HANDLER_INVOKED");
        s = new py0("NO_CLOSE_CAUSE");
    }

    public static final long A(int i2) {
        if (i2 != 0) {
            if (i2 != Integer.MAX_VALUE) {
                return i2;
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public static final boolean B(x9 x9Var, Object obj, kw kwVar) {
        Object f2 = x9Var.f(obj, null, kwVar);
        if (f2 != null) {
            x9Var.D(f2);
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean C(x9 x9Var, Object obj, kw kwVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            kwVar = null;
        }
        return B(x9Var, obj, kwVar);
    }

    public static final long v(long j2, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j2;
    }

    public static final long w(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final db x(long j2, db dbVar) {
        return new db(j2, dbVar, dbVar.u(), 0);
    }

    public static final q70 y() {
        return a.v;
    }

    public static final py0 z() {
        return l;
    }
}
