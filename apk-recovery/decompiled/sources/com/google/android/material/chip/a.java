package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.ae0;
import androidx.appcompat.view.menu.cd;
import androidx.appcompat.view.menu.ea;
import androidx.appcompat.view.menu.h8;
import androidx.appcompat.view.menu.i01;
import androidx.appcompat.view.menu.i3;
import androidx.appcompat.view.menu.ob0;
import androidx.appcompat.view.menu.om;
import androidx.appcompat.view.menu.on0;
import androidx.appcompat.view.menu.p61;
import androidx.appcompat.view.menu.qb0;
import androidx.appcompat.view.menu.rb0;
import androidx.appcompat.view.menu.tm;
import androidx.appcompat.view.menu.tz0;
import androidx.appcompat.view.menu.wp0;
import androidx.appcompat.view.menu.yz0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* loaded from: classes.dex */
public class a extends rb0 implements Drawable.Callback, yz0.b {
    public static final int[] I0 = {16842910};
    public static final ShapeDrawable J0 = new ShapeDrawable(new OvalShape());
    public float A;
    public int[] A0;
    public float B;
    public boolean B0;
    public ColorStateList C;
    public ColorStateList C0;
    public float D;
    public WeakReference D0;
    public ColorStateList E;
    public TextUtils.TruncateAt E0;
    public CharSequence F;
    public boolean F0;
    public boolean G;
    public int G0;
    public Drawable H;
    public boolean H0;
    public ColorStateList I;
    public float J;
    public boolean K;
    public boolean L;
    public Drawable M;
    public Drawable N;
    public ColorStateList O;
    public float P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public Drawable T;
    public ColorStateList U;
    public ae0 V;
    public ae0 W;
    public float X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public final Context f0;
    public final Paint g0;
    public final Paint h0;
    public final Paint.FontMetrics i0;
    public final RectF j0;
    public final PointF k0;
    public final Path l0;
    public final yz0 m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public int u0;
    public int v0;
    public ColorFilter w0;
    public PorterDuffColorFilter x0;
    public ColorStateList y;
    public ColorStateList y0;
    public ColorStateList z;
    public PorterDuff.Mode z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0061a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.B = -1.0f;
        this.g0 = new Paint(1);
        this.i0 = new Paint.FontMetrics();
        this.j0 = new RectF();
        this.k0 = new PointF();
        this.l0 = new Path();
        this.v0 = 255;
        this.z0 = PorterDuff.Mode.SRC_IN;
        this.D0 = new WeakReference(null);
        J(context);
        this.f0 = context;
        yz0 yz0Var = new yz0(this);
        this.m0 = yz0Var;
        this.F = "";
        yz0Var.f().density = context.getResources().getDisplayMetrics().density;
        this.h0 = null;
        int[] iArr = I0;
        setState(iArr);
        f2(iArr);
        this.F0 = true;
        if (wp0.a) {
            J0.setTint(-1);
        }
    }

    public static boolean h1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean l1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean m1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean n1(tz0 tz0Var) {
        return (tz0Var == null || tz0Var.i() == null || !tz0Var.i().isStateful()) ? false : true;
    }

    public static a p0(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.o1(attributeSet, i, i2);
        return aVar;
    }

    public ColorStateList A0() {
        return this.U;
    }

    public void A1(int i) {
        z1(i3.a(this.f0, i));
    }

    public void A2(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            p1();
        }
    }

    public ColorStateList B0() {
        return this.z;
    }

    public void B1(float f) {
        if (this.B != f) {
            this.B = f;
            setShapeAppearanceModel(A().w(f));
        }
    }

    public void B2(int i) {
        A2(this.f0.getResources().getDimension(i));
    }

    public float C0() {
        return this.H0 ? C() : this.B;
    }

    public void C1(int i) {
        B1(this.f0.getResources().getDimension(i));
    }

    public void C2(float f) {
        tz0 c1 = c1();
        if (c1 != null) {
            c1.l(f);
            this.m0.f().setTextSize(f);
            a();
        }
    }

    public float D0() {
        return this.e0;
    }

    public void D1(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            p1();
        }
    }

    public void D2(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidateSelf();
            p1();
        }
    }

    public Drawable E0() {
        Drawable drawable = this.H;
        if (drawable != null) {
            return om.k(drawable);
        }
        return null;
    }

    public void E1(int i) {
        D1(this.f0.getResources().getDimension(i));
    }

    public void E2(int i) {
        D2(this.f0.getResources().getDimension(i));
    }

    public float F0() {
        return this.J;
    }

    public void F1(Drawable drawable) {
        Drawable E0 = E0();
        if (E0 != drawable) {
            float g0 = g0();
            this.H = drawable != null ? om.l(drawable).mutate() : null;
            float g02 = g0();
            K2(E0);
            if (I2()) {
                e0(this.H);
            }
            invalidateSelf();
            if (g0 != g02) {
                p1();
            }
        }
    }

    public void F2(boolean z) {
        if (this.B0 != z) {
            this.B0 = z;
            L2();
            onStateChange(getState());
        }
    }

    public ColorStateList G0() {
        return this.I;
    }

    public void G1(int i) {
        F1(i3.b(this.f0, i));
    }

    public boolean G2() {
        return this.F0;
    }

    public float H0() {
        return this.A;
    }

    public void H1(float f) {
        if (this.J != f) {
            float g0 = g0();
            this.J = f;
            float g02 = g0();
            invalidateSelf();
            if (g0 != g02) {
                p1();
            }
        }
    }

    public final boolean H2() {
        return this.S && this.T != null && this.t0;
    }

    public float I0() {
        return this.X;
    }

    public void I1(int i) {
        H1(this.f0.getResources().getDimension(i));
    }

    public final boolean I2() {
        return this.G && this.H != null;
    }

    public ColorStateList J0() {
        return this.C;
    }

    public void J1(ColorStateList colorStateList) {
        this.K = true;
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (I2()) {
                om.i(this.H, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean J2() {
        return this.L && this.M != null;
    }

    public float K0() {
        return this.D;
    }

    public void K1(int i) {
        J1(i3.a(this.f0, i));
    }

    public final void K2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public Drawable L0() {
        Drawable drawable = this.M;
        if (drawable != null) {
            return om.k(drawable);
        }
        return null;
    }

    public void L1(int i) {
        M1(this.f0.getResources().getBoolean(i));
    }

    public final void L2() {
        this.C0 = this.B0 ? wp0.a(this.E) : null;
    }

    public CharSequence M0() {
        return this.Q;
    }

    public void M1(boolean z) {
        if (this.G != z) {
            boolean I2 = I2();
            this.G = z;
            boolean I22 = I2();
            if (I2 != I22) {
                if (I22) {
                    e0(this.H);
                } else {
                    K2(this.H);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public final void M2() {
        this.N = new RippleDrawable(wp0.a(Z0()), this.M, J0);
    }

    public float N0() {
        return this.d0;
    }

    public void N1(float f) {
        if (this.A != f) {
            this.A = f;
            invalidateSelf();
            p1();
        }
    }

    public float O0() {
        return this.P;
    }

    public void O1(int i) {
        N1(this.f0.getResources().getDimension(i));
    }

    public float P0() {
        return this.c0;
    }

    public void P1(float f) {
        if (this.X != f) {
            this.X = f;
            invalidateSelf();
            p1();
        }
    }

    public int[] Q0() {
        return this.A0;
    }

    public void Q1(int i) {
        P1(this.f0.getResources().getDimension(i));
    }

    public ColorStateList R0() {
        return this.O;
    }

    public void R1(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (this.H0) {
                Z(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void S0(RectF rectF) {
        j0(getBounds(), rectF);
    }

    public void S1(int i) {
        R1(i3.a(this.f0, i));
    }

    public final float T0() {
        Drawable drawable = this.t0 ? this.T : this.H;
        float f = this.J;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(p61.c(this.f0, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    public void T1(float f) {
        if (this.D != f) {
            this.D = f;
            this.g0.setStrokeWidth(f);
            if (this.H0) {
                super.a0(f);
            }
            invalidateSelf();
        }
    }

    public final float U0() {
        Drawable drawable = this.t0 ? this.T : this.H;
        float f = this.J;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    public void U1(int i) {
        T1(this.f0.getResources().getDimension(i));
    }

    public TextUtils.TruncateAt V0() {
        return this.E0;
    }

    public final void V1(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            onStateChange(getState());
        }
    }

    public ae0 W0() {
        return this.W;
    }

    public void W1(Drawable drawable) {
        Drawable L0 = L0();
        if (L0 != drawable) {
            float k0 = k0();
            this.M = drawable != null ? om.l(drawable).mutate() : null;
            if (wp0.a) {
                M2();
            }
            float k02 = k0();
            K2(L0);
            if (J2()) {
                e0(this.M);
            }
            invalidateSelf();
            if (k0 != k02) {
                p1();
            }
        }
    }

    public float X0() {
        return this.Z;
    }

    public void X1(CharSequence charSequence) {
        if (this.Q != charSequence) {
            this.Q = h8.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float Y0() {
        return this.Y;
    }

    public void Y1(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    public ColorStateList Z0() {
        return this.E;
    }

    public void Z1(int i) {
        Y1(this.f0.getResources().getDimension(i));
    }

    @Override // androidx.appcompat.view.menu.yz0.b
    public void a() {
        p1();
        invalidateSelf();
    }

    public ae0 a1() {
        return this.V;
    }

    public void a2(int i) {
        W1(i3.b(this.f0, i));
    }

    public CharSequence b1() {
        return this.F;
    }

    public void b2(float f) {
        if (this.P != f) {
            this.P = f;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    public tz0 c1() {
        return this.m0.e();
    }

    public void c2(int i) {
        b2(this.f0.getResources().getDimension(i));
    }

    public float d1() {
        return this.b0;
    }

    public void d2(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.rb0, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.v0;
        int a = i < 255 ? ea.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        u0(canvas, bounds);
        r0(canvas, bounds);
        if (this.H0) {
            super.draw(canvas);
        }
        t0(canvas, bounds);
        w0(canvas, bounds);
        s0(canvas, bounds);
        q0(canvas, bounds);
        if (this.F0) {
            y0(canvas, bounds);
        }
        v0(canvas, bounds);
        x0(canvas, bounds);
        if (this.v0 < 255) {
            canvas.restoreToCount(a);
        }
    }

    public final void e0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        om.g(drawable, om.b(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.M) {
            if (drawable.isStateful()) {
                drawable.setState(Q0());
            }
            om.i(drawable, this.O);
            return;
        }
        Drawable drawable2 = this.H;
        if (drawable == drawable2 && this.K) {
            om.i(drawable2, this.I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float e1() {
        return this.a0;
    }

    public void e2(int i) {
        d2(this.f0.getResources().getDimension(i));
    }

    public final void f0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (I2() || H2()) {
            float f = this.X + this.Y;
            float U0 = U0();
            if (om.b(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + U0;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - U0;
            }
            float T0 = T0();
            float exactCenterY = rect.exactCenterY() - (T0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + T0;
        }
    }

    public final ColorFilter f1() {
        ColorFilter colorFilter = this.w0;
        return colorFilter != null ? colorFilter : this.x0;
    }

    public boolean f2(int[] iArr) {
        if (Arrays.equals(this.A0, iArr)) {
            return false;
        }
        this.A0 = iArr;
        if (J2()) {
            return q1(getState(), iArr);
        }
        return false;
    }

    public float g0() {
        if (I2() || H2()) {
            return this.Y + U0() + this.Z;
        }
        return 0.0f;
    }

    public boolean g1() {
        return this.B0;
    }

    public void g2(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (J2()) {
                om.i(this.M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // androidx.appcompat.view.menu.rb0, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.v0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.w0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.X + g0() + this.a0 + this.m0.g(b1().toString()) + this.b0 + k0() + this.e0), this.G0);
    }

    @Override // androidx.appcompat.view.menu.rb0, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // androidx.appcompat.view.menu.rb0, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.B);
        } else {
            outline.setRoundRect(bounds, this.B);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public final void h0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (J2()) {
            float f = this.e0 + this.d0 + this.P + this.c0 + this.b0;
            if (om.b(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    public void h2(int i) {
        g2(i3.a(this.f0, i));
    }

    public final void i0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f = this.e0 + this.d0;
            if (om.b(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.P;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.P;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.P;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public boolean i1() {
        return this.R;
    }

    public void i2(boolean z) {
        if (this.L != z) {
            boolean J2 = J2();
            this.L = z;
            boolean J22 = J2();
            if (J2 != J22) {
                if (J22) {
                    e0(this.M);
                } else {
                    K2(this.M);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // androidx.appcompat.view.menu.rb0, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return l1(this.y) || l1(this.z) || l1(this.C) || (this.B0 && l1(this.C0)) || n1(this.m0.e()) || o0() || m1(this.H) || m1(this.T) || l1(this.y0);
    }

    public final void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f = this.e0 + this.d0 + this.P + this.c0 + this.b0;
            if (om.b(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean j1() {
        return m1(this.M);
    }

    public void j2(InterfaceC0061a interfaceC0061a) {
        this.D0 = new WeakReference(interfaceC0061a);
    }

    public float k0() {
        if (J2()) {
            return this.c0 + this.P + this.d0;
        }
        return 0.0f;
    }

    public boolean k1() {
        return this.L;
    }

    public void k2(TextUtils.TruncateAt truncateAt) {
        this.E0 = truncateAt;
    }

    public final void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.F != null) {
            float g0 = this.X + g0() + this.a0;
            float k0 = this.e0 + k0() + this.b0;
            if (om.b(this) == 0) {
                rectF.left = rect.left + g0;
                rectF.right = rect.right - k0;
            } else {
                rectF.left = rect.left + k0;
                rectF.right = rect.right - g0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void l2(ae0 ae0Var) {
        this.W = ae0Var;
    }

    public final float m0() {
        this.m0.f().getFontMetrics(this.i0);
        Paint.FontMetrics fontMetrics = this.i0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void m2(int i) {
        l2(ae0.c(this.f0, i));
    }

    public Paint.Align n0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.F != null) {
            float g0 = this.X + g0() + this.a0;
            if (om.b(this) == 0) {
                pointF.x = rect.left + g0;
            } else {
                pointF.x = rect.right - g0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m0();
        }
        return align;
    }

    public void n2(float f) {
        if (this.Z != f) {
            float g0 = g0();
            this.Z = f;
            float g02 = g0();
            invalidateSelf();
            if (g0 != g02) {
                p1();
            }
        }
    }

    public final boolean o0() {
        return this.S && this.T != null && this.R;
    }

    public final void o1(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = i01.h(this.f0, attributeSet, on0.b0, i, i2, new int[0]);
        this.H0 = h.hasValue(on0.M0);
        V1(qb0.a(this.f0, h, on0.z0));
        z1(qb0.a(this.f0, h, on0.m0));
        N1(h.getDimension(on0.u0, 0.0f));
        if (h.hasValue(on0.n0)) {
            B1(h.getDimension(on0.n0, 0.0f));
        }
        R1(qb0.a(this.f0, h, on0.x0));
        T1(h.getDimension(on0.y0, 0.0f));
        s2(qb0.a(this.f0, h, on0.L0));
        x2(h.getText(on0.g0));
        tz0 e = qb0.e(this.f0, h, on0.c0);
        e.l(h.getDimension(on0.d0, e.j()));
        y2(e);
        int i3 = h.getInt(on0.e0, 0);
        if (i3 == 1) {
            k2(TextUtils.TruncateAt.START);
        } else if (i3 == 2) {
            k2(TextUtils.TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            k2(TextUtils.TruncateAt.END);
        }
        M1(h.getBoolean(on0.t0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            M1(h.getBoolean(on0.q0, false));
        }
        F1(qb0.c(this.f0, h, on0.p0));
        if (h.hasValue(on0.s0)) {
            J1(qb0.a(this.f0, h, on0.s0));
        }
        H1(h.getDimension(on0.r0, -1.0f));
        i2(h.getBoolean(on0.G0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            i2(h.getBoolean(on0.B0, false));
        }
        W1(qb0.c(this.f0, h, on0.A0));
        g2(qb0.a(this.f0, h, on0.F0));
        b2(h.getDimension(on0.D0, 0.0f));
        r1(h.getBoolean(on0.h0, false));
        y1(h.getBoolean(on0.l0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            y1(h.getBoolean(on0.j0, false));
        }
        t1(qb0.c(this.f0, h, on0.i0));
        if (h.hasValue(on0.k0)) {
            v1(qb0.a(this.f0, h, on0.k0));
        }
        v2(ae0.b(this.f0, h, on0.N0));
        l2(ae0.b(this.f0, h, on0.I0));
        P1(h.getDimension(on0.w0, 0.0f));
        p2(h.getDimension(on0.K0, 0.0f));
        n2(h.getDimension(on0.J0, 0.0f));
        D2(h.getDimension(on0.P0, 0.0f));
        A2(h.getDimension(on0.O0, 0.0f));
        d2(h.getDimension(on0.E0, 0.0f));
        Y1(h.getDimension(on0.C0, 0.0f));
        D1(h.getDimension(on0.o0, 0.0f));
        r2(h.getDimensionPixelSize(on0.f0, Integer.MAX_VALUE));
        h.recycle();
    }

    public void o2(int i) {
        n2(this.f0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (I2()) {
            onLayoutDirectionChanged |= om.g(this.H, i);
        }
        if (H2()) {
            onLayoutDirectionChanged |= om.g(this.T, i);
        }
        if (J2()) {
            onLayoutDirectionChanged |= om.g(this.M, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (I2()) {
            onLevelChange |= this.H.setLevel(i);
        }
        if (H2()) {
            onLevelChange |= this.T.setLevel(i);
        }
        if (J2()) {
            onLevelChange |= this.M.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // androidx.appcompat.view.menu.rb0, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.H0) {
            super.onStateChange(iArr);
        }
        return q1(iArr, Q0());
    }

    public void p1() {
        InterfaceC0061a interfaceC0061a = (InterfaceC0061a) this.D0.get();
        if (interfaceC0061a != null) {
            interfaceC0061a.a();
        }
    }

    public void p2(float f) {
        if (this.Y != f) {
            float g0 = g0();
            this.Y = f;
            float g02 = g0();
            invalidateSelf();
            if (g0 != g02) {
                p1();
            }
        }
    }

    public final void q0(Canvas canvas, Rect rect) {
        if (H2()) {
            f0(rect, this.j0);
            RectF rectF = this.j0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.T.setBounds(0, 0, (int) this.j0.width(), (int) this.j0.height());
            this.T.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public final boolean q1(int[] iArr, int[] iArr2) {
        boolean z;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.y;
        int l = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.n0) : 0);
        boolean z2 = true;
        if (this.n0 != l) {
            this.n0 = l;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.z;
        int l2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.o0) : 0);
        if (this.o0 != l2) {
            this.o0 = l2;
            onStateChange = true;
        }
        int i = ob0.i(l, l2);
        if ((this.p0 != i) | (v() == null)) {
            this.p0 = i;
            T(ColorStateList.valueOf(i));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.C;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.q0) : 0;
        if (this.q0 != colorForState) {
            this.q0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.C0 == null || !wp0.b(iArr)) ? 0 : this.C0.getColorForState(iArr, this.r0);
        if (this.r0 != colorForState2) {
            this.r0 = colorForState2;
            if (this.B0) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.m0.e() == null || this.m0.e().i() == null) ? 0 : this.m0.e().i().getColorForState(iArr, this.s0);
        if (this.s0 != colorForState3) {
            this.s0 = colorForState3;
            onStateChange = true;
        }
        boolean z3 = h1(getState(), 16842912) && this.R;
        if (this.t0 == z3 || this.T == null) {
            z = false;
        } else {
            float g0 = g0();
            this.t0 = z3;
            if (g0 != g0()) {
                onStateChange = true;
                z = true;
            } else {
                z = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.y0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.u0) : 0;
        if (this.u0 != colorForState4) {
            this.u0 = colorForState4;
            this.x0 = tm.c(this, this.y0, this.z0);
        } else {
            z2 = onStateChange;
        }
        if (m1(this.H)) {
            z2 |= this.H.setState(iArr);
        }
        if (m1(this.T)) {
            z2 |= this.T.setState(iArr);
        }
        if (m1(this.M)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z2 |= this.M.setState(iArr3);
        }
        if (wp0.a && m1(this.N)) {
            z2 |= this.N.setState(iArr2);
        }
        if (z2) {
            invalidateSelf();
        }
        if (z) {
            p1();
        }
        return z2;
    }

    public void q2(int i) {
        p2(this.f0.getResources().getDimension(i));
    }

    public final void r0(Canvas canvas, Rect rect) {
        if (this.H0) {
            return;
        }
        this.g0.setColor(this.o0);
        this.g0.setStyle(Paint.Style.FILL);
        this.g0.setColorFilter(f1());
        this.j0.set(rect);
        canvas.drawRoundRect(this.j0, C0(), C0(), this.g0);
    }

    public void r1(boolean z) {
        if (this.R != z) {
            this.R = z;
            float g0 = g0();
            if (!z && this.t0) {
                this.t0 = false;
            }
            float g02 = g0();
            invalidateSelf();
            if (g0 != g02) {
                p1();
            }
        }
    }

    public void r2(int i) {
        this.G0 = i;
    }

    public final void s0(Canvas canvas, Rect rect) {
        if (I2()) {
            f0(rect, this.j0);
            RectF rectF = this.j0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.H.setBounds(0, 0, (int) this.j0.width(), (int) this.j0.height());
            this.H.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void s1(int i) {
        r1(this.f0.getResources().getBoolean(i));
    }

    public void s2(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            L2();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // androidx.appcompat.view.menu.rb0, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            invalidateSelf();
        }
    }

    @Override // androidx.appcompat.view.menu.rb0, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.w0 != colorFilter) {
            this.w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // androidx.appcompat.view.menu.rb0, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // androidx.appcompat.view.menu.rb0, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.z0 != mode) {
            this.z0 = mode;
            this.x0 = tm.c(this, this.y0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (I2()) {
            visible |= this.H.setVisible(z, z2);
        }
        if (H2()) {
            visible |= this.T.setVisible(z, z2);
        }
        if (J2()) {
            visible |= this.M.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t0(Canvas canvas, Rect rect) {
        if (this.D <= 0.0f || this.H0) {
            return;
        }
        this.g0.setColor(this.q0);
        this.g0.setStyle(Paint.Style.STROKE);
        if (!this.H0) {
            this.g0.setColorFilter(f1());
        }
        RectF rectF = this.j0;
        float f = this.D;
        rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
        float f2 = this.B - (this.D / 2.0f);
        canvas.drawRoundRect(this.j0, f2, f2, this.g0);
    }

    public void t1(Drawable drawable) {
        if (this.T != drawable) {
            float g0 = g0();
            this.T = drawable;
            float g02 = g0();
            K2(this.T);
            e0(this.T);
            invalidateSelf();
            if (g0 != g02) {
                p1();
            }
        }
    }

    public void t2(int i) {
        s2(i3.a(this.f0, i));
    }

    public final void u0(Canvas canvas, Rect rect) {
        if (this.H0) {
            return;
        }
        this.g0.setColor(this.n0);
        this.g0.setStyle(Paint.Style.FILL);
        this.j0.set(rect);
        canvas.drawRoundRect(this.j0, C0(), C0(), this.g0);
    }

    public void u1(int i) {
        t1(i3.b(this.f0, i));
    }

    public void u2(boolean z) {
        this.F0 = z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v0(Canvas canvas, Rect rect) {
        if (J2()) {
            i0(rect, this.j0);
            RectF rectF = this.j0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.M.setBounds(0, 0, (int) this.j0.width(), (int) this.j0.height());
            if (wp0.a) {
                this.N.setBounds(this.M.getBounds());
                this.N.jumpToCurrentState();
                this.N.draw(canvas);
            } else {
                this.M.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    public void v1(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (o0()) {
                om.i(this.T, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void v2(ae0 ae0Var) {
        this.V = ae0Var;
    }

    public final void w0(Canvas canvas, Rect rect) {
        this.g0.setColor(this.r0);
        this.g0.setStyle(Paint.Style.FILL);
        this.j0.set(rect);
        if (!this.H0) {
            canvas.drawRoundRect(this.j0, C0(), C0(), this.g0);
            return;
        }
        h(new RectF(rect), this.l0);
        super.p(canvas, this.g0, this.l0, s());
    }

    public void w1(int i) {
        v1(i3.a(this.f0, i));
    }

    public void w2(int i) {
        v2(ae0.c(this.f0, i));
    }

    public final void x0(Canvas canvas, Rect rect) {
        Paint paint = this.h0;
        if (paint != null) {
            paint.setColor(cd.k(-16777216, 127));
            canvas.drawRect(rect, this.h0);
            if (I2() || H2()) {
                f0(rect, this.j0);
                canvas.drawRect(this.j0, this.h0);
            }
            if (this.F != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.h0);
            }
            if (J2()) {
                i0(rect, this.j0);
                canvas.drawRect(this.j0, this.h0);
            }
            this.h0.setColor(cd.k(-65536, 127));
            h0(rect, this.j0);
            canvas.drawRect(this.j0, this.h0);
            this.h0.setColor(cd.k(-16711936, 127));
            j0(rect, this.j0);
            canvas.drawRect(this.j0, this.h0);
        }
    }

    public void x1(int i) {
        y1(this.f0.getResources().getBoolean(i));
    }

    public void x2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.F, charSequence)) {
            return;
        }
        this.F = charSequence;
        this.m0.k(true);
        invalidateSelf();
        p1();
    }

    public final void y0(Canvas canvas, Rect rect) {
        if (this.F != null) {
            Paint.Align n0 = n0(rect, this.k0);
            l0(rect, this.j0);
            if (this.m0.e() != null) {
                this.m0.f().drawableState = getState();
                this.m0.l(this.f0);
            }
            this.m0.f().setTextAlign(n0);
            int i = 0;
            boolean z = Math.round(this.m0.g(b1().toString())) > Math.round(this.j0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.j0);
            }
            CharSequence charSequence = this.F;
            if (z && this.E0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.m0.f(), this.j0.width(), this.E0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.k0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.m0.f());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    public void y1(boolean z) {
        if (this.S != z) {
            boolean H2 = H2();
            this.S = z;
            boolean H22 = H2();
            if (H2 != H22) {
                if (H22) {
                    e0(this.T);
                } else {
                    K2(this.T);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public void y2(tz0 tz0Var) {
        this.m0.j(tz0Var, this.f0);
    }

    public Drawable z0() {
        return this.T;
    }

    public void z1(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            onStateChange(getState());
        }
    }

    public void z2(int i) {
        y2(new tz0(this.f0, i));
    }
}
