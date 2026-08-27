package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.cm0;
import androidx.appcompat.view.menu.hn0;
import androidx.appcompat.view.menu.my0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public abstract class BottomAppBar extends Toolbar {
    public static final int T = hn0.f;
    public static final int U = cm0.s;
    public static final int V = cm0.z;

    public static /* synthetic */ void M(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ View N(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static void P(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.e) view.getLayoutParams()).d = 17;
        throw null;
    }

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect m;
        public WeakReference n;
        public int o;
        public final View.OnLayoutChangeListener p;

        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                my0.a(Behavior.this.n.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.p = new a();
            this.m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            my0.a(view);
            return P(coordinatorLayout, null, view2, view3, i, i2);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.n = new WeakReference(bottomAppBar);
            View N = BottomAppBar.N(bottomAppBar);
            if (N != null && !p51.O(N)) {
                BottomAppBar.P(bottomAppBar, N);
                this.o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) N.getLayoutParams())).bottomMargin;
                N.addOnLayoutChangeListener(this.p);
                BottomAppBar.M(bottomAppBar);
            }
            coordinatorLayout.G(bottomAppBar, i);
            return super.l(coordinatorLayout, bottomAppBar, i);
        }

        public boolean P(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            my0.a(view);
            return O(coordinatorLayout, null, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.p = new a();
            this.m = new Rect();
        }
    }
}
