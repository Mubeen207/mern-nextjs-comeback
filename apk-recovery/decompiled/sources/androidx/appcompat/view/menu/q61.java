package androidx.appcompat.view.menu;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* loaded from: classes.dex */
public abstract class q61 {
    public static final e71 a;
    public static final Property b;
    public static final Property c;

    /* loaded from: classes.dex */
    public static class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(q61.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            q61.g(view, f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return p51.q(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            p51.r0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new d71();
        } else {
            a = new c71();
        }
        b = new a(Float.class, "translationAlpha");
        c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        a.a(view);
    }

    public static i61 b(View view) {
        return new h61(view);
    }

    public static float c(View view) {
        return a.b(view);
    }

    public static h81 d(View view) {
        return new g81(view);
    }

    public static void e(View view) {
        a.c(view);
    }

    public static void f(View view, int i, int i2, int i3, int i4) {
        a.d(view, i, i2, i3, i4);
    }

    public static void g(View view, float f) {
        a.e(view, f);
    }

    public static void h(View view, int i) {
        a.f(view, i);
    }

    public static void i(View view, Matrix matrix) {
        a.g(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        a.h(view, matrix);
    }
}
