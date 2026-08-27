package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.b91;
import androidx.appcompat.view.menu.cm0;
import androidx.appcompat.view.menu.cw;
import androidx.appcompat.view.menu.dg0;
import androidx.appcompat.view.menu.dn0;
import androidx.appcompat.view.menu.ei0;
import androidx.appcompat.view.menu.h50;
import androidx.appcompat.view.menu.hm0;
import androidx.appcompat.view.menu.hn0;
import androidx.appcompat.view.menu.i3;
import androidx.appcompat.view.menu.jb0;
import androidx.appcompat.view.menu.jn;
import androidx.appcompat.view.menu.lm0;
import androidx.appcompat.view.menu.my0;
import androidx.appcompat.view.menu.og0;
import androidx.appcompat.view.menu.on0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.p61;
import androidx.appcompat.view.menu.rb0;
import androidx.appcompat.view.menu.ub0;
import androidx.appcompat.view.menu.ul;
import androidx.appcompat.view.menu.vm0;
import androidx.appcompat.view.menu.wd0;
import androidx.appcompat.view.menu.yi;
import androidx.appcompat.view.menu.ym0;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class d<S> extends ul {
    public static final Object T0 = "CONFIRM_BUTTON_TAG";
    public static final Object U0 = "CANCEL_BUTTON_TAG";
    public static final Object V0 = "TOGGLE_BUTTON_TAG";
    public CharSequence A0;
    public boolean B0;
    public int C0;
    public int D0;
    public CharSequence E0;
    public int F0;
    public CharSequence G0;
    public int H0;
    public CharSequence I0;
    public int J0;
    public CharSequence K0;
    public TextView L0;
    public TextView M0;
    public CheckableImageButton N0;
    public rb0 O0;
    public Button P0;
    public boolean Q0;
    public CharSequence R0;
    public CharSequence S0;
    public final LinkedHashSet r0 = new LinkedHashSet();
    public final LinkedHashSet s0 = new LinkedHashSet();
    public final LinkedHashSet t0 = new LinkedHashSet();
    public final LinkedHashSet u0 = new LinkedHashSet();
    public int v0;
    public ei0 w0;
    public com.google.android.material.datepicker.a x0;
    public c y0;
    public int z0;

    /* loaded from: classes.dex */
    public class a implements dg0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public a(int i, View view, int i2) {
            this.a = i;
            this.b = view;
            this.c = i2;
        }

        @Override // androidx.appcompat.view.menu.dg0
        public b91 a(View view, b91 b91Var) {
            int i = b91Var.f(b91.m.h()).b;
            if (this.a >= 0) {
                this.b.getLayoutParams().height = this.a + i;
                View view2 = this.b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.b;
            view3.setPadding(view3.getPaddingLeft(), this.c + i, this.b.getPaddingRight(), this.b.getPaddingBottom());
            return b91Var;
        }
    }

    /* loaded from: classes.dex */
    public class b extends og0 {
        public b() {
        }
    }

    public static boolean B1(Context context) {
        return F1(context, 16843277);
    }

    public static boolean D1(Context context) {
        return F1(context, cm0.C);
    }

    public static boolean F1(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(jb0.d(context, cm0.p, c.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public static Drawable s1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, i3.b(context, lm0.b));
        stateListDrawable.addState(new int[0], i3.b(context, lm0.c));
        return stateListDrawable;
    }

    private yi u1() {
        my0.a(o().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    public static CharSequence v1(CharSequence charSequence) {
        if (charSequence != null) {
            String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            return split.length > 1 ? split[0] : charSequence;
        }
        return null;
    }

    public static int y1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(hm0.G);
        int i = wd0.j().p;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(hm0.I) * i) + ((i - 1) * resources.getDimensionPixelOffset(hm0.L));
    }

    public final void A1(Context context) {
        this.N0.setTag(V0);
        this.N0.setImageDrawable(s1(context));
        this.N0.setChecked(this.C0 != 0);
        p51.k0(this.N0, null);
        J1(this.N0);
        this.N0.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.view.menu.pb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.google.android.material.datepicker.d.this.E1(view);
            }
        });
    }

    public final boolean C1() {
        return I().getConfiguration().orientation == 2;
    }

    public final /* synthetic */ void E1(View view) {
        u1();
        throw null;
    }

    public final void G1() {
        int z1 = z1(R0());
        u1();
        c v1 = c.v1(null, z1, this.x0, null);
        this.y0 = v1;
        ei0 ei0Var = v1;
        if (this.C0 == 1) {
            u1();
            ei0Var = ub0.h1(null, z1, this.x0);
        }
        this.w0 = ei0Var;
        I1();
        H1(x1());
        cw l = p().l();
        l.l(vm0.v, this.w0);
        l.g();
        this.w0.f1(new b());
    }

    public void H1(String str) {
        this.M0.setContentDescription(w1());
        this.M0.setText(str);
    }

    public final void I1() {
        this.L0.setText((this.C0 == 1 && C1()) ? this.S0 : this.R0);
    }

    public final void J1(CheckableImageButton checkableImageButton) {
        this.N0.setContentDescription(this.C0 == 1 ? checkableImageButton.getContext().getString(dn0.o) : checkableImageButton.getContext().getString(dn0.q));
    }

    @Override // androidx.appcompat.view.menu.ul, androidx.appcompat.view.menu.fv
    public final void b0(Bundle bundle) {
        super.b0(bundle);
        if (bundle == null) {
            bundle = o();
        }
        this.v0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        my0.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.x0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        my0.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.z0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.A0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.C0 = bundle.getInt("INPUT_MODE_KEY");
        this.D0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.E0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.F0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.G0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.H0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.I0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.J0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.K0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.A0;
        if (charSequence == null) {
            charSequence = R0().getResources().getText(this.z0);
        }
        this.R0 = charSequence;
        this.S0 = v1(charSequence);
    }

    @Override // androidx.appcompat.view.menu.fv
    public final View f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.B0 ? ym0.q : ym0.p, viewGroup);
        Context context = inflate.getContext();
        if (this.B0) {
            inflate.findViewById(vm0.v).setLayoutParams(new LinearLayout.LayoutParams(y1(context), -2));
        } else {
            inflate.findViewById(vm0.w).setLayoutParams(new LinearLayout.LayoutParams(y1(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(vm0.z);
        this.M0 = textView;
        p51.m0(textView, 1);
        this.N0 = (CheckableImageButton) inflate.findViewById(vm0.A);
        this.L0 = (TextView) inflate.findViewById(vm0.B);
        A1(context);
        this.P0 = (Button) inflate.findViewById(vm0.c);
        u1();
        throw null;
    }

    @Override // androidx.appcompat.view.menu.ul
    public final Dialog l1(Bundle bundle) {
        Dialog dialog = new Dialog(R0(), z1(R0()));
        Context context = dialog.getContext();
        this.B0 = B1(context);
        this.O0 = new rb0(context, null, cm0.p, hn0.j);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, on0.t2, cm0.p, hn0.j);
        int color = obtainStyledAttributes.getColor(on0.u2, 0);
        obtainStyledAttributes.recycle();
        this.O0.J(context);
        this.O0.T(ColorStateList.valueOf(color));
        this.O0.S(p51.s(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.appcompat.view.menu.ul, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.appcompat.view.menu.ul, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) P();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.appcompat.view.menu.ul, androidx.appcompat.view.menu.fv
    public final void r0(Bundle bundle) {
        super.r0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.v0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.b bVar = new a.b(this.x0);
        c cVar = this.y0;
        wd0 q1 = cVar == null ? null : cVar.q1();
        if (q1 != null) {
            bVar.b(q1.r);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.z0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.A0);
        bundle.putInt("INPUT_MODE_KEY", this.C0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.D0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.E0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.F0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.G0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.H0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.I0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.J0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.K0);
    }

    @Override // androidx.appcompat.view.menu.ul, androidx.appcompat.view.menu.fv
    public void s0() {
        super.s0();
        Window window = p1().getWindow();
        if (this.B0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.O0);
            t1(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = I().getDimensionPixelOffset(hm0.K);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.O0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new h50(p1(), rect));
        }
        G1();
    }

    @Override // androidx.appcompat.view.menu.ul, androidx.appcompat.view.menu.fv
    public void t0() {
        this.w0.g1();
        super.t0();
    }

    public final void t1(Window window) {
        if (this.Q0) {
            return;
        }
        View findViewById = S0().findViewById(vm0.f);
        jn.a(window, true, p61.d(findViewById), null);
        p51.y0(findViewById, new a(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.Q0 = true;
    }

    public final String w1() {
        u1();
        R0();
        throw null;
    }

    public String x1() {
        u1();
        q();
        throw null;
    }

    public final int z1(Context context) {
        int i = this.v0;
        if (i != 0) {
            return i;
        }
        u1();
        throw null;
    }
}
