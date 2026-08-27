package androidx.appcompat.view.menu;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class uw0 extends LinearLayout {
    public final TextInputLayout a;
    public final TextView b;
    public CharSequence c;
    public final CheckableImageButton d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public int g;
    public ImageView.ScaleType h;
    public View.OnLongClickListener i;
    public boolean j;

    public uw0(TextInputLayout textInputLayout, b11 b11Var) {
        super(textInputLayout.getContext());
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(ym0.c, (ViewGroup) this, false);
        this.d = checkableImageButton;
        i40.e(checkableImageButton);
        l3 l3Var = new l3(getContext());
        this.b = l3Var;
        j(b11Var);
        i(b11Var);
        addView(checkableImageButton);
        addView(l3Var);
    }

    public void A(p0 p0Var) {
        if (this.b.getVisibility() != 0) {
            p0Var.z0(this.d);
            return;
        }
        p0Var.n0(this.b);
        p0Var.z0(this.b);
    }

    public void B() {
        EditText editText = this.a.d;
        if (editText == null) {
            return;
        }
        p51.z0(this.b, k() ? 0 : p51.C(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(hm0.C), editText.getCompoundPaddingBottom());
    }

    public final void C() {
        int i = 8;
        int i2 = (this.c == null || this.j) ? 8 : 0;
        if (this.d.getVisibility() == 0 || i2 == 0) {
            i = 0;
        }
        setVisibility(i);
        this.b.setVisibility(i2);
        this.a.o0();
    }

    public CharSequence a() {
        return this.c;
    }

    public ColorStateList b() {
        return this.b.getTextColors();
    }

    public int c() {
        return p51.C(this) + p51.C(this.b) + (k() ? this.d.getMeasuredWidth() + ib0.a((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()) : 0);
    }

    public TextView d() {
        return this.b;
    }

    public CharSequence e() {
        return this.d.getContentDescription();
    }

    public Drawable f() {
        return this.d.getDrawable();
    }

    public int g() {
        return this.g;
    }

    public ImageView.ScaleType h() {
        return this.h;
    }

    public final void i(b11 b11Var) {
        this.b.setVisibility(8);
        this.b.setId(vm0.L);
        this.b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        p51.m0(this.b, 1);
        o(b11Var.m(on0.X5, 0));
        if (b11Var.q(on0.Y5)) {
            p(b11Var.c(on0.Y5));
        }
        n(b11Var.o(on0.W5));
    }

    public final void j(b11 b11Var) {
        if (qb0.f(getContext())) {
            ib0.c((ViewGroup.MarginLayoutParams) this.d.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        if (b11Var.q(on0.e6)) {
            this.e = qb0.b(getContext(), b11Var, on0.e6);
        }
        if (b11Var.q(on0.f6)) {
            this.f = p61.i(b11Var.j(on0.f6, -1), null);
        }
        if (b11Var.q(on0.b6)) {
            s(b11Var.g(on0.b6));
            if (b11Var.q(on0.a6)) {
                r(b11Var.o(on0.a6));
            }
            q(b11Var.a(on0.Z5, true));
        }
        t(b11Var.f(on0.c6, getResources().getDimensionPixelSize(hm0.R)));
        if (b11Var.q(on0.d6)) {
            w(i40.b(b11Var.j(on0.d6, -1)));
        }
    }

    public boolean k() {
        return this.d.getVisibility() == 0;
    }

    public void l(boolean z) {
        this.j = z;
        C();
    }

    public void m() {
        i40.d(this.a, this.d, this.e);
    }

    public void n(CharSequence charSequence) {
        this.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.b.setText(charSequence);
        C();
    }

    public void o(int i) {
        f01.n(this.b, i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        B();
    }

    public void p(ColorStateList colorStateList) {
        this.b.setTextColor(colorStateList);
    }

    public void q(boolean z) {
        this.d.setCheckable(z);
    }

    public void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.d.setContentDescription(charSequence);
        }
    }

    public void s(Drawable drawable) {
        this.d.setImageDrawable(drawable);
        if (drawable != null) {
            i40.a(this.a, this.d, this.e, this.f);
            z(true);
            m();
            return;
        }
        z(false);
        u(null);
        v(null);
        r(null);
    }

    public void t(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != this.g) {
            this.g = i;
            i40.g(this.d, i);
        }
    }

    public void u(View.OnClickListener onClickListener) {
        i40.h(this.d, onClickListener, this.i);
    }

    public void v(View.OnLongClickListener onLongClickListener) {
        this.i = onLongClickListener;
        i40.i(this.d, onLongClickListener);
    }

    public void w(ImageView.ScaleType scaleType) {
        this.h = scaleType;
        i40.j(this.d, scaleType);
    }

    public void x(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            i40.a(this.a, this.d, colorStateList, this.f);
        }
    }

    public void y(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            i40.a(this.a, this.d, this.e, mode);
        }
    }

    public void z(boolean z) {
        if (k() != z) {
            this.d.setVisibility(z ? 0 : 8);
            B();
            C();
        }
    }
}
