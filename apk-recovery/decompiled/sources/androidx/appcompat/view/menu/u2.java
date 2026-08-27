package androidx.appcompat.view.menu;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public class u2 {
    public final View a;
    public z01 d;
    public z01 e;
    public z01 f;
    public int c = -1;
    public final y2 b = y2.b();

    public u2(View view) {
        this.a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new z01();
        }
        z01 z01Var = this.f;
        z01Var.a();
        ColorStateList o = p51.o(this.a);
        if (o != null) {
            z01Var.d = true;
            z01Var.a = o;
        }
        PorterDuff.Mode p = p51.p(this.a);
        if (p != null) {
            z01Var.c = true;
            z01Var.b = p;
        }
        if (z01Var.d || z01Var.c) {
            y2.g(drawable, z01Var, this.a.getDrawableState());
            return true;
        }
        return false;
    }

    public void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            z01 z01Var = this.e;
            if (z01Var != null) {
                y2.g(background, z01Var, this.a.getDrawableState());
                return;
            }
            z01 z01Var2 = this.d;
            if (z01Var2 != null) {
                y2.g(background, z01Var2, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        z01 z01Var = this.e;
        if (z01Var != null) {
            return z01Var.a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        z01 z01Var = this.e;
        if (z01Var != null) {
            return z01Var.b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i) {
        b11 t = b11.t(this.a.getContext(), attributeSet, pn0.s2, i, 0);
        View view = this.a;
        p51.i0(view, view.getContext(), pn0.s2, attributeSet, t.p(), i, 0);
        try {
            if (t.q(pn0.t2)) {
                this.c = t.m(pn0.t2, -1);
                ColorStateList e = this.b.e(this.a.getContext(), this.c);
                if (e != null) {
                    h(e);
                }
            }
            if (t.q(pn0.u2)) {
                p51.p0(this.a, t.c(pn0.u2));
            }
            if (t.q(pn0.v2)) {
                p51.q0(this.a, vm.d(t.j(pn0.v2, -1), null));
            }
            t.v();
        } catch (Throwable th) {
            t.v();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    public void g(int i) {
        this.c = i;
        y2 y2Var = this.b;
        h(y2Var != null ? y2Var.e(this.a.getContext(), i) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new z01();
            }
            z01 z01Var = this.d;
            z01Var.a = colorStateList;
            z01Var.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new z01();
        }
        z01 z01Var = this.e;
        z01Var.a = colorStateList;
        z01Var.d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new z01();
        }
        z01 z01Var = this.e;
        z01Var.b = mode;
        z01Var.c = true;
        b();
    }

    public final boolean k() {
        return this.d != null;
    }
}
