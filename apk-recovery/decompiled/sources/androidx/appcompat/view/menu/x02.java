package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class x02 implements Executor {
    public final /* synthetic */ g02 m;

    public x02(g02 g02Var) {
        this.m = g02Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.m.h().D(runnable);
    }
}
