package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class b2 implements a2 {
    public static volatile a2 c;
    public final t3 a;
    public final Map b;

    public b2(t3 t3Var) {
        pj0.i(t3Var);
        this.a = t3Var;
        this.b = new ConcurrentHashMap();
    }

    public static a2 c(tr trVar, Context context, ey0 ey0Var) {
        pj0.i(trVar);
        pj0.i(context);
        pj0.i(ey0Var);
        pj0.i(context.getApplicationContext());
        if (c == null) {
            synchronized (b2.class) {
                try {
                    if (c == null) {
                        Bundle bundle = new Bundle(1);
                        if (trVar.t()) {
                            ey0Var.a(wi.class, new Executor() { // from class: androidx.appcompat.view.menu.me1
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new zo() { // from class: androidx.appcompat.view.menu.th1
                                @Override // androidx.appcompat.view.menu.zo
                                public final void a(vo voVar) {
                                    b2.d(voVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", trVar.s());
                        }
                        c = new b2(pn1.f(context, null, null, null, bundle).u());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static /* synthetic */ void d(vo voVar) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.a2
    public void a(String str, String str2, Object obj) {
        if (uh1.e(str) && uh1.c(str, str2)) {
            this.a.b(str, str2, obj);
        }
    }

    @Override // androidx.appcompat.view.menu.a2
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (uh1.e(str) && uh1.b(str2, bundle) && uh1.d(str, str2, bundle)) {
            uh1.a(str, str2, bundle);
            this.a.a(str, str2, bundle);
        }
    }
}
