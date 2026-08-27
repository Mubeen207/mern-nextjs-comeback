package androidx.appcompat.view.menu;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class he0 implements pf, Consumer {
    public final Context a;
    public final ReentrantLock b;
    public ba1 c;
    public final Set d;

    public he0(Context context) {
        c60.e(context, "context");
        this.a = context;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }

    @Override // androidx.appcompat.view.menu.pf, androidx.window.extensions.core.util.function.Consumer
    /* renamed from: a */
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        c60.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.c = oq.a.b(this.a, windowLayoutInfo);
            for (pf pfVar : this.d) {
                pfVar.accept(this.c);
            }
            u31 u31Var = u31.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(pf pfVar) {
        c60.e(pfVar, "listener");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            ba1 ba1Var = this.c;
            if (ba1Var != null) {
                pfVar.accept(ba1Var);
            }
            this.d.add(pfVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.d.isEmpty();
    }

    public final void d(pf pfVar) {
        c60.e(pfVar, "listener");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d.remove(pfVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
