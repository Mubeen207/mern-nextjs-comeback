package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* loaded from: classes.dex */
public final class up0 extends fu0 {
    public final SideSheetBehavior a;

    public up0(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // androidx.appcompat.view.menu.fu0
    public float b(int i) {
        float d = d();
        return (d - i) / (d - c());
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int c() {
        return Math.max(0, (d() - this.a.Y()) - this.a.d0());
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int d() {
        return this.a.g0();
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int e() {
        return this.a.g0();
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int f() {
        return c();
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int g(View view) {
        return view.getLeft() - this.a.d0();
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // androidx.appcompat.view.menu.fu0
    public int i() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.fu0
    public boolean j(float f) {
        return f < 0.0f;
    }

    @Override // androidx.appcompat.view.menu.fu0
    public boolean k(View view) {
        return view.getLeft() > (d() + c()) / 2;
    }

    @Override // androidx.appcompat.view.menu.fu0
    public boolean l(float f, float f2) {
        return gu0.a(f, f2) && Math.abs(f) > ((float) this.a.h0());
    }

    @Override // androidx.appcompat.view.menu.fu0
    public boolean m(View view, float f) {
        return Math.abs(((float) view.getRight()) + (f * this.a.b0())) > this.a.c0();
    }

    @Override // androidx.appcompat.view.menu.fu0
    public void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int g0 = this.a.g0();
        if (i <= g0) {
            marginLayoutParams.rightMargin = g0 - i;
        }
    }
}
