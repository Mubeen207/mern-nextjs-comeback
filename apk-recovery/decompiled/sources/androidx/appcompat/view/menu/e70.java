package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ea0;
import androidx.appcompat.view.menu.kh;
import androidx.appcompat.view.menu.t60;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class e70 implements t60, lb, rh0 {
    public static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(e70.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(e70.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* loaded from: classes.dex */
    public static final class a extends c70 {
        public final e70 q;
        public final b r;
        public final kb s;
        public final Object t;

        public a(e70 e70Var, b bVar, kb kbVar, Object obj) {
            this.q = e70Var;
            this.r = bVar;
            this.s = kbVar;
            this.t = obj;
        }

        @Override // androidx.appcompat.view.menu.kw
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            w((Throwable) obj);
            return u31.a;
        }

        @Override // androidx.appcompat.view.menu.pd
        public void w(Throwable th) {
            this.q.R(this.r, this.s, this.t);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements y40 {
        public static final AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isCompleting");
        public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_rootCause");
        public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;
        public final cf0 m;

        public b(cf0 cf0Var, boolean z, Throwable th) {
            this.m = cf0Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable e = e();
            if (e == null) {
                m(th);
            } else if (th == e) {
            } else {
                Object d = d();
                if (d == null) {
                    l(th);
                } else if (d instanceof Throwable) {
                    if (th == d) {
                        return;
                    }
                    ArrayList b = b();
                    b.add(d);
                    b.add(th);
                    l(b);
                } else if (d instanceof ArrayList) {
                    ((ArrayList) d).add(th);
                } else {
                    throw new IllegalStateException(("State is " + d).toString());
                }
            }
        }

        public final ArrayList b() {
            return new ArrayList(4);
        }

        @Override // androidx.appcompat.view.menu.y40
        public boolean c() {
            return e() == null;
        }

        public final Object d() {
            return p.get(this);
        }

        public final Throwable e() {
            return (Throwable) o.get(this);
        }

        @Override // androidx.appcompat.view.menu.y40
        public cf0 f() {
            return this.m;
        }

        public final boolean g() {
            return e() != null;
        }

        public final boolean h() {
            return n.get(this) != 0;
        }

        public final boolean i() {
            py0 py0Var;
            Object d = d();
            py0Var = f70.e;
            return d == py0Var;
        }

        public final List j(Throwable th) {
            ArrayList arrayList;
            py0 py0Var;
            Object d = d();
            if (d == null) {
                arrayList = b();
            } else if (d instanceof Throwable) {
                ArrayList b = b();
                b.add(d);
                arrayList = b;
            } else if (!(d instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + d).toString());
            } else {
                arrayList = (ArrayList) d;
            }
            Throwable e = e();
            if (e != null) {
                arrayList.add(0, e);
            }
            if (th != null && !c60.a(th, e)) {
                arrayList.add(th);
            }
            py0Var = f70.e;
            l(py0Var);
            return arrayList;
        }

        public final void k(boolean z) {
            n.set(this, z ? 1 : 0);
        }

        public final void l(Object obj) {
            p.set(this, obj);
        }

        public final void m(Throwable th) {
            o.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + f() + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ea0.a {
        public final /* synthetic */ e70 d;
        public final /* synthetic */ Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ea0 ea0Var, e70 e70Var, Object obj) {
            super(ea0Var);
            this.d = e70Var;
            this.e = obj;
        }

        @Override // androidx.appcompat.view.menu.e5
        /* renamed from: f */
        public Object d(ea0 ea0Var) {
            if (this.d.c0() == this.e) {
                return null;
            }
            return da0.a();
        }
    }

    public e70(boolean z) {
        this._state = z ? f70.g : f70.f;
    }

    public static /* synthetic */ CancellationException A0(e70 e70Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return e70Var.z0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    @Override // androidx.appcompat.view.menu.t60
    public final jb B(lb lbVar) {
        mm d = t60.a.d(this, true, false, new kb(lbVar), 2, null);
        c60.c(d, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (jb) d;
    }

    public final String B0() {
        return m0() + '{' + y0(c0()) + '}';
    }

    public final boolean C0(y40 y40Var, Object obj) {
        if (q.a(m, this, y40Var, f70.g(obj))) {
            q0(null);
            r0(obj);
            Q(y40Var, obj);
            return true;
        }
        return false;
    }

    public final boolean D0(y40 y40Var, Throwable th) {
        cf0 a0 = a0(y40Var);
        if (a0 == null) {
            return false;
        }
        if (q.a(m, this, y40Var, new b(a0, false, th))) {
            o0(a0, th);
            return true;
        }
        return false;
    }

    public final Object E0(Object obj, Object obj2) {
        py0 py0Var;
        py0 py0Var2;
        if (!(obj instanceof y40)) {
            py0Var2 = f70.a;
            return py0Var2;
        } else if ((!(obj instanceof zn) && !(obj instanceof c70)) || (obj instanceof kb) || (obj2 instanceof nd)) {
            return F0((y40) obj, obj2);
        } else {
            if (C0((y40) obj, obj2)) {
                return obj2;
            }
            py0Var = f70.c;
            return py0Var;
        }
    }

    public final Object F0(y40 y40Var, Object obj) {
        py0 py0Var;
        py0 py0Var2;
        py0 py0Var3;
        cf0 a0 = a0(y40Var);
        if (a0 == null) {
            py0Var3 = f70.c;
            return py0Var3;
        }
        b bVar = y40Var instanceof b ? (b) y40Var : null;
        if (bVar == null) {
            bVar = new b(a0, false, null);
        }
        eo0 eo0Var = new eo0();
        synchronized (bVar) {
            if (bVar.h()) {
                py0Var2 = f70.a;
                return py0Var2;
            }
            bVar.k(true);
            if (bVar != y40Var && !q.a(m, this, y40Var, bVar)) {
                py0Var = f70.c;
                return py0Var;
            }
            boolean g = bVar.g();
            nd ndVar = obj instanceof nd ? (nd) obj : null;
            if (ndVar != null) {
                bVar.a(ndVar.a);
            }
            Throwable e = Boolean.valueOf(true ^ g).booleanValue() ? bVar.e() : null;
            eo0Var.m = e;
            u31 u31Var = u31.a;
            if (e != null) {
                o0(a0, e);
            }
            kb U = U(y40Var);
            return (U == null || !G0(bVar, U, obj)) ? T(bVar, obj) : f70.b;
        }
    }

    public final boolean G(Object obj, cf0 cf0Var, c70 c70Var) {
        int v;
        c cVar = new c(c70Var, this, obj);
        do {
            v = cf0Var.q().v(c70Var, cf0Var, cVar);
            if (v == 1) {
                return true;
            }
        } while (v != 2);
        return false;
    }

    public final boolean G0(b bVar, kb kbVar, Object obj) {
        while (t60.a.d(kbVar.q, false, false, new a(this, bVar, kbVar, obj), 1, null) == df0.m) {
            kbVar = n0(kbVar);
            if (kbVar == null) {
                return false;
            }
        }
        return true;
    }

    public final void H(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                pp.a(th, th2);
            }
        }
    }

    public void I(Object obj) {
    }

    public final boolean J(Throwable th) {
        return K(th);
    }

    public final boolean K(Object obj) {
        Object obj2;
        py0 py0Var;
        py0 py0Var2;
        py0 py0Var3;
        obj2 = f70.a;
        if (Z() && (obj2 = M(obj)) == f70.b) {
            return true;
        }
        py0Var = f70.a;
        if (obj2 == py0Var) {
            obj2 = j0(obj);
        }
        py0Var2 = f70.a;
        if (obj2 == py0Var2 || obj2 == f70.b) {
            return true;
        }
        py0Var3 = f70.d;
        if (obj2 == py0Var3) {
            return false;
        }
        I(obj2);
        return true;
    }

    public void L(Throwable th) {
        K(th);
    }

    public final Object M(Object obj) {
        py0 py0Var;
        Object E0;
        py0 py0Var2;
        do {
            Object c0 = c0();
            if (!(c0 instanceof y40) || ((c0 instanceof b) && ((b) c0).h())) {
                py0Var = f70.a;
                return py0Var;
            }
            E0 = E0(c0, new nd(S(obj), false, 2, null));
            py0Var2 = f70.c;
        } while (E0 == py0Var2);
        return E0;
    }

    public final boolean N(Throwable th) {
        if (i0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        jb b0 = b0();
        return (b0 == null || b0 == df0.m) ? z : b0.b(th) || z;
    }

    public String O() {
        return "Job was cancelled";
    }

    public boolean P(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return K(th) && Y();
    }

    public final void Q(y40 y40Var, Object obj) {
        jb b0 = b0();
        if (b0 != null) {
            b0.a();
            w0(df0.m);
        }
        nd ndVar = obj instanceof nd ? (nd) obj : null;
        Throwable th = ndVar != null ? ndVar.a : null;
        if (!(y40Var instanceof c70)) {
            cf0 f = y40Var.f();
            if (f != null) {
                p0(f, th);
                return;
            }
            return;
        }
        try {
            ((c70) y40Var).w(th);
        } catch (Throwable th2) {
            e0(new qd("Exception in completion handler " + y40Var + " for " + this, th2));
        }
    }

    public final void R(b bVar, kb kbVar, Object obj) {
        kb n0 = n0(kbVar);
        if (n0 == null || !G0(bVar, n0, obj)) {
            I(T(bVar, obj));
        }
    }

    public final Throwable S(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th == null ? new u60(O(), null, this) : th;
        }
        c60.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((rh0) obj).t();
    }

    public final Object T(b bVar, Object obj) {
        boolean g;
        Throwable X;
        nd ndVar = obj instanceof nd ? (nd) obj : null;
        Throwable th = ndVar != null ? ndVar.a : null;
        synchronized (bVar) {
            g = bVar.g();
            List j = bVar.j(th);
            X = X(bVar, j);
            if (X != null) {
                H(X, j);
            }
        }
        if (X != null && X != th) {
            obj = new nd(X, false, 2, null);
        }
        if (X != null && (N(X) || d0(X))) {
            c60.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((nd) obj).b();
        }
        if (!g) {
            q0(X);
        }
        r0(obj);
        q.a(m, this, bVar, f70.g(obj));
        Q(bVar, obj);
        return obj;
    }

    public final kb U(y40 y40Var) {
        kb kbVar = y40Var instanceof kb ? (kb) y40Var : null;
        if (kbVar == null) {
            cf0 f = y40Var.f();
            if (f != null) {
                return n0(f);
            }
            return null;
        }
        return kbVar;
    }

    public final Object V() {
        Object c0 = c0();
        if (!(c0 instanceof y40)) {
            if (c0 instanceof nd) {
                throw ((nd) c0).a;
            }
            return f70.h(c0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final Throwable W(Object obj) {
        nd ndVar = obj instanceof nd ? (nd) obj : null;
        if (ndVar != null) {
            return ndVar.a;
        }
        return null;
    }

    public final Throwable X(b bVar, List list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.g()) {
                return new u60(O(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : (Throwable) list.get(0);
    }

    public boolean Y() {
        return true;
    }

    public boolean Z() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.t60
    public final boolean a() {
        int x0;
        do {
            x0 = x0(c0());
            if (x0 == 0) {
                return false;
            }
        } while (x0 != 1);
        return true;
    }

    public final cf0 a0(y40 y40Var) {
        cf0 f = y40Var.f();
        if (f == null) {
            if (y40Var instanceof zn) {
                return new cf0();
            }
            if (y40Var instanceof c70) {
                u0((c70) y40Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + y40Var).toString());
        }
        return f;
    }

    public final jb b0() {
        return (jb) n.get(this);
    }

    @Override // androidx.appcompat.view.menu.t60
    public boolean c() {
        Object c0 = c0();
        return (c0 instanceof y40) && ((y40) c0).c();
    }

    public final Object c0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof sg0)) {
                return obj;
            }
            ((sg0) obj).a(this);
        }
    }

    @Override // androidx.appcompat.view.menu.kh.b, androidx.appcompat.view.menu.kh
    public kh.b d(kh.c cVar) {
        return t60.a.c(this, cVar);
    }

    public boolean d0(Throwable th) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.t60
    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new u60(O(), null, this);
        }
        L(cancellationException);
    }

    public void e0(Throwable th) {
        throw th;
    }

    public final void f0(t60 t60Var) {
        if (t60Var == null) {
            w0(df0.m);
            return;
        }
        t60Var.a();
        jb B = t60Var.B(this);
        w0(B);
        if (h0()) {
            B.a();
            w0(df0.m);
        }
    }

    public final boolean g0() {
        Object c0 = c0();
        return (c0 instanceof nd) || ((c0 instanceof b) && ((b) c0).g());
    }

    @Override // androidx.appcompat.view.menu.kh.b
    public final kh.c getKey() {
        return t60.d;
    }

    @Override // androidx.appcompat.view.menu.t60
    public final mm h(kw kwVar) {
        return s(false, true, kwVar);
    }

    public final boolean h0() {
        return !(c0() instanceof y40);
    }

    public boolean i0() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.kh
    public kh j(kh.c cVar) {
        return t60.a.e(this, cVar);
    }

    public final Object j0(Object obj) {
        py0 py0Var;
        py0 py0Var2;
        py0 py0Var3;
        py0 py0Var4;
        py0 py0Var5;
        py0 py0Var6;
        Throwable th = null;
        while (true) {
            Object c0 = c0();
            if (c0 instanceof b) {
                synchronized (c0) {
                    if (((b) c0).i()) {
                        py0Var2 = f70.d;
                        return py0Var2;
                    }
                    boolean g = ((b) c0).g();
                    if (obj != null || !g) {
                        if (th == null) {
                            th = S(obj);
                        }
                        ((b) c0).a(th);
                    }
                    Throwable e = g ^ true ? ((b) c0).e() : null;
                    if (e != null) {
                        o0(((b) c0).f(), e);
                    }
                    py0Var = f70.a;
                    return py0Var;
                }
            } else if (!(c0 instanceof y40)) {
                py0Var3 = f70.d;
                return py0Var3;
            } else {
                if (th == null) {
                    th = S(obj);
                }
                y40 y40Var = (y40) c0;
                if (!y40Var.c()) {
                    Object E0 = E0(c0, new nd(th, false, 2, null));
                    py0Var5 = f70.a;
                    if (E0 == py0Var5) {
                        throw new IllegalStateException(("Cannot happen in " + c0).toString());
                    }
                    py0Var6 = f70.c;
                    if (E0 != py0Var6) {
                        return E0;
                    }
                } else if (D0(y40Var, th)) {
                    py0Var4 = f70.a;
                    return py0Var4;
                }
            }
        }
    }

    public final Object k0(Object obj) {
        Object E0;
        py0 py0Var;
        py0 py0Var2;
        do {
            E0 = E0(c0(), obj);
            py0Var = f70.a;
            if (E0 == py0Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, W(obj));
            }
            py0Var2 = f70.c;
        } while (E0 == py0Var2);
        return E0;
    }

    public final c70 l0(kw kwVar, boolean z) {
        c70 c70Var;
        if (z) {
            c70Var = kwVar instanceof v60 ? (v60) kwVar : null;
            if (c70Var == null) {
                c70Var = new j60(kwVar);
            }
        } else {
            c70Var = kwVar instanceof c70 ? (c70) kwVar : null;
            if (c70Var == null) {
                c70Var = new k60(kwVar);
            }
        }
        c70Var.y(this);
        return c70Var;
    }

    public String m0() {
        return hj.a(this);
    }

    public final kb n0(ea0 ea0Var) {
        while (ea0Var.r()) {
            ea0Var = ea0Var.q();
        }
        while (true) {
            ea0Var = ea0Var.p();
            if (!ea0Var.r()) {
                if (ea0Var instanceof kb) {
                    return (kb) ea0Var;
                }
                if (ea0Var instanceof cf0) {
                    return null;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.kh
    public kh o(kh khVar) {
        return t60.a.f(this, khVar);
    }

    public final void o0(cf0 cf0Var, Throwable th) {
        q0(th);
        Object o = cf0Var.o();
        c60.c(o, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        qd qdVar = null;
        for (ea0 ea0Var = (ea0) o; !c60.a(ea0Var, cf0Var); ea0Var = ea0Var.p()) {
            if (ea0Var instanceof v60) {
                c70 c70Var = (c70) ea0Var;
                try {
                    c70Var.w(th);
                } catch (Throwable th2) {
                    if (qdVar != null) {
                        pp.a(qdVar, th2);
                    } else {
                        qdVar = new qd("Exception in completion handler " + c70Var + " for " + this, th2);
                        u31 u31Var = u31.a;
                    }
                }
            }
        }
        if (qdVar != null) {
            e0(qdVar);
        }
        N(th);
    }

    @Override // androidx.appcompat.view.menu.kh
    public Object p(Object obj, yw ywVar) {
        return t60.a.b(this, obj, ywVar);
    }

    public final void p0(cf0 cf0Var, Throwable th) {
        Object o = cf0Var.o();
        c60.c(o, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        qd qdVar = null;
        for (ea0 ea0Var = (ea0) o; !c60.a(ea0Var, cf0Var); ea0Var = ea0Var.p()) {
            if (ea0Var instanceof c70) {
                c70 c70Var = (c70) ea0Var;
                try {
                    c70Var.w(th);
                } catch (Throwable th2) {
                    if (qdVar != null) {
                        pp.a(qdVar, th2);
                    } else {
                        qdVar = new qd("Exception in completion handler " + c70Var + " for " + this, th2);
                        u31 u31Var = u31.a;
                    }
                }
            }
        }
        if (qdVar != null) {
            e0(qdVar);
        }
    }

    public void q0(Throwable th) {
    }

    public void r0(Object obj) {
    }

    @Override // androidx.appcompat.view.menu.t60
    public final mm s(boolean z, boolean z2, kw kwVar) {
        c70 l0 = l0(kwVar, z);
        while (true) {
            Object c0 = c0();
            if (c0 instanceof zn) {
                zn znVar = (zn) c0;
                if (!znVar.c()) {
                    t0(znVar);
                } else if (q.a(m, this, c0, l0)) {
                    return l0;
                }
            } else {
                if (!(c0 instanceof y40)) {
                    if (z2) {
                        nd ndVar = c0 instanceof nd ? (nd) c0 : null;
                        kwVar.i(ndVar != null ? ndVar.a : null);
                    }
                    return df0.m;
                }
                cf0 f = ((y40) c0).f();
                if (f == null) {
                    c60.c(c0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    u0((c70) c0);
                } else {
                    mm mmVar = df0.m;
                    if (z && (c0 instanceof b)) {
                        synchronized (c0) {
                            try {
                                r3 = ((b) c0).e();
                                if (r3 != null) {
                                    if ((kwVar instanceof kb) && !((b) c0).h()) {
                                    }
                                    u31 u31Var = u31.a;
                                }
                                if (G(c0, f, l0)) {
                                    if (r3 == null) {
                                        return l0;
                                    }
                                    mmVar = l0;
                                    u31 u31Var2 = u31.a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (r3 != null) {
                        if (z2) {
                            kwVar.i(r3);
                        }
                        return mmVar;
                    } else if (G(c0, f, l0)) {
                        return l0;
                    }
                }
            }
        }
    }

    public void s0() {
    }

    @Override // androidx.appcompat.view.menu.rh0
    public CancellationException t() {
        Throwable th;
        Object c0 = c0();
        if (c0 instanceof b) {
            th = ((b) c0).e();
        } else if (c0 instanceof nd) {
            th = ((nd) c0).a;
        } else if (c0 instanceof y40) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + c0).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        if (cancellationException == null) {
            return new u60("Parent job is " + y0(c0), th, this);
        }
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.appcompat.view.menu.x40] */
    public final void t0(zn znVar) {
        cf0 cf0Var = new cf0();
        if (!znVar.c()) {
            cf0Var = new x40(cf0Var);
        }
        q.a(m, this, znVar, cf0Var);
    }

    public String toString() {
        return B0() + '@' + hj.b(this);
    }

    @Override // androidx.appcompat.view.menu.lb
    public final void u(rh0 rh0Var) {
        K(rh0Var);
    }

    public final void u0(c70 c70Var) {
        c70Var.k(new cf0());
        q.a(m, this, c70Var, c70Var.p());
    }

    public final void v0(c70 c70Var) {
        Object c0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        zn znVar;
        do {
            c0 = c0();
            if (!(c0 instanceof c70)) {
                if (!(c0 instanceof y40) || ((y40) c0).f() == null) {
                    return;
                }
                c70Var.s();
                return;
            } else if (c0 != c70Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = m;
                znVar = f70.g;
            }
        } while (!q.a(atomicReferenceFieldUpdater, this, c0, znVar));
    }

    @Override // androidx.appcompat.view.menu.t60
    public final CancellationException w() {
        Object c0 = c0();
        if (!(c0 instanceof b)) {
            if (c0 instanceof y40) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            } else if (c0 instanceof nd) {
                return A0(this, ((nd) c0).a, null, 1, null);
            } else {
                return new u60(hj.a(this) + " has completed normally", null, this);
            }
        }
        Throwable e = ((b) c0).e();
        if (e != null) {
            CancellationException z0 = z0(e, hj.a(this) + " is cancelling");
            if (z0 != null) {
                return z0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final void w0(jb jbVar) {
        n.set(this, jbVar);
    }

    public final int x0(Object obj) {
        zn znVar;
        if (!(obj instanceof zn)) {
            if (obj instanceof x40) {
                if (q.a(m, this, obj, ((x40) obj).f())) {
                    s0();
                    return 1;
                }
                return -1;
            }
            return 0;
        } else if (((zn) obj).c()) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            znVar = f70.g;
            if (q.a(atomicReferenceFieldUpdater, this, obj, znVar)) {
                s0();
                return 1;
            }
            return -1;
        }
    }

    public final String y0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof y40 ? ((y40) obj).c() ? "Active" : "New" : obj instanceof nd ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.g() ? "Cancelling" : bVar.h() ? "Completing" : "Active";
    }

    public final CancellationException z0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = O();
            }
            cancellationException = new u60(str, th, this);
        }
        return cancellationException;
    }
}
