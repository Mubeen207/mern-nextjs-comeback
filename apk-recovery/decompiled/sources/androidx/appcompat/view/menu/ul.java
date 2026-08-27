package androidx.appcompat.view.menu;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
/* loaded from: classes.dex */
public class ul extends fv implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler b0;
    public boolean k0;
    public Dialog m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public Runnable c0 = new a();
    public DialogInterface.OnCancelListener d0 = new b();
    public DialogInterface.OnDismissListener e0 = new c();
    public int f0 = 0;
    public int g0 = 0;
    public boolean h0 = true;
    public boolean i0 = true;
    public int j0 = -1;
    public cg0 l0 = new d();
    public boolean q0 = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ul.this.e0.onDismiss(ul.this.m0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (ul.this.m0 != null) {
                ul ulVar = ul.this;
                ulVar.onCancel(ulVar.m0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (ul.this.m0 != null) {
                ul ulVar = ul.this;
                ulVar.onDismiss(ulVar.m0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements cg0 {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.cg0
        /* renamed from: b */
        public void a(d90 d90Var) {
            if (d90Var == null || !ul.this.i0) {
                return;
            }
            View S0 = ul.this.S0();
            if (S0.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (ul.this.m0 != null) {
                if (rv.v0(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DialogFragment ");
                    sb.append(this);
                    sb.append(" setting the content view on ");
                    sb.append(ul.this.m0);
                }
                ul.this.m0.setContentView(S0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends iv {
        public final /* synthetic */ iv a;

        public e(iv ivVar) {
            this.a = ivVar;
        }

        @Override // androidx.appcompat.view.menu.iv
        public View a(int i) {
            return this.a.b() ? this.a.a(i) : ul.this.m1(i);
        }

        @Override // androidx.appcompat.view.menu.iv
        public boolean b() {
            return this.a.b() || ul.this.n1();
        }
    }

    @Override // androidx.appcompat.view.menu.fv
    public void B0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B0(layoutInflater, viewGroup, bundle);
        if (this.H != null || this.m0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.m0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.appcompat.view.menu.fv
    public void a0(Bundle bundle) {
        super.a0(bundle);
    }

    @Override // androidx.appcompat.view.menu.fv
    public void b0(Bundle bundle) {
        super.b0(bundle);
        this.b0 = new Handler();
        this.i0 = this.x == 0;
        if (bundle != null) {
            this.f0 = bundle.getInt("android:style", 0);
            this.g0 = bundle.getInt("android:theme", 0);
            this.h0 = bundle.getBoolean("android:cancelable", true);
            this.i0 = bundle.getBoolean("android:showsDialog", this.i0);
            this.j0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.appcompat.view.menu.fv
    public iv g() {
        return new e(super.g());
    }

    @Override // androidx.appcompat.view.menu.fv
    public void h0() {
        super.h0();
        Dialog dialog = this.m0;
        if (dialog != null) {
            this.n0 = true;
            dialog.setOnDismissListener(null);
            this.m0.dismiss();
            if (!this.o0) {
                onDismiss(this.m0);
            }
            this.m0 = null;
            this.q0 = false;
        }
    }

    @Override // androidx.appcompat.view.menu.fv
    public void i0() {
        super.i0();
        if (!this.p0 && !this.o0) {
            this.o0 = true;
        }
        Q().d(this.l0);
    }

    public final void i1(boolean z, boolean z2, boolean z3) {
        if (this.o0) {
            return;
        }
        this.o0 = true;
        this.p0 = false;
        Dialog dialog = this.m0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.m0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.b0.getLooper()) {
                    onDismiss(this.m0);
                } else {
                    this.b0.post(this.c0);
                }
            }
        }
        this.n0 = true;
        if (this.j0 >= 0) {
            if (z3) {
                C().N0(this.j0, 1);
            } else {
                C().L0(this.j0, 1, z);
            }
            this.j0 = -1;
            return;
        }
        cw l = C().l();
        l.n(true);
        l.k(this);
        if (z3) {
            l.g();
        } else if (z) {
            l.f();
        } else {
            l.e();
        }
    }

    @Override // androidx.appcompat.view.menu.fv
    public LayoutInflater j0(Bundle bundle) {
        LayoutInflater j0 = super.j0(bundle);
        if (this.i0 && !this.k0) {
            o1(bundle);
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("get layout inflater for DialogFragment ");
                sb.append(this);
                sb.append(" from dialog context");
            }
            Dialog dialog = this.m0;
            return dialog != null ? j0.cloneInContext(dialog.getContext()) : j0;
        }
        if (rv.v0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.i0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mCreatingDialog = true: ");
                sb2.append(str);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("mShowsDialog = false: ");
                sb3.append(str);
            }
        }
        return j0;
    }

    public Dialog j1() {
        return this.m0;
    }

    public int k1() {
        return this.g0;
    }

    public Dialog l1(Bundle bundle) {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new ae(R0(), k1());
    }

    public View m1(int i) {
        Dialog dialog = this.m0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public boolean n1() {
        return this.q0;
    }

    public final void o1(Bundle bundle) {
        if (this.i0 && !this.q0) {
            try {
                this.k0 = true;
                Dialog l1 = l1(bundle);
                this.m0 = l1;
                if (this.i0) {
                    q1(l1, this.f0);
                    Context q = q();
                    if (q instanceof Activity) {
                        this.m0.setOwnerActivity((Activity) q);
                    }
                    this.m0.setCancelable(this.h0);
                    this.m0.setOnCancelListener(this.d0);
                    this.m0.setOnDismissListener(this.e0);
                    this.q0 = true;
                } else {
                    this.m0 = null;
                }
                this.k0 = false;
            } catch (Throwable th) {
                this.k0 = false;
                throw th;
            }
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.n0) {
            return;
        }
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDismiss called for DialogFragment ");
            sb.append(this);
        }
        i1(true, true, false);
    }

    public final Dialog p1() {
        Dialog j1 = j1();
        if (j1 != null) {
            return j1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void q1(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.appcompat.view.menu.fv
    public void r0(Bundle bundle) {
        super.r0(bundle);
        Dialog dialog = this.m0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.g0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.h0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.i0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.j0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.appcompat.view.menu.fv
    public void s0() {
        super.s0();
        Dialog dialog = this.m0;
        if (dialog != null) {
            this.n0 = false;
            dialog.show();
            View decorView = this.m0.getWindow().getDecorView();
            k61.a(decorView, this);
            n61.a(decorView, this);
            m61.a(decorView, this);
        }
    }

    @Override // androidx.appcompat.view.menu.fv
    public void t0() {
        super.t0();
        Dialog dialog = this.m0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.appcompat.view.menu.fv
    public void v0(Bundle bundle) {
        Bundle bundle2;
        super.v0(bundle);
        if (this.m0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.m0.onRestoreInstanceState(bundle2);
    }
}
