package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class u0 extends ViewGroup.MarginLayoutParams {
    public int a;

    public u0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pn0.r);
        this.a = obtainStyledAttributes.getInt(pn0.s, 0);
        obtainStyledAttributes.recycle();
    }

    public u0(int i, int i2) {
        super(i, i2);
        this.a = 8388627;
    }

    public u0(u0 u0Var) {
        super((ViewGroup.MarginLayoutParams) u0Var);
        this.a = 0;
        this.a = u0Var.a;
    }

    public u0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
