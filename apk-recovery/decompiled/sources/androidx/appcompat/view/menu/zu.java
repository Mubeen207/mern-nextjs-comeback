package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.appcompat.view.menu.bv;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public abstract class zu {
    public static final sa0 a = new sa0(16);
    public static final ExecutorService b = bp0.a("fonts-androidx", 10, 10000);
    public static final Object c = new Object();
    public static final qu0 d = new qu0();

    /* loaded from: classes.dex */
    public class a implements Callable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ xu c;
        public final /* synthetic */ int d;

        public a(String str, Context context, xu xuVar, int i) {
            this.a = str;
            this.b = context;
            this.c = xuVar;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            return zu.c(this.a, this.b, this.c, this.d);
        }
    }

    /* loaded from: classes.dex */
    public class b implements pf {
        public final /* synthetic */ p9 a;

        public b(p9 p9Var) {
            this.a = p9Var;
        }

        @Override // androidx.appcompat.view.menu.pf, androidx.window.extensions.core.util.function.Consumer
        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.a.b(eVar);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Callable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ xu c;
        public final /* synthetic */ int d;

        public c(String str, Context context, xu xuVar, int i) {
            this.a = str;
            this.b = context;
            this.c = xuVar;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            try {
                return zu.c(this.a, this.b, this.c, this.d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements pf {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // androidx.appcompat.view.menu.pf, androidx.window.extensions.core.util.function.Consumer
        /* renamed from: a */
        public void accept(e eVar) {
            synchronized (zu.c) {
                try {
                    qu0 qu0Var = zu.d;
                    ArrayList arrayList = (ArrayList) qu0Var.get(this.a);
                    if (arrayList == null) {
                        return;
                    }
                    qu0Var.remove(this.a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((pf) arrayList.get(i)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final Typeface a;
        public final int b;

        public e(int i) {
            this.a = null;
            this.b = i;
        }

        public boolean a() {
            return this.b == 0;
        }

        public e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }

    public static String a(xu xuVar, int i) {
        return xuVar.d() + "-" + i;
    }

    public static int b(bv.a aVar) {
        int i = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        bv.b[] b2 = aVar.b();
        if (b2 != null && b2.length != 0) {
            i = 0;
            for (bv.b bVar : b2) {
                int b3 = bVar.b();
                if (b3 != 0) {
                    if (b3 < 0) {
                        return -3;
                    }
                    return b3;
                }
            }
        }
        return i;
    }

    public static e c(String str, Context context, xu xuVar, int i) {
        sa0 sa0Var = a;
        Typeface typeface = (Typeface) sa0Var.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            bv.a e2 = wu.e(context, xuVar, null);
            int b2 = b(e2);
            if (b2 != 0) {
                return new e(b2);
            }
            Typeface b3 = v21.b(context, null, e2.b(), i);
            if (b3 != null) {
                sa0Var.d(str, b3);
                return new e(b3);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, xu xuVar, int i, Executor executor, p9 p9Var) {
        String a2 = a(xuVar, i);
        Typeface typeface = (Typeface) a.c(a2);
        if (typeface != null) {
            p9Var.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(p9Var);
        synchronized (c) {
            try {
                qu0 qu0Var = d;
                ArrayList arrayList = (ArrayList) qu0Var.get(a2);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                qu0Var.put(a2, arrayList2);
                c cVar = new c(a2, context, xuVar, i);
                if (executor == null) {
                    executor = b;
                }
                bp0.b(executor, cVar, new d(a2));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, xu xuVar, p9 p9Var, int i, int i2) {
        String a2 = a(xuVar, i);
        Typeface typeface = (Typeface) a.c(a2);
        if (typeface != null) {
            p9Var.b(new e(typeface));
            return typeface;
        } else if (i2 == -1) {
            e c2 = c(a2, context, xuVar, i);
            p9Var.b(c2);
            return c2.a;
        } else {
            try {
                e eVar = (e) bp0.c(b, new a(a2, context, xuVar, i), i2);
                p9Var.b(eVar);
                return eVar.a;
            } catch (InterruptedException unused) {
                p9Var.b(new e(-3));
                return null;
            }
        }
    }
}
