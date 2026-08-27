package androidx.appcompat.view.menu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.view.menu.nj0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class l3 extends TextView {
    public final u2 a;
    public final k3 b;
    public final j3 c;
    public b3 d;
    public boolean e;
    public a f;
    public Future g;

    /* loaded from: classes.dex */
    public interface a {
        void a(int[] iArr, int i);

        void b(TextClassifier textClassifier);

        int[] c();

        void d(int i);

        TextClassifier e();

        int f();

        void g(int i, int i2, int i3, int i4);

        int h();

        int i();

        void j(int i);

        int k();

        void l(int i);

        void m(int i, float f);
    }

    /* loaded from: classes.dex */
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public void a(int[] iArr, int i) {
            l3.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public void b(TextClassifier textClassifier) {
            l3.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public int[] c() {
            return l3.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public TextClassifier e() {
            return l3.super.getTextClassifier();
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public int f() {
            return l3.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public void g(int i, int i2, int i3, int i4) {
            l3.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public int h() {
            return l3.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public int i() {
            return l3.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public int k() {
            return l3.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public void l(int i) {
            l3.super.setAutoSizeTextTypeWithDefaults(i);
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public void m(int i, float f) {
        }
    }

    /* loaded from: classes.dex */
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public void d(int i) {
            l3.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.view.menu.l3.a
        public void j(int i) {
            l3.super.setFirstBaselineToTopHeight(i);
        }
    }

    /* loaded from: classes.dex */
    public class d extends c {
        public d() {
            super();
        }

        @Override // androidx.appcompat.view.menu.l3.b, androidx.appcompat.view.menu.l3.a
        public void m(int i, float f) {
            l3.super.setLineHeight(i, f);
        }
    }

    public l3(Context context) {
        this(context, null);
    }

    private b3 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new b3(this);
        }
        return this.d;
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
            return getSuperCaller().f();
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
            return getSuperCaller().i();
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
            return getSuperCaller().k();
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
            return getSuperCaller().c();
        }
        k3 k3Var = this.b;
        return k3Var != null ? k3Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (s61.a) {
            return getSuperCaller().h() == 1 ? 1 : 0;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return f01.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return f01.c(this);
    }

    public a getSuperCaller() {
        if (this.f == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f = new d();
            } else {
                this.f = new c();
            }
        }
        return this.f;
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
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return getSuperCaller().e();
    }

    public nj0.a getTextMetricsParamsCompat() {
        return f01.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.r(this, onCreateInputConnection, editorInfo);
        return c3.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        r();
        super.onMeasure(i, i2);
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

    public final void r() {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                my0.a(future.get());
                f01.m(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (s61.a) {
            getSuperCaller().g(i, i2, i3, i4);
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
            getSuperCaller().a(iArr, i);
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
            getSuperCaller().l(i);
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
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
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
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        getSuperCaller().j(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        getSuperCaller().d(i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        f01.k(this, i);
    }

    public void setPrecomputedText(nj0 nj0Var) {
        f01.m(this, nj0Var);
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

    public void setTextFuture(Future<nj0> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(nj0.a aVar) {
        f01.o(this, aVar);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.e) {
            return;
        }
        Typeface a2 = (typeface == null || i <= 0) ? null : v21.a(getContext(), typeface, i);
        this.e = true;
        if (a2 != null) {
            typeface = a2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    public l3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().m(i, f);
        } else {
            f01.l(this, i, f);
        }
    }

    public l3(Context context, AttributeSet attributeSet, int i) {
        super(y01.b(context), attributeSet, i);
        this.e = false;
        this.f = null;
        j01.a(this, getContext());
        u2 u2Var = new u2(this);
        this.a = u2Var;
        u2Var.e(attributeSet, i);
        k3 k3Var = new k3(this);
        this.b = k3Var;
        k3Var.m(attributeSet, i);
        k3Var.b();
        this.c = new j3(this);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? i3.b(context, i) : null, i2 != 0 ? i3.b(context, i2) : null, i3 != 0 ? i3.b(context, i3) : null, i4 != 0 ? i3.b(context, i4) : null);
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? i3.b(context, i) : null, i2 != 0 ? i3.b(context, i2) : null, i3 != 0 ? i3.b(context, i3) : null, i4 != 0 ? i3.b(context, i4) : null);
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.p();
        }
    }
}
