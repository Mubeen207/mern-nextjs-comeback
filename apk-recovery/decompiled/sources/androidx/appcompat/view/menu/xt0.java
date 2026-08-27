package androidx.appcompat.view.menu;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class xt0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final List g = new ArrayList();
    public final List h = new ArrayList();
    public boolean i;

    /* loaded from: classes.dex */
    public class a extends g {
        public final /* synthetic */ List c;
        public final /* synthetic */ Matrix d;

        public a(List list, Matrix matrix) {
            this.c = list;
            this.d = matrix;
        }

        @Override // androidx.appcompat.view.menu.xt0.g
        public void a(Matrix matrix, ut0 ut0Var, int i, Canvas canvas) {
            for (g gVar : this.c) {
                gVar.a(this.d, ut0Var, i, canvas);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends g {
        public final d c;

        public b(d dVar) {
            this.c = dVar;
        }

        @Override // androidx.appcompat.view.menu.xt0.g
        public void a(Matrix matrix, ut0 ut0Var, int i, Canvas canvas) {
            ut0Var.a(canvas, matrix, new RectF(this.c.k(), this.c.o(), this.c.l(), this.c.j()), i, this.c.m(), this.c.n());
        }
    }

    /* loaded from: classes.dex */
    public static class c extends g {
        public final e c;
        public final float d;
        public final float e;

        public c(e eVar, float f, float f2) {
            this.c = eVar;
            this.d = f;
            this.e = f2;
        }

        @Override // androidx.appcompat.view.menu.xt0.g
        public void a(Matrix matrix, ut0 ut0Var, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.c.c - this.e, this.c.b - this.d), 0.0f);
            this.a.set(matrix);
            this.a.preTranslate(this.d, this.e);
            this.a.preRotate(c());
            ut0Var.b(canvas, this.a, rectF, i);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.c.c - this.e) / (this.c.b - this.d)));
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {
        public static final RectF h = new RectF();
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;

        public d(float f, float f2, float f3, float f4) {
            q(f);
            u(f2);
            r(f3);
            p(f4);
        }

        @Override // androidx.appcompat.view.menu.xt0.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.e;
        }

        public final float k() {
            return this.b;
        }

        public final float l() {
            return this.d;
        }

        public final float m() {
            return this.f;
        }

        public final float n() {
            return this.g;
        }

        public final float o() {
            return this.c;
        }

        public final void p(float f) {
            this.e = f;
        }

        public final void q(float f) {
            this.b = f;
        }

        public final void r(float f) {
            this.d = f;
        }

        public final void s(float f) {
            this.f = f;
        }

        public final void t(float f) {
            this.g = f;
        }

        public final void u(float f) {
            this.c = f;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends f {
        public float b;
        public float c;

        @Override // androidx.appcompat.view.menu.xt0.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public static final Matrix b = new Matrix();
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, ut0 ut0Var, int i, Canvas canvas);

        public final void b(ut0 ut0Var, int i, Canvas canvas) {
            a(b, ut0Var, i, canvas);
        }
    }

    public xt0() {
        n(0.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        s(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public final void b(float f2) {
        if (g() == f2) {
            return;
        }
        float g2 = ((f2 - g()) + 360.0f) % 360.0f;
        if (g2 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g2);
        this.h.add(new b(dVar));
        p(f2);
    }

    public final void c(g gVar, float f2, float f3) {
        b(f2);
        this.h.add(gVar);
        p(f3);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            ((f) this.g.get(i)).a(matrix, path);
        }
    }

    public boolean e() {
        return this.i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.h), new Matrix(matrix));
    }

    public final float g() {
        return this.e;
    }

    public final float h() {
        return this.f;
    }

    public float i() {
        return this.c;
    }

    public float j() {
        return this.d;
    }

    public float k() {
        return this.a;
    }

    public float l() {
        return this.b;
    }

    public void m(float f2, float f3) {
        e eVar = new e();
        eVar.b = f2;
        eVar.c = f3;
        this.g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f2);
        s(f3);
    }

    public void n(float f2, float f3) {
        o(f2, f3, 270.0f, 0.0f);
    }

    public void o(float f2, float f3, float f4, float f5) {
        t(f2);
        u(f3);
        r(f2);
        s(f3);
        p(f4);
        q((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }

    public final void p(float f2) {
        this.e = f2;
    }

    public final void q(float f2) {
        this.f = f2;
    }

    public final void r(float f2) {
        this.c = f2;
    }

    public final void s(float f2) {
        this.d = f2;
    }

    public final void t(float f2) {
        this.a = f2;
    }

    public final void u(float f2) {
        this.b = f2;
    }
}
