package androidx.appcompat.view.menu;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class jo1 implements ThreadFactory {
    public ThreadFactory a = Executors.defaultThreadFactory();

    public jo1(pn1 pn1Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
