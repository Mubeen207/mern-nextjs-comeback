package androidx.appcompat.view.menu;

import android.content.ComponentName;
/* loaded from: classes.dex */
public final class k62 implements Runnable {
    public final /* synthetic */ ComponentName m;
    public final /* synthetic */ g62 n;

    public k62(g62 g62Var, ComponentName componentName) {
        this.n = g62Var;
        this.m = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k42.M(this.n.n, this.m);
    }
}
