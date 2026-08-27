package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
/* loaded from: classes.dex */
public abstract class w2 extends CheckBox {
    public final x2 a;
    public final u2 b;
    public final k3 c;
    public b3 d;

    public w2(Context context, AttributeSet attributeSet, int i) {
        super(y01.b(context), attributeSet, i);
        j01.a(this, getContext());
        x2 x2Var = new x2(this);
        this.a = x2Var;
        x2Var.d(attributeSet, i);
        u2 u2Var = new u2(this);
        this.b = u2Var;
        u2Var.e(attributeSet, i);
        k3 k3Var = new k3(this);
        this.c = k3Var;
        k3Var.m(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private b3 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new b3(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        u2 u2Var = this.b;
        if (u2Var != null) {
            u2Var.b();
        }
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        u2 u2Var = this.b;
        if (u2Var != null) {
            return u2Var.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        u2 u2Var = this.b;
        if (u2Var != null) {
            return u2Var.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        x2 x2Var = this.a;
        if (x2Var != null) {
            return x2Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        x2 x2Var = this.a;
        if (x2Var != null) {
            return x2Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        u2 u2Var = this.b;
        if (u2Var != null) {
            u2Var.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        u2 u2Var = this.b;
        if (u2Var != null) {
            u2Var.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        x2 x2Var = this.a;
        if (x2Var != null) {
            x2Var.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        u2 u2Var = this.b;
        if (u2Var != null) {
            u2Var.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        u2 u2Var = this.b;
        if (u2Var != null) {
            u2Var.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        x2 x2Var = this.a;
        if (x2Var != null) {
            x2Var.f(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        x2 x2Var = this.a;
        if (x2Var != null) {
            x2Var.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.w(colorStateList);
        this.c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.x(mode);
        this.c.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(i3.b(getContext(), i));
    }
}
