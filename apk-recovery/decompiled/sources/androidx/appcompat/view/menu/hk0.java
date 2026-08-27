package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
/* loaded from: classes.dex */
public abstract class hk0 {

    /* loaded from: classes.dex */
    public static final class a extends zg {
        public Object p;
        public Object q;
        public /* synthetic */ Object r;
        public int s;

        public a(xg xgVar) {
            super(xgVar);
        }

        @Override // androidx.appcompat.view.menu.y7
        public final Object k(Object obj) {
            this.r = obj;
            this.s |= Integer.MIN_VALUE;
            return hk0.a(null, null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j80 implements kw {
        public final /* synthetic */ x9 n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x9 x9Var) {
            super(1);
            this.n = x9Var;
        }

        public final void a(Throwable th) {
            x9 x9Var = this.n;
            qp0.a aVar = qp0.m;
            x9Var.n(qp0.a(u31.a));
        }

        @Override // androidx.appcompat.view.menu.kw
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return u31.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.appcompat.view.menu.jk0 r4, androidx.appcompat.view.menu.iw r5, androidx.appcompat.view.menu.xg r6) {
        /*
            boolean r0 = r6 instanceof androidx.appcompat.view.menu.hk0.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.appcompat.view.menu.hk0$a r0 = (androidx.appcompat.view.menu.hk0.a) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.appcompat.view.menu.hk0$a r0 = new androidx.appcompat.view.menu.hk0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.r
            java.lang.Object r1 = androidx.appcompat.view.menu.d60.c()
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.q
            r5 = r4
            androidx.appcompat.view.menu.iw r5 = (androidx.appcompat.view.menu.iw) r5
            java.lang.Object r4 = r0.p
            androidx.appcompat.view.menu.jk0 r4 = (androidx.appcompat.view.menu.jk0) r4
            androidx.appcompat.view.menu.rp0.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            androidx.appcompat.view.menu.rp0.b(r6)
            androidx.appcompat.view.menu.kh r6 = r0.b()
            androidx.appcompat.view.menu.t60$b r2 = androidx.appcompat.view.menu.t60.d
            androidx.appcompat.view.menu.kh$b r6 = r6.d(r2)
            if (r6 != r4) goto L7f
            r0.p = r4     // Catch: java.lang.Throwable -> L32
            r0.q = r5     // Catch: java.lang.Throwable -> L32
            r0.s = r3     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.view.menu.y9 r6 = new androidx.appcompat.view.menu.y9     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.view.menu.xg r2 = androidx.appcompat.view.menu.d60.b(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.z()     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.view.menu.hk0$b r2 = new androidx.appcompat.view.menu.hk0$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.v(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.w()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = androidx.appcompat.view.menu.d60.c()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            androidx.appcompat.view.menu.gj.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.d()
            androidx.appcompat.view.menu.u31 r4 = androidx.appcompat.view.menu.u31.a
            return r4
        L7b:
            r5.d()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.hk0.a(androidx.appcompat.view.menu.jk0, androidx.appcompat.view.menu.iw, androidx.appcompat.view.menu.xg):java.lang.Object");
    }

    public static final yn0 b(th thVar, kh khVar, int i, u8 u8Var, xh xhVar, kw kwVar, yw ywVar) {
        ik0 ik0Var = new ik0(lh.d(thVar, khVar), ab.b(i, u8Var, null, 4, null));
        if (kwVar != null) {
            ik0Var.h(kwVar);
        }
        ik0Var.K0(xhVar, ik0Var, ywVar);
        return ik0Var;
    }

    public static /* synthetic */ yn0 c(th thVar, kh khVar, int i, u8 u8Var, xh xhVar, kw kwVar, yw ywVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            khVar = bo.m;
        }
        kh khVar2 = khVar;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            u8Var = u8.SUSPEND;
        }
        u8 u8Var2 = u8Var;
        if ((i2 & 8) != 0) {
            xhVar = xh.DEFAULT;
        }
        xh xhVar2 = xhVar;
        if ((i2 & 16) != 0) {
            kwVar = null;
        }
        return b(thVar, khVar2, i3, u8Var2, xhVar2, kwVar, ywVar);
    }
}
