package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.jn0;
import androidx.appcompat.view.menu.mf;
import androidx.appcompat.view.menu.w7;
/* loaded from: classes.dex */
public class a extends c {
    public int i;
    public int j;
    public w7 k;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.c
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.k = new w7();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jn0.a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == jn0.q1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == jn0.p1) {
                    this.k.O0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == jn0.r1) {
                    this.k.Q0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.d = this.k;
        m();
    }

    public int getMargin() {
        return this.k.M0();
    }

    public int getType() {
        return this.i;
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(mf mfVar, boolean z) {
        o(mfVar, this.i, z);
    }

    public boolean n() {
        return this.k.K0();
    }

    public final void o(mf mfVar, int i, boolean z) {
        this.j = i;
        if (z) {
            int i2 = this.i;
            if (i2 == 5) {
                this.j = 1;
            } else if (i2 == 6) {
                this.j = 0;
            }
        } else {
            int i3 = this.i;
            if (i3 == 5) {
                this.j = 0;
            } else if (i3 == 6) {
                this.j = 1;
            }
        }
        if (mfVar instanceof w7) {
            ((w7) mfVar).P0(this.j);
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.k.O0(z);
    }

    public void setDpMargin(int i) {
        w7 w7Var = this.k;
        w7Var.Q0((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.k.Q0(i);
    }

    public void setType(int i) {
        this.i = i;
    }
}
