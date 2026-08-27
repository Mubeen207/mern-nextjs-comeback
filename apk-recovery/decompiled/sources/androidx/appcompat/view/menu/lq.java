package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.view.menu.qf;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class lq implements e81 {
    public final WindowLayoutComponent a;
    public final qf b;
    public final ReentrantLock c;
    public final Map d;
    public final Map e;
    public final Map f;

    /* loaded from: classes.dex */
    public /* synthetic */ class a extends kx implements kw {
        public a(Object obj) {
            super(1, obj, he0.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        @Override // androidx.appcompat.view.menu.kw
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            k((WindowLayoutInfo) obj);
            return u31.a;
        }

        public final void k(WindowLayoutInfo windowLayoutInfo) {
            c60.e(windowLayoutInfo, "p0");
            ((he0) this.n).accept(windowLayoutInfo);
        }
    }

    public lq(WindowLayoutComponent windowLayoutComponent, qf qfVar) {
        c60.e(windowLayoutComponent, "component");
        c60.e(qfVar, "consumerAdapter");
        this.a = windowLayoutComponent;
        this.b = qfVar;
        this.c = new ReentrantLock();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
    }

    @Override // androidx.appcompat.view.menu.e81
    public void a(Context context, Executor executor, pf pfVar) {
        u31 u31Var;
        List e;
        c60.e(context, "context");
        c60.e(executor, "executor");
        c60.e(pfVar, "callback");
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            he0 he0Var = (he0) this.d.get(context);
            if (he0Var != null) {
                he0Var.b(pfVar);
                this.e.put(pfVar, context);
                u31Var = u31.a;
            } else {
                u31Var = null;
            }
            if (u31Var == null) {
                he0 he0Var2 = new he0(context);
                this.d.put(context, he0Var2);
                this.e.put(pfVar, context);
                he0Var2.b(pfVar);
                if (!(context instanceof Activity)) {
                    e = sc.e();
                    he0Var2.accept(new WindowLayoutInfo(e));
                    reentrantLock.unlock();
                    return;
                }
                this.f.put(he0Var2, this.b.c(this.a, go0.b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new a(he0Var2)));
            }
            u31 u31Var2 = u31.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.e81
    public void b(pf pfVar) {
        c60.e(pfVar, "callback");
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.e.get(pfVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            he0 he0Var = (he0) this.d.get(context);
            if (he0Var == null) {
                reentrantLock.unlock();
                return;
            }
            he0Var.d(pfVar);
            this.e.remove(pfVar);
            if (he0Var.c()) {
                this.d.remove(context);
                qf.b bVar = (qf.b) this.f.remove(he0Var);
                if (bVar != null) {
                    bVar.a();
                }
            }
            u31 u31Var = u31.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
