package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.pc0;
import androidx.appcompat.view.menu.s61;
import androidx.appcompat.view.menu.tc0;
import androidx.appcompat.view.menu.xc0;
import androidx.appcompat.view.menu.zc0;
import androidx.appcompat.widget.b;
/* loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements pc0.b, zc0 {
    public e A;
    public pc0 p;
    public Context q;
    public int r;
    public boolean s;
    public androidx.appcompat.widget.a t;
    public xc0.a u;
    public pc0.a v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean c();
    }

    /* loaded from: classes.dex */
    public static class b implements xc0.a {
        @Override // androidx.appcompat.view.menu.xc0.a
        public void b(pc0 pc0Var, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.xc0.a
        public boolean c(pc0 pc0Var) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b.a {
        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.a = cVar.a;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.a = false;
        }
    }

    /* loaded from: classes.dex */
    public class d implements pc0.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.pc0.a
        public boolean a(pc0 pc0Var, MenuItem menuItem) {
            e eVar = ActionMenuView.this.A;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.pc0.a
        public void b(pc0 pc0Var) {
            pc0.a aVar = ActionMenuView.this.v;
            if (aVar != null) {
                aVar.b(pc0Var);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static int G(View view, int i, int i2, int i3, int i4) {
        int i5;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.s();
        if (i2 > 0) {
            i5 = 2;
            if (!z2 || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z2 || i6 >= 2) {
                    i5 = i6;
                }
                if (!cVar.a && z2) {
                    z = true;
                }
                cVar.d = z;
                cVar.b = i5;
                view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
                return i5;
            }
        }
        i5 = 0;
        if (!cVar.a) {
            z = true;
        }
        cVar.d = z;
        cVar.b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: A */
    public c k(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: B */
    public c l(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        return j();
    }

    public c C() {
        c j = j();
        j.a = true;
        return j;
    }

    public boolean D(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).c();
    }

    public void E(pc0 pc0Var) {
        this.p = pc0Var;
    }

    public boolean F() {
        androidx.appcompat.widget.a aVar = this.t;
        return aVar != null && aVar.B();
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    public final void H(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.y;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        boolean z4 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        long j = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i18 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i19 = i15 + 1;
                if (z5) {
                    int i20 = this.z;
                    i7 = i19;
                    r14 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    i7 = i19;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f = r14;
                cVar.c = r14;
                cVar.b = r14;
                cVar.d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.e = z5 && ((ActionMenuItemView) childAt).s();
                int G = G(childAt, i12, cVar.a ? 1 : i10, childMeasureSpec, paddingTop);
                i16 = Math.max(i16, G);
                if (cVar.d) {
                    i17++;
                }
                if (cVar.a) {
                    z4 = true;
                }
                i10 -= G;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (G == 1) {
                    j |= 1 << i14;
                    i13 = i13;
                }
                i15 = i7;
            }
            i14++;
            size2 = i18;
        }
        int i21 = size2;
        boolean z6 = z4 && i15 == 2;
        boolean z7 = false;
        while (i17 > 0 && i10 > 0) {
            int i22 = Integer.MAX_VALUE;
            int i23 = 0;
            int i24 = 0;
            long j2 = 0;
            while (i24 < childCount) {
                boolean z8 = z7;
                c cVar2 = (c) getChildAt(i24).getLayoutParams();
                int i25 = i13;
                if (cVar2.d) {
                    int i26 = cVar2.b;
                    if (i26 < i22) {
                        j2 = 1 << i24;
                        i22 = i26;
                        i23 = 1;
                    } else if (i26 == i22) {
                        i23++;
                        j2 |= 1 << i24;
                    }
                }
                i24++;
                i13 = i25;
                z7 = z8;
            }
            z = z7;
            i5 = i13;
            j |= j2;
            if (i23 > i10) {
                i3 = mode;
                i4 = i8;
                break;
            }
            int i27 = i22 + 1;
            int i28 = 0;
            while (i28 < childCount) {
                View childAt2 = getChildAt(i28);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i29 = i8;
                int i30 = mode;
                long j3 = 1 << i28;
                if ((j2 & j3) == 0) {
                    if (cVar3.b == i27) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && cVar3.e && i10 == 1) {
                        int i31 = this.z;
                        z3 = z6;
                        childAt2.setPadding(i31 + i12, 0, i31, 0);
                    } else {
                        z3 = z6;
                    }
                    cVar3.b++;
                    cVar3.f = true;
                    i10--;
                }
                i28++;
                mode = i30;
                i8 = i29;
                z6 = z3;
            }
            i13 = i5;
            z7 = true;
        }
        i3 = mode;
        i4 = i8;
        z = z7;
        i5 = i13;
        boolean z9 = !z4 && i15 == 1;
        if (i10 <= 0 || j == 0 || (i10 >= i15 - 1 && !z9 && i16 <= 1)) {
            i6 = 0;
            z2 = z;
        } else {
            float bitCount = Long.bitCount(j);
            if (z9) {
                i6 = 0;
            } else {
                i6 = 0;
                if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & (1 << i32)) != 0 && !((c) getChildAt(i32).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) ((i10 * i12) / bitCount) : i6;
            z2 = z;
            for (int i34 = i6; i34 < childCount; i34++) {
                if ((j & (1 << i34)) != 0) {
                    View childAt3 = getChildAt(i34);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.c = i33;
                        cVar4.f = true;
                        if (i34 == 0 && !cVar4.e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i33) / 2;
                        }
                        z2 = true;
                    } else if (cVar4.a) {
                        cVar4.c = i33;
                        cVar4.f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i33) / 2;
                        z2 = true;
                    } else {
                        if (i34 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i33 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i35 = i6; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.b * i12) + cVar5.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i21);
    }

    public pc0 I() {
        return this.p;
    }

    public void J(xc0.a aVar, pc0.a aVar2) {
        this.u = aVar;
        this.v = aVar2;
    }

    public boolean K() {
        androidx.appcompat.widget.a aVar = this.t;
        return aVar != null && aVar.H();
    }

    @Override // androidx.appcompat.view.menu.pc0.b
    public boolean a(tc0 tc0Var) {
        return this.p.I(tc0Var, 0);
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.p == null) {
            Context context = getContext();
            pc0 pc0Var = new pc0(context);
            this.p = pc0Var;
            pc0Var.M(new d());
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.t = aVar;
            aVar.G(true);
            androidx.appcompat.widget.a aVar2 = this.t;
            xc0.a aVar3 = this.u;
            if (aVar3 == null) {
                aVar3 = new b();
            }
            aVar2.k(aVar3);
            this.p.b(this.t, this.q);
            this.t.E(this);
        }
        return this.p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.t.y();
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.t;
        if (aVar != null) {
            aVar.f(false);
            if (this.t.B()) {
                this.t.z();
                this.t.H();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.w) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = s61.a(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (D(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    D(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i, int i2) {
        pc0 pc0Var;
        boolean z = this.w;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.w = z2;
        if (z != z2) {
            this.x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.w && (pc0Var = this.p) != null && size != this.x) {
            this.x = size;
            pc0Var.H(true);
        }
        int childCount = getChildCount();
        if (this.w && childCount > 0) {
            H(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            c cVar = (c) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.D(z);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.t.F(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.s = z;
    }

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.t = aVar;
        aVar.E(this);
    }

    public void y() {
        androidx.appcompat.widget.a aVar = this.t;
        if (aVar != null) {
            aVar.w();
        }
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: z */
    public c j() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.y = (int) (56.0f * f);
        this.z = (int) (f * 4.0f);
        this.q = context;
        this.r = 0;
    }
}
