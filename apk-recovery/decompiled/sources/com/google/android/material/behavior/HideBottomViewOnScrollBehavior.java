package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.view.menu.ce0;
import androidx.appcompat.view.menu.cm0;
import androidx.appcompat.view.menu.j2;
import androidx.appcompat.view.menu.my0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.b {
    public static final int j = cm0.s;
    public static final int k = cm0.u;
    public static final int l = cm0.z;
    public final LinkedHashSet a;
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public int f;
    public int g;
    public int h;
    public ViewPropertyAnimator i;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.a = new LinkedHashSet();
        this.f = 0;
        this.g = 2;
        this.h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void F(View view, int i, long j2, TimeInterpolator timeInterpolator) {
        this.i = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }

    public boolean G() {
        return this.g == 1;
    }

    public boolean H() {
        return this.g == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 1);
        int i = this.f + this.h;
        if (z) {
            F(view, i, this.c, this.e);
        } else {
            view.setTranslationY(i);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 2);
        if (z) {
            F(view, 0, this.b, this.d);
        } else {
            view.setTranslationY(0);
        }
    }

    public final void M(View view, int i) {
        this.g = i;
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = ce0.f(view.getContext(), j, 225);
        this.c = ce0.f(view.getContext(), k, 175);
        Context context = view.getContext();
        int i2 = l;
        this.d = ce0.g(context, i2, j2.d);
        this.e = ce0.g(view.getContext(), i2, j2.c);
        return super.l(coordinatorLayout, view, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            I(view);
        } else if (i2 < 0) {
            K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new LinkedHashSet();
        this.f = 0;
        this.g = 2;
        this.h = 0;
    }
}
