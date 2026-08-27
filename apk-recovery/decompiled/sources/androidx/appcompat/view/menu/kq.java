package androidx.appcompat.view.menu;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class kq implements e81 {
    public static final void d(pf pfVar) {
        List e;
        c60.e(pfVar, "$callback");
        e = sc.e();
        pfVar.accept(new ba1(e));
    }

    @Override // androidx.appcompat.view.menu.e81
    public void a(Context context, Executor executor, final pf pfVar) {
        c60.e(context, "context");
        c60.e(executor, "executor");
        c60.e(pfVar, "callback");
        executor.execute(new Runnable() { // from class: androidx.appcompat.view.menu.jq
            @Override // java.lang.Runnable
            public final void run() {
                kq.d(pf.this);
            }
        });
    }

    @Override // androidx.appcompat.view.menu.e81
    public void b(pf pfVar) {
        c60.e(pfVar, "callback");
    }
}
