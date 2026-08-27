package androidx.appcompat.view.menu;

import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
public class d71 extends c71 {
    @Override // androidx.appcompat.view.menu.v61, androidx.appcompat.view.menu.e71
    public float b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // androidx.appcompat.view.menu.a71, androidx.appcompat.view.menu.e71
    public void d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.appcompat.view.menu.v61, androidx.appcompat.view.menu.e71
    public void e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.appcompat.view.menu.c71, androidx.appcompat.view.menu.e71
    public void f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.appcompat.view.menu.y61, androidx.appcompat.view.menu.e71
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.appcompat.view.menu.y61, androidx.appcompat.view.menu.e71
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
