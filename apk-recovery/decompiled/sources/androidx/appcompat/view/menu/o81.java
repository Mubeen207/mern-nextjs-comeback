package androidx.appcompat.view.menu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.appcompat.view.menu.b91;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class o81 {
    public e a;

    /* loaded from: classes.dex */
    public static final class a {
        public final m50 a;
        public final m50 b;

        public a(m50 m50Var, m50 m50Var2) {
            this.a = m50Var;
            this.b = m50Var2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public m50 a() {
            return this.a;
        }

        public m50 b() {
            return this.b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.a = d.g(bounds);
            this.b = d.f(bounds);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public WindowInsets a;
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public abstract void b(o81 o81Var);

        public abstract void c(o81 o81Var);

        public abstract b91 d(b91 b91Var, List list);

        public abstract a e(o81 o81Var, a aVar);
    }

    /* loaded from: classes.dex */
    public static class c extends e {
        public static final Interpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        public static final Interpolator f = new ar();
        public static final Interpolator g = new DecelerateInterpolator();

        /* loaded from: classes.dex */
        public static class a implements View.OnApplyWindowInsetsListener {
            public final b a;
            public b91 b;

            /* renamed from: androidx.appcompat.view.menu.o81$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0021a implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ o81 a;
                public final /* synthetic */ b91 b;
                public final /* synthetic */ b91 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ View e;

                public C0021a(o81 o81Var, b91 b91Var, b91 b91Var2, int i, View view) {
                    this.a = o81Var;
                    this.b = b91Var;
                    this.c = b91Var2;
                    this.d = i;
                    this.e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.e, c.o(this.b, this.c, this.a.b(), this.d), Collections.singletonList(this.a));
                }
            }

            /* loaded from: classes.dex */
            public class b extends AnimatorListenerAdapter {
                public final /* synthetic */ o81 a;
                public final /* synthetic */ View b;

                public b(o81 o81Var, View view) {
                    this.a = o81Var;
                    this.b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.a.e(1.0f);
                    c.i(this.b, this.a);
                }
            }

            /* renamed from: androidx.appcompat.view.menu.o81$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0022c implements Runnable {
                public final /* synthetic */ View m;
                public final /* synthetic */ o81 n;
                public final /* synthetic */ a o;
                public final /* synthetic */ ValueAnimator p;

                public RunnableC0022c(View view, o81 o81Var, a aVar, ValueAnimator valueAnimator) {
                    this.m = view;
                    this.n = o81Var;
                    this.o = aVar;
                    this.p = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.m, this.n, this.o);
                    this.p.start();
                }
            }

            public a(View view, b bVar) {
                this.a = bVar;
                b91 D = p51.D(view);
                this.b = D != null ? new b91.b(D).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int e;
                if (!view.isLaidOut()) {
                    this.b = b91.u(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                b91 u = b91.u(windowInsets, view);
                if (this.b == null) {
                    this.b = p51.D(view);
                }
                if (this.b == null) {
                    this.b = u;
                    return c.m(view, windowInsets);
                }
                b n = c.n(view);
                if ((n == null || !Objects.equals(n.a, windowInsets)) && (e = c.e(u, this.b)) != 0) {
                    b91 b91Var = this.b;
                    o81 o81Var = new o81(e, c.g(e, u, b91Var), 160L);
                    o81Var.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(o81Var.a());
                    a f = c.f(u, b91Var, e);
                    c.j(view, o81Var, windowInsets, false);
                    duration.addUpdateListener(new C0021a(o81Var, u, b91Var, e, view));
                    duration.addListener(new b(o81Var, view));
                    rg0.a(view, new RunnableC0022c(view, o81Var, f, duration));
                    this.b = u;
                    return c.m(view, windowInsets);
                }
                return c.m(view, windowInsets);
            }
        }

        public c(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        public static int e(b91 b91Var, b91 b91Var2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!b91Var.f(i2).equals(b91Var2.f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        public static a f(b91 b91Var, b91 b91Var2, int i) {
            m50 f2 = b91Var.f(i);
            m50 f3 = b91Var2.f(i);
            return new a(m50.b(Math.min(f2.a, f3.a), Math.min(f2.b, f3.b), Math.min(f2.c, f3.c), Math.min(f2.d, f3.d)), m50.b(Math.max(f2.a, f3.a), Math.max(f2.b, f3.b), Math.max(f2.c, f3.c), Math.max(f2.d, f3.d)));
        }

        public static Interpolator g(int i, b91 b91Var, b91 b91Var2) {
            return (i & 8) != 0 ? b91Var.f(b91.m.c()).d > b91Var2.f(b91.m.c()).d ? e : f : g;
        }

        public static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        public static void i(View view, o81 o81Var) {
            b n = n(view);
            if (n != null) {
                n.b(o81Var);
                if (n.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    i(viewGroup.getChildAt(i), o81Var);
                }
            }
        }

        public static void j(View view, o81 o81Var, WindowInsets windowInsets, boolean z) {
            b n = n(view);
            if (n != null) {
                n.a = windowInsets;
                if (!z) {
                    n.c(o81Var);
                    z = n.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    j(viewGroup.getChildAt(i), o81Var, windowInsets, z);
                }
            }
        }

        public static void k(View view, b91 b91Var, List list) {
            b n = n(view);
            if (n != null) {
                b91Var = n.d(b91Var, list);
                if (n.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    k(viewGroup.getChildAt(i), b91Var, list);
                }
            }
        }

        public static void l(View view, o81 o81Var, a aVar) {
            b n = n(view);
            if (n != null) {
                n.e(o81Var, aVar);
                if (n.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    l(viewGroup.getChildAt(i), o81Var, aVar);
                }
            }
        }

        public static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(pm0.L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b n(View view) {
            Object tag = view.getTag(pm0.R);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }

        public static b91 o(b91 b91Var, b91 b91Var2, float f2, int i) {
            b91.b bVar = new b91.b(b91Var);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    bVar.b(i2, b91Var.f(i2));
                } else {
                    m50 f3 = b91Var.f(i2);
                    m50 f4 = b91Var2.f(i2);
                    float f5 = 1.0f - f2;
                    bVar.b(i2, b91.m(f3, (int) (((f3.a - f4.a) * f5) + 0.5d), (int) (((f3.b - f4.b) * f5) + 0.5d), (int) (((f3.c - f4.c) * f5) + 0.5d), (int) (((f3.d - f4.d) * f5) + 0.5d)));
                }
            }
            return bVar.a();
        }

        public static void p(View view, b bVar) {
            Object tag = view.getTag(pm0.L);
            if (bVar == null) {
                view.setTag(pm0.R, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener h = h(view, bVar);
            view.setTag(pm0.R, h);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(h);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {
        public final WindowInsetsAnimation e;

        /* loaded from: classes.dex */
        public static class a extends WindowInsetsAnimation$Callback {
            public final b a;
            public List b;
            public ArrayList c;
            public final HashMap d;

            public a(b bVar) {
                super(bVar.a());
                this.d = new HashMap();
                this.a = bVar;
            }

            public final o81 a(WindowInsetsAnimation windowInsetsAnimation) {
                o81 o81Var = (o81) this.d.get(windowInsetsAnimation);
                if (o81Var == null) {
                    o81 f = o81.f(windowInsetsAnimation);
                    this.d.put(windowInsetsAnimation, f);
                    return f;
                }
                return o81Var;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.b(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                float fraction;
                ArrayList arrayList = this.c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a = z81.a(list.get(size));
                    o81 a2 = a(a);
                    fraction = a.getFraction();
                    a2.e(fraction);
                    this.c.add(a2);
                }
                return this.a.d(b91.t(windowInsets), this.b).s();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            w81.a();
            return v81.a(aVar.a().e(), aVar.b().e());
        }

        public static m50 f(WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return m50.d(upperBound);
        }

        public static m50 g(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return m50.d(lowerBound);
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.appcompat.view.menu.o81.e
        public long a() {
            long durationMillis;
            durationMillis = this.e.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.appcompat.view.menu.o81.e
        public float b() {
            float interpolatedFraction;
            interpolatedFraction = this.e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.appcompat.view.menu.o81.e
        public int c() {
            int typeMask;
            typeMask = this.e.getTypeMask();
            return typeMask;
        }

        @Override // androidx.appcompat.view.menu.o81.e
        public void d(float f) {
            this.e.setFraction(f);
        }

        public d(int i, Interpolator interpolator, long j) {
            this(u81.a(i, interpolator, j));
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;

        public e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public long a() {
            return this.d;
        }

        public float b() {
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
        }

        public int c() {
            return this.a;
        }

        public void d(float f) {
            this.b = f;
        }
    }

    public o81(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(i, interpolator, j);
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    public static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    public static o81 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new o81(windowInsetsAnimation);
    }

    public long a() {
        return this.a.a();
    }

    public float b() {
        return this.a.b();
    }

    public int c() {
        return this.a.c();
    }

    public void e(float f) {
        this.a.d(f);
    }

    public o81(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(windowInsetsAnimation);
        }
    }
}
