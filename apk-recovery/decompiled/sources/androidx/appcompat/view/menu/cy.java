package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.view.menu.ac;
import androidx.appcompat.view.menu.m2;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
/* loaded from: classes.dex */
public abstract class cy {
    public final Context a;
    public final String b;
    public final m2 c;
    public final m2.d d;
    public final r2 e;
    public final Looper f;
    public final int g;
    public final fy h;
    public final ex0 i;
    public final gy j;

    /* loaded from: classes.dex */
    public static class a {
        public static final a c = new C0003a().a();
        public final ex0 a;
        public final Looper b;

        /* renamed from: androidx.appcompat.view.menu.cy$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0003a {
            public ex0 a;
            public Looper b;

            public a a() {
                if (this.a == null) {
                    this.a = new p2();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }
        }

        public a(ex0 ex0Var, Account account, Looper looper) {
            this.a = ex0Var;
            this.b = looper;
        }
    }

    public cy(Context context, Activity activity, m2 m2Var, m2.d dVar, a aVar) {
        pj0.j(context, "Null context is not permitted.");
        pj0.j(m2Var, "Api must not be null.");
        pj0.j(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        String str = null;
        if (ti0.k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.b = str;
        this.c = m2Var;
        this.d = dVar;
        this.f = aVar.b;
        r2 a2 = r2.a(m2Var, dVar, str);
        this.e = a2;
        this.h = new bc1(this);
        gy x = gy.x(this.a);
        this.j = x;
        this.g = x.m();
        this.i = aVar.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            kb1.u(activity, x, a2);
        }
        x.b(this);
    }

    public ac.a b() {
        ac.a aVar = new ac.a();
        aVar.d(null);
        aVar.c(Collections.emptySet());
        aVar.e(this.a.getClass().getName());
        aVar.b(this.a.getPackageName());
        return aVar;
    }

    public cz0 c(dz0 dz0Var) {
        return i(2, dz0Var);
    }

    public final r2 d() {
        return this.e;
    }

    public String e() {
        return this.b;
    }

    public final int f() {
        return this.g;
    }

    public final m2.f g(Looper looper, wb1 wb1Var) {
        m2.f b = ((m2.a) pj0.i(this.c.a())).b(this.a, looper, b().a(), this.d, wb1Var, wb1Var);
        String e = e();
        if (e != null && (b instanceof z7)) {
            ((z7) b).P(e);
        }
        if (e == null || !(b instanceof ef0)) {
            return b;
        }
        ef0 ef0Var = (ef0) b;
        throw null;
    }

    public final pc1 h(Context context, Handler handler) {
        return new pc1(context, handler, b().a());
    }

    public final cz0 i(int i, dz0 dz0Var) {
        ez0 ez0Var = new ez0();
        this.j.D(this, i, dz0Var, ez0Var, this.i);
        return ez0Var.a();
    }

    public cy(Context context, m2 m2Var, m2.d dVar, a aVar) {
        this(context, null, m2Var, dVar, aVar);
    }
}
