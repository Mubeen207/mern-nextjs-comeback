package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.view.menu.gq;
import androidx.appcompat.view.menu.my0;
import androidx.appcompat.view.menu.p51;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.b {
    public int a;

    public ExpandableBehavior() {
        this.a = 0;
    }

    public gq E(CoordinatorLayout coordinatorLayout, View view) {
        List q = coordinatorLayout.q(view);
        int size = q.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) q.get(i);
            if (e(coordinatorLayout, view, view2)) {
                my0.a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        my0.a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (p51.O(view)) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
