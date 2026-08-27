package androidx.appcompat.view.menu;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public enum h31 implements Executor {
    INSTANCE;
    
    public static final Handler n = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        n.post(runnable);
    }
}
