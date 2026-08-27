package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class ub0<S> extends ei0 {
    public int c0;
    public com.google.android.material.datepicker.a d0;

    /* loaded from: classes.dex */
    public class a extends og0 {
        public a() {
        }
    }

    public static ub0 h1(yi yiVar, int i, com.google.android.material.datepicker.a aVar) {
        ub0 ub0Var = new ub0();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", yiVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        ub0Var.X0(bundle);
        return ub0Var;
    }

    @Override // androidx.appcompat.view.menu.fv
    public void b0(Bundle bundle) {
        super.b0(bundle);
        if (bundle == null) {
            bundle = o();
        }
        this.c0 = bundle.getInt("THEME_RES_ID_KEY");
        my0.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.d0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.appcompat.view.menu.fv
    public View f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(q(), this.c0));
        new a();
        throw null;
    }

    @Override // androidx.appcompat.view.menu.fv
    public void r0(Bundle bundle) {
        super.r0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.c0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d0);
    }
}
