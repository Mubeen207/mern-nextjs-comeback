package androidx.appcompat.view.menu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class wq extends k71 {

    /* loaded from: classes.dex */
    public class a extends w11 {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void e(v11 v11Var) {
            q61.g(this.a, 1.0f);
            q61.a(this.a);
            v11Var.S(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {
        public final View a;
        public boolean b = false;

        public b(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q61.g(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (p51.K(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public wq(int i) {
        l0(i);
    }

    public static float n0(b21 b21Var, float f) {
        Float f2;
        return (b21Var == null || (f2 = (Float) b21Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // androidx.appcompat.view.menu.k71
    public Animator h0(ViewGroup viewGroup, View view, b21 b21Var, b21 b21Var2) {
        float n0 = n0(b21Var, 0.0f);
        return m0(view, n0 != 1.0f ? n0 : 0.0f, 1.0f);
    }

    @Override // androidx.appcompat.view.menu.k71, androidx.appcompat.view.menu.v11
    public void j(b21 b21Var) {
        super.j(b21Var);
        b21Var.a.put("android:fade:transitionAlpha", Float.valueOf(q61.c(b21Var.b)));
    }

    @Override // androidx.appcompat.view.menu.k71
    public Animator j0(ViewGroup viewGroup, View view, b21 b21Var, b21 b21Var2) {
        q61.e(view);
        return m0(view, n0(b21Var, 1.0f), 0.0f);
    }

    public final Animator m0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        q61.g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, q61.b, f2);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    public wq() {
    }
}
