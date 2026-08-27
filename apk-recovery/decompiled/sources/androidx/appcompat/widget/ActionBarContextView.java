package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.b11;
import androidx.appcompat.view.menu.dm0;
import androidx.appcompat.view.menu.nm0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.pn0;
import androidx.appcompat.view.menu.s61;
import androidx.appcompat.view.menu.zm0;
/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.view.menu.b {
    public CharSequence h;
    public CharSequence i;
    public View j;
    public View k;
    public LinearLayout l;
    public TextView m;
    public TextView n;
    public int o;
    public int p;
    public boolean q;
    public int r;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dm0.d);
    }

    public final void d() {
        if (this.l == null) {
            LayoutInflater.from(getContext()).inflate(zm0.a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.l = linearLayout;
            this.m = (TextView) linearLayout.findViewById(nm0.e);
            this.n = (TextView) this.l.findViewById(nm0.d);
            if (this.o != 0) {
                this.m.setTextAppearance(getContext(), this.o);
            }
            if (this.p != 0) {
                this.n.setTextAppearance(getContext(), this.p);
            }
        }
        this.m.setText(this.h);
        this.n.setText(this.i);
        boolean z = !TextUtils.isEmpty(this.h);
        boolean z2 = !TextUtils.isEmpty(this.i);
        int i = 8;
        this.n.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.l;
        if (z || z2) {
            i = 0;
        }
        linearLayout2.setVisibility(i);
        if (this.l.getParent() == null) {
            addView(this.l);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.view.menu.b
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.view.menu.b
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.i;
    }

    public CharSequence getTitle() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.d;
        if (aVar != null) {
            aVar.z();
            this.d.A();
        }
    }

    @Override // androidx.appcompat.view.menu.b, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = s61.a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.j;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
            int i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int b = androidx.appcompat.view.menu.b.b(paddingRight, i5, a);
            paddingRight = androidx.appcompat.view.menu.b.b(b + c(this.j, b, paddingTop, paddingTop2, a), i6, a);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.l;
        if (linearLayout != null && this.k == null && linearLayout.getVisibility() != 8) {
            i7 += c(this.l, i7, paddingTop, paddingTop2, a);
        }
        int i8 = i7;
        View view2 = this.k;
        if (view2 != null) {
            c(view2, i8, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            c(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.e;
            if (i3 <= 0) {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = i3 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            View view = this.j;
            if (view != null) {
                int a = a(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = a(this.c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.l;
            if (linearLayout != null && this.k == null) {
                if (this.q) {
                    this.l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.l.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.l.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.k;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i5 = layoutParams.width;
                int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i5 >= 0) {
                    paddingLeft = Math.min(i5, paddingLeft);
                }
                int i7 = layoutParams.height;
                int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
                if (i7 >= 0) {
                    i4 = Math.min(i7, i4);
                }
                this.k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
            }
            if (this.e > 0) {
                setMeasuredDimension(size, i3);
                return;
            }
            int childCount = getChildCount();
            int i9 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i9) {
                    i9 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i9);
        }
    }

    @Override // androidx.appcompat.view.menu.b, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.b
    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.k;
        if (view2 != null) {
            removeView(view2);
        }
        this.k = view;
        if (view != null && (linearLayout = this.l) != null) {
            removeView(linearLayout);
            this.l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.h = charSequence;
        d();
        p51.n0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.q) {
            requestLayout();
        }
        this.q = z;
    }

    @Override // androidx.appcompat.view.menu.b, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b11 t = b11.t(context, attributeSet, pn0.w, i, 0);
        setBackground(t.g(pn0.x));
        this.o = t.m(pn0.B, 0);
        this.p = t.m(pn0.A, 0);
        this.e = t.l(pn0.z, 0);
        this.r = t.m(pn0.y, zm0.d);
        t.v();
    }
}
