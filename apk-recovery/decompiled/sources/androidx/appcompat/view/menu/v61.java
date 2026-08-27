package androidx.appcompat.view.menu;

import android.view.View;
/* loaded from: classes.dex */
public abstract class v61 extends e71 {
    public static boolean c = true;

    @Override // androidx.appcompat.view.menu.e71
    public void a(View view) {
    }

    @Override // androidx.appcompat.view.menu.e71
    public float b(View view) {
        float transitionAlpha;
        if (c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.appcompat.view.menu.e71
    public void c(View view) {
    }

    @Override // androidx.appcompat.view.menu.e71
    public void e(View view, float f) {
        if (c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        view.setAlpha(f);
    }
}
