package androidx.appcompat.view.menu;

import android.view.View;
/* loaded from: classes.dex */
public abstract class a71 extends y61 {
    public static boolean f = true;

    @Override // androidx.appcompat.view.menu.e71
    public void d(View view, int i, int i2, int i3, int i4) {
        if (f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
