package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
/* loaded from: classes.dex */
public abstract class az extends f61 {
    public final Rect d;
    public final Rect e;
    public int f;
    public int g;

    public az() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    public static int L(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // androidx.appcompat.view.menu.f61
    public void F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View G = G(coordinatorLayout.q(view));
        if (G == null) {
            super.F(coordinatorLayout, view, i);
            this.f = 0;
            return;
        }
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
        Rect rect = this.d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, G.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((coordinatorLayout.getHeight() + G.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        b91 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && p51.u(coordinatorLayout) && !p51.u(view)) {
            rect.left += lastWindowInsets.i();
            rect.right -= lastWindowInsets.j();
        }
        Rect rect2 = this.e;
        my.a(L(eVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int H = H(G);
        view.layout(rect2.left, rect2.top - H, rect2.right, rect2.bottom - H);
        this.f = rect2.top - G.getBottom();
    }

    public abstract View G(List list);

    public final int H(View view) {
        if (this.g == 0) {
            return 0;
        }
        float I = I(view);
        int i = this.g;
        return xb0.b((int) (I * i), 0, i);
    }

    public abstract float I(View view);

    public int J(View view) {
        return view.getMeasuredHeight();
    }

    public final int K() {
        return this.f;
    }

    public final void M(int i) {
        this.g = i;
    }

    public boolean N() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View G;
        b91 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (G = G(coordinatorLayout.q(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (p51.u(G) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.k() + lastWindowInsets.h();
            }
            int J = size + J(G);
            int measuredHeight = G.getMeasuredHeight();
            if (N()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                J -= measuredHeight;
            }
            coordinatorLayout.H(view, i, i2, View.MeasureSpec.makeMeasureSpec(J, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
            return true;
        }
        return false;
    }

    public az(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
}
