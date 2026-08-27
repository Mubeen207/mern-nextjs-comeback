package androidx.appcompat.view.menu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
/* loaded from: classes.dex */
public abstract class v2 extends Button {
    public final u2 a;
    public final k3 b;
    public b3 c;

    public v2(Context context, AttributeSet attributeSet, int i) {
        super(y01.b(context), attributeSet, i);
        j01.a(this, getContext());
        u2 u2Var = new u2(this);
        this.a = u2Var;
        u2Var.e(attributeSet, i);
        k3 k3Var = new k3(this);
        this.b = k3Var;
        k3Var.m(attributeSet, i);
        k3Var.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private b3 getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new b3(this);
        }
        return this.c;
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
    public int getAutoSizeMaxTextSize() {
        if (s61.a) {
            return super.getAutoSizeMaxTextSize();
        }
        k3 k3Var = this.b;
        if (k3Var != null) {
            return k3Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (s61.a) {
            return super.getAutoSizeMinTextSize();
        }
        k3 k3Var = this.b;
        if (k3Var != null) {
            return k3Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (s61.a) {
            return super.getAutoSizeStepGranularity();
        }
        k3 k3Var = this.b;
        if (k3Var != null) {
            return k3Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (s61.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        k3 k3Var = this.b;
        return k3Var != null ? k3Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (s61.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        k3 k3Var = this.b;
        if (k3Var != null) {
            return k3Var.i();
        }
        return 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        k3 k3Var = this.b;
        if (k3Var == null || s61.a || !k3Var.l()) {
            return;
        }
        this.b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (s61.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (s61.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (s61.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.v(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(f01.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.s(z);
        }
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
    public void setTextSize(int i, float f) {
        if (s61.a) {
            super.setTextSize(i, f);
            return;
        }
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.A(i, f);
        }
    }
}
