package androidx.appcompat.view.menu;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class cx1 extends FutureTask implements Comparable {
    public final long m;
    public final boolean n;
    public final String o;
    public final /* synthetic */ mw1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx1(mw1 mw1Var, Runnable runnable, boolean z, String str) {
        super(rl1.a().b(runnable), null);
        AtomicLong atomicLong;
        this.p = mw1Var;
        pj0.i(str);
        atomicLong = mw1.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.m = andIncrement;
        this.o = str;
        this.n = z;
        if (andIncrement == Long.MAX_VALUE) {
            mw1Var.l().G().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        cx1 cx1Var = (cx1) obj;
        boolean z = this.n;
        if (z != cx1Var.n) {
            return z ? -1 : 1;
        }
        long j = this.m;
        long j2 = cx1Var.m;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.p.l().I().b("Two tasks share the same index. index", Long.valueOf(this.m));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.p.l().G().b(this.o, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx1(mw1 mw1Var, Callable callable, boolean z, String str) {
        super(rl1.a().a(callable));
        AtomicLong atomicLong;
        this.p = mw1Var;
        pj0.i(str);
        atomicLong = mw1.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.m = andIncrement;
        this.o = str;
        this.n = z;
        if (andIncrement == Long.MAX_VALUE) {
            mw1Var.l().G().a("Tasks index overflow");
        }
    }
}
