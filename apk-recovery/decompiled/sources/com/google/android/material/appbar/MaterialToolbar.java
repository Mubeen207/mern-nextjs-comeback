package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.cm0;
import androidx.appcompat.view.menu.h11;
import androidx.appcompat.view.menu.hn0;
import androidx.appcompat.view.menu.om;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.pc0;
import androidx.appcompat.view.menu.rb0;
import androidx.appcompat.view.menu.sb0;
import androidx.appcompat.view.menu.tm;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final int b0 = hn0.l;
    public static final ImageView.ScaleType[] c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer T;
    public boolean U;
    public boolean V;
    public ImageView.ScaleType W;
    public Boolean a0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, cm0.G);
    }

    public final Pair M(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public final void N(Context context) {
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : tm.a(background);
        if (valueOf != null) {
            rb0 rb0Var = new rb0();
            rb0Var.T(valueOf);
            rb0Var.J(context);
            rb0Var.S(p51.s(this));
            p51.o0(this, rb0Var);
        }
    }

    public final void O(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    public final void P() {
        if (this.U || this.V) {
            TextView e = h11.e(this);
            TextView c = h11.c(this);
            if (e == null && c == null) {
                return;
            }
            Pair M = M(e, c);
            if (this.U && e != null) {
                O(e, M);
            }
            if (!this.V || c == null) {
                return;
            }
            O(c, M);
        }
    }

    public final Drawable Q(Drawable drawable) {
        if (drawable == null || this.T == null) {
            return drawable;
        }
        Drawable l = om.l(drawable.mutate());
        om.h(l, this.T.intValue());
        return l;
    }

    public final void R() {
        ImageView b = h11.b(this);
        if (b != null) {
            Boolean bool = this.a0;
            if (bool != null) {
                b.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.W;
            if (scaleType != null) {
                b.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.W;
    }

    public Integer getNavigationIconTint() {
        return this.T;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sb0.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        P();
        R();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        sb0.d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.a0;
        if (bool == null || bool.booleanValue() != z) {
            this.a0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.W != scaleType) {
            this.W = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(Q(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.T = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.V != z) {
            this.V = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.U != z) {
            this.U = z;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void u(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof pc0;
        if (z) {
            ((pc0) menu).W();
        }
        super.u(i);
        if (z) {
            ((pc0) menu).V();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.b0
            android.content.Context r8 = androidx.appcompat.view.menu.vb0.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = androidx.appcompat.view.menu.on0.b3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = androidx.appcompat.view.menu.i01.h(r0, r1, r2, r3, r4, r5)
            int r10 = androidx.appcompat.view.menu.on0.e3
            boolean r10 = r9.hasValue(r10)
            r0 = -1
            if (r10 == 0) goto L2b
            int r10 = androidx.appcompat.view.menu.on0.e3
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L2b:
            int r10 = androidx.appcompat.view.menu.on0.g3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.U = r10
            int r10 = androidx.appcompat.view.menu.on0.f3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.V = r10
            int r10 = androidx.appcompat.view.menu.on0.d3
            int r10 = r9.getInt(r10, r0)
            if (r10 < 0) goto L4c
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.c0
            int r1 = r0.length
            if (r10 >= r1) goto L4c
            r10 = r0[r10]
            r7.W = r10
        L4c:
            int r10 = androidx.appcompat.view.menu.on0.c3
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L60
            int r10 = androidx.appcompat.view.menu.on0.c3
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.a0 = r10
        L60:
            r9.recycle()
            r7.N(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
