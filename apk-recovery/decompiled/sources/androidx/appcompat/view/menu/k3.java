package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.view.menu.ip0;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class k3 {
    public final TextView a;
    public z01 b;
    public z01 c;
    public z01 d;
    public z01 e;
    public z01 f;
    public z01 g;
    public z01 h;
    public final m3 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    /* loaded from: classes.dex */
    public class a extends ip0.e {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // androidx.appcompat.view.menu.ip0.e
        public void h(int i) {
        }

        @Override // androidx.appcompat.view.menu.ip0.e
        public void i(Typeface typeface) {
            int i = this.a;
            if (i != -1) {
                typeface = e.a(typeface, i, (this.b & 2) != 0);
            }
            k3.this.n(this.c, typeface);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ TextView m;
        public final /* synthetic */ Typeface n;
        public final /* synthetic */ int o;

        public b(TextView textView, Typeface typeface, int i) {
            this.m = textView;
            this.n = typeface;
            this.o = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.m.setTypeface(this.n, this.o);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public k3(TextView textView) {
        this.a = textView;
        this.i = new m3(textView);
    }

    public static z01 d(Context context, y2 y2Var, int i) {
        ColorStateList e2 = y2Var.e(context, i);
        if (e2 != null) {
            z01 z01Var = new z01();
            z01Var.d = true;
            z01Var.a = e2;
            return z01Var;
        }
        return null;
    }

    public void A(int i, float f) {
        if (s61.a || l()) {
            return;
        }
        B(i, f);
    }

    public final void B(int i, float f) {
        this.i.t(i, f);
    }

    public final void C(Context context, b11 b11Var) {
        String n;
        this.j = b11Var.j(pn0.G1, this.j);
        int j = b11Var.j(pn0.I1, -1);
        this.k = j;
        if (j != -1) {
            this.j &= 2;
        }
        if (!b11Var.q(pn0.H1) && !b11Var.q(pn0.J1)) {
            if (b11Var.q(pn0.F1)) {
                this.m = false;
                int j2 = b11Var.j(pn0.F1, 1);
                if (j2 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (j2 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else if (j2 != 3) {
                    return;
                } else {
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i = b11Var.q(pn0.J1) ? pn0.J1 : pn0.H1;
        int i2 = this.k;
        int i3 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface i4 = b11Var.i(i, this.j, new a(i2, i3, new WeakReference(this.a)));
                if (i4 != null) {
                    if (this.k != -1) {
                        this.l = e.a(Typeface.create(i4, 0), this.k, (this.j & 2) != 0);
                    } else {
                        this.l = i4;
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (n = b11Var.n(i)) == null) {
            return;
        }
        if (this.k != -1) {
            this.l = e.a(Typeface.create(n, 0), this.k, (this.j & 2) != 0);
        } else {
            this.l = Typeface.create(n, this.j);
        }
    }

    public final void a(Drawable drawable, z01 z01Var) {
        if (drawable == null || z01Var == null) {
            return;
        }
        y2.g(drawable, z01Var, this.a.getDrawableState());
    }

    public void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public void c() {
        this.i.a();
    }

    public int e() {
        return this.i.f();
    }

    public int f() {
        return this.i.g();
    }

    public int g() {
        return this.i.h();
    }

    public int[] h() {
        return this.i.i();
    }

    public int i() {
        return this.i.j();
    }

    public ColorStateList j() {
        z01 z01Var = this.h;
        if (z01Var != null) {
            return z01Var.a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        z01 z01Var = this.h;
        if (z01Var != null) {
            return z01Var.b;
        }
        return null;
    }

    public boolean l() {
        return this.i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r17, int r18) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k3.m(android.util.AttributeSet, int):void");
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    public void o(boolean z, int i, int i2, int i3, int i4) {
        if (s61.a) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i) {
        String n;
        b11 r = b11.r(context, i, pn0.D1);
        if (r.q(pn0.L1)) {
            s(r.a(pn0.L1, false));
        }
        if (r.q(pn0.E1) && r.f(pn0.E1, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, r);
        if (r.q(pn0.K1) && (n = r.n(pn0.K1)) != null) {
            d.d(this.a, n);
        }
        r.v();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        mn.e(editorInfo, textView.getText());
    }

    public void s(boolean z) {
        this.a.setAllCaps(z);
    }

    public void t(int i, int i2, int i3, int i4) {
        this.i.p(i, i2, i3, i4);
    }

    public void u(int[] iArr, int i) {
        this.i.q(iArr, i);
    }

    public void v(int i) {
        this.i.r(i);
    }

    public void w(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new z01();
        }
        z01 z01Var = this.h;
        z01Var.a = colorStateList;
        z01Var.d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new z01();
        }
        z01 z01Var = this.h;
        z01Var.b = mode;
        z01Var.c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
                return;
            }
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            TextView textView2 = this.a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    public final void z() {
        z01 z01Var = this.h;
        this.b = z01Var;
        this.c = z01Var;
        this.d = z01Var;
        this.e = z01Var;
        this.f = z01Var;
        this.g = z01Var;
    }
}
