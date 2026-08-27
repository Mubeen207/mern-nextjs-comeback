package androidx.appcompat.view.menu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a50 {
    public ColorStateList A;
    public Typeface B;
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final Context g;
    public final TextInputLayout h;
    public LinearLayout i;
    public int j;
    public FrameLayout k;
    public Animator l;
    public final float m;
    public int n;
    public int o;
    public CharSequence p;
    public boolean q;
    public TextView r;
    public CharSequence s;
    public int t;
    public int u;
    public ColorStateList v;
    public CharSequence w;
    public boolean x;
    public TextView y;
    public int z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ TextView d;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.a = i;
            this.b = textView;
            this.c = i2;
            this.d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a50.this.n = this.a;
            a50.this.l = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && a50.this.r != null) {
                    a50.this.r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
                this.d.setAlpha(0.0f);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = a50.this.h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public a50(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(hm0.e);
        this.a = ce0.f(context, cm0.x, 217);
        this.b = ce0.f(context, cm0.u, 167);
        this.c = ce0.f(context, cm0.x, 167);
        this.d = ce0.g(context, cm0.y, j2.d);
        int i = cm0.y;
        TimeInterpolator timeInterpolator = j2.a;
        this.e = ce0.g(context, i, timeInterpolator);
        this.f = ce0.g(context, cm0.A, timeInterpolator);
    }

    public boolean A() {
        return this.q;
    }

    public boolean B() {
        return this.x;
    }

    public void C(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.i == null) {
            return;
        }
        if (!z(i) || (frameLayout = this.k) == null) {
            this.i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.j - 1;
        this.j = i2;
        O(this.i, i2);
    }

    public final void D(int i, int i2) {
        TextView m;
        TextView m2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m2 = m(i2)) != null) {
            m2.setVisibility(0);
            m2.setAlpha(1.0f);
        }
        if (i != 0 && (m = m(i)) != null) {
            m.setVisibility(4);
            if (i == 1) {
                m.setText((CharSequence) null);
            }
        }
        this.n = i2;
    }

    public void E(int i) {
        this.t = i;
        TextView textView = this.r;
        if (textView != null) {
            p51.m0(textView, i);
        }
    }

    public void F(CharSequence charSequence) {
        this.s = charSequence;
        TextView textView = this.r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void G(boolean z) {
        if (this.q == z) {
            return;
        }
        h();
        if (z) {
            l3 l3Var = new l3(this.g);
            this.r = l3Var;
            l3Var.setId(vm0.I);
            this.r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.r.setTypeface(typeface);
            }
            H(this.u);
            I(this.v);
            F(this.s);
            E(this.t);
            this.r.setVisibility(4);
            e(this.r, 0);
        } else {
            w();
            C(this.r, 0);
            this.r = null;
            this.h.p0();
            this.h.A0();
        }
        this.q = z;
    }

    public void H(int i) {
        this.u = i;
        TextView textView = this.r;
        if (textView != null) {
            this.h.c0(textView, i);
        }
    }

    public void I(ColorStateList colorStateList) {
        this.v = colorStateList;
        TextView textView = this.r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void J(int i) {
        this.z = i;
        TextView textView = this.y;
        if (textView != null) {
            f01.n(textView, i);
        }
    }

    public void K(boolean z) {
        if (this.x == z) {
            return;
        }
        h();
        if (z) {
            l3 l3Var = new l3(this.g);
            this.y = l3Var;
            l3Var.setId(vm0.J);
            this.y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.y.setTypeface(typeface);
            }
            this.y.setVisibility(4);
            p51.m0(this.y, 1);
            J(this.z);
            L(this.A);
            e(this.y, 1);
            this.y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.y, 1);
            this.y = null;
            this.h.p0();
            this.h.A0();
        }
        this.x = z;
    }

    public void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.r, typeface);
            M(this.y, typeface);
        }
    }

    public final void O(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean P(TextView textView, CharSequence charSequence) {
        return p51.O(this.h) && this.h.isEnabled() && !(this.o == this.n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public void Q(CharSequence charSequence) {
        h();
        this.p = charSequence;
        this.r.setText(charSequence);
        int i = this.n;
        if (i != 1) {
            this.o = 1;
        }
        S(i, this.o, P(this.r, charSequence));
    }

    public void R(CharSequence charSequence) {
        h();
        this.w = charSequence;
        this.y.setText(charSequence);
        int i = this.n;
        if (i != 2) {
            this.o = 2;
        }
        S(i, this.o, P(this.y, charSequence));
    }

    public final void S(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.l = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.x, this.y, 2, i, i2);
            i(arrayList, this.q, this.r, 1, i, i2);
            k2.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, m(i), i, m(i2)));
            animatorSet.start();
        } else {
            D(i, i2);
        }
        this.h.p0();
        this.h.u0(z);
        this.h.A0();
    }

    public void e(TextView textView, int i) {
        if (this.i == null && this.k == null) {
            LinearLayout linearLayout = new LinearLayout(this.g);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            this.h.addView(this.i, -1, -2);
            this.k = new FrameLayout(this.g);
            this.i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.h.getEditText() != null) {
                f();
            }
        }
        if (z(i)) {
            this.k.setVisibility(0);
            this.k.addView(textView);
        } else {
            this.i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.h.getEditText();
            boolean f = qb0.f(this.g);
            p51.z0(this.i, v(f, hm0.A, p51.C(editText)), v(f, hm0.B, this.g.getResources().getDimensionPixelSize(hm0.z)), v(f, hm0.A, p51.B(editText)), 0);
        }
    }

    public final boolean g() {
        return (this.i == null || this.h.getEditText() == null) ? false : true;
    }

    public void h() {
        Animator animator = this.l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void i(List list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator j = j(textView, i3 == i);
            if (i == i3 && i2 != 0) {
                j.setStartDelay(this.c);
            }
            list.add(j);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator k = k(textView);
            k.setStartDelay(this.c);
            list.add(k);
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(z ? this.b : this.c);
        ofFloat.setInterpolator(z ? this.e : this.f);
        return ofFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.m, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(this.d);
        return ofFloat;
    }

    public boolean l() {
        return y(this.o);
    }

    public final TextView m(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.y;
        }
        return this.r;
    }

    public int n() {
        return this.t;
    }

    public CharSequence o() {
        return this.s;
    }

    public CharSequence p() {
        return this.p;
    }

    public int q() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList r() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence s() {
        return this.w;
    }

    public View t() {
        return this.y;
    }

    public int u() {
        TextView textView = this.y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int v(boolean z, int i, int i2) {
        return z ? this.g.getResources().getDimensionPixelSize(i) : i2;
    }

    public void w() {
        this.p = null;
        h();
        if (this.n == 1) {
            if (!this.x || TextUtils.isEmpty(this.w)) {
                this.o = 0;
            } else {
                this.o = 2;
            }
        }
        S(this.n, this.o, P(this.r, ""));
    }

    public void x() {
        h();
        int i = this.n;
        if (i == 2) {
            this.o = 0;
        }
        S(i, this.o, P(this.y, ""));
    }

    public final boolean y(int i) {
        return (i != 1 || this.r == null || TextUtils.isEmpty(this.p)) ? false : true;
    }

    public boolean z(int i) {
        return i == 0 || i == 1;
    }
}
