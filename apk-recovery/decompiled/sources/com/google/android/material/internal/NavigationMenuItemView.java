package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.b0;
import androidx.appcompat.view.menu.cv;
import androidx.appcompat.view.menu.dm0;
import androidx.appcompat.view.menu.f01;
import androidx.appcompat.view.menu.hm0;
import androidx.appcompat.view.menu.i11;
import androidx.appcompat.view.menu.ip0;
import androidx.appcompat.view.menu.lm0;
import androidx.appcompat.view.menu.om;
import androidx.appcompat.view.menu.p0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.tc0;
import androidx.appcompat.view.menu.vm0;
import androidx.appcompat.view.menu.ym0;
import androidx.appcompat.view.menu.zc0;
import androidx.appcompat.widget.b;
/* loaded from: classes.dex */
public class NavigationMenuItemView extends cv implements zc0.a {
    public static final int[] G = {16842912};
    public FrameLayout A;
    public tc0 B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final b0 F;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final CheckedTextView z;

    /* loaded from: classes.dex */
    public class a extends b0 {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.b0
        public void g(View view, p0 p0Var) {
            super.g(view, p0Var);
            p0Var.a0(NavigationMenuItemView.this.x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(vm0.d)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    public final boolean A() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.zc0.a
    public boolean b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.zc0.a
    public void d(tc0 tc0Var, int i) {
        this.B = tc0Var;
        if (tc0Var.getItemId() > 0) {
            setId(tc0Var.getItemId());
        }
        setVisibility(tc0Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            p51.o0(this, z());
        }
        setCheckable(tc0Var.isCheckable());
        setChecked(tc0Var.isChecked());
        setEnabled(tc0Var.isEnabled());
        setTitle(tc0Var.getTitle());
        setIcon(tc0Var.getIcon());
        setActionView(tc0Var.getActionView());
        setContentDescription(tc0Var.getContentDescription());
        i11.a(this, tc0Var.getTooltipText());
        y();
    }

    @Override // androidx.appcompat.view.menu.zc0.a
    public tc0 getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        tc0 tc0Var = this.B;
        if (tc0Var != null && tc0Var.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.x != z) {
            this.x = z;
            this.F.l(this.z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.z.setChecked(z);
        CheckedTextView checkedTextView = this.z;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = om.l(drawable).mutate();
                om.i(drawable, this.C);
            }
            int i = this.v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.w) {
            if (this.E == null) {
                Drawable e = ip0.e(getResources(), lm0.g, getContext().getTheme());
                this.E = e;
                if (e != null) {
                    int i2 = this.v;
                    e.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.E;
        }
        f01.h(this.z, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        tc0 tc0Var = this.B;
        if (tc0Var != null) {
            setIcon(tc0Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.w = z;
    }

    public void setTextAppearance(int i) {
        f01.n(this.z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }

    public final void y() {
        if (A()) {
            this.z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                b.a aVar = (b.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.z.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            b.a aVar2 = (b.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.A.setLayoutParams(aVar2);
        }
    }

    public final StateListDrawable z() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(dm0.k, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = true;
        a aVar = new a();
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(ym0.a, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(hm0.b));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(vm0.e);
        this.z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        p51.k0(checkedTextView, aVar);
    }
}
