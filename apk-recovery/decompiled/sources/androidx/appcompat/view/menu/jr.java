package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class jr {
    public static final Object c = new Object();
    public static ma1 d;
    public final Context a;
    public final Executor b = new lc0();

    public jr(Context context) {
        this.a = context;
    }

    public static cz0 e(Context context, Intent intent, boolean z) {
        Log.isLoggable("FirebaseMessaging", 3);
        ma1 f = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (z) {
            if (gt0.b().e(context)) {
                t71.f(context, f, intent);
            } else {
                f.c(intent);
            }
            return mz0.e(-1);
        }
        return f.c(intent).f(new lc0(), new yg() { // from class: androidx.appcompat.view.menu.ir
            @Override // androidx.appcompat.view.menu.yg
            public final Object a(cz0 cz0Var) {
                Integer g;
                g = jr.g(cz0Var);
                return g;
            }
        });
    }

    public static ma1 f(Context context, String str) {
        ma1 ma1Var;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new ma1(context, str);
                }
                ma1Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ma1Var;
    }

    public static /* synthetic */ Integer g(cz0 cz0Var) {
        return -1;
    }

    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(gt0.b().g(context, intent));
    }

    public static /* synthetic */ Integer i(cz0 cz0Var) {
        return 403;
    }

    public static /* synthetic */ cz0 j(Context context, Intent intent, boolean z, cz0 cz0Var) {
        return (ti0.h() && ((Integer) cz0Var.i()).intValue() == 402) ? e(context, intent, z).f(new lc0(), new yg() { // from class: androidx.appcompat.view.menu.hr
            @Override // androidx.appcompat.view.menu.yg
            public final Object a(cz0 cz0Var2) {
                Integer i;
                i = jr.i(cz0Var2);
                return i;
            }
        }) : cz0Var;
    }

    public cz0 k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.a, intent);
    }

    public cz0 l(final Context context, final Intent intent) {
        boolean z = ti0.h() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? mz0.c(this.b, new Callable() { // from class: androidx.appcompat.view.menu.fr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer h;
                h = jr.h(context, intent);
                return h;
            }
        }).g(this.b, new yg() { // from class: androidx.appcompat.view.menu.gr
            @Override // androidx.appcompat.view.menu.yg
            public final Object a(cz0 cz0Var) {
                cz0 j;
                j = jr.j(context, intent, z2, cz0Var);
                return j;
            }
        }) : e(context, intent, z2);
    }
}
