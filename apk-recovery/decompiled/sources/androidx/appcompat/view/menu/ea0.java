package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class ea0 {
    public static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(ea0.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(ea0.class, Object.class, "_prev");
    public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(ea0.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* loaded from: classes.dex */
    public static abstract class a extends e5 {
        public final ea0 b;
        public ea0 c;

        public a(ea0 ea0Var) {
            this.b = ea0Var;
        }

        @Override // androidx.appcompat.view.menu.e5
        /* renamed from: e */
        public void b(ea0 ea0Var, Object obj) {
            boolean z = obj == null;
            ea0 ea0Var2 = z ? this.b : this.c;
            if (ea0Var2 != null && q.a(ea0.m, ea0Var, this, ea0Var2) && z) {
                ea0 ea0Var3 = this.b;
                ea0 ea0Var4 = this.c;
                c60.b(ea0Var4);
                ea0Var3.n(ea0Var4);
            }
        }
    }

    public final boolean k(ea0 ea0Var) {
        n.lazySet(ea0Var, this);
        m.lazySet(ea0Var, this);
        while (o() == this) {
            if (q.a(m, this, this, ea0Var)) {
                ea0Var.n(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (androidx.appcompat.view.menu.q.a(r4, r3, r2, ((androidx.appcompat.view.menu.wo0) r5).a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.view.menu.ea0 l(androidx.appcompat.view.menu.sg0 r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = androidx.appcompat.view.menu.ea0.n
            java.lang.Object r0 = r0.get(r8)
            androidx.appcompat.view.menu.ea0 r0 = (androidx.appcompat.view.menu.ea0) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = androidx.appcompat.view.menu.ea0.m
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = androidx.appcompat.view.menu.ea0.n
            boolean r0 = androidx.appcompat.view.menu.q.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.r()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof androidx.appcompat.view.menu.sg0
            if (r6 == 0) goto L34
            androidx.appcompat.view.menu.sg0 r5 = (androidx.appcompat.view.menu.sg0) r5
            r5.a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof androidx.appcompat.view.menu.wo0
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            androidx.appcompat.view.menu.wo0 r5 = (androidx.appcompat.view.menu.wo0) r5
            androidx.appcompat.view.menu.ea0 r5 = r5.a
            boolean r2 = androidx.appcompat.view.menu.q.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = androidx.appcompat.view.menu.ea0.n
            java.lang.Object r2 = r4.get(r2)
            androidx.appcompat.view.menu.ea0 r2 = (androidx.appcompat.view.menu.ea0) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            androidx.appcompat.view.menu.c60.c(r5, r3)
            r3 = r5
            androidx.appcompat.view.menu.ea0 r3 = (androidx.appcompat.view.menu.ea0) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ea0.l(androidx.appcompat.view.menu.sg0):androidx.appcompat.view.menu.ea0");
    }

    public final ea0 m(ea0 ea0Var) {
        while (ea0Var.r()) {
            ea0Var = (ea0) n.get(ea0Var);
        }
        return ea0Var;
    }

    public final void n(ea0 ea0Var) {
        ea0 ea0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        do {
            ea0Var2 = (ea0) atomicReferenceFieldUpdater.get(ea0Var);
            if (o() != ea0Var) {
                return;
            }
        } while (!q.a(n, ea0Var, ea0Var2, this));
        if (r()) {
            ea0Var.l(null);
        }
    }

    public final Object o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof sg0)) {
                return obj;
            }
            ((sg0) obj).a(this);
        }
    }

    public final ea0 p() {
        return da0.b(o());
    }

    public final ea0 q() {
        ea0 l = l(null);
        return l == null ? m((ea0) n.get(this)) : l;
    }

    public boolean r() {
        return o() instanceof wo0;
    }

    public boolean s() {
        return t() == null;
    }

    public final ea0 t() {
        Object o2;
        ea0 ea0Var;
        do {
            o2 = o();
            if (o2 instanceof wo0) {
                return ((wo0) o2).a;
            }
            if (o2 == this) {
                return (ea0) o2;
            }
            c60.c(o2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            ea0Var = (ea0) o2;
        } while (!q.a(m, this, o2, ea0Var.u()));
        ea0Var.l(null);
        return null;
    }

    public String toString() {
        return new uk0(this) { // from class: androidx.appcompat.view.menu.ea0.b
            @Override // androidx.appcompat.view.menu.r70
            public Object get() {
                return hj.a(this.n);
            }
        } + '@' + hj.b(this);
    }

    public final wo0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        wo0 wo0Var = (wo0) atomicReferenceFieldUpdater.get(this);
        if (wo0Var == null) {
            wo0 wo0Var2 = new wo0(this);
            atomicReferenceFieldUpdater.lazySet(this, wo0Var2);
            return wo0Var2;
        }
        return wo0Var;
    }

    public final int v(ea0 ea0Var, ea0 ea0Var2, a aVar) {
        n.lazySet(ea0Var, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        atomicReferenceFieldUpdater.lazySet(ea0Var, ea0Var2);
        aVar.c = ea0Var2;
        if (q.a(atomicReferenceFieldUpdater, this, ea0Var2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
