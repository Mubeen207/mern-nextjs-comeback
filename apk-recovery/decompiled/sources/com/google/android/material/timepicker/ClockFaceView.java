package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.view.menu.b0;
import androidx.appcompat.view.menu.cm0;
import androidx.appcompat.view.menu.em0;
import androidx.appcompat.view.menu.hm0;
import androidx.appcompat.view.menu.hn0;
import androidx.appcompat.view.menu.i3;
import androidx.appcompat.view.menu.on0;
import androidx.appcompat.view.menu.p0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.qb0;
import androidx.appcompat.view.menu.sn0;
import androidx.appcompat.view.menu.vm0;
import androidx.appcompat.view.menu.ym0;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
/* loaded from: classes.dex */
class ClockFaceView extends sn0 implements ClockHandView.b {
    public final ClockHandView A;
    public final Rect B;
    public final RectF C;
    public final Rect D;
    public final SparseArray E;
    public final b0 F;
    public final int[] G;
    public final float[] H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public String[] M;
    public float N;
    public final ColorStateList O;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (ClockFaceView.this.isShown()) {
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.x(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.A.i()) - ClockFaceView.this.I);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends b0 {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.b0
        public void g(View view, p0 p0Var) {
            super.g(view, p0Var);
            int intValue = ((Integer) view.getTag(vm0.n)).intValue();
            if (intValue > 0) {
                p0Var.z0((View) ClockFaceView.this.E.get(intValue - 1));
            }
            p0Var.f0(p0.f.a(0, 1, intValue, 1, false, view.isSelected()));
            p0Var.d0(true);
            p0Var.b(p0.a.i);
        }

        @Override // androidx.appcompat.view.menu.b0
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(ClockFaceView.this.B);
                float centerX = ClockFaceView.this.B.centerX();
                float centerY = ClockFaceView.this.B.centerY();
                ClockFaceView.this.A.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                ClockFaceView.this.A.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                return true;
            }
            return super.j(view, i, bundle);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, cm0.q);
    }

    public static float I(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    public final void F() {
        RectF e = this.A.e();
        TextView H = H(e);
        for (int i = 0; i < this.E.size(); i++) {
            TextView textView = (TextView) this.E.get(i);
            if (textView != null) {
                textView.setSelected(textView == H);
                textView.getPaint().setShader(G(e, textView));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient G(RectF rectF, TextView textView) {
        textView.getHitRect(this.B);
        this.C.set(this.B);
        textView.getLineBounds(0, this.D);
        RectF rectF2 = this.C;
        Rect rect = this.D;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.C)) {
            return new RadialGradient(rectF.centerX() - this.C.left, rectF.centerY() - this.C.top, rectF.width() * 0.5f, this.G, this.H, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public final TextView H(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.E.size(); i++) {
            TextView textView2 = (TextView) this.E.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.B);
                this.C.set(this.B);
                this.C.union(rectF);
                float width = this.C.width() * this.C.height();
                if (width < f) {
                    textView = textView2;
                    f = width;
                }
            }
        }
        return textView;
    }

    public void J(String[] strArr, int i) {
        this.M = strArr;
        K(i);
    }

    public final void K(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.E.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.M.length, size); i2++) {
            TextView textView = (TextView) this.E.get(i2);
            if (i2 >= this.M.length) {
                removeView(textView);
                this.E.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(ym0.d, (ViewGroup) this, false);
                    this.E.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.M[i2]);
                textView.setTag(vm0.n, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(vm0.i, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                p51.k0(textView, this.F);
                textView.setTextColor(this.O);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.M[i2]));
                }
            }
        }
        this.A.q(z);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f, boolean z) {
        if (Math.abs(this.N - f) > 0.001f) {
            this.N = f;
            F();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p0.C0(accessibilityNodeInfo).e0(p0.e.a(1, this.M.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        F();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int I = (int) (this.L / I(this.J / displayMetrics.heightPixels, this.K / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(I, 1073741824);
        setMeasuredDimension(I, I);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // androidx.appcompat.view.menu.sn0
    public void x(int i) {
        if (i != w()) {
            super.x(i);
            this.A.m(w());
        }
    }

    @Override // androidx.appcompat.view.menu.sn0
    public void z() {
        super.z();
        for (int i = 0; i < this.E.size(); i++) {
            ((TextView) this.E.get(i)).setVisibility(0);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = new Rect();
        this.C = new RectF();
        this.D = new Rect();
        this.E = new SparseArray();
        this.H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, on0.S0, i, hn0.k);
        Resources resources = getResources();
        ColorStateList a2 = qb0.a(context, obtainStyledAttributes, on0.U0);
        this.O = a2;
        LayoutInflater.from(context).inflate(ym0.e, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(vm0.h);
        this.A = clockHandView;
        this.I = resources.getDimensionPixelSize(hm0.q);
        int colorForState = a2.getColorForState(new int[]{16842913}, a2.getDefaultColor());
        this.G = new int[]{colorForState, colorForState, a2.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = i3.a(context, em0.b).getDefaultColor();
        ColorStateList a3 = qb0.a(context, obtainStyledAttributes, on0.T0);
        setBackgroundColor(a3 != null ? a3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.F = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        J(strArr, 0);
        this.J = resources.getDimensionPixelSize(hm0.D);
        this.K = resources.getDimensionPixelSize(hm0.E);
        this.L = resources.getDimensionPixelSize(hm0.s);
    }
}
