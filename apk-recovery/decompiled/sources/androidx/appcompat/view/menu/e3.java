package androidx.appcompat.view.menu;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class e3 {
    public final ImageView a;
    public z01 b;
    public z01 c;
    public z01 d;
    public int e = 0;

    public e3(ImageView imageView) {
        this.a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new z01();
        }
        z01 z01Var = this.d;
        z01Var.a();
        ColorStateList a = m40.a(this.a);
        if (a != null) {
            z01Var.d = true;
            z01Var.a = a;
        }
        PorterDuff.Mode b = m40.b(this.a);
        if (b != null) {
            z01Var.c = true;
            z01Var.b = b;
        }
        if (z01Var.d || z01Var.c) {
            y2.g(drawable, z01Var, this.a.getDrawableState());
            return true;
        }
        return false;
    }

    public void b() {
        if (this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.e);
        }
    }

    public void c() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            vm.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            z01 z01Var = this.c;
            if (z01Var != null) {
                y2.g(drawable, z01Var, this.a.getDrawableState());
                return;
            }
            z01 z01Var2 = this.b;
            if (z01Var2 != null) {
                y2.g(drawable, z01Var2, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        z01 z01Var = this.c;
        if (z01Var != null) {
            return z01Var.a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        z01 z01Var = this.c;
        if (z01Var != null) {
            return z01Var.b;
        }
        return null;
    }

    public boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i) {
        int m;
        b11 t = b11.t(this.a.getContext(), attributeSet, pn0.F, i, 0);
        ImageView imageView = this.a;
        p51.i0(imageView, imageView.getContext(), pn0.F, attributeSet, t.p(), i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (m = t.m(pn0.G, -1)) != -1 && (drawable = i3.b(this.a.getContext(), m)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                vm.b(drawable);
            }
            if (t.q(pn0.H)) {
                m40.c(this.a, t.c(pn0.H));
            }
            if (t.q(pn0.I)) {
                m40.d(this.a, vm.d(t.j(pn0.I, -1), null));
            }
            t.v();
        } catch (Throwable th) {
            t.v();
            throw th;
        }
    }

    public void h(Drawable drawable) {
        this.e = drawable.getLevel();
    }

    public void i(int i) {
        if (i != 0) {
            Drawable b = i3.b(this.a.getContext(), i);
            if (b != null) {
                vm.b(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new z01();
        }
        z01 z01Var = this.c;
        z01Var.a = colorStateList;
        z01Var.d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new z01();
        }
        z01 z01Var = this.c;
        z01Var.b = mode;
        z01Var.c = true;
        c();
    }

    public final boolean l() {
        return this.b != null;
    }
}
