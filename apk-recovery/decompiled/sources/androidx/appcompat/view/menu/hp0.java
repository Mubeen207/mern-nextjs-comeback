package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class hp0 {
    public static hp0 i;
    public WeakHashMap a;
    public qu0 b;
    public gw0 c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public c g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final a j = new a(6);

    /* loaded from: classes.dex */
    public static class a extends sa0 {
        public a(int i) {
            super(i);
        }

        public static int j(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter k(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(j(i, mode)));
        }

        public PorterDuffColorFilter l(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i, mode)), porterDuffColorFilter);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface c {
        Drawable a(hp0 hp0Var, Context context, int i);

        boolean b(Context context, int i, Drawable drawable);

        PorterDuff.Mode c(int i);

        ColorStateList d(Context context, int i);

        boolean e(Context context, int i, Drawable drawable);
    }

    public static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized hp0 g() {
        hp0 hp0Var;
        synchronized (hp0.class) {
            try {
                if (i == null) {
                    hp0 hp0Var2 = new hp0();
                    i = hp0Var2;
                    o(hp0Var2);
                }
                hp0Var = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hp0Var;
    }

    public static synchronized PorterDuffColorFilter k(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter k;
        synchronized (hp0.class) {
            a aVar = j;
            k = aVar.k(i2, mode);
            if (k == null) {
                k = new PorterDuffColorFilter(i2, mode);
                aVar.l(i2, mode, k);
            }
        }
        return k;
    }

    public static void o(hp0 hp0Var) {
    }

    public static boolean p(Drawable drawable) {
        return (drawable instanceof d51) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void u(Drawable drawable, z01 z01Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = z01Var.d;
            if (z || z01Var.c) {
                drawable.setColorFilter(f(z ? z01Var.a : null, z01Var.c ? z01Var.b : h, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public final synchronized boolean a(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                qa0 qa0Var = (qa0) this.d.get(context);
                if (qa0Var == null) {
                    qa0Var = new qa0();
                    this.d.put(context, qa0Var);
                }
                qa0Var.h(j2, new WeakReference(constantState));
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        gw0 gw0Var = (gw0) this.a.get(context);
        if (gw0Var == null) {
            gw0Var = new gw0();
            this.a.put(context, gw0Var);
        }
        gw0Var.a(i2, colorStateList);
    }

    public final void c(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable i2 = i(context, jm0.a);
        if (i2 == null || !p(i2)) {
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable e(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long d = d(typedValue);
        Drawable h2 = h(context, d);
        if (h2 != null) {
            return h2;
        }
        c cVar = this.g;
        Drawable a2 = cVar == null ? null : cVar.a(this, context, i2);
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, d, a2);
        }
        return a2;
    }

    public final synchronized Drawable h(Context context, long j2) {
        qa0 qa0Var = (qa0) this.d.get(context);
        if (qa0Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) qa0Var.d(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            qa0Var.i(j2);
        }
        return null;
    }

    public synchronized Drawable i(Context context, int i2) {
        return j(context, i2, false);
    }

    public synchronized Drawable j(Context context, int i2, boolean z) {
        Drawable q;
        try {
            c(context);
            q = q(context, i2);
            if (q == null) {
                q = e(context, i2);
            }
            if (q == null) {
                q = lg.e(context, i2);
            }
            if (q != null) {
                q = t(context, i2, z, q);
            }
            if (q != null) {
                vm.b(q);
            }
        } catch (Throwable th) {
            throw th;
        }
        return q;
    }

    public synchronized ColorStateList l(Context context, int i2) {
        ColorStateList m;
        m = m(context, i2);
        if (m == null) {
            c cVar = this.g;
            m = cVar == null ? null : cVar.d(context, i2);
            if (m != null) {
                b(context, i2, m);
            }
        }
        return m;
    }

    public final ColorStateList m(Context context, int i2) {
        gw0 gw0Var;
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null || (gw0Var = (gw0) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) gw0Var.e(i2);
    }

    public PorterDuff.Mode n(int i2) {
        c cVar = this.g;
        if (cVar == null) {
            return null;
        }
        return cVar.c(i2);
    }

    public final Drawable q(Context context, int i2) {
        int next;
        qu0 qu0Var = this.b;
        if (qu0Var == null || qu0Var.isEmpty()) {
            return null;
        }
        gw0 gw0Var = this.c;
        if (gw0Var != null) {
            String str = (String) gw0Var.e(i2);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.b.get(str) == null)) {
                return null;
            }
        } else {
            this.c = new gw0();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long d = d(typedValue);
        Drawable h2 = h(context, d);
        if (h2 != null) {
            return h2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.c.a(i2, name);
                b bVar = (b) this.b.get(name);
                if (bVar != null) {
                    h2 = bVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (h2 != null) {
                    h2.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, d, h2);
                }
            } catch (Exception unused) {
            }
        }
        if (h2 == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return h2;
    }

    public synchronized Drawable r(Context context, e51 e51Var, int i2) {
        try {
            Drawable q = q(context, i2);
            if (q == null) {
                q = e51Var.a(i2);
            }
            if (q != null) {
                return t(context, i2, false, q);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(c cVar) {
        this.g = cVar;
    }

    public final Drawable t(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList l = l(context, i2);
        if (l != null) {
            Drawable l2 = om.l(drawable.mutate());
            om.i(l2, l);
            PorterDuff.Mode n = n(i2);
            if (n != null) {
                om.j(l2, n);
                return l2;
            }
            return l2;
        }
        c cVar = this.g;
        if ((cVar == null || !cVar.e(context, i2, drawable)) && !v(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    public boolean v(Context context, int i2, Drawable drawable) {
        c cVar = this.g;
        return cVar != null && cVar.b(context, i2, drawable);
    }
}
