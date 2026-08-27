package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public class nd {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(nd.class, "_handled");
    private volatile int _handled;
    public final Throwable a;

    public nd(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    public final boolean a() {
        return b.get(this) != 0;
    }

    public final boolean b() {
        return b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return hj.a(this) + '[' + this.a + ']';
    }

    public /* synthetic */ nd(Throwable th, boolean z, int i, lj ljVar) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
