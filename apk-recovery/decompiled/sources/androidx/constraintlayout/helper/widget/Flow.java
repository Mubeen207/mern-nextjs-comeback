package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.view.menu.h71;
import androidx.appcompat.view.menu.i71;
import androidx.appcompat.view.menu.jn0;
import androidx.appcompat.view.menu.mf;
import androidx.appcompat.view.menu.ws;
/* loaded from: classes.dex */
public class Flow extends h71 {
    public ws k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.view.menu.h71, androidx.constraintlayout.widget.c
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.k = new ws();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jn0.a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == jn0.b1) {
                    this.k.S1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == jn0.c1) {
                    this.k.Y0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == jn0.m1) {
                    this.k.d1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == jn0.n1) {
                    this.k.a1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == jn0.d1) {
                    this.k.b1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == jn0.e1) {
                    this.k.e1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == jn0.f1) {
                    this.k.c1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == jn0.g1) {
                    this.k.Z0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == jn0.L1) {
                    this.k.X1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == jn0.B1) {
                    this.k.M1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == jn0.K1) {
                    this.k.W1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == jn0.v1) {
                    this.k.G1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == jn0.D1) {
                    this.k.O1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == jn0.x1) {
                    this.k.I1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == jn0.F1) {
                    this.k.Q1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == jn0.z1) {
                    this.k.K1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == jn0.u1) {
                    this.k.F1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == jn0.C1) {
                    this.k.N1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == jn0.w1) {
                    this.k.H1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == jn0.E1) {
                    this.k.P1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == jn0.I1) {
                    this.k.U1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == jn0.y1) {
                    this.k.J1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == jn0.H1) {
                    this.k.T1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == jn0.A1) {
                    this.k.L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == jn0.J1) {
                    this.k.V1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == jn0.G1) {
                    this.k.R1(obtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.d = this.k;
        m();
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(mf mfVar, boolean z) {
        this.k.K0(z);
    }

    @Override // androidx.appcompat.view.menu.h71
    public void n(i71 i71Var, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (i71Var == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        i71Var.S0(mode, size, mode2, size2);
        setMeasuredDimension(i71Var.N0(), i71Var.M0());
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onMeasure(int i, int i2) {
        n(this.k, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.k.F1(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.k.G1(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.k.H1(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.k.I1(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.k.J1(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.k.K1(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.k.L1(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.k.M1(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.k.R1(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.k.S1(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.k.Y0(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.k.Z0(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.k.b1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.k.c1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.k.e1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.k.T1(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.k.U1(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.k.V1(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.k.W1(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.k.X1(i);
        requestLayout();
    }
}
