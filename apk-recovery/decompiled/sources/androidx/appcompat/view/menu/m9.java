package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class m9 extends va {
    public final yw e;

    /* loaded from: classes.dex */
    public static final class a extends zg {
        public Object p;
        public /* synthetic */ Object q;
        public int s;

        public a(xg xgVar) {
            super(xgVar);
        }

        @Override // androidx.appcompat.view.menu.y7
        public final Object k(Object obj) {
            this.q = obj;
            this.s |= Integer.MIN_VALUE;
            return m9.this.e(null, this);
        }
    }

    public /* synthetic */ m9(yw ywVar, kh khVar, int i, u8 u8Var, int i2, lj ljVar) {
        this(ywVar, (i2 & 2) != 0 ? bo.m : khVar, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? u8.SUSPEND : u8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // androidx.appcompat.view.menu.va, androidx.appcompat.view.menu.ua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(androidx.appcompat.view.menu.jk0 r5, androidx.appcompat.view.menu.xg r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.appcompat.view.menu.m9.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.appcompat.view.menu.m9$a r0 = (androidx.appcompat.view.menu.m9.a) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.appcompat.view.menu.m9$a r0 = new androidx.appcompat.view.menu.m9$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.q
            java.lang.Object r1 = androidx.appcompat.view.menu.d60.c()
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.p
            androidx.appcompat.view.menu.jk0 r5 = (androidx.appcompat.view.menu.jk0) r5
            androidx.appcompat.view.menu.rp0.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            androidx.appcompat.view.menu.rp0.b(r6)
            r0.p = r5
            r0.s = r3
            java.lang.Object r6 = super.e(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.A()
            if (r5 == 0) goto L4c
            androidx.appcompat.view.menu.u31 r5 = androidx.appcompat.view.menu.u31.a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.m9.e(androidx.appcompat.view.menu.jk0, androidx.appcompat.view.menu.xg):java.lang.Object");
    }

    @Override // androidx.appcompat.view.menu.ua
    public ua f(kh khVar, int i, u8 u8Var) {
        return new m9(this.e, khVar, i, u8Var);
    }

    public m9(yw ywVar, kh khVar, int i, u8 u8Var) {
        super(ywVar, khVar, i, u8Var);
        this.e = ywVar;
    }
}
