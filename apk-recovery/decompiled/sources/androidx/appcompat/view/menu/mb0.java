package androidx.appcompat.view.menu;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
/* loaded from: classes.dex */
public class mb0 {
    public static final boolean u = true;
    public static final boolean v = false;
    public final MaterialButton a;
    public vt0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean q;
    public LayerDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public mb0(MaterialButton materialButton, vt0 vt0Var) {
        this.a = materialButton;
        this.b = vt0Var;
    }

    public void A(boolean z) {
        this.n = z;
        J();
    }

    public void B(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            J();
        }
    }

    public void C(int i) {
        if (this.h != i) {
            this.h = i;
            J();
        }
    }

    public void D(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (f() != null) {
                om.i(f(), this.j);
            }
        }
    }

    public void E(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (f() == null || this.i == null) {
                return;
            }
            om.j(f(), this.i);
        }
    }

    public void F(boolean z) {
        this.r = z;
    }

    public final void G(int i, int i2) {
        int C = p51.C(this.a);
        int paddingTop = this.a.getPaddingTop();
        int B = p51.B(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            H();
        }
        p51.z0(this.a, C, (paddingTop + i) - i3, B, (paddingBottom + i2) - i4);
    }

    public final void H() {
        this.a.setInternalBackground(a());
        rb0 f = f();
        if (f != null) {
            f.S(this.t);
            f.setState(this.a.getDrawableState());
        }
    }

    public final void I(vt0 vt0Var) {
        if (v && !this.o) {
            int C = p51.C(this.a);
            int paddingTop = this.a.getPaddingTop();
            int B = p51.B(this.a);
            int paddingBottom = this.a.getPaddingBottom();
            H();
            p51.z0(this.a, C, paddingTop, B, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(vt0Var);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(vt0Var);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(vt0Var);
        }
    }

    public final void J() {
        rb0 f = f();
        rb0 n = n();
        if (f != null) {
            f.Y(this.h, this.k);
            if (n != null) {
                n.X(this.h, this.n ? ob0.d(this.a, cm0.h) : 0);
            }
        }
    }

    public final InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    public final Drawable a() {
        rb0 rb0Var = new rb0(this.b);
        rb0Var.J(this.a.getContext());
        om.i(rb0Var, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            om.j(rb0Var, mode);
        }
        rb0Var.Y(this.h, this.k);
        rb0 rb0Var2 = new rb0(this.b);
        rb0Var2.setTint(0);
        rb0Var2.X(this.h, this.n ? ob0.d(this.a, cm0.h) : 0);
        if (u) {
            rb0 rb0Var3 = new rb0(this.b);
            this.m = rb0Var3;
            om.h(rb0Var3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(wp0.a(this.l), K(new LayerDrawable(new Drawable[]{rb0Var2, rb0Var})), this.m);
            this.s = rippleDrawable;
            return rippleDrawable;
        }
        vp0 vp0Var = new vp0(this.b);
        this.m = vp0Var;
        om.i(vp0Var, wp0.a(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{rb0Var2, rb0Var, this.m});
        this.s = layerDrawable;
        return K(layerDrawable);
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public yt0 e() {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (yt0) this.s.getDrawable(2) : (yt0) this.s.getDrawable(1);
    }

    public rb0 f() {
        return g(false);
    }

    public final rb0 g(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return u ? (rb0) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (rb0) this.s.getDrawable(!z ? 1 : 0);
    }

    public ColorStateList h() {
        return this.l;
    }

    public vt0 i() {
        return this.b;
    }

    public ColorStateList j() {
        return this.k;
    }

    public int k() {
        return this.h;
    }

    public ColorStateList l() {
        return this.j;
    }

    public PorterDuff.Mode m() {
        return this.i;
    }

    public final rb0 n() {
        return g(true);
    }

    public boolean o() {
        return this.o;
    }

    public boolean p() {
        return this.q;
    }

    public boolean q() {
        return this.r;
    }

    public void r(TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(on0.V1, 0);
        this.d = typedArray.getDimensionPixelOffset(on0.W1, 0);
        this.e = typedArray.getDimensionPixelOffset(on0.X1, 0);
        this.f = typedArray.getDimensionPixelOffset(on0.Y1, 0);
        if (typedArray.hasValue(on0.c2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(on0.c2, -1);
            this.g = dimensionPixelSize;
            z(this.b.w(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(on0.m2, 0);
        this.i = p61.i(typedArray.getInt(on0.b2, -1), PorterDuff.Mode.SRC_IN);
        this.j = qb0.a(this.a.getContext(), typedArray, on0.a2);
        this.k = qb0.a(this.a.getContext(), typedArray, on0.l2);
        this.l = qb0.a(this.a.getContext(), typedArray, on0.k2);
        this.q = typedArray.getBoolean(on0.Z1, false);
        this.t = typedArray.getDimensionPixelSize(on0.d2, 0);
        this.r = typedArray.getBoolean(on0.n2, true);
        int C = p51.C(this.a);
        int paddingTop = this.a.getPaddingTop();
        int B = p51.B(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        if (typedArray.hasValue(on0.U1)) {
            t();
        } else {
            H();
        }
        p51.z0(this.a, C + this.c, paddingTop + this.e, B + this.d, paddingBottom + this.f);
    }

    public void s(int i) {
        if (f() != null) {
            f().setTint(i);
        }
    }

    public void t() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    public void u(boolean z) {
        this.q = z;
    }

    public void v(int i) {
        if (this.p && this.g == i) {
            return;
        }
        this.g = i;
        this.p = true;
        z(this.b.w(i));
    }

    public void w(int i) {
        G(this.e, i);
    }

    public void x(int i) {
        G(i, this.f);
    }

    public void y(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            boolean z = u;
            if (z && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(wp0.a(colorStateList));
            } else if (z || !(this.a.getBackground() instanceof vp0)) {
            } else {
                ((vp0) this.a.getBackground()).setTintList(wp0.a(colorStateList));
            }
        }
    }

    public void z(vt0 vt0Var) {
        this.b = vt0Var;
        I(vt0Var);
    }
}
