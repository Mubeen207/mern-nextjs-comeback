package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* loaded from: classes.dex */
public final class t80 extends fu0 {
    public final SideSheetBehavior a;

    public t80(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // androidx.appcompat.view.menu.fu0
    public float b(int i) {
        float d = d();
        return (i - d) / (c() - d);
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int c() {
        return Math.max(0, this.a.f0() + this.a.d0());
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int d() {
        return (-this.a.Y()) - this.a.d0();
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int e() {
        return this.a.d0();
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int f() {
        return -this.a.Y();
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int g(View view) {
        return view.getRight() + this.a.d0();
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int i() {
        return 1;
    }

    @Override // androidx.appcompat.view.menu.fu0
    public boolean j(float f) {
        return f > 0.0f;
    }

    @Override // androidx.appcompat.view.menu.fu0
    public boolean k(View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override // androidx.appcompat.view.menu.fu0
    public boolean l(float f, float f2) {
        return gu0.a(f, f2) && Math.abs(f) > ((float) this.a.h0());
    }

    @Override // androidx.appcompat.view.menu.fu0
    public boolean m(View view, float f) {
        return Math.abs(((float) view.getLeft()) + (f * this.a.b0())) > this.a.c0();
    }

    @Override // androidx.appcompat.view.menu.fu0
    public void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.a.g0()) {
            marginLayoutParams.leftMargin = i2;
        }
    }
}
