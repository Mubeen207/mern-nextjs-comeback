package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.ce0;
import androidx.appcompat.view.menu.cm0;
import androidx.appcompat.view.menu.hm0;
import androidx.appcompat.view.menu.j2;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.vm0;
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView a;
    public Button b;
    public final TimeInterpolator c;
    public int d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = ce0.g(context, cm0.z, j2.b);
    }

    public static void a(View view, int i, int i2) {
        if (p51.Q(view)) {
            p51.z0(view, p51.C(view), i, p51.B(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    public final boolean b(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        a(this.a, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(vm0.E);
        this.b = (Button) findViewById(vm0.D);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(hm0.d);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(hm0.c);
        Layout layout = this.a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.d = i;
    }
}
