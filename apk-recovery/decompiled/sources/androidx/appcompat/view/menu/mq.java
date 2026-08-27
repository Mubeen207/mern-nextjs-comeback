package androidx.appcompat.view.menu;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class mq implements e81 {
    public final WindowLayoutComponent a;
    public final ReentrantLock b;
    public final Map c;
    public final Map d;

    public mq(WindowLayoutComponent windowLayoutComponent) {
        c60.e(windowLayoutComponent, "component");
        this.a = windowLayoutComponent;
        this.b = new ReentrantLock();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override // androidx.appcompat.view.menu.e81
    public void a(Context context, Executor executor, pf pfVar) {
        u31 u31Var;
        c60.e(context, "context");
        c60.e(executor, "executor");
        c60.e(pfVar, "callback");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            he0 he0Var = (he0) this.c.get(context);
            if (he0Var != null) {
                he0Var.b(pfVar);
                this.d.put(pfVar, context);
                u31Var = u31.a;
            } else {
                u31Var = null;
            }
            if (u31Var == null) {
                he0 he0Var2 = new he0(context);
                this.c.put(context, he0Var2);
                this.d.put(pfVar, context);
                he0Var2.b(pfVar);
                this.a.addWindowLayoutInfoListener(context, he0Var2);
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
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Context context = (Context) this.d.get(pfVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            he0 he0Var = (he0) this.c.get(context);
            if (he0Var == null) {
                reentrantLock.unlock();
                return;
            }
            he0Var.d(pfVar);
            this.d.remove(pfVar);
            if (he0Var.c()) {
                this.c.remove(context);
                this.a.removeWindowLayoutInfoListener(he0Var);
            }
            u31 u31Var = u31.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
