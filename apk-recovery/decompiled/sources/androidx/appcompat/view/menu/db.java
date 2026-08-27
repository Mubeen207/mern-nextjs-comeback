package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes.dex */
public final class db extends ms0 {
    public final v8 q;
    public final AtomicReferenceArray r;

    public db(long j, db dbVar, v8 v8Var, int i) {
        super(j, dbVar, i);
        this.q = v8Var;
        this.r = new AtomicReferenceArray(w8.b * 2);
    }

    public final void A(int i, Object obj) {
        this.r.set((i * 2) + 1, obj);
    }

    public final void B(int i, Object obj) {
        z(i, obj);
    }

    @Override // androidx.appcompat.view.menu.ms0
    public int n() {
        return w8.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
        if (r0 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
        r4 = u().n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
        if (r4 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
        androidx.appcompat.view.menu.qg0.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    @Override // androidx.appcompat.view.menu.ms0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(int r4, java.lang.Throwable r5, androidx.appcompat.view.menu.kh r6) {
        /*
            r3 = this;
            int r5 = androidx.appcompat.view.menu.w8.b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof androidx.appcompat.view.menu.p71
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof androidx.appcompat.view.menu.q71
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            androidx.appcompat.view.menu.py0 r2 = androidx.appcompat.view.menu.w8.j()
            if (r1 == r2) goto L63
            androidx.appcompat.view.menu.py0 r2 = androidx.appcompat.view.menu.w8.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            androidx.appcompat.view.menu.py0 r2 = androidx.appcompat.view.menu.w8.p()
            if (r1 == r2) goto Le
            androidx.appcompat.view.menu.py0 r2 = androidx.appcompat.view.menu.w8.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            androidx.appcompat.view.menu.py0 r4 = androidx.appcompat.view.menu.w8.f()
            if (r1 == r4) goto L62
            androidx.appcompat.view.menu.py0 r4 = androidx.appcompat.view.menu.w8.d
            if (r1 != r4) goto L40
            goto L62
        L40:
            androidx.appcompat.view.menu.py0 r4 = androidx.appcompat.view.menu.w8.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.s(r4)
            if (r0 == 0) goto L73
            androidx.appcompat.view.menu.v8 r4 = r3.u()
            androidx.appcompat.view.menu.kw r4 = r4.n
            if (r4 == 0) goto L73
            androidx.appcompat.view.menu.qg0.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            androidx.appcompat.view.menu.py0 r2 = androidx.appcompat.view.menu.w8.j()
            goto L7f
        L7b:
            androidx.appcompat.view.menu.py0 r2 = androidx.appcompat.view.menu.w8.i()
        L7f:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L9a
            androidx.appcompat.view.menu.v8 r4 = r3.u()
            androidx.appcompat.view.menu.kw r4 = r4.n
            if (r4 == 0) goto L9a
            androidx.appcompat.view.menu.qg0.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.db.o(int, java.lang.Throwable, androidx.appcompat.view.menu.kh):void");
    }

    public final boolean r(int i, Object obj, Object obj2) {
        return cb.a(this.r, (i * 2) + 1, obj, obj2);
    }

    public final void s(int i) {
        z(i, null);
    }

    public final Object t(int i, Object obj) {
        return this.r.getAndSet((i * 2) + 1, obj);
    }

    public final v8 u() {
        v8 v8Var = this.q;
        c60.b(v8Var);
        return v8Var;
    }

    public final Object v(int i) {
        return this.r.get(i * 2);
    }

    public final Object w(int i) {
        return this.r.get((i * 2) + 1);
    }

    public final void x(int i, boolean z) {
        if (z) {
            u().A0((this.o * w8.b) + i);
        }
        p();
    }

    public final Object y(int i) {
        Object v = v(i);
        s(i);
        return v;
    }

    public final void z(int i, Object obj) {
        this.r.lazySet(i * 2, obj);
    }
}
