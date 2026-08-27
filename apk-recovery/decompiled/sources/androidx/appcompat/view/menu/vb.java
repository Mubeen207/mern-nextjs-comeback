package androidx.appcompat.view.menu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
/* loaded from: classes.dex */
public class vb extends oo {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final View.OnClickListener j;
    public final View.OnFocusChangeListener k;
    public AnimatorSet l;
    public ValueAnimator m;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            vb.this.b.a0(true);
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            vb.this.b.a0(false);
        }
    }

    public vb(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.j = new View.OnClickListener() { // from class: androidx.appcompat.view.menu.tb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vb.this.G(view);
            }
        };
        this.k = new View.OnFocusChangeListener() { // from class: androidx.appcompat.view.menu.ub
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                vb.this.H(view, z);
            }
        };
        this.e = ce0.f(aVar.getContext(), cm0.w, 100);
        this.f = ce0.f(aVar.getContext(), cm0.w, 150);
        this.g = ce0.g(aVar.getContext(), cm0.A, j2.a);
        this.h = ce0.g(aVar.getContext(), cm0.z, j2.d);
    }

    public final void A(boolean z) {
        boolean z2 = this.b.F() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
            }
        } else if (z) {
        } else {
            this.l.cancel();
            this.m.start();
            if (z2) {
                this.m.end();
            }
        }
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.g);
        ofFloat.setDuration(this.e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.appcompat.view.menu.sb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                vb.this.E(valueAnimator);
            }
        });
        return ofFloat;
    }

    public final ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.appcompat.view.menu.rb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                vb.this.F(valueAnimator);
            }
        });
        return ofFloat;
    }

    public final void D() {
        ValueAnimator C = C();
        ValueAnimator B = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(C, B);
        this.l.addListener(new a());
        ValueAnimator B2 = B(1.0f, 0.0f);
        this.m = B2;
        B2.addListener(new b());
    }

    public final /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final /* synthetic */ void F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.d.setScaleX(floatValue);
        this.d.setScaleY(floatValue);
    }

    public final /* synthetic */ void G(View view) {
        EditText editText = this.i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        r();
    }

    public final /* synthetic */ void H(View view, boolean z) {
        A(J());
    }

    public final /* synthetic */ void I() {
        A(true);
    }

    public final boolean J() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }

    @Override // androidx.appcompat.view.menu.oo
    public void a(Editable editable) {
        if (this.b.w() != null) {
            return;
        }
        A(J());
    }

    @Override // androidx.appcompat.view.menu.oo
    public int c() {
        return dn0.e;
    }

    @Override // androidx.appcompat.view.menu.oo
    public int d() {
        return lm0.f;
    }

    @Override // androidx.appcompat.view.menu.oo
    public View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // androidx.appcompat.view.menu.oo
    public View.OnClickListener f() {
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.oo
    public View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // androidx.appcompat.view.menu.oo
    public void n(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(J());
    }

    @Override // androidx.appcompat.view.menu.oo
    public void q(boolean z) {
        if (this.b.w() == null) {
            return;
        }
        A(z);
    }

    @Override // androidx.appcompat.view.menu.oo
    public void s() {
        D();
    }

    @Override // androidx.appcompat.view.menu.oo
    public void u() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: androidx.appcompat.view.menu.qb
                @Override // java.lang.Runnable
                public final void run() {
                    vb.this.I();
                }
            });
        }
    }
}
