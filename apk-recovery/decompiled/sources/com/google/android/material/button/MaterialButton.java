package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.cm0;
import androidx.appcompat.view.menu.f01;
import androidx.appcompat.view.menu.hn0;
import androidx.appcompat.view.menu.i3;
import androidx.appcompat.view.menu.mb0;
import androidx.appcompat.view.menu.my0;
import androidx.appcompat.view.menu.om;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.sb0;
import androidx.appcompat.view.menu.v2;
import androidx.appcompat.view.menu.vt0;
import androidx.appcompat.view.menu.yt0;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public class MaterialButton extends v2 implements Checkable, yt0 {
    public static final int[] r = {16842911};
    public static final int[] s = {16842912};
    public static final int t = hn0.g;
    public final mb0 d;
    public final LinkedHashSet e;
    public a f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;

    /* loaded from: classes.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: classes.dex */
    public static class b extends c {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public boolean o;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public final void b(Parcel parcel) {
            this.o = parcel.readInt() == 1;
        }

        @Override // androidx.appcompat.view.menu.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.o ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, cm0.n);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    public boolean a() {
        mb0 mb0Var = this.d;
        return mb0Var != null && mb0Var.p();
    }

    public final boolean b() {
        int i = this.q;
        return i == 3 || i == 4;
    }

    public final boolean c() {
        int i = this.q;
        return i == 1 || i == 2;
    }

    public final boolean d() {
        int i = this.q;
        return i == 16 || i == 32;
    }

    public final boolean e() {
        return p51.x(this) == 1;
    }

    public final boolean f() {
        mb0 mb0Var = this.d;
        return (mb0Var == null || mb0Var.o()) ? false : true;
    }

    public final void g() {
        if (c()) {
            f01.h(this, this.i, null, null, null);
        } else if (b()) {
            f01.h(this, null, null, this.i, null);
        } else if (d()) {
            f01.h(this, null, this.i, null, null);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.j;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    public int getIconPadding() {
        return this.n;
    }

    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.c();
    }

    public int getInsetTop() {
        return this.d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.d.h();
        }
        return null;
    }

    public vt0 getShapeAppearanceModel() {
        if (f()) {
            return this.d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.d.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.view.menu.v2
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.d.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.view.menu.v2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.d.m() : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable mutate = om.l(drawable).mutate();
            this.i = mutate;
            om.i(mutate, this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                om.j(this.i, mode);
            }
            int i = this.k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.l;
            int i4 = this.m;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.i.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] a2 = f01.a(this);
        Drawable drawable3 = a2[0];
        Drawable drawable4 = a2[1];
        Drawable drawable5 = a2[2];
        if ((!c() || drawable3 == this.i) && ((!b() || drawable5 == this.i) && (!d() || drawable4 == this.i))) {
            return;
        }
        g();
    }

    public final void i(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.l = 0;
                if (this.q == 16) {
                    this.m = 0;
                    h(false);
                    return;
                }
                int i3 = this.k;
                if (i3 == 0) {
                    i3 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.n) - getPaddingBottom()) / 2);
                if (this.m != max) {
                    this.m = max;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.q;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.l = 0;
            h(false);
            return;
        }
        int i5 = this.k;
        if (i5 == 0) {
            i5 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - p51.B(this)) - i5) - this.n) - p51.C(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.l != textLayoutWidth) {
            this.l = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            sb0.f(this, this.d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, s);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.v2, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.view.menu.v2, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.view.menu.v2, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.o);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.o = this.o;
        return bVar;
    }

    @Override // androidx.appcompat.view.menu.v2, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.d.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (f()) {
            this.d.s(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.view.menu.v2, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
        } else {
            this.d.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.view.menu.v2, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? i3.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (f()) {
            this.d.u(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.o != z) {
            this.o = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.o);
            }
            if (this.p) {
                return;
            }
            this.p = true;
            Iterator it = this.e.iterator();
            if (it.hasNext()) {
                my0.a(it.next());
                throw null;
            } else {
                this.p = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (f()) {
            this.d.v(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (f()) {
            this.d.f().S(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.q != i) {
            this.q = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.n != i) {
            this.n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? i3.b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.k != i) {
            this.k = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(i3.a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.d.w(i);
    }

    public void setInsetTop(int i) {
        this.d.x(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.d.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (f()) {
            setRippleColor(i3.a(getContext(), i));
        }
    }

    @Override // androidx.appcompat.view.menu.yt0
    public void setShapeAppearanceModel(vt0 vt0Var) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.z(vt0Var);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (f()) {
            this.d.A(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.d.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (f()) {
            setStrokeColor(i3.a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (f()) {
            this.d.C(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.view.menu.v2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.d.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.v2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.d.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.F(z);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.t
            android.content.Context r9 = androidx.appcompat.view.menu.vb0.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.e = r9
            r9 = 0
            r8.o = r9
            r8.p = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = androidx.appcompat.view.menu.on0.T1
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = androidx.appcompat.view.menu.i01.h(r0, r1, r2, r3, r4, r5)
            int r1 = androidx.appcompat.view.menu.on0.g2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.n = r1
            int r1 = androidx.appcompat.view.menu.on0.j2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.view.menu.p61.i(r1, r2)
            r8.g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = androidx.appcompat.view.menu.on0.i2
            android.content.res.ColorStateList r1 = androidx.appcompat.view.menu.qb0.a(r1, r0, r2)
            r8.h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = androidx.appcompat.view.menu.on0.e2
            android.graphics.drawable.Drawable r1 = androidx.appcompat.view.menu.qb0.c(r1, r0, r2)
            r8.i = r1
            int r1 = androidx.appcompat.view.menu.on0.f2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.q = r1
            int r1 = androidx.appcompat.view.menu.on0.h2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.k = r1
            androidx.appcompat.view.menu.vt0$b r10 = androidx.appcompat.view.menu.vt0.e(r7, r10, r11, r6)
            androidx.appcompat.view.menu.vt0 r10 = r10.m()
            androidx.appcompat.view.menu.mb0 r11 = new androidx.appcompat.view.menu.mb0
            r11.<init>(r8, r10)
            r8.d = r11
            r11.r(r0)
            r0.recycle()
            int r10 = r8.n
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.i
            if (r10 == 0) goto L84
            r9 = r2
        L84:
            r8.h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
