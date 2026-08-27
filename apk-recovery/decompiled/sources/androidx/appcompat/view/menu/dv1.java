package androidx.appcompat.view.menu;

import android.content.Context;
import android.database.ContentObserver;
/* loaded from: classes.dex */
public final class dv1 implements tu1 {
    public static dv1 c;
    public final Context a;
    public final ContentObserver b;

    public dv1() {
        this.a = null;
        this.b = null;
    }

    public static dv1 a(Context context) {
        dv1 dv1Var;
        synchronized (dv1.class) {
            try {
                if (c == null) {
                    c = ai0.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new dv1(context) : new dv1();
                }
                dv1Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dv1Var;
    }

    public static synchronized void b() {
        Context context;
        synchronized (dv1.class) {
            try {
                dv1 dv1Var = c;
                if (dv1Var != null && (context = dv1Var.a) != null && dv1Var.b != null) {
                    context.getContentResolver().unregisterContentObserver(c.b);
                }
                c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ String c(String str) {
        return rt1.a(this.a.getContentResolver(), str, null);
    }

    @Override // androidx.appcompat.view.menu.tu1
    /* renamed from: d */
    public final String h(final String str) {
        Context context = this.a;
        if (context != null && !cu1.b(context)) {
            try {
                return (String) zu1.a(new xu1() { // from class: androidx.appcompat.view.menu.bv1
                    @Override // androidx.appcompat.view.menu.xu1
                    public final Object a() {
                        return dv1.this.c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                new StringBuilder("Unable to read GServices for: ").append(str);
            }
        }
        return null;
    }

    public dv1(Context context) {
        this.a = context;
        hv1 hv1Var = new hv1(this, null);
        this.b = hv1Var;
        context.getContentResolver().registerContentObserver(rt1.a, true, hv1Var);
    }
}
