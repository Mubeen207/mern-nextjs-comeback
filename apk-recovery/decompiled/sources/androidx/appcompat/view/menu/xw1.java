package androidx.appcompat.view.menu;

import java.lang.Thread;
/* loaded from: classes.dex */
public final class xw1 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ mw1 b;

    public xw1(mw1 mw1Var, String str) {
        this.b = mw1Var;
        pj0.i(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.l().G().b(this.a, th);
    }
}
