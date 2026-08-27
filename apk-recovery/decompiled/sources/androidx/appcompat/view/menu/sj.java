package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.appcompat.view.menu.ez;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class sj implements dz, ez {
    public final hl0 a;
    public final Context b;
    public final hl0 c;
    public final Set d;
    public final Executor e;

    public sj(final Context context, final String str, Set set, hl0 hl0Var, Executor executor) {
        this(new hl0() { // from class: androidx.appcompat.view.menu.rj
            @Override // androidx.appcompat.view.menu.hl0
            public final Object get() {
                fz j;
                j = sj.j(context, str);
                return j;
            }
        }, set, executor, hl0Var, context);
    }

    public static ud g() {
        final xl0 a = xl0.a(u7.class, Executor.class);
        return ud.f(sj.class, dz.class, ez.class).b(il.j(Context.class)).b(il.j(tr.class)).b(il.l(bz.class)).b(il.k(o41.class)).b(il.i(a)).f(new de() { // from class: androidx.appcompat.view.menu.oj
            @Override // androidx.appcompat.view.menu.de
            public final Object a(xd xdVar) {
                sj h;
                h = sj.h(xl0.this, xdVar);
                return h;
            }
        }).d();
    }

    public static /* synthetic */ sj h(xl0 xl0Var, xd xdVar) {
        return new sj((Context) xdVar.a(Context.class), ((tr) xdVar.a(tr.class)).n(), xdVar.c(bz.class), xdVar.d(o41.class), (Executor) xdVar.e(xl0Var));
    }

    public static /* synthetic */ fz j(Context context, String str) {
        return new fz(context, str);
    }

    @Override // androidx.appcompat.view.menu.dz
    public cz0 a() {
        return r41.a(this.b) ^ true ? mz0.e("") : mz0.c(this.e, new Callable() { // from class: androidx.appcompat.view.menu.pj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i;
                i = sj.this.i();
                return i;
            }
        });
    }

    @Override // androidx.appcompat.view.menu.ez
    public synchronized ez.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        fz fzVar = (fz) this.a.get();
        if (!fzVar.i(currentTimeMillis)) {
            return ez.a.NONE;
        }
        fzVar.g();
        return ez.a.GLOBAL;
    }

    public final /* synthetic */ String i() {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                fz fzVar = (fz) this.a.get();
                List c = fzVar.c();
                fzVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < c.size(); i++) {
                    gz gzVar = (gz) c.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", gzVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) gzVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    public final /* synthetic */ Void k() {
        synchronized (this) {
            ((fz) this.a.get()).k(System.currentTimeMillis(), ((o41) this.c.get()).a());
        }
        return null;
    }

    public cz0 l() {
        if (this.d.size() > 0 && !(!r41.a(this.b))) {
            return mz0.c(this.e, new Callable() { // from class: androidx.appcompat.view.menu.qj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void k;
                    k = sj.this.k();
                    return k;
                }
            });
        }
        return mz0.e(null);
    }

    public sj(hl0 hl0Var, Set set, Executor executor, hl0 hl0Var2, Context context) {
        this.a = hl0Var;
        this.d = set;
        this.e = executor;
        this.c = hl0Var2;
        this.b = context;
    }
}
