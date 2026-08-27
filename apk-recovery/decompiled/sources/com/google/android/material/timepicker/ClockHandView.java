package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ce0;
import androidx.appcompat.view.menu.cm0;
import androidx.appcompat.view.menu.hm0;
import androidx.appcompat.view.menu.hn0;
import androidx.appcompat.view.menu.j2;
import androidx.appcompat.view.menu.on0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.p61;
import androidx.appcompat.view.menu.wb0;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {
    public final int a;
    public final TimeInterpolator b;
    public final ValueAnimator c;
    public boolean d;
    public float e;
    public float f;
    public boolean g;
    public final int h;
    public boolean i;
    public final List j;
    public final int k;
    public final float l;
    public final Paint m;
    public final RectF n;
    public final int o;
    public float p;
    public boolean q;
    public double r;
    public int s;
    public int t;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, cm0.q);
    }

    public void b(b bVar) {
        this.j.add(bVar);
    }

    public final void c(float f, float f2) {
        this.t = wb0.a((float) (getWidth() / 2), (float) (getHeight() / 2), f, f2) > ((float) h(2)) + p61.c(getContext(), 12) ? 1 : 2;
    }

    public final void d(Canvas canvas) {
        int h;
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float h2 = h(this.t);
        float f2 = height;
        this.m.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.r)) * h2) + f, (h2 * ((float) Math.sin(this.r))) + f2, this.k, this.m);
        double sin = Math.sin(this.r);
        double cos = Math.cos(this.r);
        this.m.setStrokeWidth(this.o);
        canvas.drawLine(f, f2, width + ((int) (cos * r7)), height + ((int) (r7 * sin)), this.m);
        canvas.drawCircle(f, f2, this.l, this.m);
    }

    public RectF e() {
        return this.n;
    }

    public final int f(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    public float g() {
        return this.p;
    }

    public final int h(int i) {
        return i == 2 ? Math.round(this.s * 0.66f) : this.s;
    }

    public int i() {
        return this.k;
    }

    public final Pair j(float f) {
        float g = g();
        if (Math.abs(g - f) > 180.0f) {
            if (g > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (g < 180.0f && f > 180.0f) {
                g += 360.0f;
            }
        }
        return new Pair(Float.valueOf(g), Float.valueOf(f));
    }

    public final boolean k(float f, float f2, boolean z, boolean z2, boolean z3) {
        float f3 = f(f, f2);
        boolean z4 = false;
        boolean z5 = g() != f3;
        if (z2 && z5) {
            return true;
        }
        if (z5 || z) {
            if (z3 && this.d) {
                z4 = true;
            }
            o(f3, z4);
            return true;
        }
        return false;
    }

    public final /* synthetic */ void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    public void m(int i) {
        this.s = i;
        invalidate();
    }

    public void n(float f) {
        o(f, false);
    }

    public void o(float f, boolean z) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            p(f, false);
            return;
        }
        Pair j = j(f);
        this.c.setFloatValues(((Float) j.first).floatValue(), ((Float) j.second).floatValue());
        this.c.setDuration(this.a);
        this.c.setInterpolator(this.b);
        this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.this.l(valueAnimator2);
            }
        });
        this.c.addListener(new a());
        this.c.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.c.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.e = x;
            this.f = y;
            this.g = true;
            this.q = false;
            z = true;
            z2 = false;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.e);
            int i2 = (int) (y - this.f);
            this.g = (i * i) + (i2 * i2) > this.h;
            z2 = this.q;
            boolean z4 = actionMasked == 1;
            if (this.i) {
                c(x, y);
            }
            z3 = z4;
            z = false;
        } else {
            z2 = false;
            z = false;
            z3 = false;
        }
        this.q |= k(x, y, z2, z, z3);
        return true;
    }

    public final void p(float f, boolean z) {
        float f2 = f % 360.0f;
        this.p = f2;
        this.r = Math.toRadians(f2 - 90.0f);
        float h = h(this.t);
        float width = (getWidth() / 2) + (((float) Math.cos(this.r)) * h);
        float height = (getHeight() / 2) + (h * ((float) Math.sin(this.r)));
        RectF rectF = this.n;
        int i = this.k;
        rectF.set(width - i, height - i, width + i, height + i);
        for (b bVar : this.j) {
            bVar.a(f2, z);
        }
        invalidate();
    }

    public void q(boolean z) {
        if (this.i && !z) {
            this.t = 1;
        }
        this.i = z;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ValueAnimator();
        this.j = new ArrayList();
        Paint paint = new Paint();
        this.m = paint;
        this.n = new RectF();
        this.t = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, on0.V0, i, hn0.k);
        this.a = ce0.f(context, cm0.s, 200);
        this.b = ce0.g(context, cm0.z, j2.b);
        this.s = obtainStyledAttributes.getDimensionPixelSize(on0.X0, 0);
        this.k = obtainStyledAttributes.getDimensionPixelSize(on0.Y0, 0);
        Resources resources = getResources();
        this.o = resources.getDimensionPixelSize(hm0.r);
        this.l = resources.getDimensionPixelSize(hm0.p);
        int color = obtainStyledAttributes.getColor(on0.W0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        p51.u0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
