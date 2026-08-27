package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
/* loaded from: classes.dex */
public abstract class t2 extends AutoCompleteTextView {
    public static final int[] d = {16843126};
    public final u2 a;
    public final k3 b;
    public final a3 c;

    public t2(Context context, AttributeSet attributeSet, int i) {
        super(y01.b(context), attributeSet, i);
        j01.a(this, getContext());
        b11 t = b11.t(getContext(), attributeSet, d, i, 0);
        if (t.q(0)) {
            setDropDownBackgroundDrawable(t.g(0));
        }
        t.v();
        u2 u2Var = new u2(this);
        this.a = u2Var;
        u2Var.e(attributeSet, i);
        k3 k3Var = new k3(this);
        this.b = k3Var;
        k3Var.m(attributeSet, i);
        k3Var.b();
        a3 a3Var = new a3(this);
        this.c = a3Var;
        a3Var.c(attributeSet, i);
        a(a3Var);
    }

    public void a(a3 a3Var) {
        KeyListener keyListener = getKeyListener();
        if (a3Var.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a = a3Var.a(keyListener);
            if (a == keyListener) {
                return;
            }
            super.setKeyListener(a);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        u2 u2Var = this.a;
        if (u2Var != null) {
            u2Var.b();
        }
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return f01.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        u2 u2Var = this.a;
        if (u2Var != null) {
            return u2Var.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        u2 u2Var = this.a;
        if (u2Var != null) {
            return u2Var.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.c.d(c3.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        u2 u2Var = this.a;
        if (u2Var != null) {
            u2Var.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        u2 u2Var = this.a;
        if (u2Var != null) {
            u2Var.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(f01.q(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(i3.b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        u2 u2Var = this.a;
        if (u2Var != null) {
            u2Var.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        u2 u2Var = this.a;
        if (u2Var != null) {
            u2Var.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.w(colorStateList);
        this.b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.x(mode);
        this.b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.q(context, i);
        }
    }
}
