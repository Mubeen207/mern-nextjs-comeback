package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.vt0;
import androidx.appcompat.view.menu.wt0;
import androidx.appcompat.view.menu.xt0;
import java.util.BitSet;
/* loaded from: classes.dex */
public class rb0 extends Drawable implements yt0 {
    public static final Paint x;
    public c a;
    public final xt0.g[] b;
    public final xt0.g[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public vt0 m;
    public final Paint n;
    public final Paint o;
    public final ut0 p;
    public final wt0.b q;
    public final wt0 r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public int u;
    public final RectF v;
    public boolean w;

    /* loaded from: classes.dex */
    public class a implements wt0.b {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.wt0.b
        public void a(xt0 xt0Var, Matrix matrix, int i) {
            rb0.this.d.set(i + 4, xt0Var.e());
            rb0.this.c[i] = xt0Var.f(matrix);
        }

        @Override // androidx.appcompat.view.menu.wt0.b
        public void b(xt0 xt0Var, Matrix matrix, int i) {
            rb0.this.d.set(i, xt0Var.e());
            rb0.this.b[i] = xt0Var.f(matrix);
        }
    }

    /* loaded from: classes.dex */
    public class b implements vt0.c {
        public final /* synthetic */ float a;

        public b(float f) {
            this.a = f;
        }

        @Override // androidx.appcompat.view.menu.vt0.c
        public gh a(gh ghVar) {
            return ghVar instanceof po0 ? ghVar : new x1(this.a, ghVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public rb0() {
        this(new vt0());
    }

    public static int O(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public static rb0 m(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ob0.c(context, cm0.h, rb0.class.getSimpleName()));
        }
        rb0 rb0Var = new rb0();
        rb0Var.J(context);
        rb0Var.T(colorStateList);
        rb0Var.S(f);
        return rb0Var;
    }

    public vt0 A() {
        return this.a.a;
    }

    public final float B() {
        if (I()) {
            return this.o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float C() {
        return this.a.a.r().a(s());
    }

    public float D() {
        return this.a.a.t().a(s());
    }

    public float E() {
        return this.a.p;
    }

    public float F() {
        return u() + E();
    }

    public final boolean G() {
        c cVar = this.a;
        int i = cVar.q;
        return i != 1 && cVar.r > 0 && (i == 2 || Q());
    }

    public final boolean H() {
        Paint.Style style = this.a.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean I() {
        Paint.Style style = this.a.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    public void J(Context context) {
        this.a.b = new nn(context);
        d0();
    }

    public final void K() {
        super.invalidateSelf();
    }

    public boolean L() {
        nn nnVar = this.a.b;
        return nnVar != null && nnVar.d();
    }

    public boolean M() {
        return this.a.a.u(s());
    }

    public final void N(Canvas canvas) {
        if (G()) {
            canvas.save();
            P(canvas);
            if (!this.w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.v.width() - getBounds().width());
            int height = (int) (this.v.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.v.width()) + (this.a.r * 2) + width, ((int) this.v.height()) + (this.a.r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.a.r) - width;
            float f2 = (getBounds().top - this.a.r) - height;
            canvas2.translate(-f, -f2);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    public final void P(Canvas canvas) {
        canvas.translate(y(), z());
    }

    public boolean Q() {
        return (M() || this.g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void R(gh ghVar) {
        setShapeAppearanceModel(this.a.a.x(ghVar));
    }

    public void S(float f) {
        c cVar = this.a;
        if (cVar.o != f) {
            cVar.o = f;
            d0();
        }
    }

    public void T(ColorStateList colorStateList) {
        c cVar = this.a;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void U(float f) {
        c cVar = this.a;
        if (cVar.k != f) {
            cVar.k = f;
            this.e = true;
            invalidateSelf();
        }
    }

    public void V(int i, int i2, int i3, int i4) {
        c cVar = this.a;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.a.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void W(float f) {
        c cVar = this.a;
        if (cVar.n != f) {
            cVar.n = f;
            d0();
        }
    }

    public void X(float f, int i) {
        a0(f);
        Z(ColorStateList.valueOf(i));
    }

    public void Y(float f, ColorStateList colorStateList) {
        a0(f);
        Z(colorStateList);
    }

    public void Z(ColorStateList colorStateList) {
        c cVar = this.a;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public void a0(float f) {
        this.a.l = f;
        invalidateSelf();
    }

    public final boolean b0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.a.d == null || color2 == (colorForState2 = this.a.d.getColorForState(iArr, (color2 = this.n.getColor())))) {
            z = false;
        } else {
            this.n.setColor(colorForState2);
            z = true;
        }
        if (this.a.e == null || color == (colorForState = this.a.e.getColorForState(iArr, (color = this.o.getColor())))) {
            return z;
        }
        this.o.setColor(colorForState);
        return true;
    }

    public final boolean c0() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        c cVar = this.a;
        this.s = k(cVar.g, cVar.h, this.n, true);
        c cVar2 = this.a;
        this.t = k(cVar2.f, cVar2.h, this.o, false);
        c cVar3 = this.a;
        if (cVar3.u) {
            this.p.d(cVar3.g.getColorForState(getState(), 0));
        }
        return (bg0.a(porterDuffColorFilter, this.s) && bg0.a(porterDuffColorFilter2, this.t)) ? false : true;
    }

    public final void d0() {
        float F = F();
        this.a.r = (int) Math.ceil(0.75f * F);
        this.a.s = (int) Math.ceil(F * 0.25f);
        c0();
        K();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.n.setColorFilter(this.s);
        int alpha = this.n.getAlpha();
        this.n.setAlpha(O(alpha, this.a.m));
        this.o.setColorFilter(this.t);
        this.o.setStrokeWidth(this.a.l);
        int alpha2 = this.o.getAlpha();
        this.o.setAlpha(O(alpha2, this.a.m));
        if (this.e) {
            i();
            g(s(), this.g);
            this.e = false;
        }
        N(canvas);
        if (H()) {
            o(canvas);
        }
        if (I()) {
            r(canvas);
        }
        this.n.setAlpha(alpha);
        this.o.setAlpha(alpha2);
    }

    public final PorterDuffColorFilter f(Paint paint, boolean z) {
        if (z) {
            int color = paint.getColor();
            int l = l(color);
            this.u = l;
            if (l != color) {
                return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.a.j != 1.0f) {
            this.f.reset();
            Matrix matrix = this.f;
            float f = this.a.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f);
        }
        path.computeBounds(this.v, true);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.a.q == 2) {
            return;
        }
        if (M()) {
            outline.setRoundRect(getBounds(), C() * this.a.k);
            return;
        }
        g(s(), this.g);
        tm.b(outline, this.g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.a.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.k.set(getBounds());
        g(s(), this.g);
        this.l.setPath(this.g, this.k);
        this.k.op(this.l, Region.Op.DIFFERENCE);
        return this.k;
    }

    public final void h(RectF rectF, Path path) {
        wt0 wt0Var = this.r;
        c cVar = this.a;
        wt0Var.e(cVar.a, cVar.k, rectF, this.q, path);
    }

    public final void i() {
        vt0 y = A().y(new b(-B()));
        this.m = y;
        this.r.d(y, this.a.k, t(), this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.a.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.a.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.a.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.a.d) != null && colorStateList4.isStateful())));
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        this.u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? f(paint, z) : j(colorStateList, mode, z);
    }

    public int l(int i) {
        float F = F() + x();
        nn nnVar = this.a.b;
        return nnVar != null ? nnVar.c(i, F) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new c(this.a);
        return this;
    }

    public final void n(Canvas canvas) {
        this.d.cardinality();
        if (this.a.s != 0) {
            canvas.drawPath(this.g, this.p.c());
        }
        for (int i = 0; i < 4; i++) {
            this.b[i].b(this.p, this.a.r, canvas);
            this.c[i].b(this.p, this.a.r, canvas);
        }
        if (this.w) {
            int y = y();
            int z = z();
            canvas.translate(-y, -z);
            canvas.drawPath(this.g, x);
            canvas.translate(y, z);
        }
    }

    public final void o(Canvas canvas) {
        q(canvas, this.n, this.g, this.a.a, s());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = b0(iArr) || c0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.a.a, rectF);
    }

    public final void q(Canvas canvas, Paint paint, Path path, vt0 vt0Var, RectF rectF) {
        if (!vt0Var.u(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float a2 = vt0Var.t().a(rectF) * this.a.k;
        canvas.drawRoundRect(rectF, a2, a2, paint);
    }

    public void r(Canvas canvas) {
        q(canvas, this.o, this.h, this.m, t());
    }

    public RectF s() {
        this.i.set(getBounds());
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.a;
        if (cVar.m != i) {
            cVar.m = i;
            K();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        K();
    }

    @Override // androidx.appcompat.view.menu.yt0
    public void setShapeAppearanceModel(vt0 vt0Var) {
        this.a.a = vt0Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        c0();
        K();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.a;
        if (cVar.h != mode) {
            cVar.h = mode;
            c0();
            K();
        }
    }

    public final RectF t() {
        this.j.set(s());
        float B = B();
        this.j.inset(B, B);
        return this.j;
    }

    public float u() {
        return this.a.o;
    }

    public ColorStateList v() {
        return this.a.d;
    }

    public float w() {
        return this.a.k;
    }

    public float x() {
        return this.a.n;
    }

    public int y() {
        c cVar = this.a;
        return (int) (cVar.s * Math.sin(Math.toRadians(cVar.t)));
    }

    public int z() {
        c cVar = this.a;
        return (int) (cVar.s * Math.cos(Math.toRadians(cVar.t)));
    }

    public rb0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(vt0.e(context, attributeSet, i, i2).m());
    }

    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {
        public vt0 a;
        public nn b;
        public ColorFilter c;
        public ColorStateList d;
        public ColorStateList e;
        public ColorStateList f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(vt0 vt0Var, nn nnVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = vt0Var;
            this.b = nnVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            rb0 rb0Var = new rb0(this);
            rb0Var.e = true;
            return rb0Var;
        }

        public c(c cVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = cVar.a;
            this.b = cVar.b;
            this.l = cVar.l;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.h = cVar.h;
            this.g = cVar.g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f = cVar.f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }
    }

    public rb0(vt0 vt0Var) {
        this(new c(vt0Var, null));
    }

    public rb0(c cVar) {
        wt0 wt0Var;
        this.b = new xt0.g[4];
        this.c = new xt0.g[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new ut0();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            wt0Var = wt0.k();
        } else {
            wt0Var = new wt0();
        }
        this.r = wt0Var;
        this.v = new RectF();
        this.w = true;
        this.a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        c0();
        b0(getState());
        this.q = new a();
    }
}
