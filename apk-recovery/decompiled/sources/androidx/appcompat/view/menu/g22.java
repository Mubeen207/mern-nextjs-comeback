package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class g22 implements Runnable {
    public final /* synthetic */ km1 m;
    public final /* synthetic */ g02 n;

    public g22(g02 g02Var, km1 km1Var) {
        this.n = g02Var;
        this.m = km1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            androidx.appcompat.view.menu.g02 r0 = r7.n
            androidx.appcompat.view.menu.b72 r0 = r0.u()
            boolean r1 = androidx.appcompat.view.menu.gd2.a()
            r2 = 0
            if (r1 == 0) goto L68
            androidx.appcompat.view.menu.tf1 r1 = r0.e()
            androidx.appcompat.view.menu.xs1 r3 = androidx.appcompat.view.menu.vi1.D0
            boolean r1 = r1.s(r3)
            if (r1 == 0) goto L68
            androidx.appcompat.view.menu.wu1 r1 = r0.i()
            androidx.appcompat.view.menu.oz1 r1 = r1.J()
            boolean r1 = r1.y()
            if (r1 != 0) goto L36
            androidx.appcompat.view.menu.st1 r0 = r0.l()
            androidx.appcompat.view.menu.vt1 r0 = r0.M()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L34:
            r0 = r2
            goto L76
        L36:
            androidx.appcompat.view.menu.wu1 r1 = r0.i()
            androidx.appcompat.view.menu.cc r3 = r0.b()
            long r3 = r3.a()
            boolean r1 = r1.y(r3)
            if (r1 != 0) goto L34
            androidx.appcompat.view.menu.wu1 r1 = r0.i()
            androidx.appcompat.view.menu.gv1 r1 = r1.q
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L59
            goto L34
        L59:
            androidx.appcompat.view.menu.wu1 r0 = r0.i()
            androidx.appcompat.view.menu.gv1 r0 = r0.q
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L76
        L68:
            androidx.appcompat.view.menu.st1 r0 = r0.l()
            androidx.appcompat.view.menu.vt1 r0 = r0.M()
            java.lang.String r1 = "getSessionId has been disabled."
            r0.a(r1)
            goto L34
        L76:
            if (r0 == 0) goto L8a
            androidx.appcompat.view.menu.g02 r1 = r7.n
            androidx.appcompat.view.menu.fx1 r1 = r1.a
            androidx.appcompat.view.menu.aa2 r1 = r1.L()
            androidx.appcompat.view.menu.km1 r2 = r7.m
            long r3 = r0.longValue()
            r1.P(r2, r3)
            return
        L8a:
            androidx.appcompat.view.menu.km1 r0 = r7.m     // Catch: android.os.RemoteException -> L90
            r0.f(r2)     // Catch: android.os.RemoteException -> L90
            return
        L90:
            r0 = move-exception
            androidx.appcompat.view.menu.g02 r1 = r7.n
            androidx.appcompat.view.menu.fx1 r1 = r1.a
            androidx.appcompat.view.menu.st1 r1 = r1.l()
            androidx.appcompat.view.menu.vt1 r1 = r1.G()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g22.run():void");
    }
}
