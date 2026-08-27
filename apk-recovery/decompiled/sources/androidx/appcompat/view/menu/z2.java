package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
/* loaded from: classes.dex */
public abstract class z2 extends EditText implements ng0 {
    public final u2 a;
    public final k3 b;
    public final j3 c;
    public final g01 d;
    public final a3 e;
    public a f;

    /* loaded from: classes.dex */
    public class a {
        public a() {
        }

        public TextClassifier a() {
            return z2.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            z2.super.setTextClassifier(textClassifier);
        }
    }

    public z2(Context context, AttributeSet attributeSet, int i) {
        super(y01.b(context), attributeSet, i);
        j01.a(this, getContext());
        u2 u2Var = new u2(this);
        this.a = u2Var;
        u2Var.e(attributeSet, i);
        k3 k3Var = new k3(this);
        this.b = k3Var;
        k3Var.m(attributeSet, i);
        k3Var.b();
        this.c = new j3(this);
        this.d = new g01();
        a3 a3Var = new a3(this);
        this.e = a3Var;
        a3Var.c(attributeSet, i);
        d(a3Var);
    }

    private a getSuperCaller() {
        if (this.f == null) {
            this.f = new a();
        }
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.ng0
    public uf a(uf ufVar) {
        return this.d.a(this, ufVar);
    }

    public void d(a3 a3Var) {
        KeyListener keyListener = getKeyListener();
        if (a3Var.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a2 = a3Var.a(keyListener);
            if (a2 == keyListener) {
                return;
            }
            super.setKeyListener(a2);
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return getSuperCaller().a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] A;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.r(this, onCreateInputConnection, editorInfo);
        InputConnection a2 = c3.a(onCreateInputConnection, editorInfo, this);
        if (a2 != null && Build.VERSION.SDK_INT <= 30 && (A = p51.A(this)) != null) {
            mn.c(editorInfo, A);
            a2 = f50.c(this, a2, editorInfo);
        }
        return this.e.d(a2, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (h3.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (h3.b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    public void setEmojiCompatEnabled(boolean z) {
        this.e.e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        getSuperCaller().b(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
