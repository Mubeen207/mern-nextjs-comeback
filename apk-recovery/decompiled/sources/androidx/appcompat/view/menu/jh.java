package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.o9;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public abstract class jh {

    /* loaded from: classes.dex */
    public static final class a extends j80 implements kw {
        public final /* synthetic */ o9.a n;
        public final /* synthetic */ ok o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o9.a aVar, ok okVar) {
            super(1);
            this.n = aVar;
            this.o = okVar;
        }

        public final void a(Throwable th) {
            if (th == null) {
                this.n.b(this.o.i());
            } else if (th instanceof CancellationException) {
                this.n.c();
            } else {
                this.n.e(th);
            }
        }

        @Override // androidx.appcompat.view.menu.kw
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return u31.a;
        }
    }

    public static final m90 b(final ok okVar, final Object obj) {
        c60.e(okVar, "<this>");
        m90 a2 = o9.a(new o9.c() { // from class: androidx.appcompat.view.menu.ih
            @Override // androidx.appcompat.view.menu.o9.c
            public final Object a(o9.a aVar) {
                Object d;
                d = jh.d(ok.this, obj, aVar);
                return d;
            }
        });
        c60.d(a2, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a2;
    }

    public static /* synthetic */ m90 c(ok okVar, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(okVar, obj);
    }

    public static final Object d(ok okVar, Object obj, o9.a aVar) {
        c60.e(okVar, "$this_asListenableFuture");
        c60.e(aVar, "completer");
        okVar.h(new a(aVar, okVar));
        return obj;
    }
}
