package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class v8 implements sa {
    public static final AtomicLongFieldUpdater p = AtomicLongFieldUpdater.newUpdater(v8.class, "sendersAndCloseStatus");
    public static final AtomicLongFieldUpdater q = AtomicLongFieldUpdater.newUpdater(v8.class, "receivers");
    public static final AtomicLongFieldUpdater r = AtomicLongFieldUpdater.newUpdater(v8.class, "bufferEnd");
    public static final AtomicLongFieldUpdater s = AtomicLongFieldUpdater.newUpdater(v8.class, "completedExpandBuffersAndPauseFlag");
    public static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(v8.class, Object.class, "sendSegment");
    public static final AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(v8.class, Object.class, "receiveSegment");
    public static final AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(v8.class, Object.class, "bufferEndSegment");
    public static final AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(v8.class, Object.class, "_closeCause");
    public static final AtomicReferenceFieldUpdater x = AtomicReferenceFieldUpdater.newUpdater(v8.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    public final int m;
    public final kw n;
    public final ax o;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* loaded from: classes.dex */
    public final class a implements za, p71 {
        public Object m;
        public y9 n;

        public a() {
            py0 py0Var;
            py0Var = w8.p;
            this.m = py0Var;
        }

        @Override // androidx.appcompat.view.menu.p71
        public void a(ms0 ms0Var, int i) {
            y9 y9Var = this.n;
            if (y9Var != null) {
                y9Var.a(ms0Var, i);
            }
        }

        @Override // androidx.appcompat.view.menu.za
        public Object b(xg xgVar) {
            db dbVar;
            py0 py0Var;
            py0 py0Var2;
            py0 py0Var3;
            v8 v8Var = v8.this;
            db dbVar2 = (db) v8.u.get(v8Var);
            while (!v8Var.S()) {
                long andIncrement = v8.q.getAndIncrement(v8Var);
                int i = w8.b;
                long j = andIncrement / i;
                int i2 = (int) (andIncrement % i);
                if (dbVar2.o != j) {
                    db E = v8Var.E(j, dbVar2);
                    if (E == null) {
                        continue;
                    } else {
                        dbVar = E;
                    }
                } else {
                    dbVar = dbVar2;
                }
                Object u0 = v8Var.u0(dbVar, i2, andIncrement, null);
                py0Var = w8.m;
                if (u0 == py0Var) {
                    throw new IllegalStateException("unreachable".toString());
                }
                py0Var2 = w8.o;
                if (u0 != py0Var2) {
                    py0Var3 = w8.n;
                    if (u0 == py0Var3) {
                        return f(dbVar, i2, andIncrement, xgVar);
                    }
                    dbVar.b();
                    this.m = u0;
                    return r8.a(true);
                }
                if (andIncrement < v8Var.L()) {
                    dbVar.b();
                }
                dbVar2 = dbVar;
            }
            return r8.a(g());
        }

        public final Object f(db dbVar, int i, long j, xg xgVar) {
            xg b;
            py0 py0Var;
            py0 py0Var2;
            Boolean a;
            py0 py0Var3;
            py0 py0Var4;
            py0 py0Var5;
            Object c;
            v8 v8Var = v8.this;
            b = e60.b(xgVar);
            y9 a2 = aa.a(b);
            try {
                this.n = a2;
                Object u0 = v8Var.u0(dbVar, i, j, this);
                py0Var = w8.m;
                if (u0 == py0Var) {
                    v8Var.h0(this, dbVar, i);
                } else {
                    py0Var2 = w8.o;
                    kw kwVar = null;
                    if (u0 == py0Var2) {
                        if (j < v8Var.L()) {
                            dbVar.b();
                        }
                        db dbVar2 = (db) v8.u.get(v8Var);
                        while (true) {
                            if (v8Var.S()) {
                                h();
                                break;
                            }
                            long andIncrement = v8.q.getAndIncrement(v8Var);
                            int i2 = w8.b;
                            long j2 = andIncrement / i2;
                            int i3 = (int) (andIncrement % i2);
                            if (dbVar2.o != j2) {
                                db E = v8Var.E(j2, dbVar2);
                                if (E != null) {
                                    dbVar2 = E;
                                }
                            }
                            Object u02 = v8Var.u0(dbVar2, i3, andIncrement, this);
                            py0Var3 = w8.m;
                            if (u02 == py0Var3) {
                                v8Var.h0(this, dbVar2, i3);
                                break;
                            }
                            py0Var4 = w8.o;
                            if (u02 != py0Var4) {
                                py0Var5 = w8.n;
                                if (u02 == py0Var5) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                dbVar2.b();
                                this.m = u02;
                                this.n = null;
                                a = r8.a(true);
                                kw kwVar2 = v8Var.n;
                                if (kwVar2 != null) {
                                    kwVar = qg0.a(kwVar2, u02, a2.b());
                                }
                            } else if (andIncrement < v8Var.L()) {
                                dbVar2.b();
                            }
                        }
                    } else {
                        dbVar.b();
                        this.m = u0;
                        this.n = null;
                        a = r8.a(true);
                        kw kwVar3 = v8Var.n;
                        if (kwVar3 != null) {
                            kwVar = qg0.a(kwVar3, u0, a2.b());
                        }
                    }
                    a2.K(a, kwVar);
                }
                Object w = a2.w();
                c = f60.c();
                if (w == c) {
                    gj.c(xgVar);
                }
                return w;
            } catch (Throwable th) {
                a2.I();
                throw th;
            }
        }

        public final boolean g() {
            this.m = w8.z();
            Throwable H = v8.this.H();
            if (H == null) {
                return false;
            }
            throw pw0.a(H);
        }

        public final void h() {
            y9 y9Var = this.n;
            c60.b(y9Var);
            this.n = null;
            this.m = w8.z();
            Throwable H = v8.this.H();
            if (H == null) {
                qp0.a aVar = qp0.m;
                y9Var.n(qp0.a(Boolean.FALSE));
                return;
            }
            qp0.a aVar2 = qp0.m;
            y9Var.n(qp0.a(rp0.a(H)));
        }

        public final boolean i(Object obj) {
            boolean B;
            y9 y9Var = this.n;
            c60.b(y9Var);
            this.n = null;
            this.m = obj;
            Boolean bool = Boolean.TRUE;
            kw kwVar = v8.this.n;
            B = w8.B(y9Var, bool, kwVar != null ? qg0.a(kwVar, obj, y9Var.b()) : null);
            return B;
        }

        public final void j() {
            y9 y9Var = this.n;
            c60.b(y9Var);
            this.n = null;
            this.m = w8.z();
            Throwable H = v8.this.H();
            if (H == null) {
                qp0.a aVar = qp0.m;
                y9Var.n(qp0.a(Boolean.FALSE));
                return;
            }
            qp0.a aVar2 = qp0.m;
            y9Var.n(qp0.a(rp0.a(H)));
        }

        @Override // androidx.appcompat.view.menu.za
        public Object next() {
            py0 py0Var;
            py0 py0Var2;
            Object obj = this.m;
            py0Var = w8.p;
            if (obj != py0Var) {
                py0Var2 = w8.p;
                this.m = py0Var2;
                if (obj != w8.z()) {
                    return obj;
                }
                throw pw0.a(v8.this.I());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j80 implements ax {
        public b() {
            super(3);
        }
    }

    public v8(int i, kw kwVar) {
        long A;
        py0 py0Var;
        this.m = i;
        this.n = kwVar;
        if (i < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
        }
        A = w8.A(i);
        this.bufferEnd = A;
        this.completedExpandBuffersAndPauseFlag = G();
        db dbVar = new db(0L, null, this, 3);
        this.sendSegment = dbVar;
        this.receiveSegment = dbVar;
        if (W()) {
            dbVar = w8.a;
            c60.c(dbVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = dbVar;
        this.o = kwVar != null ? new b() : null;
        py0Var = w8.s;
        this._closeCause = py0Var;
    }

    public static /* synthetic */ void O(v8 v8Var, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        v8Var.N(j);
    }

    public static /* synthetic */ Object n0(v8 v8Var, Object obj, xg xgVar) {
        db dbVar;
        Object c;
        Object c2;
        Object c3;
        Object c4;
        db dbVar2 = (db) t.get(v8Var);
        while (true) {
            long andIncrement = p.getAndIncrement(v8Var);
            long j = andIncrement & 1152921504606846975L;
            boolean U = v8Var.U(andIncrement);
            int i = w8.b;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (dbVar2.o != j2) {
                db F = v8Var.F(j2, dbVar2);
                if (F != null) {
                    dbVar = F;
                } else if (U) {
                    Object d0 = v8Var.d0(obj, xgVar);
                    c4 = f60.c();
                    if (d0 == c4) {
                        return d0;
                    }
                }
            } else {
                dbVar = dbVar2;
            }
            int w0 = v8Var.w0(dbVar, i2, obj, j, null, U);
            if (w0 == 0) {
                dbVar.b();
                break;
            } else if (w0 == 1) {
                break;
            } else if (w0 != 2) {
                if (w0 == 3) {
                    Object o0 = v8Var.o0(dbVar, i2, obj, j, xgVar);
                    c2 = f60.c();
                    if (o0 == c2) {
                        return o0;
                    }
                } else if (w0 != 4) {
                    if (w0 == 5) {
                        dbVar.b();
                    }
                    dbVar2 = dbVar;
                } else {
                    if (j < v8Var.J()) {
                        dbVar.b();
                    }
                    Object d02 = v8Var.d0(obj, xgVar);
                    c3 = f60.c();
                    if (d02 == c3) {
                        return d02;
                    }
                }
            } else if (U) {
                dbVar.p();
                Object d03 = v8Var.d0(obj, xgVar);
                c = f60.c();
                if (d03 == c) {
                    return d03;
                }
            }
        }
        return u31.a;
    }

    @Override // androidx.appcompat.view.menu.os0
    public boolean A() {
        return U(p.get(this));
    }

    public final void A0(long j) {
        int i;
        long j2;
        long v2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long v3;
        long j3;
        long v4;
        if (W()) {
            return;
        }
        do {
        } while (G() <= j);
        i = w8.c;
        for (int i2 = 0; i2 < i; i2++) {
            long G = G();
            if (G == (4611686018427387903L & s.get(this)) && G == G()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = s;
        do {
            j2 = atomicLongFieldUpdater2.get(this);
            v2 = w8.v(j2 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, v2));
        while (true) {
            long G2 = G();
            atomicLongFieldUpdater = s;
            long j4 = atomicLongFieldUpdater.get(this);
            long j5 = j4 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j4) != 0;
            if (G2 == j5 && G2 == G()) {
                break;
            } else if (!z) {
                v3 = w8.v(j5, true);
                atomicLongFieldUpdater.compareAndSet(this, j4, v3);
            }
        }
        do {
            j3 = atomicLongFieldUpdater.get(this);
            v4 = w8.v(j3 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, v4));
    }

    public final void B(long j) {
        py0 py0Var;
        n31 d;
        db dbVar = (db) u.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = q;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.m + j2, G())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                int i = w8.b;
                long j3 = j2 / i;
                int i2 = (int) (j2 % i);
                if (dbVar.o != j3) {
                    db E = E(j3, dbVar);
                    if (E == null) {
                        continue;
                    } else {
                        dbVar = E;
                    }
                }
                Object u0 = u0(dbVar, i2, j2, null);
                py0Var = w8.o;
                if (u0 != py0Var) {
                    dbVar.b();
                    kw kwVar = this.n;
                    if (kwVar != null && (d = qg0.d(kwVar, u0, null, 2, null)) != null) {
                        throw d;
                    }
                } else if (j2 < L()) {
                    dbVar.b();
                }
            }
        }
    }

    public final void C() {
        if (W()) {
            return;
        }
        db dbVar = (db) v.get(this);
        while (true) {
            long andIncrement = r.getAndIncrement(this);
            int i = w8.b;
            long j = andIncrement / i;
            if (L() <= andIncrement) {
                if (dbVar.o < j && dbVar.e() != null) {
                    b0(j, dbVar);
                }
                O(this, 0L, 1, null);
                return;
            }
            if (dbVar.o != j) {
                db D = D(j, dbVar, andIncrement);
                if (D == null) {
                    continue;
                } else {
                    dbVar = D;
                }
            }
            if (s0(dbVar, (int) (andIncrement % i), andIncrement)) {
                O(this, 0L, 1, null);
                return;
            }
            O(this, 0L, 1, null);
        }
    }

    public final db D(long j, db dbVar, long j2) {
        Object c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v;
        yw ywVar = (yw) w8.y();
        loop0: while (true) {
            c = ye.c(dbVar, j, ywVar);
            if (!ns0.c(c)) {
                ms0 b2 = ns0.b(c);
                while (true) {
                    ms0 ms0Var = (ms0) atomicReferenceFieldUpdater.get(this);
                    if (ms0Var.o >= b2.o) {
                        break loop0;
                    } else if (!b2.q()) {
                        break;
                    } else if (q.a(atomicReferenceFieldUpdater, this, ms0Var, b2)) {
                        if (ms0Var.m()) {
                            ms0Var.k();
                        }
                    } else if (b2.m()) {
                        b2.k();
                    }
                }
            } else {
                break;
            }
        }
        if (ns0.c(c)) {
            z();
            b0(j, dbVar);
            O(this, 0L, 1, null);
            return null;
        }
        db dbVar2 = (db) ns0.b(c);
        long j3 = dbVar2.o;
        if (j3 > j) {
            int i = w8.b;
            if (r.compareAndSet(this, j2 + 1, i * j3)) {
                N((dbVar2.o * i) - j2);
                return null;
            }
            O(this, 0L, 1, null);
            return null;
        }
        return dbVar2;
    }

    public final db E(long j, db dbVar) {
        Object c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
        yw ywVar = (yw) w8.y();
        loop0: while (true) {
            c = ye.c(dbVar, j, ywVar);
            if (!ns0.c(c)) {
                ms0 b2 = ns0.b(c);
                while (true) {
                    ms0 ms0Var = (ms0) atomicReferenceFieldUpdater.get(this);
                    if (ms0Var.o >= b2.o) {
                        break loop0;
                    } else if (!b2.q()) {
                        break;
                    } else if (q.a(atomicReferenceFieldUpdater, this, ms0Var, b2)) {
                        if (ms0Var.m()) {
                            ms0Var.k();
                        }
                    } else if (b2.m()) {
                        b2.k();
                    }
                }
            } else {
                break;
            }
        }
        if (ns0.c(c)) {
            z();
            if (dbVar.o * w8.b < L()) {
                dbVar.b();
                return null;
            }
            return null;
        }
        db dbVar2 = (db) ns0.b(c);
        if (!W() && j <= G() / w8.b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = v;
            while (true) {
                ms0 ms0Var2 = (ms0) atomicReferenceFieldUpdater2.get(this);
                if (ms0Var2.o >= dbVar2.o || !dbVar2.q()) {
                    break;
                } else if (q.a(atomicReferenceFieldUpdater2, this, ms0Var2, dbVar2)) {
                    if (ms0Var2.m()) {
                        ms0Var2.k();
                    }
                } else if (dbVar2.m()) {
                    dbVar2.k();
                }
            }
        }
        long j2 = dbVar2.o;
        if (j2 > j) {
            int i = w8.b;
            y0(j2 * i);
            if (dbVar2.o * i < L()) {
                dbVar2.b();
                return null;
            }
            return null;
        }
        return dbVar2;
    }

    public final db F(long j, db dbVar) {
        Object c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
        yw ywVar = (yw) w8.y();
        loop0: while (true) {
            c = ye.c(dbVar, j, ywVar);
            if (!ns0.c(c)) {
                ms0 b2 = ns0.b(c);
                while (true) {
                    ms0 ms0Var = (ms0) atomicReferenceFieldUpdater.get(this);
                    if (ms0Var.o >= b2.o) {
                        break loop0;
                    } else if (!b2.q()) {
                        break;
                    } else if (q.a(atomicReferenceFieldUpdater, this, ms0Var, b2)) {
                        if (ms0Var.m()) {
                            ms0Var.k();
                        }
                    } else if (b2.m()) {
                        b2.k();
                    }
                }
            } else {
                break;
            }
        }
        if (ns0.c(c)) {
            z();
            if (dbVar.o * w8.b < J()) {
                dbVar.b();
                return null;
            }
            return null;
        }
        db dbVar2 = (db) ns0.b(c);
        long j2 = dbVar2.o;
        if (j2 > j) {
            int i = w8.b;
            z0(j2 * i);
            if (dbVar2.o * i < J()) {
                dbVar2.b();
                return null;
            }
            return null;
        }
        return dbVar2;
    }

    public final long G() {
        return r.get(this);
    }

    public final Throwable H() {
        return (Throwable) w.get(this);
    }

    public final Throwable I() {
        Throwable H = H();
        return H == null ? new hc("Channel was closed") : H;
    }

    public final long J() {
        return q.get(this);
    }

    public final Throwable K() {
        Throwable H = H();
        return H == null ? new ic("Channel was closed") : H;
    }

    public final long L() {
        return p.get(this) & 1152921504606846975L;
    }

    public final boolean M() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
            db dbVar = (db) atomicReferenceFieldUpdater.get(this);
            long J = J();
            if (L() <= J) {
                return false;
            }
            int i = w8.b;
            long j = J / i;
            if (dbVar.o == j || (dbVar = E(j, dbVar)) != null) {
                dbVar.b();
                if (Q(dbVar, (int) (J % i), J)) {
                    return true;
                }
                q.compareAndSet(this, J, J + 1);
            } else if (((db) atomicReferenceFieldUpdater.get(this)).o < j) {
                return false;
            }
        }
    }

    public final void N(long j) {
        if ((s.addAndGet(this, j) & 4611686018427387904L) != 0) {
            do {
            } while ((s.get(this) & 4611686018427387904L) != 0);
        }
    }

    public final void P() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!q.a(atomicReferenceFieldUpdater, this, obj, obj == null ? w8.q : w8.r));
        if (obj == null) {
            return;
        }
        kw kwVar = (kw) t21.a(obj, 1);
        ((kw) obj).i(H());
    }

    public final boolean Q(db dbVar, int i, long j) {
        Object w2;
        py0 py0Var;
        py0 py0Var2;
        py0 py0Var3;
        py0 py0Var4;
        py0 py0Var5;
        py0 py0Var6;
        py0 py0Var7;
        do {
            w2 = dbVar.w(i);
            if (w2 != null) {
                py0Var2 = w8.e;
                if (w2 != py0Var2) {
                    if (w2 == w8.d) {
                        return true;
                    }
                    py0Var3 = w8.j;
                    if (w2 == py0Var3 || w2 == w8.z()) {
                        return false;
                    }
                    py0Var4 = w8.i;
                    if (w2 == py0Var4) {
                        return false;
                    }
                    py0Var5 = w8.h;
                    if (w2 == py0Var5) {
                        return false;
                    }
                    py0Var6 = w8.g;
                    if (w2 == py0Var6) {
                        return true;
                    }
                    py0Var7 = w8.f;
                    return w2 != py0Var7 && j == J();
                }
            }
            py0Var = w8.h;
        } while (!dbVar.r(i, w2, py0Var));
        C();
        return false;
    }

    public final boolean R(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            x(j & 1152921504606846975L);
            if (z && M()) {
                return false;
            }
        } else if (i != 3) {
            throw new IllegalStateException(("unexpected close status: " + i).toString());
        } else {
            w(j & 1152921504606846975L);
        }
        return true;
    }

    public boolean S() {
        return T(p.get(this));
    }

    public final boolean T(long j) {
        return R(j, true);
    }

    public final boolean U(long j) {
        return R(j, false);
    }

    public boolean V() {
        return false;
    }

    public final boolean W() {
        long G = G();
        return G == 0 || G == Long.MAX_VALUE;
    }

    public final long X(db dbVar) {
        py0 py0Var;
        do {
            int i = w8.b;
            while (true) {
                i--;
                if (-1 < i) {
                    long j = (dbVar.o * w8.b) + i;
                    if (j >= J()) {
                        while (true) {
                            Object w2 = dbVar.w(i);
                            if (w2 != null) {
                                py0Var = w8.e;
                                if (w2 != py0Var) {
                                    if (w2 == w8.d) {
                                        return j;
                                    }
                                }
                            }
                            if (dbVar.r(i, w2, w8.z())) {
                                dbVar.p();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                } else {
                    dbVar = (db) dbVar.g();
                }
            }
        } while (dbVar != null);
        return -1L;
    }

    public final void Y() {
        long j;
        long w2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = p;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
            w2 = w8.w(1152921504606846975L & j, 1);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, w2));
    }

    public final void Z() {
        long j;
        long w2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = p;
        do {
            j = atomicLongFieldUpdater.get(this);
            w2 = w8.w(1152921504606846975L & j, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, w2));
    }

    public final void a0() {
        long j;
        long w2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = p;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                w2 = w8.w(j & 1152921504606846975L, 2);
            } else if (i != 1) {
                return;
            } else {
                w2 = w8.w(j & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, w2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(long r5, androidx.appcompat.view.menu.db r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.o
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            androidx.appcompat.view.menu.ze r0 = r7.e()
            androidx.appcompat.view.menu.db r0 = (androidx.appcompat.view.menu.db) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.h()
            if (r5 == 0) goto L22
            androidx.appcompat.view.menu.ze r5 = r7.e()
            androidx.appcompat.view.menu.db r5 = (androidx.appcompat.view.menu.db) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = androidx.appcompat.view.menu.v8.v
        L24:
            java.lang.Object r6 = r5.get(r4)
            androidx.appcompat.view.menu.ms0 r6 = (androidx.appcompat.view.menu.ms0) r6
            long r0 = r6.o
            long r2 = r7.o
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.q()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = androidx.appcompat.view.menu.q.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.m()
            if (r5 == 0) goto L49
            r6.k()
        L49:
            return
        L4a:
            boolean r6 = r7.m()
            if (r6 == 0) goto L24
            r7.k()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.v8.b0(long, androidx.appcompat.view.menu.db):void");
    }

    public void c0() {
    }

    public final Object d0(Object obj, xg xgVar) {
        xg b2;
        Object c;
        Object c2;
        n31 d;
        b2 = e60.b(xgVar);
        y9 y9Var = new y9(b2, 1);
        y9Var.z();
        kw kwVar = this.n;
        if (kwVar == null || (d = qg0.d(kwVar, obj, null, 2, null)) == null) {
            Throwable K = K();
            qp0.a aVar = qp0.m;
            y9Var.n(qp0.a(rp0.a(K)));
        } else {
            pp.a(d, K());
            qp0.a aVar2 = qp0.m;
            y9Var.n(qp0.a(rp0.a(d)));
        }
        Object w2 = y9Var.w();
        c = f60.c();
        if (w2 == c) {
            gj.c(xgVar);
        }
        c2 = f60.c();
        return w2 == c2 ? w2 : u31.a;
    }

    @Override // androidx.appcompat.view.menu.yn0
    public final void e(CancellationException cancellationException) {
        r(cancellationException);
    }

    public final void e0(Object obj, x9 x9Var) {
        kw kwVar = this.n;
        if (kwVar != null) {
            qg0.b(kwVar, obj, x9Var.b());
        }
        Throwable K = K();
        qp0.a aVar = qp0.m;
        x9Var.n(qp0.a(rp0.a(K)));
    }

    public void f0() {
    }

    public void g0() {
    }

    public final void h0(p71 p71Var, db dbVar, int i) {
        g0();
        p71Var.a(dbVar, i);
    }

    public final void i0(p71 p71Var, db dbVar, int i) {
        p71Var.a(dbVar, i + w8.b);
    }

    @Override // androidx.appcompat.view.menu.yn0
    public za iterator() {
        return new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
        r12 = (androidx.appcompat.view.menu.db) r12.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(androidx.appcompat.view.menu.db r12) {
        /*
            r11 = this;
            androidx.appcompat.view.menu.kw r0 = r11.n
            r1 = 0
            r2 = 1
            java.lang.Object r3 = androidx.appcompat.view.menu.c50.b(r1, r2, r1)
        L8:
            int r4 = androidx.appcompat.view.menu.w8.b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.o
            int r8 = androidx.appcompat.view.menu.w8.b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.w(r4)
            androidx.appcompat.view.menu.py0 r9 = androidx.appcompat.view.menu.w8.f()
            if (r8 == r9) goto Lbb
            androidx.appcompat.view.menu.py0 r9 = androidx.appcompat.view.menu.w8.d
            if (r8 != r9) goto L48
            long r9 = r11.J()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            androidx.appcompat.view.menu.py0 r9 = androidx.appcompat.view.menu.w8.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.v(r4)
            androidx.appcompat.view.menu.n31 r1 = androidx.appcompat.view.menu.qg0.c(r0, r5, r1)
        L40:
            r12.s(r4)
            r12.p()
            goto Laf
        L48:
            androidx.appcompat.view.menu.py0 r9 = androidx.appcompat.view.menu.w8.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof androidx.appcompat.view.menu.p71
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof androidx.appcompat.view.menu.q71
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            androidx.appcompat.view.menu.py0 r9 = androidx.appcompat.view.menu.w8.p()
            if (r8 == r9) goto Lbb
            androidx.appcompat.view.menu.py0 r9 = androidx.appcompat.view.menu.w8.q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            androidx.appcompat.view.menu.py0 r9 = androidx.appcompat.view.menu.w8.p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.J()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof androidx.appcompat.view.menu.q71
            if (r9 == 0) goto L80
            r9 = r8
            androidx.appcompat.view.menu.q71 r9 = (androidx.appcompat.view.menu.q71) r9
            androidx.appcompat.view.menu.p71 r9 = r9.a
            goto L83
        L80:
            r9 = r8
            androidx.appcompat.view.menu.p71 r9 = (androidx.appcompat.view.menu.p71) r9
        L83:
            androidx.appcompat.view.menu.py0 r10 = androidx.appcompat.view.menu.w8.z()
            boolean r8 = r12.r(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.v(r4)
            androidx.appcompat.view.menu.n31 r1 = androidx.appcompat.view.menu.qg0.c(r0, r5, r1)
        L97:
            java.lang.Object r3 = androidx.appcompat.view.menu.c50.c(r3, r9)
            r12.s(r4)
            r12.p()
            goto Laf
        La2:
            androidx.appcompat.view.menu.py0 r9 = androidx.appcompat.view.menu.w8.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.p()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            androidx.appcompat.view.menu.ze r12 = r12.g()
            androidx.appcompat.view.menu.db r12 = (androidx.appcompat.view.menu.db) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            androidx.appcompat.view.menu.p71 r3 = (androidx.appcompat.view.menu.p71) r3
            r11.l0(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            androidx.appcompat.view.menu.c60.c(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            androidx.appcompat.view.menu.p71 r0 = (androidx.appcompat.view.menu.p71) r0
            r11.l0(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.v8.j0(androidx.appcompat.view.menu.db):void");
    }

    @Override // androidx.appcompat.view.menu.os0
    public boolean k(Throwable th) {
        return u(th, false);
    }

    public final void k0(p71 p71Var) {
        m0(p71Var, true);
    }

    public final void l0(p71 p71Var) {
        m0(p71Var, false);
    }

    public final void m0(p71 p71Var, boolean z) {
        if (p71Var instanceof x9) {
            xg xgVar = (xg) p71Var;
            qp0.a aVar = qp0.m;
            xgVar.n(qp0.a(rp0.a(z ? I() : K())));
        } else if (p71Var instanceof a) {
            ((a) p71Var).j();
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + p71Var).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(androidx.appcompat.view.menu.db r21, int r22, java.lang.Object r23, long r24, androidx.appcompat.view.menu.xg r26) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.v8.o0(androidx.appcompat.view.menu.db, int, java.lang.Object, long, androidx.appcompat.view.menu.xg):java.lang.Object");
    }

    public final boolean p(long j) {
        return j < G() || j < J() + ((long) this.m);
    }

    public final boolean p0(long j) {
        if (U(j)) {
            return false;
        }
        return !p(j & 1152921504606846975L);
    }

    @Override // androidx.appcompat.view.menu.os0
    public Object q(Object obj, xg xgVar) {
        return n0(this, obj, xgVar);
    }

    public final boolean q0(Object obj, Object obj2) {
        boolean B;
        if (obj instanceof a) {
            c60.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        } else if (!(obj instanceof x9)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        } else {
            c60.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            x9 x9Var = (x9) obj;
            kw kwVar = this.n;
            B = w8.B(x9Var, obj2, kwVar != null ? qg0.a(kwVar, obj2, x9Var.b()) : null);
            return B;
        }
    }

    public boolean r(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return u(th, true);
    }

    public final boolean r0(Object obj, db dbVar, int i) {
        if (obj instanceof x9) {
            c60.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return w8.C((x9) obj, u31.a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final void s(db dbVar, long j) {
        py0 py0Var;
        Object b2 = c50.b(null, 1, null);
        loop0: while (dbVar != null) {
            for (int i = w8.b - 1; -1 < i; i--) {
                if ((dbVar.o * w8.b) + i < j) {
                    break loop0;
                }
                while (true) {
                    Object w2 = dbVar.w(i);
                    if (w2 != null) {
                        py0Var = w8.e;
                        if (w2 != py0Var) {
                            if (w2 instanceof q71) {
                                if (dbVar.r(i, w2, w8.z())) {
                                    b2 = c50.c(b2, ((q71) w2).a);
                                    dbVar.x(i, true);
                                    break;
                                }
                            } else if (!(w2 instanceof p71)) {
                                break;
                            } else if (dbVar.r(i, w2, w8.z())) {
                                b2 = c50.c(b2, w2);
                                dbVar.x(i, true);
                                break;
                            }
                        }
                    }
                    if (dbVar.r(i, w2, w8.z())) {
                        dbVar.p();
                        break;
                    }
                }
            }
            dbVar = (db) dbVar.g();
        }
        if (b2 != null) {
            if (!(b2 instanceof ArrayList)) {
                k0((p71) b2);
                return;
            }
            c60.c(b2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) b2;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                k0((p71) arrayList.get(size));
            }
        }
    }

    public final boolean s0(db dbVar, int i, long j) {
        py0 py0Var;
        py0 py0Var2;
        Object w2 = dbVar.w(i);
        if ((w2 instanceof p71) && j >= q.get(this)) {
            py0Var = w8.g;
            if (dbVar.r(i, w2, py0Var)) {
                if (r0(w2, dbVar, i)) {
                    dbVar.A(i, w8.d);
                    return true;
                }
                py0Var2 = w8.j;
                dbVar.A(i, py0Var2);
                dbVar.x(i, false);
                return false;
            }
        }
        return t0(dbVar, i, j);
    }

    public final db t() {
        db dbVar = v.get(this);
        db dbVar2 = (db) t.get(this);
        if (dbVar2.o > ((db) dbVar).o) {
            dbVar = dbVar2;
        }
        db dbVar3 = (db) u.get(this);
        if (dbVar3.o > ((db) dbVar).o) {
            dbVar = dbVar3;
        }
        return (db) ye.b((ze) dbVar);
    }

    public final boolean t0(db dbVar, int i, long j) {
        py0 py0Var;
        py0 py0Var2;
        py0 py0Var3;
        py0 py0Var4;
        py0 py0Var5;
        py0 py0Var6;
        py0 py0Var7;
        py0 py0Var8;
        while (true) {
            Object w2 = dbVar.w(i);
            if (!(w2 instanceof p71)) {
                py0Var3 = w8.j;
                if (w2 != py0Var3) {
                    if (w2 != null) {
                        if (w2 != w8.d) {
                            py0Var5 = w8.h;
                            if (w2 == py0Var5) {
                                break;
                            }
                            py0Var6 = w8.i;
                            if (w2 == py0Var6) {
                                break;
                            }
                            py0Var7 = w8.k;
                            if (w2 == py0Var7 || w2 == w8.z()) {
                                return true;
                            }
                            py0Var8 = w8.f;
                            if (w2 != py0Var8) {
                                throw new IllegalStateException(("Unexpected cell state: " + w2).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        py0Var4 = w8.e;
                        if (dbVar.r(i, w2, py0Var4)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j >= q.get(this)) {
                py0Var = w8.g;
                if (dbVar.r(i, w2, py0Var)) {
                    if (r0(w2, dbVar, i)) {
                        dbVar.A(i, w8.d);
                        return true;
                    }
                    py0Var2 = w8.j;
                    dbVar.A(i, py0Var2);
                    dbVar.x(i, false);
                    return false;
                }
            } else if (dbVar.r(i, w2, new q71((p71) w2))) {
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ac, code lost:
        r3 = (androidx.appcompat.view.menu.db) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b3, code lost:
        if (r3 != null) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ac A[EDGE_INSN: B:93:0x01ac->B:75:0x01ac ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.v8.toString():java.lang.String");
    }

    public boolean u(Throwable th, boolean z) {
        py0 py0Var;
        if (z) {
            Y();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        py0Var = w8.s;
        boolean a2 = q.a(atomicReferenceFieldUpdater, this, py0Var, th);
        if (z) {
            Z();
        } else {
            a0();
        }
        z();
        c0();
        if (a2) {
            P();
        }
        return a2;
    }

    public final Object u0(db dbVar, int i, long j, Object obj) {
        py0 py0Var;
        py0 py0Var2;
        py0 py0Var3;
        Object w2 = dbVar.w(i);
        if (w2 == null) {
            if (j >= (p.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    py0Var3 = w8.n;
                    return py0Var3;
                } else if (dbVar.r(i, w2, obj)) {
                    C();
                    py0Var2 = w8.m;
                    return py0Var2;
                }
            }
        } else if (w2 == w8.d) {
            py0Var = w8.i;
            if (dbVar.r(i, w2, py0Var)) {
                C();
                return dbVar.y(i);
            }
        }
        return v0(dbVar, i, j, obj);
    }

    @Override // androidx.appcompat.view.menu.os0
    public void v(kw kwVar) {
        py0 py0Var;
        py0 py0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        py0 py0Var3;
        py0 py0Var4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = x;
        if (q.a(atomicReferenceFieldUpdater2, this, null, kwVar)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            py0Var = w8.q;
            if (obj != py0Var) {
                py0Var2 = w8.r;
                if (obj == py0Var2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = x;
            py0Var3 = w8.q;
            py0Var4 = w8.r;
        } while (!q.a(atomicReferenceFieldUpdater, this, py0Var3, py0Var4));
        kwVar.i(H());
    }

    public final Object v0(db dbVar, int i, long j, Object obj) {
        py0 py0Var;
        py0 py0Var2;
        py0 py0Var3;
        py0 py0Var4;
        py0 py0Var5;
        py0 py0Var6;
        py0 py0Var7;
        py0 py0Var8;
        py0 py0Var9;
        py0 py0Var10;
        py0 py0Var11;
        py0 py0Var12;
        py0 py0Var13;
        py0 py0Var14;
        py0 py0Var15;
        py0 py0Var16;
        while (true) {
            Object w2 = dbVar.w(i);
            if (w2 != null) {
                py0Var5 = w8.e;
                if (w2 != py0Var5) {
                    if (w2 == w8.d) {
                        py0Var6 = w8.i;
                        if (dbVar.r(i, w2, py0Var6)) {
                            C();
                            return dbVar.y(i);
                        }
                    } else {
                        py0Var7 = w8.j;
                        if (w2 == py0Var7) {
                            py0Var8 = w8.o;
                            return py0Var8;
                        }
                        py0Var9 = w8.h;
                        if (w2 == py0Var9) {
                            py0Var10 = w8.o;
                            return py0Var10;
                        } else if (w2 == w8.z()) {
                            C();
                            py0Var11 = w8.o;
                            return py0Var11;
                        } else {
                            py0Var12 = w8.g;
                            if (w2 != py0Var12) {
                                py0Var13 = w8.f;
                                if (dbVar.r(i, w2, py0Var13)) {
                                    boolean z = w2 instanceof q71;
                                    if (z) {
                                        w2 = ((q71) w2).a;
                                    }
                                    if (r0(w2, dbVar, i)) {
                                        py0Var16 = w8.i;
                                        dbVar.A(i, py0Var16);
                                        C();
                                        return dbVar.y(i);
                                    }
                                    py0Var14 = w8.j;
                                    dbVar.A(i, py0Var14);
                                    dbVar.x(i, false);
                                    if (z) {
                                        C();
                                    }
                                    py0Var15 = w8.o;
                                    return py0Var15;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            if (j < (p.get(this) & 1152921504606846975L)) {
                py0Var = w8.h;
                if (dbVar.r(i, w2, py0Var)) {
                    C();
                    py0Var2 = w8.o;
                    return py0Var2;
                }
            } else if (obj == null) {
                py0Var3 = w8.n;
                return py0Var3;
            } else if (dbVar.r(i, w2, obj)) {
                C();
                py0Var4 = w8.m;
                return py0Var4;
            }
        }
    }

    public final void w(long j) {
        j0(x(j));
    }

    public final int w0(db dbVar, int i, Object obj, long j, Object obj2, boolean z) {
        py0 py0Var;
        py0 py0Var2;
        py0 py0Var3;
        dbVar.B(i, obj);
        if (z) {
            return x0(dbVar, i, obj, j, obj2, z);
        }
        Object w2 = dbVar.w(i);
        if (w2 == null) {
            if (p(j)) {
                if (dbVar.r(i, null, w8.d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (dbVar.r(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (w2 instanceof p71) {
            dbVar.s(i);
            if (q0(w2, obj)) {
                py0Var3 = w8.i;
                dbVar.A(i, py0Var3);
                f0();
                return 0;
            }
            py0Var = w8.k;
            Object t2 = dbVar.t(i, py0Var);
            py0Var2 = w8.k;
            if (t2 != py0Var2) {
                dbVar.x(i, true);
            }
            return 5;
        }
        return x0(dbVar, i, obj, j, obj2, z);
    }

    public final db x(long j) {
        db t2 = t();
        if (V()) {
            long X = X(t2);
            if (X != -1) {
                B(X);
            }
        }
        s(t2, j);
        return t2;
    }

    public final int x0(db dbVar, int i, Object obj, long j, Object obj2, boolean z) {
        py0 py0Var;
        py0 py0Var2;
        py0 py0Var3;
        py0 py0Var4;
        py0 py0Var5;
        py0 py0Var6;
        py0 py0Var7;
        while (true) {
            Object w2 = dbVar.w(i);
            if (w2 != null) {
                py0Var2 = w8.e;
                if (w2 != py0Var2) {
                    py0Var3 = w8.k;
                    if (w2 == py0Var3) {
                        dbVar.s(i);
                        return 5;
                    }
                    py0Var4 = w8.h;
                    if (w2 == py0Var4) {
                        dbVar.s(i);
                        return 5;
                    } else if (w2 == w8.z()) {
                        dbVar.s(i);
                        z();
                        return 4;
                    } else {
                        dbVar.s(i);
                        if (w2 instanceof q71) {
                            w2 = ((q71) w2).a;
                        }
                        if (q0(w2, obj)) {
                            py0Var7 = w8.i;
                            dbVar.A(i, py0Var7);
                            f0();
                            return 0;
                        }
                        py0Var5 = w8.k;
                        Object t2 = dbVar.t(i, py0Var5);
                        py0Var6 = w8.k;
                        if (t2 != py0Var6) {
                            dbVar.x(i, true);
                        }
                        return 5;
                    }
                } else if (dbVar.r(i, w2, w8.d)) {
                    return 1;
                }
            } else if (!p(j) || z) {
                if (z) {
                    py0Var = w8.j;
                    if (dbVar.r(i, null, py0Var)) {
                        dbVar.x(i, false);
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (dbVar.r(i, null, obj2)) {
                        return 2;
                    }
                }
            } else if (dbVar.r(i, null, w8.d)) {
                return 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return androidx.appcompat.view.menu.bb.a.c(androidx.appcompat.view.menu.u31.a);
     */
    @Override // androidx.appcompat.view.menu.os0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = androidx.appcompat.view.menu.v8.p
            long r0 = r0.get(r14)
            boolean r0 = r14.p0(r0)
            if (r0 == 0) goto L13
            androidx.appcompat.view.menu.bb$b r15 = androidx.appcompat.view.menu.bb.a
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            androidx.appcompat.view.menu.py0 r8 = androidx.appcompat.view.menu.w8.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = g()
            java.lang.Object r0 = r0.get(r14)
            androidx.appcompat.view.menu.db r0 = (androidx.appcompat.view.menu.db) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = h()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = i(r14, r1)
            int r1 = androidx.appcompat.view.menu.w8.b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.o
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L59
            androidx.appcompat.view.menu.db r1 = b(r14, r2, r0)
            if (r1 != 0) goto L57
            if (r11 == 0) goto L21
        L4b:
            androidx.appcompat.view.menu.bb$b r15 = androidx.appcompat.view.menu.bb.a
            java.lang.Throwable r0 = r14.K()
            java.lang.Object r15 = r15.a(r0)
            goto Lbe
        L57:
            r13 = r1
            goto L5a
        L59:
            r13 = r0
        L5a:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = o(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lba
            r1 = 1
            if (r0 == r1) goto Lb1
            r1 = 2
            if (r0 == r1) goto L94
            r1 = 3
            if (r0 == r1) goto L88
            r1 = 4
            if (r0 == r1) goto L7c
            r1 = 5
            if (r0 == r1) goto L77
            goto L7a
        L77:
            r13.b()
        L7a:
            r0 = r13
            goto L21
        L7c:
            long r0 = r14.J()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4b
            r13.b()
            goto L4b
        L88:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L94:
            if (r11 == 0) goto L9a
            r13.p()
            goto L4b
        L9a:
            boolean r15 = r8 instanceof androidx.appcompat.view.menu.p71
            if (r15 == 0) goto La1
            androidx.appcompat.view.menu.p71 r8 = (androidx.appcompat.view.menu.p71) r8
            goto La2
        La1:
            r8 = 0
        La2:
            if (r8 == 0) goto La7
            m(r14, r8, r13, r12)
        La7:
            r13.p()
            androidx.appcompat.view.menu.bb$b r15 = androidx.appcompat.view.menu.bb.a
            java.lang.Object r15 = r15.b()
            goto Lbe
        Lb1:
            androidx.appcompat.view.menu.bb$b r15 = androidx.appcompat.view.menu.bb.a
            androidx.appcompat.view.menu.u31 r0 = androidx.appcompat.view.menu.u31.a
            java.lang.Object r15 = r15.c(r0)
            goto Lbe
        Lba:
            r13.b()
            goto Lb1
        Lbe:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.v8.y(java.lang.Object):java.lang.Object");
    }

    public final void y0(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = q;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
        } while (!q.compareAndSet(this, j2, j));
    }

    public final void z() {
        A();
    }

    public final void z0(long j) {
        long j2;
        long w2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = p;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            long j3 = 1152921504606846975L & j2;
            if (j3 >= j) {
                return;
            }
            w2 = w8.w(j3, (int) (j2 >> 60));
        } while (!p.compareAndSet(this, j2, w2));
    }
}
