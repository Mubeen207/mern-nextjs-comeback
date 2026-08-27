package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.appcompat.view.menu.av;
import androidx.appcompat.view.menu.bv;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public abstract class a31 {
    public ConcurrentHashMap a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public class a implements b {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.a31.b
        /* renamed from: c */
        public int a(bv.b bVar) {
            return bVar.e();
        }

        @Override // androidx.appcompat.view.menu.a31.b
        /* renamed from: d */
        public boolean b(bv.b bVar) {
            return bVar.f();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    public static Object d(Object[] objArr, int i, b bVar) {
        return e(objArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, bVar);
    }

    public static Object e(Object[] objArr, int i, boolean z, b bVar) {
        Object obj = null;
        int i2 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.a(obj2) - i) * 2) + (bVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i2 > abs) {
                obj = obj2;
                i2 = abs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, av.c cVar, Resources resources, int i);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, bv.b[] bVarArr, int i);

    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        File d = b31.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (b31.b(d, resources, i)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public bv.b f(bv.b[] bVarArr, int i) {
        return (bv.b) d(bVarArr, i, new a());
    }
}
