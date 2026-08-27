package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ud0 extends ta0 implements sk {
    public final Throwable o;
    public final String p;

    public ud0(Throwable th, String str) {
        this.o = th;
        this.p = str;
    }

    @Override // androidx.appcompat.view.menu.nh
    public boolean D(kh khVar) {
        I();
        throw new g80();
    }

    @Override // androidx.appcompat.view.menu.ta0
    public ta0 F() {
        return this;
    }

    @Override // androidx.appcompat.view.menu.nh
    /* renamed from: H */
    public Void A(kh khVar, Runnable runnable) {
        I();
        throw new g80();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Void I() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.o
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.p
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.o
            r1.<init>(r0, r2)
            throw r1
        L36:
            androidx.appcompat.view.menu.wa0.d()
            androidx.appcompat.view.menu.g80 r0 = new androidx.appcompat.view.menu.g80
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ud0.I():java.lang.Void");
    }

    @Override // androidx.appcompat.view.menu.nh
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.o != null) {
            str = ", cause=" + this.o;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
