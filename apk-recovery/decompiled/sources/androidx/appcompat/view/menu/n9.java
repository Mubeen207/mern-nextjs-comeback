package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t60;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class n9 {
    public final ReentrantLock a = new ReentrantLock();
    public final Map b = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a extends oy0 implements yw {
        public int q;
        public final /* synthetic */ xs r;
        public final /* synthetic */ pf s;

        /* renamed from: androidx.appcompat.view.menu.n9$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0016a implements ys {
            public final /* synthetic */ pf a;

            public C0016a(pf pfVar) {
                this.a = pfVar;
            }

            @Override // androidx.appcompat.view.menu.ys
            public final Object a(Object obj, xg xgVar) {
                this.a.accept(obj);
                return u31.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xs xsVar, pf pfVar, xg xgVar) {
            super(2, xgVar);
            this.r = xsVar;
            this.s = pfVar;
        }

        @Override // androidx.appcompat.view.menu.y7
        public final xg a(Object obj, xg xgVar) {
            return new a(this.r, this.s, xgVar);
        }

        @Override // androidx.appcompat.view.menu.y7
        public final Object k(Object obj) {
            Object c = d60.c();
            int i = this.q;
            if (i == 0) {
                rp0.b(obj);
                xs xsVar = this.r;
                C0016a c0016a = new C0016a(this.s);
                this.q = 1;
                if (xsVar.b(c0016a, this) == c) {
                    return c;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp0.b(obj);
            }
            return u31.a;
        }

        @Override // androidx.appcompat.view.menu.yw
        /* renamed from: o */
        public final Object h(th thVar, xg xgVar) {
            return ((a) a(thVar, xgVar)).k(u31.a);
        }
    }

    public final void a(Executor executor, pf pfVar, xs xsVar) {
        c60.e(executor, "executor");
        c60.e(pfVar, "consumer");
        c60.e(xsVar, "flow");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (this.b.get(pfVar) == null) {
                this.b.put(pfVar, b9.d(uh.a(xp.a(executor)), null, null, new a(xsVar, pfVar, null), 3, null));
            }
            u31 u31Var = u31.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(pf pfVar) {
        c60.e(pfVar, "consumer");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            t60 t60Var = (t60) this.b.get(pfVar);
            if (t60Var != null) {
                t60.a.a(t60Var, null, 1, null);
            }
            t60 t60Var2 = (t60) this.b.remove(pfVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
