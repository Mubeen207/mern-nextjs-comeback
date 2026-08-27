package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes.dex */
public abstract class sb0 {
    public static hh a(int i) {
        return i != 0 ? i != 1 ? b() : new li() : new zp0();
    }

    public static hh b() {
        return new zp0();
    }

    public static kn c() {
        return new kn();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof rb0) {
            ((rb0) background).S(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof rb0) {
            f(view, (rb0) background);
        }
    }

    public static void f(View view, rb0 rb0Var) {
        if (rb0Var.L()) {
            rb0Var.W(p61.f(view));
        }
    }
}
