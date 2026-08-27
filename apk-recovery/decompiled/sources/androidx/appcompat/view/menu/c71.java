package androidx.appcompat.view.menu;

import android.os.Build;
import android.view.View;
/* loaded from: classes.dex */
public class c71 extends a71 {
    public static boolean g = true;

    @Override // androidx.appcompat.view.menu.e71
    public void f(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i);
        } else if (g) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
