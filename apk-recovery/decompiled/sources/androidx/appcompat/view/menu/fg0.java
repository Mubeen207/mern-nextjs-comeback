package androidx.appcompat.view.menu;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.fg0;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class fg0 {
    public final Runnable a;
    public final pf b;
    public final k4 c;
    public eg0 d;
    public OnBackInvokedCallback e;
    public OnBackInvokedDispatcher f;
    public boolean g;
    public boolean h;

    /* loaded from: classes.dex */
    public static final class a extends j80 implements kw {
        public a() {
            super(1);
        }

        public final void a(h7 h7Var) {
            c60.e(h7Var, "backEvent");
            fg0.this.g(h7Var);
        }

        @Override // androidx.appcompat.view.menu.kw
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((h7) obj);
            return u31.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j80 implements kw {
        public b() {
            super(1);
        }

        public final void a(h7 h7Var) {
            c60.e(h7Var, "backEvent");
            fg0.this.f(h7Var);
        }

        @Override // androidx.appcompat.view.menu.kw
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((h7) obj);
            return u31.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends j80 implements iw {
        public c() {
            super(0);
        }

        public final void a() {
            fg0.this.e();
        }

        @Override // androidx.appcompat.view.menu.iw
        public /* bridge */ /* synthetic */ Object d() {
            a();
            return u31.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends j80 implements iw {
        public d() {
            super(0);
        }

        public final void a() {
            fg0.this.d();
        }

        @Override // androidx.appcompat.view.menu.iw
        public /* bridge */ /* synthetic */ Object d() {
            a();
            return u31.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends j80 implements iw {
        public e() {
            super(0);
        }

        public final void a() {
            fg0.this.e();
        }

        @Override // androidx.appcompat.view.menu.iw
        public /* bridge */ /* synthetic */ Object d() {
            a();
            return u31.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        public static final f a = new f();

        public static final void c(iw iwVar) {
            c60.e(iwVar, "$onBackInvoked");
            iwVar.d();
        }

        public final OnBackInvokedCallback b(final iw iwVar) {
            c60.e(iwVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.view.menu.gg0
                public final void onBackInvoked() {
                    fg0.f.c(iw.this);
                }
            };
        }

        public final void d(Object obj, int i, Object obj2) {
            c60.e(obj, "dispatcher");
            c60.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            c60.e(obj, "dispatcher");
            c60.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public static final class g {
        public static final g a = new g();

        /* loaded from: classes.dex */
        public static final class a implements OnBackAnimationCallback {
            public final /* synthetic */ kw a;
            public final /* synthetic */ kw b;
            public final /* synthetic */ iw c;
            public final /* synthetic */ iw d;

            public a(kw kwVar, kw kwVar2, iw iwVar, iw iwVar2) {
                this.a = kwVar;
                this.b = kwVar2;
                this.c = iwVar;
                this.d = iwVar2;
            }

            public void onBackCancelled() {
                this.d.d();
            }

            public void onBackInvoked() {
                this.c.d();
            }

            public void onBackProgressed(BackEvent backEvent) {
                c60.e(backEvent, "backEvent");
                this.b.i(new h7(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                c60.e(backEvent, "backEvent");
                this.a.i(new h7(backEvent));
            }
        }

        public final OnBackInvokedCallback a(kw kwVar, kw kwVar2, iw iwVar, iw iwVar2) {
            c60.e(kwVar, "onBackStarted");
            c60.e(kwVar2, "onBackProgressed");
            c60.e(iwVar, "onBackInvoked");
            c60.e(iwVar2, "onBackCancelled");
            return new a(kwVar, kwVar2, iwVar, iwVar2);
        }
    }

    public fg0(Runnable runnable, pf pfVar) {
        OnBackInvokedCallback b2;
        this.a = runnable;
        this.b = pfVar;
        this.c = new k4();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                b2 = g.a.a(new a(), new b(), new c(), new d());
            } else {
                b2 = f.a.b(new e());
            }
            this.e = b2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        ?? r2;
        eg0 eg0Var = this.d;
        if (eg0Var == null) {
            k4 k4Var = this.c;
            ListIterator listIterator = k4Var.listIterator(k4Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    r2 = 0;
                    break;
                }
                r2 = listIterator.previous();
                if (((eg0) r2).e()) {
                    break;
                }
            }
            eg0Var = r2;
        }
        this.d = null;
        if (eg0Var != null) {
            eg0Var.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void e() {
        ?? r2;
        eg0 eg0Var = this.d;
        if (eg0Var == null) {
            k4 k4Var = this.c;
            ListIterator listIterator = k4Var.listIterator(k4Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    r2 = 0;
                    break;
                }
                r2 = listIterator.previous();
                if (((eg0) r2).e()) {
                    break;
                }
            }
            eg0Var = r2;
        }
        this.d = null;
        if (eg0Var != null) {
            eg0Var.b();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final void f(h7 h7Var) {
        ?? r1;
        eg0 eg0Var = this.d;
        if (eg0Var == null) {
            k4 k4Var = this.c;
            ListIterator listIterator = k4Var.listIterator(k4Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    r1 = 0;
                    break;
                }
                r1 = listIterator.previous();
                if (((eg0) r1).e()) {
                    break;
                }
            }
            eg0Var = r1;
        }
        if (eg0Var != null) {
            eg0Var.c(h7Var);
        }
    }

    public final void g(h7 h7Var) {
        Object obj;
        k4 k4Var = this.c;
        ListIterator<E> listIterator = k4Var.listIterator(k4Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((eg0) obj).e()) {
                break;
            }
        }
        eg0 eg0Var = (eg0) obj;
        this.d = eg0Var;
        if (eg0Var != null) {
            eg0Var.d(h7Var);
        }
    }

    public final void h(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        c60.e(onBackInvokedDispatcher, "invoker");
        this.f = onBackInvokedDispatcher;
        i(this.h);
    }

    public final void i(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f;
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.g) {
            f.a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.g = true;
        } else if (z || !this.g) {
        } else {
            f.a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.g = false;
        }
    }

    public fg0(Runnable runnable) {
        this(runnable, null);
    }
}
