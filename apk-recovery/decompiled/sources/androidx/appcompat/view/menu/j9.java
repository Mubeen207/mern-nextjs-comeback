package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class j9 {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final vt0 f;

    public j9(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, vt0 vt0Var, Rect rect) {
        tj0.d(rect.left);
        tj0.d(rect.top);
        tj0.d(rect.right);
        tj0.d(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = vt0Var;
    }

    public static j9 a(Context context, int i) {
        tj0.b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, on0.D2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(on0.E2, 0), obtainStyledAttributes.getDimensionPixelOffset(on0.G2, 0), obtainStyledAttributes.getDimensionPixelOffset(on0.F2, 0), obtainStyledAttributes.getDimensionPixelOffset(on0.H2, 0));
        ColorStateList a = qb0.a(context, obtainStyledAttributes, on0.I2);
        ColorStateList a2 = qb0.a(context, obtainStyledAttributes, on0.N2);
        ColorStateList a3 = qb0.a(context, obtainStyledAttributes, on0.L2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(on0.M2, 0);
        vt0 m = vt0.b(context, obtainStyledAttributes.getResourceId(on0.J2, 0), obtainStyledAttributes.getResourceId(on0.K2, 0)).m();
        obtainStyledAttributes.recycle();
        return new j9(a, a2, a3, dimensionPixelSize, m, rect);
    }

    public void b(TextView textView) {
        c(textView, null, null);
    }

    public void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        rb0 rb0Var = new rb0();
        rb0 rb0Var2 = new rb0();
        rb0Var.setShapeAppearanceModel(this.f);
        rb0Var2.setShapeAppearanceModel(this.f);
        if (colorStateList == null) {
            colorStateList = this.c;
        }
        rb0Var.T(colorStateList);
        rb0Var.Y(this.e, this.d);
        if (colorStateList2 == null) {
            colorStateList2 = this.b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), rb0Var, rb0Var2);
        Rect rect = this.a;
        p51.o0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
