package androidx.appcompat.view.menu;

import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public abstract class dp extends bp {
    public abstract Thread O();

    public final void P() {
        Thread O = O();
        if (Thread.currentThread() != O) {
            w.a();
            LockSupport.unpark(O);
        }
    }
}
