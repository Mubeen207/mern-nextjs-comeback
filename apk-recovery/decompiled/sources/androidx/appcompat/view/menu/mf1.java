package androidx.appcompat.view.menu;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class mf1 implements qf1 {
    public final CountDownLatch a = new CountDownLatch(1);

    public /* synthetic */ mf1(hf1 hf1Var) {
    }

    @Override // androidx.appcompat.view.menu.pg0
    public final void a(Object obj) {
        this.a.countDown();
    }

    public final void b() {
        this.a.await();
    }

    @Override // androidx.appcompat.view.menu.ig0
    public final void c() {
        this.a.countDown();
    }

    @Override // androidx.appcompat.view.menu.lg0
    public final void d(Exception exc) {
        this.a.countDown();
    }

    public final boolean e(long j, TimeUnit timeUnit) {
        return this.a.await(j, timeUnit);
    }
}
