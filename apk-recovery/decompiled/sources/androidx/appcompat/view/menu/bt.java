package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract /* synthetic */ class bt {

    /* loaded from: classes.dex */
    public static final class a extends zg {
        public Object p;
        public Object q;
        public Object r;
        public boolean s;
        public /* synthetic */ Object t;
        public int u;

        public a(xg xgVar) {
            super(xgVar);
        }

        @Override // androidx.appcompat.view.menu.y7
        public final Object k(Object obj) {
            this.t = obj;
            this.u |= Integer.MIN_VALUE;
            return bt.c(null, null, false, this);
        }
    }

    public static final Object b(ys ysVar, yn0 yn0Var, xg xgVar) {
        Object c;
        Object c2 = c(ysVar, yn0Var, true, xgVar);
        c = f60.c();
        return c2 == c ? c2 : u31.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.appcompat.view.menu.ys r6, androidx.appcompat.view.menu.yn0 r7, boolean r8, androidx.appcompat.view.menu.xg r9) {
        /*
            boolean r0 = r9 instanceof androidx.appcompat.view.menu.bt.a
            if (r0 == 0) goto L13
            r0 = r9
            androidx.appcompat.view.menu.bt$a r0 = (androidx.appcompat.view.menu.bt.a) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.appcompat.view.menu.bt$a r0 = new androidx.appcompat.view.menu.bt$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.t
            java.lang.Object r1 = androidx.appcompat.view.menu.d60.c()
            int r2 = r0.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.s
            java.lang.Object r6 = r0.r
            androidx.appcompat.view.menu.za r6 = (androidx.appcompat.view.menu.za) r6
            java.lang.Object r7 = r0.q
            androidx.appcompat.view.menu.yn0 r7 = (androidx.appcompat.view.menu.yn0) r7
            java.lang.Object r2 = r0.p
            androidx.appcompat.view.menu.ys r2 = (androidx.appcompat.view.menu.ys) r2
            androidx.appcompat.view.menu.rp0.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.s
            java.lang.Object r6 = r0.r
            androidx.appcompat.view.menu.za r6 = (androidx.appcompat.view.menu.za) r6
            java.lang.Object r7 = r0.q
            androidx.appcompat.view.menu.yn0 r7 = (androidx.appcompat.view.menu.yn0) r7
            java.lang.Object r2 = r0.p
            androidx.appcompat.view.menu.ys r2 = (androidx.appcompat.view.menu.ys) r2
            androidx.appcompat.view.menu.rp0.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            androidx.appcompat.view.menu.rp0.b(r9)
            androidx.appcompat.view.menu.zs.c(r6)
            androidx.appcompat.view.menu.za r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.p = r6     // Catch: java.lang.Throwable -> L3c
            r0.q = r7     // Catch: java.lang.Throwable -> L3c
            r0.r = r9     // Catch: java.lang.Throwable -> L3c
            r0.s = r8     // Catch: java.lang.Throwable -> L3c
            r0.u = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.p = r2     // Catch: java.lang.Throwable -> L3c
            r0.q = r7     // Catch: java.lang.Throwable -> L3c
            r0.r = r6     // Catch: java.lang.Throwable -> L3c
            r0.s = r8     // Catch: java.lang.Throwable -> L3c
            r0.u = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.a(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            androidx.appcompat.view.menu.eb.a(r7, r6)
        L9a:
            androidx.appcompat.view.menu.u31 r6 = androidx.appcompat.view.menu.u31.a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            androidx.appcompat.view.menu.eb.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.bt.c(androidx.appcompat.view.menu.ys, androidx.appcompat.view.menu.yn0, boolean, androidx.appcompat.view.menu.xg):java.lang.Object");
    }
}
