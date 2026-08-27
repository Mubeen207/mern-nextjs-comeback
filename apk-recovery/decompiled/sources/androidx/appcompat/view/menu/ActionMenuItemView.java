package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.pc0;
import androidx.appcompat.view.menu.zc0;
import androidx.appcompat.widget.ActionMenuView;
/* loaded from: classes.dex */
public class ActionMenuItemView extends l3 implements zc0.a, View.OnClickListener, ActionMenuView.a {
    public tc0 h;
    public CharSequence i;
    public Drawable j;
    public pc0.b k;
    public dv l;
    public b m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;

    /* loaded from: classes.dex */
    public class a extends dv {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.view.menu.dv
        public hu0 b() {
            b bVar = ActionMenuItemView.this.m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.view.menu.dv
        public boolean c() {
            hu0 b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            pc0.b bVar = actionMenuItemView.k;
            return bVar != null && bVar.a(actionMenuItemView.h) && (b = b()) != null && b.i();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract hu0 a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.view.menu.zc0.a
    public boolean b() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return s() && this.h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.zc0.a
    public void d(tc0 tc0Var, int i) {
        this.h = tc0Var;
        setIcon(tc0Var.getIcon());
        setTitle(tc0Var.h(this));
        setId(tc0Var.getItemId());
        setVisibility(tc0Var.isVisible() ? 0 : 8);
        setEnabled(tc0Var.isEnabled());
        if (tc0Var.hasSubMenu() && this.l == null) {
            this.l = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.zc0.a
    public tc0 getItemData() {
        return this.h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        pc0.b bVar = this.k;
        if (bVar != null) {
            bVar.a(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n = t();
        u();
    }

    @Override // androidx.appcompat.view.menu.l3, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean s = s();
        if (s && (i3 = this.q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.p) : this.p;
        if (mode != 1073741824 && this.p > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (s || this.j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        dv dvVar;
        if (this.h.hasSubMenu() && (dvVar = this.l) != null && dvVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.o != z) {
            this.o = z;
            tc0 tc0Var = this.h;
            if (tc0Var != null) {
                tc0Var.a();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.r;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        u();
    }

    public void setItemInvoker(pc0.b bVar) {
        this.k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        u();
    }

    public final boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void u() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.i);
        if (this.j != null && (!this.h.A() || (!this.n && !this.o))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.i : null);
        CharSequence contentDescription = this.h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            i11.a(this, z3 ? null : this.h.getTitle());
        } else {
            i11.a(this, tooltipText);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.n = t();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pn0.t, i, 0);
        this.p = obtainStyledAttributes.getDimensionPixelSize(pn0.u, 0);
        obtainStyledAttributes.recycle();
        this.r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.q = -1;
        setSaveEnabled(false);
    }
}
