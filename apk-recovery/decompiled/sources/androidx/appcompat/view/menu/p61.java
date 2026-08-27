package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.PackageParser;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.view.menu.b91;
/* loaded from: classes.dex */
public abstract class p61 {

    /* loaded from: classes.dex */
    public class a implements dg0 {
        public final /* synthetic */ c a;
        public final /* synthetic */ d b;

        public a(c cVar, d dVar) {
            this.a = cVar;
            this.b = dVar;
        }

        @Override // androidx.appcompat.view.menu.dg0
        public b91 a(View view, b91 b91Var) {
            return this.a.a(view, b91Var, new d(this.b));
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            p51.h0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        b91 a(View view, b91 b91Var, d dVar);
    }

    /* loaded from: classes.dex */
    public static class d {
        public int a;
        public int b;
        public int c;
        public int d;

        public d(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public d(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.c = dVar.c;
            this.d = dVar.d;
        }
    }

    public static void b(View view, c cVar) {
        p51.y0(view, new a(cVar, new d(p51.C(view), view.getPaddingTop(), p51.B(view), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList a2 = tm.a(view.getBackground());
        if (a2 != null) {
            return Integer.valueOf(a2.getDefaultColor());
        }
        return null;
    }

    public static InputMethodManager e(View view) {
        return (InputMethodManager) lg.j(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += p51.s((View) parent);
        }
        return f;
    }

    public static boolean g(View view) {
        return p51.x(view) == 1;
    }

    public static PorterDuff.Mode i(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void j(View view) {
        if (p51.N(view)) {
            p51.h0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void k(final View view, final boolean z) {
        view.requestFocus();
        view.post(new Runnable() { // from class: androidx.appcompat.view.menu.o61
            @Override // java.lang.Runnable
            public final void run() {
                p61.l(view, z);
            }
        });
    }

    public static void l(View view, boolean z) {
        y91 G;
        if (!z || (G = p51.G(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            G.c(b91.m.c());
        }
    }
}
