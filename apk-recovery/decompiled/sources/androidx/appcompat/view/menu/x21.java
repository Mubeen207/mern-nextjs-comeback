package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.view.menu.av;
import androidx.appcompat.view.menu.bv;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class x21 extends w21 {
    public final Class g;
    public final Constructor h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public x21() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = t();
            constructor = u(cls);
            method = q(cls);
            method2 = r(cls);
            method3 = v(cls);
            method4 = p(cls);
            method5 = s(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method;
        this.j = method2;
        this.k = method3;
        this.l = method4;
        this.m = method5;
    }

    @Override // androidx.appcompat.view.menu.w21, androidx.appcompat.view.menu.a31
    public Typeface a(Context context, av.c cVar, Resources resources, int i) {
        av.d[] a;
        if (o()) {
            Object j = j();
            if (j == null) {
                return null;
            }
            for (av.d dVar : cVar.a()) {
                if (!l(context, j, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                    k(j);
                    return null;
                }
            }
            if (n(j)) {
                return h(j);
            }
            return null;
        }
        return super.a(context, cVar, resources, i);
    }

    @Override // androidx.appcompat.view.menu.a31
    public Typeface b(Context context, CancellationSignal cancellationSignal, bv.b[] bVarArr, int i) {
        Typeface h;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!o()) {
            bv.b f = f(bVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f.e()).setItalic(f.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map f2 = b31.f(context, bVarArr, cancellationSignal);
        Object j = j();
        if (j == null) {
            return null;
        }
        boolean z = false;
        for (bv.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) f2.get(bVar.d());
            if (byteBuffer != null) {
                if (!m(j, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    k(j);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            k(j);
            return null;
        } else if (n(j) && (h = h(j)) != null) {
            return Typeface.create(h, i);
        } else {
            return null;
        }
    }

    @Override // androidx.appcompat.view.menu.a31
    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        if (o()) {
            Object j = j();
            if (j == null) {
                return null;
            }
            if (!l(context, j, str, 0, -1, -1, null)) {
                k(j);
                return null;
            } else if (n(j)) {
                return h(j);
            } else {
                return null;
            }
        }
        return super.c(context, resources, i, str, i2);
    }

    public abstract Typeface h(Object obj);

    public final Object j() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void k(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean l(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean n(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o() {
        return this.i != null;
    }

    public Method p(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    public Method q(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method r(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public abstract Method s(Class cls);

    public Class t() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor u(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    public Method v(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
