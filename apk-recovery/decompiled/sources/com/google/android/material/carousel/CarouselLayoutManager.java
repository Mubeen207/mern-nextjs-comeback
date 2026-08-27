package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.cd;
import androidx.appcompat.view.menu.fa;
import androidx.appcompat.view.menu.fe0;
import androidx.appcompat.view.menu.hm0;
import androidx.appcompat.view.menu.ia;
import androidx.appcompat.view.menu.j2;
import androidx.appcompat.view.menu.ja;
import androidx.appcompat.view.menu.on0;
import androidx.appcompat.view.menu.tj0;
import androidx.appcompat.view.menu.xb0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.o implements fa, RecyclerView.y.b {
    public int A;
    public Map B;
    public ia C;
    public final View.OnLayoutChangeListener D;
    public int E;
    public int F;
    public int G;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public final c w;
    public ja x;
    public com.google.android.material.carousel.c y;
    public com.google.android.material.carousel.b z;

    /* loaded from: classes.dex */
    public class a extends g {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.y
        public PointF a(int i) {
            return CarouselLayoutManager.this.d(i);
        }

        @Override // androidx.recyclerview.widget.g
        public int t(View view, int i) {
            if (CarouselLayoutManager.this.y == null || !CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.i2(carouselLayoutManager.n0(view));
        }

        @Override // androidx.recyclerview.widget.g
        public int u(View view, int i) {
            if (CarouselLayoutManager.this.y == null || CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.i2(carouselLayoutManager.n0(view));
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final View a;
        public final float b;
        public final float c;
        public final d d;

        public b(View view, float f, float f2, d dVar) {
            this.a = view;
            this.b = f;
            this.c = f2;
            this.d = dVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.n {
        public final Paint a;
        public List b;

        public c() {
            Paint paint = new Paint();
            this.a = paint;
            this.b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            super.i(canvas, recyclerView, zVar);
            this.a.setStrokeWidth(recyclerView.getResources().getDimension(hm0.k));
            for (b.c cVar : this.b) {
                this.a.setColor(cd.c(-65281, -16776961, cVar.c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    canvas.drawLine(cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).v2(), this.a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).x2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.b, this.a);
                }
            }
        }

        public void j(List list) {
            this.b = Collections.unmodifiableList(list);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final b.c a;
        public final b.c b;

        public d(b.c cVar, b.c cVar2) {
            tj0.a(cVar.a <= cVar2.a);
            this.a = cVar;
            this.b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new fe0());
    }

    public static d D2(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            b.c cVar = (b.c) list.get(i5);
            float f6 = z ? cVar.b : cVar.a;
            float abs = Math.abs(f6 - f);
            if (f6 <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (f6 > f && abs <= f4) {
                i3 = i5;
                f4 = abs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new d((b.c) list.get(i), (b.c) list.get(i3));
    }

    private int O2(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (O() == 0 || i == 0) {
            return 0;
        }
        if (this.y == null) {
            L2(uVar);
        }
        int j2 = j2(i, this.s, this.t, this.u);
        this.s += j2;
        V2(this.y);
        float f = this.z.f() / 2.0f;
        float g2 = g2(n0(N(0)));
        Rect rect = new Rect();
        float f2 = E2() ? this.z.h().b : this.z.a().b;
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < O(); i2++) {
            View N = N(i2);
            float abs = Math.abs(f2 - K2(N, g2, f, rect));
            if (N != null && abs < f3) {
                this.F = n0(N);
                f3 = abs;
            }
            g2 = a2(g2, this.z.f());
        }
        m2(uVar, zVar);
        return j2;
    }

    public static int j2(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    private int l2(int i) {
        int u2 = u2();
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (u2 == 0) {
                        return E2() ? 1 : -1;
                    }
                    return Integer.MIN_VALUE;
                } else if (i == 33) {
                    return u2 == 1 ? -1 : Integer.MIN_VALUE;
                } else if (i == 66) {
                    if (u2 == 0) {
                        return E2() ? -1 : 1;
                    }
                    return Integer.MIN_VALUE;
                } else if (i == 130) {
                    return u2 == 1 ? 1 : Integer.MIN_VALUE;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown focus request:");
                    sb.append(i);
                    return Integer.MIN_VALUE;
                }
            }
            return 1;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return this.u - this.t;
    }

    public final int A2() {
        return this.C.j();
    }

    public final int B2(int i, com.google.android.material.carousel.b bVar) {
        return E2() ? (int) (((p2() - bVar.h().a) - (i * bVar.f())) - (bVar.f() / 2.0f)) : (int) (((i * bVar.f()) - bVar.a().a) + (bVar.f() / 2.0f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (p()) {
            return O2(i, uVar, zVar);
        }
        return 0;
    }

    public final int C2(int i, com.google.android.material.carousel.b bVar) {
        int i2 = Integer.MAX_VALUE;
        for (b.c cVar : bVar.e()) {
            float f = (i * bVar.f()) + (bVar.f() / 2.0f);
            int p2 = (E2() ? (int) ((p2() - cVar.a) - f) : (int) (f - cVar.a)) - this.s;
            if (Math.abs(i2) > Math.abs(p2)) {
                i2 = p2;
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D1(int i) {
        this.F = i;
        if (this.y == null) {
            return;
        }
        this.s = B2(i, r2(i));
        this.A = xb0.b(i, 0, Math.max(0, e() - 1));
        V2(this.y);
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int E1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (q()) {
            return O2(i, uVar, zVar);
        }
        return 0;
    }

    public boolean E2() {
        return f() && d0() == 1;
    }

    public final boolean F2(float f, d dVar) {
        float b2 = b2(f, s2(f, dVar) / 2.0f);
        if (E2()) {
            if (b2 >= 0.0f) {
                return false;
            }
        } else if (b2 <= p2()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void G0(View view, int i, int i2) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final boolean G2(float f, d dVar) {
        float a2 = a2(f, s2(f, dVar) / 2.0f);
        if (E2()) {
            if (a2 <= p2()) {
                return false;
            }
        } else if (a2 >= 0.0f) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void H2(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        view.post(new Runnable() { // from class: androidx.appcompat.view.menu.ha
            @Override // java.lang.Runnable
            public final void run() {
                CarouselLayoutManager.this.M2();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return new RecyclerView.p(-2, -2);
    }

    public final void I2() {
        if (this.v && Log.isLoggable("CarouselLayoutManager", 3)) {
            for (int i = 0; i < O(); i++) {
                View N = N(i);
                float q2 = q2(N);
                StringBuilder sb = new StringBuilder();
                sb.append("item position ");
                sb.append(n0(N));
                sb.append(", center:");
                sb.append(q2);
                sb.append(", child index:");
                sb.append(i);
            }
        }
    }

    public final b J2(RecyclerView.u uVar, float f, int i) {
        View o = uVar.o(i);
        G0(o, 0, 0);
        float a2 = a2(f, this.z.f() / 2.0f);
        d D2 = D2(this.z.g(), a2, false);
        return new b(o, a2, f2(o, a2, D2), D2);
    }

    public final float K2(View view, float f, float f2, Rect rect) {
        float a2 = a2(f, f2);
        d D2 = D2(this.z.g(), a2, false);
        float f22 = f2(view, a2, D2);
        super.U(view, rect);
        U2(view, a2, D2);
        this.C.l(view, rect, f2, f22);
        return f22;
    }

    public final void L2(RecyclerView.u uVar) {
        View o = uVar.o(0);
        G0(o, 0, 0);
        com.google.android.material.carousel.b c2 = this.x.c(this, o);
        if (E2()) {
            c2 = com.google.android.material.carousel.b.m(c2, p2());
        }
        this.y = com.google.android.material.carousel.c.f(this, c2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M0(RecyclerView recyclerView) {
        super.M0(recyclerView);
        M2();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    public final void M2() {
        this.y = null;
        z1();
    }

    public final void N2(RecyclerView.u uVar) {
        while (O() > 0) {
            View N = N(0);
            float q2 = q2(N);
            if (!G2(q2, D2(this.z.g(), q2, true))) {
                break;
            }
            s1(N, uVar);
        }
        while (O() - 1 >= 0) {
            View N2 = N(O() - 1);
            float q22 = q2(N2);
            if (!F2(q22, D2(this.z.g(), q22, true))) {
                return;
            }
            s1(N2, uVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.O0(recyclerView, uVar);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i);
        P1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View P0(View view, int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        int l2;
        if (O() == 0 || (l2 = l2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (l2 == -1) {
            if (n0(view) == 0) {
                return null;
            }
            c2(uVar, n0(N(0)) - 1, 0);
            return o2();
        } else if (n0(view) == e() - 1) {
            return null;
        } else {
            c2(uVar, n0(N(O() - 1)) + 1, -1);
            return n2();
        }
    }

    public final void P2(RecyclerView recyclerView, int i) {
        if (f()) {
            recyclerView.scrollBy(i, 0);
        } else {
            recyclerView.scrollBy(0, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Q0(AccessibilityEvent accessibilityEvent) {
        super.Q0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(n0(N(0)));
            accessibilityEvent.setToIndex(n0(N(O() - 1)));
        }
    }

    public void Q2(int i) {
        this.G = i;
        M2();
    }

    public final void R2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, on0.Y);
            Q2(obtainStyledAttributes.getInt(on0.Z, 0));
            T2(obtainStyledAttributes.getInt(on0.E3, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public void S2(ja jaVar) {
        this.x = jaVar;
        M2();
    }

    public void T2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        l(null);
        ia iaVar = this.C;
        if (iaVar == null || i != iaVar.a) {
            this.C = ia.b(this, i);
            M2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U(View view, Rect rect) {
        super.U(view, rect);
        float centerY = rect.centerY();
        if (f()) {
            centerY = rect.centerX();
        }
        float s2 = s2(centerY, D2(this.z.g(), centerY, true));
        float width = f() ? (rect.width() - s2) / 2.0f : 0.0f;
        float height = f() ? 0.0f : (rect.height() - s2) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    public final void U2(View view, float f, d dVar) {
    }

    public final void V2(com.google.android.material.carousel.c cVar) {
        int i = this.u;
        int i2 = this.t;
        if (i <= i2) {
            this.z = E2() ? cVar.h() : cVar.l();
        } else {
            this.z = cVar.j(this.s, i2, i);
        }
        this.w.j(this.z.g());
    }

    public final void W2() {
        int e = e();
        int i = this.E;
        if (e == i || this.y == null) {
            return;
        }
        if (this.x.d(this, i)) {
            M2();
        }
        this.E = e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView recyclerView, int i, int i2) {
        super.X0(recyclerView, i, i2);
        W2();
    }

    public final void X2() {
        if (!this.v || O() < 1) {
            return;
        }
        int i = 0;
        while (i < O() - 1) {
            int n0 = n0(N(i));
            int i2 = i + 1;
            int n02 = n0(N(i2));
            if (n0 > n02) {
                I2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + n0 + "] and child at index [" + i2 + "] had adapter position [" + n02 + "].");
            }
            i = i2;
        }
    }

    public final void Z1(View view, int i, b bVar) {
        float f = this.z.f() / 2.0f;
        j(view, i);
        float f2 = bVar.c;
        this.C.k(view, (int) (f2 - f), (int) (f2 + f));
        U2(view, bVar.b, bVar.d);
    }

    @Override // androidx.appcompat.view.menu.fa
    public int a() {
        return u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(RecyclerView recyclerView, int i, int i2) {
        super.a1(recyclerView, i, i2);
        W2();
    }

    public final float a2(float f, float f2) {
        return E2() ? f - f2 : f + f2;
    }

    @Override // androidx.appcompat.view.menu.fa
    public int b() {
        return this.G;
    }

    public final float b2(float f, float f2) {
        return E2() ? f + f2 : f - f2;
    }

    @Override // androidx.appcompat.view.menu.fa
    public int c() {
        return b0();
    }

    public final void c2(RecyclerView.u uVar, int i, int i2) {
        if (i < 0 || i >= e()) {
            return;
        }
        b J2 = J2(uVar, g2(i), i);
        Z1(J2.a, i2, J2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF d(int i) {
        if (this.y == null) {
            return null;
        }
        int t2 = t2(i, r2(i));
        return f() ? new PointF(t2, 0.0f) : new PointF(0.0f, t2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d1(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.b() <= 0 || p2() <= 0.0f) {
            q1(uVar);
            this.A = 0;
            return;
        }
        boolean E2 = E2();
        boolean z = this.y == null;
        if (z) {
            L2(uVar);
        }
        int k2 = k2(this.y);
        int h2 = h2(zVar, this.y);
        this.t = E2 ? h2 : k2;
        if (E2) {
            h2 = k2;
        }
        this.u = h2;
        if (z) {
            this.s = k2;
            this.B = this.y.i(e(), this.t, this.u, E2());
            int i = this.F;
            if (i != -1) {
                this.s = B2(i, r2(i));
            }
        }
        int i2 = this.s;
        this.s = i2 + j2(0, i2, this.t, this.u);
        this.A = xb0.b(this.A, 0, zVar.b());
        V2(this.y);
        B(uVar);
        m2(uVar, zVar);
        this.E = e();
    }

    public final void d2(RecyclerView.u uVar, RecyclerView.z zVar, int i) {
        float g2 = g2(i);
        while (i < zVar.b()) {
            b J2 = J2(uVar, g2, i);
            if (F2(J2.c, J2.d)) {
                return;
            }
            g2 = a2(g2, this.z.f());
            if (!G2(J2.c, J2.d)) {
                Z1(J2.a, -1, J2);
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(RecyclerView.z zVar) {
        super.e1(zVar);
        if (O() == 0) {
            this.A = 0;
        } else {
            this.A = n0(N(0));
        }
        X2();
    }

    public final void e2(RecyclerView.u uVar, int i) {
        float g2 = g2(i);
        while (i >= 0) {
            b J2 = J2(uVar, g2, i);
            if (G2(J2.c, J2.d)) {
                return;
            }
            g2 = b2(g2, this.z.f());
            if (!F2(J2.c, J2.d)) {
                Z1(J2.a, 0, J2);
            }
            i--;
        }
    }

    @Override // androidx.appcompat.view.menu.fa
    public boolean f() {
        return this.C.a == 0;
    }

    public final float f2(View view, float f, d dVar) {
        b.c cVar = dVar.a;
        float f2 = cVar.b;
        b.c cVar2 = dVar.b;
        float b2 = j2.b(f2, cVar2.b, cVar.a, cVar2.a, f);
        if (dVar.b == this.z.c() || dVar.a == this.z.j()) {
            float d2 = this.C.d((RecyclerView.p) view.getLayoutParams()) / this.z.f();
            b.c cVar3 = dVar.b;
            return b2 + ((f - cVar3.a) * ((1.0f - cVar3.c) + d2));
        }
        return b2;
    }

    public final float g2(int i) {
        return a2(z2() - this.s, this.z.f() * i);
    }

    public final int h2(RecyclerView.z zVar, com.google.android.material.carousel.c cVar) {
        boolean E2 = E2();
        com.google.android.material.carousel.b l = E2 ? cVar.l() : cVar.h();
        b.c a2 = E2 ? l.a() : l.h();
        int b2 = (int) ((((((zVar.b() - 1) * l.f()) + i0()) * (E2 ? -1.0f : 1.0f)) - (a2.a - z2())) + (w2() - a2.a));
        return E2 ? Math.min(0, b2) : Math.max(0, b2);
    }

    public int i2(int i) {
        return (int) (this.s - B2(i, r2(i)));
    }

    public final int k2(com.google.android.material.carousel.c cVar) {
        boolean E2 = E2();
        com.google.android.material.carousel.b h = E2 ? cVar.h() : cVar.l();
        b.c h2 = E2 ? h.h() : h.a();
        return (int) (((l0() * (E2 ? 1 : -1)) + z2()) - b2(h2.a, h.f() / 2.0f));
    }

    public final void m2(RecyclerView.u uVar, RecyclerView.z zVar) {
        N2(uVar);
        if (O() == 0) {
            e2(uVar, this.A - 1);
            d2(uVar, zVar, this.A);
        } else {
            int n0 = n0(N(0));
            int n02 = n0(N(O() - 1));
            e2(uVar, n0 - 1);
            d2(uVar, zVar, n02 + 1);
        }
        X2();
    }

    public final View n2() {
        return N(E2() ? 0 : O() - 1);
    }

    public final View o2() {
        return N(E2() ? O() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return f();
    }

    public final int p2() {
        return f() ? a() : c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return !f();
    }

    public final float q2(View view) {
        Rect rect = new Rect();
        super.U(view, rect);
        return f() ? rect.centerX() : rect.centerY();
    }

    public final com.google.android.material.carousel.b r2(int i) {
        com.google.android.material.carousel.b bVar;
        Map map = this.B;
        return (map == null || (bVar = (com.google.android.material.carousel.b) map.get(Integer.valueOf(xb0.b(i, 0, Math.max(0, e() + (-1)))))) == null) ? this.y.g() : bVar;
    }

    public final float s2(float f, d dVar) {
        b.c cVar = dVar.a;
        float f2 = cVar.d;
        b.c cVar2 = dVar.b;
        return j2.b(f2, cVar2.d, cVar.b, cVar2.b, f);
    }

    public int t2(int i, com.google.android.material.carousel.b bVar) {
        return B2(i, bVar) - this.s;
    }

    public int u2() {
        return this.C.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        if (O() == 0 || this.y == null || e() <= 1) {
            return 0;
        }
        return (int) (u0() * (this.y.g().f() / x(zVar)));
    }

    public final int v2() {
        return this.C.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return this.s;
    }

    public final int w2() {
        return this.C.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return this.u - this.t;
    }

    public final int x2() {
        return this.C.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        if (O() == 0 || this.y == null || e() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.y.g().f() / A(zVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean y1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int C2;
        if (this.y == null || (C2 = C2(n0(view), r2(n0(view)))) == 0) {
            return false;
        }
        P2(recyclerView, C2(n0(view), this.y.j(this.s + j2(C2, this.s, this.t, this.u), this.t, this.u)));
        return true;
    }

    public final int y2() {
        return this.C.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return this.s;
    }

    public final int z2() {
        return this.C.i();
    }

    public CarouselLayoutManager(ja jaVar) {
        this(jaVar, 0);
    }

    public CarouselLayoutManager(ja jaVar, int i) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: androidx.appcompat.view.menu.ga
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager.this.H2(view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.F = -1;
        this.G = 0;
        S2(jaVar);
        T2(i);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: androidx.appcompat.view.menu.ga
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager.this.H2(view, i22, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.F = -1;
        this.G = 0;
        S2(new fe0());
        R2(context, attributeSet);
    }
}
