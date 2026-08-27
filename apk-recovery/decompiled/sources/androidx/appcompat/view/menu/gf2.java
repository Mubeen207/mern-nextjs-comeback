package androidx.appcompat.view.menu;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class gf2 implements Executor {
    public final Handler m = new je1(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.m.post(runnable);
    }
}
