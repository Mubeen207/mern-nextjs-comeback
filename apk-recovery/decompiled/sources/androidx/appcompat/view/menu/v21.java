package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.appcompat.view.menu.av;
import androidx.appcompat.view.menu.bv;
import androidx.appcompat.view.menu.ip0;
/* loaded from: classes.dex */
public abstract class v21 {
    public static final a31 a;
    public static final sa0 b;

    /* loaded from: classes.dex */
    public static class a extends bv.c {
        public ip0.e a;

        public a(ip0.e eVar) {
            this.a = eVar;
        }

        @Override // androidx.appcompat.view.menu.bv.c
        public void a(int i) {
            ip0.e eVar = this.a;
            if (eVar != null) {
                eVar.f(i);
            }
        }

        @Override // androidx.appcompat.view.menu.bv.c
        public void b(Typeface typeface) {
            ip0.e eVar = this.a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new z21();
        } else {
            a = new y21();
        }
        b = new sa0(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, bv.b[] bVarArr, int i) {
        return a.b(context, cancellationSignal, bVarArr, i);
    }

    public static Typeface c(Context context, av.b bVar, Resources resources, int i, String str, int i2, int i3, ip0.e eVar, Handler handler, boolean z) {
        Typeface a2;
        if (bVar instanceof av.e) {
            av.e eVar2 = (av.e) bVar;
            Typeface g = g(eVar2.c());
            if (g != null) {
                if (eVar != null) {
                    eVar.d(g, handler);
                }
                return g;
            }
            a2 = bv.c(context, eVar2.b(), i3, !z ? eVar != null : eVar2.a() != 0, z ? eVar2.d() : -1, ip0.e.e(handler), new a(eVar));
        } else {
            a2 = a.a(context, (av.c) bVar, resources, i3);
            if (eVar != null) {
                if (a2 != null) {
                    eVar.d(a2, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a2 != null) {
            b.d(e(resources, i, str, i2, i3), a2);
        }
        return a2;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface c = a.c(context, resources, i, str, i3);
        if (c != null) {
            b.d(e(resources, i, str, i2, i3), c);
        }
        return c;
    }

    public static String e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface f(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) b.c(e(resources, i, str, i2, i3));
    }

    public static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
