package androidx.appcompat.view.menu;

import android.app.Activity;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class k81 implements j81 {
    public final j81 b;
    public final n9 c;

    public k81(j81 j81Var, n9 n9Var) {
        this.b = j81Var;
        this.c = n9Var;
    }

    @Override // androidx.appcompat.view.menu.j81
    public xs a(Activity activity) {
        c60.e(activity, "activity");
        return this.b.a(activity);
    }

    public final void b(Activity activity, Executor executor, pf pfVar) {
        c60.e(activity, "activity");
        c60.e(executor, "executor");
        c60.e(pfVar, "consumer");
        this.c.a(executor, pfVar, this.b.a(activity));
    }

    public final void c(pf pfVar) {
        c60.e(pfVar, "consumer");
        this.c.b(pfVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k81(j81 j81Var) {
        this(j81Var, new n9());
        c60.e(j81Var, "tracker");
    }
}
