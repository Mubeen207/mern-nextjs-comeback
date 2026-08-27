package androidx.appcompat.view.menu;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class z82 implements Callable {
    public final /* synthetic */ fb2 a;
    public final /* synthetic */ r82 b;

    public z82(r82 r82Var, fb2 fb2Var) {
        this.b = r82Var;
        this.a = fb2Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        if (!this.b.Q((String) pj0.i(this.a.m)).y() || !oz1.e(this.a.H).y()) {
            this.b.l().K().a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        uw1 g = this.b.g(this.a);
        if (g == null) {
            this.b.l().L().a("App info was null when attempting to get app instance id");
            return null;
        }
        return g.u0();
    }
}
