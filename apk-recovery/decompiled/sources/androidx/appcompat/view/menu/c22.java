package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class c22 implements Runnable {
    public final /* synthetic */ AtomicReference m;
    public final /* synthetic */ String n = null;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ g02 q;

    public c22(g02 g02Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.q = g02Var;
        this.m = atomicReference;
        this.o = str2;
        this.p = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.a.J().S(this.m, null, this.o, this.p);
    }
}
