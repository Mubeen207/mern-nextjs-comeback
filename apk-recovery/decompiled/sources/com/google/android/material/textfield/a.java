package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.af0;
import androidx.appcompat.view.menu.b11;
import androidx.appcompat.view.menu.dn0;
import androidx.appcompat.view.menu.e0;
import androidx.appcompat.view.menu.f01;
import androidx.appcompat.view.menu.fn;
import androidx.appcompat.view.menu.h01;
import androidx.appcompat.view.menu.hm0;
import androidx.appcompat.view.menu.i3;
import androidx.appcompat.view.menu.i40;
import androidx.appcompat.view.menu.ib0;
import androidx.appcompat.view.menu.ii;
import androidx.appcompat.view.menu.l3;
import androidx.appcompat.view.menu.my0;
import androidx.appcompat.view.menu.om;
import androidx.appcompat.view.menu.on0;
import androidx.appcompat.view.menu.oo;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.p61;
import androidx.appcompat.view.menu.qb0;
import androidx.appcompat.view.menu.th0;
import androidx.appcompat.view.menu.vb;
import androidx.appcompat.view.menu.vm0;
import androidx.appcompat.view.menu.ym0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public class a extends LinearLayout {
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final d h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final TextView q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public e0.a u;
    public final TextWatcher v;
    public final TextInputLayout.f w;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0065a extends h01 {
        public C0065a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a.this.m().a(editable);
        }

        @Override // androidx.appcompat.view.menu.h01, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            a.this.m().b(charSequence, i, i2, i3);
        }
    }

    /* loaded from: classes.dex */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            if (a.this.s == textInputLayout.getEditText()) {
                return;
            }
            if (a.this.s != null) {
                a.this.s.removeTextChangedListener(a.this.v);
                if (a.this.s.getOnFocusChangeListener() == a.this.m().e()) {
                    a.this.s.setOnFocusChangeListener(null);
                }
            }
            a.this.s = textInputLayout.getEditText();
            if (a.this.s != null) {
                a.this.s.addTextChangedListener(a.this.v);
            }
            a.this.m().n(a.this.s);
            a aVar = a.this;
            aVar.h0(aVar.m());
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a.this.M();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final SparseArray a = new SparseArray();
        public final a b;
        public final int c;
        public final int d;

        public d(a aVar, b11 b11Var) {
            this.b = aVar;
            this.c = b11Var.m(on0.r5, 0);
            this.d = b11Var.m(on0.P5, 0);
        }

        public final oo b(int i) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                return new fn(this.b);
                            }
                            throw new IllegalArgumentException("Invalid end icon mode: " + i);
                        }
                        return new vb(this.b);
                    }
                    return new th0(this.b, this.d);
                }
                return new af0(this.b);
            }
            return new ii(this.b);
        }

        public oo c(int i) {
            oo ooVar = (oo) this.a.get(i);
            if (ooVar == null) {
                oo b = b(i);
                this.a.append(i, b);
                return b;
            }
            return ooVar;
        }
    }

    public a(TextInputLayout textInputLayout, b11 b11Var) {
        super(textInputLayout.getContext());
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new C0065a();
        b bVar = new b();
        this.w = bVar;
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i = i(this, from, vm0.G);
        this.c = i;
        CheckableImageButton i2 = i(frameLayout, from, vm0.F);
        this.g = i2;
        this.h = new d(this, b11Var);
        l3 l3Var = new l3(getContext());
        this.q = l3Var;
        C(b11Var);
        B(b11Var);
        D(b11Var);
        frameLayout.addView(i2);
        addView(l3Var);
        addView(frameLayout);
        addView(i);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public boolean A() {
        return this.i != 0;
    }

    public final void B(b11 b11Var) {
        if (!b11Var.q(on0.Q5)) {
            if (b11Var.q(on0.v5)) {
                this.k = qb0.b(getContext(), b11Var, on0.v5);
            }
            if (b11Var.q(on0.w5)) {
                this.l = p61.i(b11Var.j(on0.w5, -1), null);
            }
        }
        if (b11Var.q(on0.t5)) {
            U(b11Var.j(on0.t5, 0));
            if (b11Var.q(on0.q5)) {
                Q(b11Var.o(on0.q5));
            }
            O(b11Var.a(on0.p5, true));
        } else if (b11Var.q(on0.Q5)) {
            if (b11Var.q(on0.R5)) {
                this.k = qb0.b(getContext(), b11Var, on0.R5);
            }
            if (b11Var.q(on0.S5)) {
                this.l = p61.i(b11Var.j(on0.S5, -1), null);
            }
            U(b11Var.a(on0.Q5, false) ? 1 : 0);
            Q(b11Var.o(on0.O5));
        }
        T(b11Var.f(on0.s5, getResources().getDimensionPixelSize(hm0.R)));
        if (b11Var.q(on0.u5)) {
            X(i40.b(b11Var.j(on0.u5, -1)));
        }
    }

    public final void C(b11 b11Var) {
        if (b11Var.q(on0.B5)) {
            this.d = qb0.b(getContext(), b11Var, on0.B5);
        }
        if (b11Var.q(on0.C5)) {
            this.e = p61.i(b11Var.j(on0.C5, -1), null);
        }
        if (b11Var.q(on0.A5)) {
            c0(b11Var.g(on0.A5));
        }
        this.c.setContentDescription(getResources().getText(dn0.f));
        p51.u0(this.c, 2);
        this.c.setClickable(false);
        this.c.setPressable(false);
        this.c.setFocusable(false);
    }

    public final void D(b11 b11Var) {
        this.q.setVisibility(8);
        this.q.setId(vm0.M);
        this.q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        p51.m0(this.q, 1);
        q0(b11Var.m(on0.h6, 0));
        if (b11Var.q(on0.i6)) {
            r0(b11Var.c(on0.i6));
        }
        p0(b11Var.o(on0.g6));
    }

    public boolean E() {
        return A() && this.g.isChecked();
    }

    public boolean F() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    public boolean G() {
        return this.c.getVisibility() == 0;
    }

    public void H(boolean z) {
        this.r = z;
        y0();
    }

    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.a.d0());
        }
    }

    public void J() {
        i40.d(this.a, this.g, this.k);
    }

    public void K() {
        i40.d(this.a, this.c, this.d);
    }

    public void L(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        oo m = m();
        boolean z3 = true;
        if (!m.l() || (isChecked = this.g.isChecked()) == m.m()) {
            z2 = false;
        } else {
            this.g.setChecked(!isChecked);
            z2 = true;
        }
        if (!m.j() || (isActivated = this.g.isActivated()) == m.k()) {
            z3 = z2;
        } else {
            N(!isActivated);
        }
        if (z || z3) {
            J();
        }
    }

    public final void M() {
        AccessibilityManager accessibilityManager;
        e0.a aVar = this.u;
        if (aVar == null || (accessibilityManager = this.t) == null) {
            return;
        }
        e0.b(accessibilityManager, aVar);
    }

    public void N(boolean z) {
        this.g.setActivated(z);
    }

    public void O(boolean z) {
        this.g.setCheckable(z);
    }

    public void P(int i) {
        Q(i != 0 ? getResources().getText(i) : null);
    }

    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.g.setContentDescription(charSequence);
        }
    }

    public void R(int i) {
        S(i != 0 ? i3.b(getContext(), i) : null);
    }

    public void S(Drawable drawable) {
        this.g.setImageDrawable(drawable);
        if (drawable != null) {
            i40.a(this.a, this.g, this.k, this.l);
            J();
        }
    }

    public void T(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != this.m) {
            this.m = i;
            i40.g(this.g, i);
            i40.g(this.c, i);
        }
    }

    public void U(int i) {
        if (this.i == i) {
            return;
        }
        t0(m());
        int i2 = this.i;
        this.i = i;
        j(i2);
        a0(i != 0);
        oo m = m();
        R(t(m));
        P(m.c());
        O(m.l());
        if (!m.i(this.a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        s0(m);
        V(m.f());
        EditText editText = this.s;
        if (editText != null) {
            m.n(editText);
            h0(m);
        }
        i40.a(this.a, this.g, this.k, this.l);
        L(true);
    }

    public void V(View.OnClickListener onClickListener) {
        i40.h(this.g, onClickListener, this.o);
    }

    public void W(View.OnLongClickListener onLongClickListener) {
        this.o = onLongClickListener;
        i40.i(this.g, onLongClickListener);
    }

    public void X(ImageView.ScaleType scaleType) {
        this.n = scaleType;
        i40.j(this.g, scaleType);
        i40.j(this.c, scaleType);
    }

    public void Y(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            i40.a(this.a, this.g, colorStateList, this.l);
        }
    }

    public void Z(PorterDuff.Mode mode) {
        if (this.l != mode) {
            this.l = mode;
            i40.a(this.a, this.g, this.k, mode);
        }
    }

    public void a0(boolean z) {
        if (F() != z) {
            this.g.setVisibility(z ? 0 : 8);
            v0();
            x0();
            this.a.o0();
        }
    }

    public void b0(int i) {
        c0(i != 0 ? i3.b(getContext(), i) : null);
        K();
    }

    public void c0(Drawable drawable) {
        this.c.setImageDrawable(drawable);
        w0();
        i40.a(this.a, this.c, this.d, this.e);
    }

    public void d0(View.OnClickListener onClickListener) {
        i40.h(this.c, onClickListener, this.f);
    }

    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f = onLongClickListener;
        i40.i(this.c, onLongClickListener);
    }

    public void f0(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            i40.a(this.a, this.c, colorStateList, this.e);
        }
    }

    public final void g() {
        if (this.u == null || this.t == null || !p51.N(this)) {
            return;
        }
        e0.a(this.t, this.u);
    }

    public void g0(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            i40.a(this.a, this.c, this.d, mode);
        }
    }

    public void h() {
        this.g.performClick();
        this.g.jumpDrawablesToCurrentState();
    }

    public final void h0(oo ooVar) {
        if (this.s == null) {
            return;
        }
        if (ooVar.e() != null) {
            this.s.setOnFocusChangeListener(ooVar.e());
        }
        if (ooVar.g() != null) {
            this.g.setOnFocusChangeListener(ooVar.g());
        }
    }

    public final CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(ym0.b, viewGroup, false);
        checkableImageButton.setId(i);
        i40.e(checkableImageButton);
        if (qb0.f(getContext())) {
            ib0.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public void i0(int i) {
        j0(i != 0 ? getResources().getText(i) : null);
    }

    public final void j(int i) {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
    }

    public void j0(CharSequence charSequence) {
        this.g.setContentDescription(charSequence);
    }

    public CheckableImageButton k() {
        if (G()) {
            return this.c;
        }
        if (A() && F()) {
            return this.g;
        }
        return null;
    }

    public void k0(int i) {
        l0(i != 0 ? i3.b(getContext(), i) : null);
    }

    public CharSequence l() {
        return this.g.getContentDescription();
    }

    public void l0(Drawable drawable) {
        this.g.setImageDrawable(drawable);
    }

    public oo m() {
        return this.h.c(this.i);
    }

    public void m0(boolean z) {
        if (z && this.i != 1) {
            U(1);
        } else if (z) {
        } else {
            U(0);
        }
    }

    public Drawable n() {
        return this.g.getDrawable();
    }

    public void n0(ColorStateList colorStateList) {
        this.k = colorStateList;
        i40.a(this.a, this.g, colorStateList, this.l);
    }

    public int o() {
        return this.m;
    }

    public void o0(PorterDuff.Mode mode) {
        this.l = mode;
        i40.a(this.a, this.g, this.k, mode);
    }

    public int p() {
        return this.i;
    }

    public void p0(CharSequence charSequence) {
        this.p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.q.setText(charSequence);
        y0();
    }

    public ImageView.ScaleType q() {
        return this.n;
    }

    public void q0(int i) {
        f01.n(this.q, i);
    }

    public CheckableImageButton r() {
        return this.g;
    }

    public void r0(ColorStateList colorStateList) {
        this.q.setTextColor(colorStateList);
    }

    public Drawable s() {
        return this.c.getDrawable();
    }

    public final void s0(oo ooVar) {
        ooVar.s();
        this.u = ooVar.h();
        g();
    }

    public final int t(oo ooVar) {
        int i = this.h.c;
        return i == 0 ? ooVar.d() : i;
    }

    public final void t0(oo ooVar) {
        M();
        this.u = null;
        ooVar.u();
    }

    public CharSequence u() {
        return this.g.getContentDescription();
    }

    public final void u0(boolean z) {
        if (!z || n() == null) {
            i40.a(this.a, this.g, this.k, this.l);
            return;
        }
        Drawable mutate = om.l(n()).mutate();
        om.h(mutate, this.a.getErrorCurrentTextColors());
        this.g.setImageDrawable(mutate);
    }

    public Drawable v() {
        return this.g.getDrawable();
    }

    public final void v0() {
        int i = 8;
        this.b.setVisibility((this.g.getVisibility() != 0 || G()) ? 8 : 0);
        boolean z = (this.p == null || this.r) ? true : false;
        if (F() || G() || !z) {
            i = 0;
        }
        setVisibility(i);
    }

    public CharSequence w() {
        return this.p;
    }

    public final void w0() {
        this.c.setVisibility(s() != null && this.a.N() && this.a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.a.o0();
    }

    public ColorStateList x() {
        return this.q.getTextColors();
    }

    public void x0() {
        if (this.a.d == null) {
            return;
        }
        p51.z0(this.q, getContext().getResources().getDimensionPixelSize(hm0.C), this.a.d.getPaddingTop(), (F() || G()) ? 0 : p51.B(this.a.d), this.a.d.getPaddingBottom());
    }

    public int y() {
        return p51.B(this) + p51.B(this.q) + ((F() || G()) ? this.g.getMeasuredWidth() + ib0.b((ViewGroup.MarginLayoutParams) this.g.getLayoutParams()) : 0);
    }

    public final void y0() {
        int visibility = this.q.getVisibility();
        int i = (this.p == null || this.r) ? 8 : 0;
        if (visibility != i) {
            m().q(i == 0);
        }
        v0();
        this.q.setVisibility(i);
        this.a.o0();
    }

    public TextView z() {
        return this.q;
    }
}
