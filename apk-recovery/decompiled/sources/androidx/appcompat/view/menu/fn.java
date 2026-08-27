package androidx.appcompat.view.menu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.view.menu.e0;
/* loaded from: classes.dex */
public class fn extends oo {
    public static final boolean s = true;
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final View.OnClickListener i;
    public final View.OnFocusChangeListener j;
    public final e0.a k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            fn.this.r();
            fn.this.r.start();
        }
    }

    public fn(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.i = new View.OnClickListener() { // from class: androidx.appcompat.view.menu.ym
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fn.this.J(view);
            }
        };
        this.j = new View.OnFocusChangeListener() { // from class: androidx.appcompat.view.menu.zm
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                fn.this.K(view, z);
            }
        };
        this.k = new e0.a() { // from class: androidx.appcompat.view.menu.an
            @Override // androidx.appcompat.view.menu.e0.a
            public final void onTouchExplorationStateChanged(boolean z) {
                fn.this.L(z);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = ce0.f(aVar.getContext(), cm0.w, 67);
        this.e = ce0.f(aVar.getContext(), cm0.w, 50);
        this.g = ce0.g(aVar.getContext(), cm0.A, j2.a);
    }

    public static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.r = E(this.f, 0.0f, 1.0f);
        ValueAnimator E = E(this.e, 1.0f, 0.0f);
        this.q = E;
        E.addListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z) {
        this.l = z;
        r();
        if (z) {
            return;
        }
        O(false);
        this.m = false;
    }

    public final ValueAnimator E(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.g);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.appcompat.view.menu.bn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                fn.this.I(valueAnimator);
            }
        });
        return ofFloat;
    }

    public final boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.o;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public final /* synthetic */ void H() {
        boolean isPopupShowing = this.h.isPopupShowing();
        O(isPopupShowing);
        this.m = isPopupShowing;
    }

    public final /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final /* synthetic */ void L(boolean z) {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView == null || ln.a(autoCompleteTextView)) {
            return;
        }
        p51.u0(this.d, z ? 2 : 1);
    }

    public final /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.m = false;
            }
            Q();
            R();
        }
        return false;
    }

    public final /* synthetic */ void N() {
        R();
        O(false);
    }

    public final void O(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void P() {
        this.h.setOnTouchListener(new View.OnTouchListener() { // from class: androidx.appcompat.view.menu.dn
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean M;
                M = fn.this.M(view, motionEvent);
                return M;
            }
        });
        if (s) {
            this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: androidx.appcompat.view.menu.en
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    fn.this.N();
                }
            });
        }
        this.h.setThreshold(0);
    }

    public final void Q() {
        if (this.h == null) {
            return;
        }
        if (G()) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        if (s) {
            O(!this.n);
        } else {
            this.n = !this.n;
            r();
        }
        if (!this.n) {
            this.h.dismissDropDown();
            return;
        }
        this.h.requestFocus();
        this.h.showDropDown();
    }

    public final void R() {
        this.m = true;
        this.o = System.currentTimeMillis();
    }

    @Override // androidx.appcompat.view.menu.oo
    public void a(Editable editable) {
        if (this.p.isTouchExplorationEnabled() && ln.a(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new Runnable() { // from class: androidx.appcompat.view.menu.cn
            @Override // java.lang.Runnable
            public final void run() {
                fn.this.H();
            }
        });
    }

    @Override // androidx.appcompat.view.menu.oo
    public int c() {
        return dn0.g;
    }

    @Override // androidx.appcompat.view.menu.oo
    public int d() {
        return s ? lm0.d : lm0.e;
    }

    @Override // androidx.appcompat.view.menu.oo
    public View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.oo
    public View.OnClickListener f() {
        return this.i;
    }

    @Override // androidx.appcompat.view.menu.oo
    public e0.a h() {
        return this.k;
    }

    @Override // androidx.appcompat.view.menu.oo
    public boolean i(int i) {
        return i != 0;
    }

    @Override // androidx.appcompat.view.menu.oo
    public boolean j() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.oo
    public boolean k() {
        return this.l;
    }

    @Override // androidx.appcompat.view.menu.oo
    public boolean l() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.oo
    public boolean m() {
        return this.n;
    }

    @Override // androidx.appcompat.view.menu.oo
    public void n(EditText editText) {
        this.h = D(editText);
        P();
        this.a.setErrorIconDrawable((Drawable) null);
        if (!ln.a(editText) && this.p.isTouchExplorationEnabled()) {
            p51.u0(this.d, 2);
        }
        this.a.setEndIconVisible(true);
    }

    @Override // androidx.appcompat.view.menu.oo
    public void o(View view, p0 p0Var) {
        if (!ln.a(this.h)) {
            p0Var.c0(Spinner.class.getName());
        }
        if (p0Var.P()) {
            p0Var.m0(null);
        }
    }

    @Override // androidx.appcompat.view.menu.oo
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || ln.a(this.h)) {
            return;
        }
        boolean z = accessibilityEvent.getEventType() == 32768 && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            Q();
            R();
        }
    }

    @Override // androidx.appcompat.view.menu.oo
    public void s() {
        F();
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // androidx.appcompat.view.menu.oo
    public boolean t() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.oo
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (s) {
                this.h.setOnDismissListener(null);
            }
        }
    }
}
