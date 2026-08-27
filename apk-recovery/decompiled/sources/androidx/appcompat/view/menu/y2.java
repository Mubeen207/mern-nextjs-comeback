package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.view.menu.hp0;
/* loaded from: classes.dex */
public final class y2 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static y2 c;
    public hp0 a;

    /* loaded from: classes.dex */
    public class a implements hp0.c {
        public final int[] a = {mm0.R, mm0.P, mm0.a};
        public final int[] b = {mm0.o, mm0.B, mm0.t, mm0.p, mm0.q, mm0.s, mm0.r};
        public final int[] c = {mm0.O, mm0.Q, mm0.k, mm0.K, mm0.L, mm0.M, mm0.N};
        public final int[] d = {mm0.w, mm0.i, mm0.v};
        public final int[] e = {mm0.J, mm0.S};
        public final int[] f = {mm0.c, mm0.g, mm0.d, mm0.h};

        @Override // androidx.appcompat.view.menu.hp0.c
        public Drawable a(hp0 hp0Var, Context context, int i) {
            if (i == mm0.j) {
                return new LayerDrawable(new Drawable[]{hp0Var.i(context, mm0.i), hp0Var.i(context, mm0.k)});
            }
            if (i == mm0.y) {
                return l(hp0Var, context, im0.c);
            }
            if (i == mm0.x) {
                return l(hp0Var, context, im0.d);
            }
            if (i == mm0.z) {
                return l(hp0Var, context, im0.e);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[RETURN] */
        @Override // androidx.appcompat.view.menu.hp0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.view.menu.y2.a()
                int[] r1 = r7.a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = androidx.appcompat.view.menu.dm0.l
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = androidx.appcompat.view.menu.dm0.j
                goto L11
            L20:
                int[] r1 = r7.d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = androidx.appcompat.view.menu.mm0.u
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = androidx.appcompat.view.menu.mm0.l
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L66
                android.graphics.drawable.Drawable r10 = r10.mutate()
                int r8 = androidx.appcompat.view.menu.j01.c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.view.menu.y2.d(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L65
                r10.setAlpha(r0)
            L65:
                return r2
            L66:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.y2.a.b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.view.menu.hp0.c
        public PorterDuff.Mode c(int i) {
            if (i == mm0.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.view.menu.hp0.c
        public ColorStateList d(Context context, int i) {
            if (i == mm0.m) {
                return i3.a(context, fm0.c);
            }
            if (i == mm0.I) {
                return i3.a(context, fm0.f);
            }
            if (i == mm0.H) {
                return k(context);
            }
            if (i == mm0.f) {
                return j(context);
            }
            if (i == mm0.b) {
                return g(context);
            }
            if (i == mm0.e) {
                return i(context);
            }
            if (i == mm0.D || i == mm0.E) {
                return i3.a(context, fm0.e);
            }
            if (f(this.b, i)) {
                return j01.e(context, dm0.l);
            }
            if (f(this.e, i)) {
                return i3.a(context, fm0.b);
            }
            if (f(this.f, i)) {
                return i3.a(context, fm0.a);
            }
            if (i == mm0.A) {
                return i3.a(context, fm0.d);
            }
            return null;
        }

        @Override // androidx.appcompat.view.menu.hp0.c
        public boolean e(Context context, int i, Drawable drawable) {
            if (i == mm0.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(16908288), j01.c(context, dm0.l), y2.b);
                m(layerDrawable.findDrawableByLayerId(16908303), j01.c(context, dm0.l), y2.b);
                m(layerDrawable.findDrawableByLayerId(16908301), j01.c(context, dm0.j), y2.b);
                return true;
            } else if (i == mm0.y || i == mm0.x || i == mm0.z) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), j01.b(context, dm0.l), y2.b);
                m(layerDrawable2.findDrawableByLayerId(16908303), j01.c(context, dm0.j), y2.b);
                m(layerDrawable2.findDrawableByLayerId(16908301), j01.c(context, dm0.j), y2.b);
                return true;
            } else {
                return false;
            }
        }

        public final boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i) {
            int c = j01.c(context, dm0.k);
            return new ColorStateList(new int[][]{j01.b, j01.e, j01.c, j01.i}, new int[]{j01.b(context, dm0.i), cd.g(c, i), cd.g(c, i), i});
        }

        public final ColorStateList i(Context context) {
            return h(context, j01.c(context, dm0.h));
        }

        public final ColorStateList j(Context context) {
            return h(context, j01.c(context, dm0.i));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList e = j01.e(context, dm0.m);
            if (e == null || !e.isStateful()) {
                iArr[0] = j01.b;
                iArr2[0] = j01.b(context, dm0.m);
                iArr[1] = j01.f;
                iArr2[1] = j01.c(context, dm0.j);
                iArr[2] = j01.i;
                iArr2[2] = j01.c(context, dm0.m);
            } else {
                int[] iArr3 = j01.b;
                iArr[0] = iArr3;
                iArr2[0] = e.getColorForState(iArr3, 0);
                iArr[1] = j01.f;
                iArr2[1] = j01.c(context, dm0.j);
                iArr[2] = j01.i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(hp0 hp0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable i2 = hp0Var.i(context, mm0.F);
            Drawable i3 = hp0Var.i(context, mm0.G);
            if ((i2 instanceof BitmapDrawable) && i2.getIntrinsicWidth() == dimensionPixelSize && i2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) i2;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i2.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((i3 instanceof BitmapDrawable) && i3.getIntrinsicWidth() == dimensionPixelSize && i3.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) i3;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                i3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i3.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = y2.b;
            }
            mutate.setColorFilter(y2.d(i, mode));
        }
    }

    public static synchronized y2 b() {
        y2 y2Var;
        synchronized (y2.class) {
            try {
                if (c == null) {
                    f();
                }
                y2Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return y2Var;
    }

    public static synchronized PorterDuffColorFilter d(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter k;
        synchronized (y2.class) {
            k = hp0.k(i, mode);
        }
        return k;
    }

    public static synchronized void f() {
        synchronized (y2.class) {
            if (c == null) {
                y2 y2Var = new y2();
                c = y2Var;
                y2Var.a = hp0.g();
                c.a.s(new a());
            }
        }
    }

    public static void g(Drawable drawable, z01 z01Var, int[] iArr) {
        hp0.u(drawable, z01Var, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.a.i(context, i);
    }

    public synchronized ColorStateList e(Context context, int i) {
        return this.a.l(context, i);
    }
}
