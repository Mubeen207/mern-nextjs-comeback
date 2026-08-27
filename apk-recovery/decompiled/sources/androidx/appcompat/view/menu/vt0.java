package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* loaded from: classes.dex */
public class vt0 {
    public static final gh m = new po0(0.5f);
    public hh a;
    public hh b;
    public hh c;
    public hh d;
    public gh e;
    public gh f;
    public gh g;
    public gh h;
    public kn i;
    public kn j;
    public kn k;
    public kn l;

    /* loaded from: classes.dex */
    public interface c {
        gh a(gh ghVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    public static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new e(i3));
    }

    public static b d(Context context, int i, int i2, gh ghVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(on0.K3);
        try {
            int i3 = obtainStyledAttributes.getInt(on0.L3, 0);
            int i4 = obtainStyledAttributes.getInt(on0.O3, i3);
            int i5 = obtainStyledAttributes.getInt(on0.P3, i3);
            int i6 = obtainStyledAttributes.getInt(on0.N3, i3);
            int i7 = obtainStyledAttributes.getInt(on0.M3, i3);
            gh m2 = m(obtainStyledAttributes, on0.Q3, ghVar);
            gh m3 = m(obtainStyledAttributes, on0.T3, m2);
            gh m4 = m(obtainStyledAttributes, on0.U3, m2);
            gh m5 = m(obtainStyledAttributes, on0.S3, m2);
            return new b().y(i4, m3).C(i5, m4).u(i6, m5).q(i7, m(obtainStyledAttributes, on0.R3, m2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new e(i3));
    }

    public static b g(Context context, AttributeSet attributeSet, int i, int i2, gh ghVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, on0.T2, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(on0.U2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(on0.V2, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, ghVar);
    }

    public static gh m(TypedArray typedArray, int i, gh ghVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return ghVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new e(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new po0(peekValue.getFraction(1.0f, 1.0f)) : ghVar;
    }

    public kn h() {
        return this.k;
    }

    public hh i() {
        return this.d;
    }

    public gh j() {
        return this.h;
    }

    public hh k() {
        return this.c;
    }

    public gh l() {
        return this.g;
    }

    public kn n() {
        return this.l;
    }

    public kn o() {
        return this.j;
    }

    public kn p() {
        return this.i;
    }

    public hh q() {
        return this.a;
    }

    public gh r() {
        return this.e;
    }

    public hh s() {
        return this.b;
    }

    public gh t() {
        return this.f;
    }

    public boolean u(RectF rectF) {
        boolean z = this.l.getClass().equals(kn.class) && this.j.getClass().equals(kn.class) && this.i.getClass().equals(kn.class) && this.k.getClass().equals(kn.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof zp0) && (this.a instanceof zp0) && (this.c instanceof zp0) && (this.d instanceof zp0));
    }

    public b v() {
        return new b(this);
    }

    public vt0 w(float f) {
        return v().o(f).m();
    }

    public vt0 x(gh ghVar) {
        return v().p(ghVar).m();
    }

    public vt0 y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    public vt0(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    /* loaded from: classes.dex */
    public static final class b {
        public hh a;
        public hh b;
        public hh c;
        public hh d;
        public gh e;
        public gh f;
        public gh g;
        public gh h;
        public kn i;
        public kn j;
        public kn k;
        public kn l;

        public b() {
            this.a = sb0.b();
            this.b = sb0.b();
            this.c = sb0.b();
            this.d = sb0.b();
            this.e = new e(0.0f);
            this.f = new e(0.0f);
            this.g = new e(0.0f);
            this.h = new e(0.0f);
            this.i = sb0.c();
            this.j = sb0.c();
            this.k = sb0.c();
            this.l = sb0.c();
        }

        public static float n(hh hhVar) {
            if (hhVar instanceof zp0) {
                return ((zp0) hhVar).a;
            }
            if (hhVar instanceof li) {
                return ((li) hhVar).a;
            }
            return -1.0f;
        }

        public b A(float f) {
            this.e = new e(f);
            return this;
        }

        public b B(gh ghVar) {
            this.e = ghVar;
            return this;
        }

        public b C(int i, gh ghVar) {
            return D(sb0.a(i)).F(ghVar);
        }

        public b D(hh hhVar) {
            this.b = hhVar;
            float n = n(hhVar);
            if (n != -1.0f) {
                E(n);
            }
            return this;
        }

        public b E(float f) {
            this.f = new e(f);
            return this;
        }

        public b F(gh ghVar) {
            this.f = ghVar;
            return this;
        }

        public vt0 m() {
            return new vt0(this);
        }

        public b o(float f) {
            return A(f).E(f).w(f).s(f);
        }

        public b p(gh ghVar) {
            return B(ghVar).F(ghVar).x(ghVar).t(ghVar);
        }

        public b q(int i, gh ghVar) {
            return r(sb0.a(i)).t(ghVar);
        }

        public b r(hh hhVar) {
            this.d = hhVar;
            float n = n(hhVar);
            if (n != -1.0f) {
                s(n);
            }
            return this;
        }

        public b s(float f) {
            this.h = new e(f);
            return this;
        }

        public b t(gh ghVar) {
            this.h = ghVar;
            return this;
        }

        public b u(int i, gh ghVar) {
            return v(sb0.a(i)).x(ghVar);
        }

        public b v(hh hhVar) {
            this.c = hhVar;
            float n = n(hhVar);
            if (n != -1.0f) {
                w(n);
            }
            return this;
        }

        public b w(float f) {
            this.g = new e(f);
            return this;
        }

        public b x(gh ghVar) {
            this.g = ghVar;
            return this;
        }

        public b y(int i, gh ghVar) {
            return z(sb0.a(i)).B(ghVar);
        }

        public b z(hh hhVar) {
            this.a = hhVar;
            float n = n(hhVar);
            if (n != -1.0f) {
                A(n);
            }
            return this;
        }

        public b(vt0 vt0Var) {
            this.a = sb0.b();
            this.b = sb0.b();
            this.c = sb0.b();
            this.d = sb0.b();
            this.e = new e(0.0f);
            this.f = new e(0.0f);
            this.g = new e(0.0f);
            this.h = new e(0.0f);
            this.i = sb0.c();
            this.j = sb0.c();
            this.k = sb0.c();
            this.l = sb0.c();
            this.a = vt0Var.a;
            this.b = vt0Var.b;
            this.c = vt0Var.c;
            this.d = vt0Var.d;
            this.e = vt0Var.e;
            this.f = vt0Var.f;
            this.g = vt0Var.g;
            this.h = vt0Var.h;
            this.i = vt0Var.i;
            this.j = vt0Var.j;
            this.k = vt0Var.k;
            this.l = vt0Var.l;
        }
    }

    public vt0() {
        this.a = sb0.b();
        this.b = sb0.b();
        this.c = sb0.b();
        this.d = sb0.b();
        this.e = new e(0.0f);
        this.f = new e(0.0f);
        this.g = new e(0.0f);
        this.h = new e(0.0f);
        this.i = sb0.c();
        this.j = sb0.c();
        this.k = sb0.c();
        this.l = sb0.c();
    }
}
