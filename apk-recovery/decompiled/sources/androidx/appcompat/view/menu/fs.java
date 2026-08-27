package androidx.appcompat.view.menu;

import android.text.TextUtils;
import androidx.appcompat.view.menu.d11;
import androidx.appcompat.view.menu.hs;
import androidx.appcompat.view.menu.q50;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class fs implements gs {
    public static final Object m = new Object();
    public static final ThreadFactory n = new a();
    public final tr a;
    public final as b;
    public final ci0 c;
    public final w41 d;
    public final m80 e;
    public final un0 f;
    public final Object g;
    public final ExecutorService h;
    public final Executor i;
    public String j;
    public Set k;
    public final List l;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[d11.b.values().length];
            b = iArr;
            try {
                iArr[d11.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[d11.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[d11.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[q50.b.values().length];
            a = iArr2;
            try {
                iArr2[q50.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[q50.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public fs(final tr trVar, hl0 hl0Var, ExecutorService executorService, Executor executor) {
        this(executorService, executor, trVar, new as(trVar.j(), hl0Var), new ci0(trVar), w41.c(), new m80(new hl0() { // from class: androidx.appcompat.view.menu.cs
            @Override // androidx.appcompat.view.menu.hl0
            public final Object get() {
                j40 z;
                z = fs.z(tr.this);
                return z;
            }
        }), new un0());
    }

    public static fs q() {
        return r(tr.k());
    }

    public static fs r(tr trVar) {
        pj0.b(trVar != null, "Null is not a valid value of FirebaseApp.");
        return (fs) trVar.i(gs.class);
    }

    public static /* synthetic */ j40 z(tr trVar) {
        return new j40(trVar);
    }

    public final void A() {
        pj0.f(n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        pj0.f(u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        pj0.f(m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        pj0.b(w41.h(n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        pj0.b(w41.g(m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String B(di0 di0Var) {
        if ((this.a.l().equals("CHIME_ANDROID_SDK") || this.a.t()) && di0Var.m()) {
            String f = p().f();
            return TextUtils.isEmpty(f) ? this.f.a() : f;
        }
        return this.f.a();
    }

    public final di0 C(di0 di0Var) {
        q50 d = this.b.d(m(), di0Var.d(), u(), n(), (di0Var.d() == null || di0Var.d().length() != 11) ? null : p().i());
        int i = b.a[d.e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return di0Var.q("BAD CONFIG");
            }
            throw new hs("Firebase Installations Service is unavailable. Please try again later.", hs.a.UNAVAILABLE);
        }
        return di0Var.s(d.c(), d.d(), this.d.b(), d.b().c(), d.b().d());
    }

    public final void D(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((bx0) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void E(di0 di0Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((bx0) it.next()).a(di0Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void F(String str) {
        this.j = str;
    }

    public final synchronized void G(di0 di0Var, di0 di0Var2) {
        if (this.k.size() != 0 && !TextUtils.equals(di0Var.d(), di0Var2.d())) {
            Iterator it = this.k.iterator();
            if (it.hasNext()) {
                my0.a(it.next());
                di0Var2.d();
                throw null;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.gs
    public cz0 a() {
        A();
        String o = o();
        if (o != null) {
            return mz0.e(o);
        }
        cz0 h = h();
        this.h.execute(new Runnable() { // from class: androidx.appcompat.view.menu.bs
            @Override // java.lang.Runnable
            public final void run() {
                fs.this.x();
            }
        });
        return h;
    }

    @Override // androidx.appcompat.view.menu.gs
    public cz0 b(final boolean z) {
        A();
        cz0 g = g();
        this.h.execute(new Runnable() { // from class: androidx.appcompat.view.menu.es
            @Override // java.lang.Runnable
            public final void run() {
                fs.this.y(z);
            }
        });
        return g;
    }

    public final cz0 g() {
        ez0 ez0Var = new ez0();
        i(new px(this.d, ez0Var));
        return ez0Var.a();
    }

    public final cz0 h() {
        ez0 ez0Var = new ez0();
        i(new qx(ez0Var));
        return ez0Var.a();
    }

    public final void i(bx0 bx0Var) {
        synchronized (this.g) {
            this.l.add(bx0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(boolean r3) {
        /*
            r2 = this;
            androidx.appcompat.view.menu.di0 r0 = r2.s()
            boolean r1 = r0.i()     // Catch: androidx.appcompat.view.menu.hs -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.l()     // Catch: androidx.appcompat.view.menu.hs -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            androidx.appcompat.view.menu.w41 r3 = r2.d     // Catch: androidx.appcompat.view.menu.hs -> L1d
            boolean r3 = r3.f(r0)     // Catch: androidx.appcompat.view.menu.hs -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L61
        L1f:
            androidx.appcompat.view.menu.di0 r3 = r2.l(r0)     // Catch: androidx.appcompat.view.menu.hs -> L1d
            goto L28
        L24:
            androidx.appcompat.view.menu.di0 r3 = r2.C(r0)     // Catch: androidx.appcompat.view.menu.hs -> L1d
        L28:
            r2.v(r3)
            r2.G(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.d()
            r2.F(r0)
        L3b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4c
            androidx.appcompat.view.menu.hs r3 = new androidx.appcompat.view.menu.hs
            androidx.appcompat.view.menu.hs$a r0 = androidx.appcompat.view.menu.hs.a.BAD_CONFIG
            r3.<init>(r0)
            r2.D(r3)
            goto L60
        L4c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.D(r3)
            goto L60
        L5d:
            r2.E(r3)
        L60:
            return
        L61:
            r2.D(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.fs.w(boolean):void");
    }

    /* renamed from: k */
    public final void y(final boolean z) {
        di0 t = t();
        if (z) {
            t = t.p();
        }
        E(t);
        this.i.execute(new Runnable() { // from class: androidx.appcompat.view.menu.ds
            @Override // java.lang.Runnable
            public final void run() {
                fs.this.w(z);
            }
        });
    }

    public final di0 l(di0 di0Var) {
        d11 e = this.b.e(m(), di0Var.d(), u(), di0Var.f());
        int i = b.b[e.b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    F(null);
                    return di0Var.r();
                }
                throw new hs("Firebase Installations Service is unavailable. Please try again later.", hs.a.UNAVAILABLE);
            }
            return di0Var.q("BAD CONFIG");
        }
        return di0Var.o(e.c(), e.d(), this.d.b());
    }

    public String m() {
        return this.a.m().b();
    }

    public String n() {
        return this.a.m().c();
    }

    public final synchronized String o() {
        return this.j;
    }

    public final j40 p() {
        return (j40) this.e.get();
    }

    public final di0 s() {
        di0 d;
        synchronized (m) {
            try {
                hi a2 = hi.a(this.a.j(), "generatefid.lock");
                d = this.c.d();
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    public final di0 t() {
        di0 d;
        synchronized (m) {
            try {
                hi a2 = hi.a(this.a.j(), "generatefid.lock");
                d = this.c.d();
                if (d.j()) {
                    d = this.c.b(d.t(B(d)));
                }
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    public String u() {
        return this.a.m().e();
    }

    public final void v(di0 di0Var) {
        synchronized (m) {
            try {
                hi a2 = hi.a(this.a.j(), "generatefid.lock");
                this.c.b(di0Var);
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void x() {
        y(false);
    }

    public fs(ExecutorService executorService, Executor executor, tr trVar, as asVar, ci0 ci0Var, w41 w41Var, m80 m80Var, un0 un0Var) {
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = trVar;
        this.b = asVar;
        this.c = ci0Var;
        this.d = w41Var;
        this.e = m80Var;
        this.f = un0Var;
        this.h = executorService;
        this.i = executor;
    }
}
