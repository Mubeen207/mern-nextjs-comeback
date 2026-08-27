package androidx.appcompat.view.menu;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.view.menu.v9;
/* loaded from: classes.dex */
public final class lc {
    public static final boolean t0 = false;
    public static final Paint u0 = null;
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public v9 D;
    public v9 E;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public boolean K;
    public Bitmap L;
    public Paint M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public int[] T;
    public boolean U;
    public final TextPaint V;
    public final TextPaint W;
    public TimeInterpolator X;
    public TimeInterpolator Y;
    public float Z;
    public final View a;
    public float a0;
    public float b;
    public float b0;
    public boolean c;
    public ColorStateList c0;
    public float d;
    public float d0;
    public float e;
    public float e0;
    public int f;
    public float f0;
    public final Rect g;
    public ColorStateList g0;
    public final Rect h;
    public float h0;
    public final RectF i;
    public float i0;
    public float j0;
    public StaticLayout k0;
    public float l0;
    public float m0;
    public ColorStateList n;
    public float n0;
    public ColorStateList o;
    public CharSequence o0;
    public int p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public Typeface z;
    public int j = 16;
    public int k = 16;
    public float l = 15.0f;
    public float m = 15.0f;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public boolean J = true;
    public int p0 = 1;
    public float q0 = 0.0f;
    public float r0 = 1.0f;
    public int s0 = cx0.n;

