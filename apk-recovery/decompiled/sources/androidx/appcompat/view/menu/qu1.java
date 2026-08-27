package androidx.appcompat.view.menu;

import java.util.Map;
/* loaded from: classes.dex */
public final class qu1 implements Runnable {
    public final du1 m;
    public final int n;
    public final Throwable o;
    public final byte[] p;
    public final String q;
    public final Map r;

    @Override // java.lang.Runnable
    public final void run() {
        this.m.a(this.q, this.n, this.o, this.p, this.r);
    }

    public qu1(String str, du1 du1Var, int i, Throwable th, byte[] bArr, Map map) {
        pj0.i(du1Var);
        this.m = du1Var;
        this.n = i;
        this.o = th;
        this.p = bArr;
        this.q = str;
        this.r = map;
    }
}
