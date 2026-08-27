package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class b22 implements Runnable {
    public final /* synthetic */ AtomicReference m;
    public final /* synthetic */ String n = null;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ g02 r;

    public b22(g02 g02Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.r = g02Var;
        this.m = atomicReference;
        this.o = str2;
        this.p = str3;
        this.q = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.r.a.J().T(this.m, null, this.o, this.p, this.q);
    }
}