    /* loaded from: classes.dex */
    public class a implements v9.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.v9.a
        public void a(Typeface typeface) {
            lc.this.T(typeface);
        }
    }

    public lc(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.h = new Rect();
        this.g = new Rect();
        this.i = new RectF();
        this.e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    public static boolean C(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    public static float G(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return j2.a(f, f2, f3);
    }

    public static boolean L(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    public static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public final void A(TextPaint textPaint) {
        textPaint.setTextSize(this.l);
        textPaint.setTypeface(this.z);
        textPaint.setLetterSpacing(this.i0);
    }

    public final void B(float f) {
        if (this.c) {
            this.i.set(f < this.e ? this.g : this.h);
            return;
        }
        this.i.left = G(this.g.left, this.h.left, f, this.X);
        this.i.top = G(this.q, this.r, f, this.X);
        this.i.right = G(this.g.right, this.h.right, f, this.X);
        this.i.bottom = G(this.g.bottom, this.h.bottom, f, this.X);
    }

    public final boolean D() {
        return p51.x(this.a) == 1;
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.o;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.n) != null && colorStateList.isStateful());
    }

    public final boolean F(CharSequence charSequence, boolean z) {
        return (z ? xz0.d : xz0.c).a(charSequence, 0, charSequence.length());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.y;
            if (typeface != null) {
                this.x = f31.b(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = f31.b(configuration, typeface2);
            }
            Typeface typeface3 = this.x;
            if (typeface3 == null) {
                typeface3 = this.y;
            }
            this.w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.z = typeface4;
            K(true);
        }
    }

    public final float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void J() {
        K(false);
    }

    public void K(boolean z) {
        if ((this.a.getHeight() <= 0 || this.a.getWidth() <= 0) && !z) {
            return;
        }
        b(z);
        c();
    }

    public void M(ColorStateList colorStateList) {
        if (this.o == colorStateList && this.n == colorStateList) {
            return;
        }
        this.o = colorStateList;
        this.n = colorStateList;
        J();
    }

    public void N(int i, int i2, int i3, int i4) {
        if (L(this.h, i, i2, i3, i4)) {
            return;
        }
        this.h.set(i, i2, i3, i4);
        this.U = true;
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i) {
        tz0 tz0Var = new tz0(this.a.getContext(), i);
        if (tz0Var.i() != null) {
            this.o = tz0Var.i();
        }
        if (tz0Var.j() != 0.0f) {
            this.m = tz0Var.j();
        }
        ColorStateList colorStateList = tz0Var.c;
        if (colorStateList != null) {
            this.c0 = colorStateList;
        }
        this.a0 = tz0Var.h;
        this.b0 = tz0Var.i;
        this.Z = tz0Var.j;
        this.h0 = tz0Var.l;
        v9 v9Var = this.E;
        if (v9Var != null) {
            v9Var.c();
        }
        this.E = new v9(new a(), tz0Var.e());
        tz0Var.h(this.a.getContext(), this.E);
        J();
    }

    public final void Q(float f) {
        this.m0 = f;
        p51.b0(this.a);
    }

    public void R(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            J();
        }
    }

    public void S(int i) {
        if (this.k != i) {
            this.k = i;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public final boolean U(Typeface typeface) {
        v9 v9Var = this.E;
        if (v9Var != null) {
            v9Var.c();
        }
        if (this.y != typeface) {
            this.y = typeface;
            Typeface b = f31.b(this.a.getContext().getResources().getConfiguration(), typeface);
            this.x = b;
            if (b == null) {
                b = this.y;
            }
            this.w = b;
            return true;
        }
        return false;
    }

    public void V(int i, int i2, int i3, int i4) {
        if (L(this.g, i, i2, i3, i4)) {
            return;
        }
        this.g.set(i, i2, i3, i4);
        this.U = true;
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f) {
        if (this.i0 != f) {
            this.i0 = f;
            J();
        }
    }

    public final void Y(float f) {
        this.n0 = f;
        p51.b0(this.a);
    }

    public void Z(int i) {
        if (this.j != i) {
            this.j = i;
            J();
        }
    }

    public void a0(float f) {
        if (this.l != f) {
            this.l = f;
            J();
        }
    }

    public final void b(boolean z) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        i(1.0f, z);
        CharSequence charSequence = this.H;
        if (charSequence != null && (staticLayout2 = this.k0) != null) {
            this.o0 = TextUtils.ellipsize(charSequence, this.V, staticLayout2.getWidth(), this.F);
        }
        CharSequence charSequence2 = this.o0;
        float f = 0.0f;
        if (charSequence2 != null) {
            this.l0 = I(this.V, charSequence2);
        } else {
            this.l0 = 0.0f;
        }
        int b = my.b(this.k, this.I ? 1 : 0);
        int i = b & 112;
        if (i == 48) {
            this.r = this.h.top;
        } else if (i != 80) {
            this.r = this.h.centerY() - ((this.V.descent() - this.V.ascent()) / 2.0f);
        } else {
            this.r = this.h.bottom + this.V.ascent();
        }
        int i2 = b & 8388615;
        if (i2 == 1) {
            this.t = this.h.centerX() - (this.l0 / 2.0f);
        } else if (i2 != 5) {
            this.t = this.h.left;
        } else {
            this.t = this.h.right - this.l0;
        }
        i(0.0f, z);
        float height = this.k0 != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.k0;
        if (staticLayout3 == null || this.p0 <= 1) {
            CharSequence charSequence3 = this.H;
            if (charSequence3 != null) {
                f = I(this.V, charSequence3);
            }
        } else {
            f = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.k0;
        this.p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int b2 = my.b(this.j, this.I ? 1 : 0);
        int i3 = b2 & 112;
        if (i3 == 48) {
            this.q = this.g.top;
        } else if (i3 != 80) {
            this.q = this.g.centerY() - (height / 2.0f);
        } else {
            this.q = (this.g.bottom - height) + this.V.descent();
        }
        int i4 = b2 & 8388615;
        if (i4 == 1) {
            this.s = this.g.centerX() - (f / 2.0f);
        } else if (i4 != 5) {
            this.s = this.g.left;
        } else {
            this.s = this.g.right - f;
        }
        j();
        d0(this.b);
    }

    public final boolean b0(Typeface typeface) {
        v9 v9Var = this.D;
        if (v9Var != null) {
            v9Var.c();
        }
        if (this.B != typeface) {
            this.B = typeface;
            Typeface b = f31.b(this.a.getContext().getResources().getConfiguration(), typeface);
            this.A = b;
            if (b == null) {
                b = this.B;
            }
            this.z = b;
            return true;
        }
        return false;
    }

    public final void c() {
        g(this.b);
    }

    public void c0(float f) {
        float a2 = xb0.a(f, 0.0f, 1.0f);
        if (a2 != this.b) {
            this.b = a2;
            c();
        }
    }

    public final float d(float f) {
        float f2 = this.e;
        return f <= f2 ? j2.b(1.0f, 0.0f, this.d, f2, f) : j2.b(0.0f, 1.0f, f2, 1.0f, f);
    }

    public final void d0(float f) {
        h(f);
        boolean z = t0 && this.N != 1.0f;
        this.K = z;
        if (z) {
            n();
        }
        p51.b0(this.a);
    }

    public final float e() {
        float f = this.d;
        return f + ((1.0f - f) * 0.5f);
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        J();
    }

    public final boolean f(CharSequence charSequence) {
        boolean D = D();
        return this.J ? F(charSequence, D) : D;
    }

    public final boolean f0(int[] iArr) {
        this.T = iArr;
        if (E()) {
            J();
            return true;
        }
        return false;
    }

    public final void g(float f) {
        float f2;
        B(f);
        if (!this.c) {
            this.u = G(this.s, this.t, f, this.X);
            this.v = G(this.q, this.r, f, this.X);
            d0(f);
            f2 = f;
        } else if (f < this.e) {
            this.u = this.s;
            this.v = this.q;
            d0(0.0f);
            f2 = 0.0f;
        } else {
            this.u = this.t;
            this.v = this.r - Math.max(0, this.f);
            d0(1.0f);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = j2.b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        Y(G(1.0f, 0.0f, f, timeInterpolator));
        if (this.o != this.n) {
            this.V.setColor(a(v(), t(), f2));
        } else {
            this.V.setColor(t());
        }
        float f3 = this.h0;
        float f4 = this.i0;
        if (f3 != f4) {
            this.V.setLetterSpacing(G(f4, f3, f, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f3);
        }
        this.P = G(this.d0, this.Z, f, null);
        this.Q = G(this.e0, this.a0, f, null);
        this.R = G(this.f0, this.b0, f, null);
        int a2 = a(u(this.g0), u(this.c0), f);
        this.S = a2;
        this.V.setShadowLayer(this.P, this.Q, this.R, a2);
        if (this.c) {
            this.V.setAlpha((int) (d(f) * this.V.getAlpha()));
        }
        p51.b0(this.a);
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            J();
        }
    }

    public final void h(float f) {
        i(f, false);
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        J();
    }

    public final void i(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        if (this.G == null) {
            return;
        }
        float width = this.h.width();
        float width2 = this.g.width();
        if (C(f, 1.0f)) {
            f2 = this.m;
            f3 = this.h0;
            this.N = 1.0f;
            typeface = this.w;
        } else {
            float f4 = this.l;
            float f5 = this.i0;
            Typeface typeface2 = this.z;
            if (C(f, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = G(this.l, this.m, f, this.Y) / this.l;
            }
            float f6 = this.m / this.l;
            width = (z || this.c || width2 * f6 <= width) ? width2 : Math.min(width / f6, width2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        if (width > 0.0f) {
            boolean z2 = this.O != f2;
            boolean z3 = this.j0 != f3;
            boolean z4 = this.C != typeface;
            StaticLayout staticLayout = this.k0;
            boolean z5 = z2 || z3 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || this.U;
            this.O = f2;
            this.j0 = f3;
            this.C = typeface;
            this.U = false;
            this.V.setLinearText(this.N != 1.0f);
            r5 = z5;
        }
        if (this.H == null || r5) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.C);
            this.V.setLetterSpacing(this.j0);
            this.I = f(this.G);
            StaticLayout k = k(j0() ? this.p0 : 1, width, this.I);
            this.k0 = k;
            this.H = k.getText();
        }
    }

    public void i0(Typeface typeface) {
        boolean U = U(typeface);
        boolean b0 = b0(typeface);
        if (U || b0) {
            J();
        }
    }

    public final void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    public final boolean j0() {
        return this.p0 > 1 && (!this.I || this.c) && !this.K;
    }

    public final StaticLayout k(int i, float f, boolean z) {
        return (StaticLayout) tj0.g(cx0.b(this.G, this.V, (int) f).d(this.F).g(z).c(i == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i).h(this.q0, this.r0).e(this.s0).j(null).a());
    }

    public void l(Canvas canvas) {
        int save = canvas.save();
        if (this.H == null || this.i.width() <= 0.0f || this.i.height() <= 0.0f) {
            return;
        }
        this.V.setTextSize(this.O);
        float f = this.u;
        float f2 = this.v;
        boolean z = this.K && this.L != null;
        float f3 = this.N;
        if (f3 != 1.0f && !this.c) {
            canvas.scale(f3, f3, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.L, f, f2, this.M);
            canvas.restoreToCount(save);
            return;
        }
        if (!j0() || (this.c && this.b <= this.e)) {
            canvas.translate(f, f2);
            this.k0.draw(canvas);
        } else {
            m(canvas, this.u - this.k0.getLineStart(0), f2);
        }
        canvas.restoreToCount(save);
    }

    public final void m(Canvas canvas, float f, float f2) {
        int alpha = this.V.getAlpha();
        canvas.translate(f, f2);
        if (!this.c) {
            this.V.setAlpha((int) (this.n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, ob0.a(this.S, textPaint.getAlpha()));
            }
            this.k0.draw(canvas);
        }
        if (!this.c) {
            this.V.setAlpha((int) (this.m0 * alpha));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, ob0.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.k0.getLineBaseline(0);
        CharSequence charSequence = this.o0;
        float f3 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f3, this.V);
        if (i >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (this.c) {
            return;
        }
        String trim = this.o0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.k0.getLineEnd(0), str.length()), 0.0f, f3, (Paint) this.V);
    }

    public final void n() {
        if (this.L != null || this.g.isEmpty() || TextUtils.isEmpty(this.H)) {
            return;
        }
        g(0.0f);
        int width = this.k0.getWidth();
        int height = this.k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.k0.draw(new Canvas(this.L));
        if (this.M == null) {
            this.M = new Paint(3);
        }
    }

    public void o(RectF rectF, int i, int i2) {
        this.I = f(this.G);
        rectF.left = Math.max(r(i, i2), this.h.left);
        rectF.top = this.h.top;
        rectF.right = Math.min(s(rectF, i, i2), this.h.right);
        rectF.bottom = this.h.top + q();
    }

    public ColorStateList p() {
        return this.o;
    }

    public float q() {
        z(this.W);
        return -this.W.ascent();
    }

    public final float r(int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) - (this.l0 / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.I ? this.h.left : this.h.right - this.l0 : this.I ? this.h.right - this.l0 : this.h.left;
    }

    public final float s(RectF rectF, int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) + (this.l0 / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.I ? rectF.left + this.l0 : this.h.right : this.I ? this.h.right : rectF.left + this.l0;
    }

    public int t() {
        return u(this.o);
    }

    public final int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final int v() {
        return u(this.n);
    }

    public float w() {
        A(this.W);
        return -this.W.ascent();
    }

    public float x() {
        return this.b;
    }

    public final Layout.Alignment y() {
        int b = my.b(this.j, this.I ? 1 : 0) & 7;
        return b != 1 ? b != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    public final void z(TextPaint textPaint) {
        textPaint.setTextSize(this.m);
        textPaint.setTypeface(this.w);
        textPaint.setLetterSpacing(this.h0);
    }
}
