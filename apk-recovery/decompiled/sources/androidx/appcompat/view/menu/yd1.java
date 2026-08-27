package androidx.appcompat.view.menu;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
/* loaded from: classes.dex */
public final class yd1 implements Runnable {
    public final td1 m;
    public final /* synthetic */ be1 n;

    public yd1(be1 be1Var, td1 td1Var) {
        this.n = be1Var;
        this.m = td1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.n.b) {
            ef b = this.m.b();
            if (b.k()) {
                be1 be1Var = this.n;
                be1Var.a.startActivityForResult(GoogleApiActivity.a(be1Var.b(), (PendingIntent) pj0.i(b.i()), this.m.a(), false), 1);
                return;
            }
            be1 be1Var2 = this.n;
            if (be1Var2.e.b(be1Var2.b(), b.d(), null) != null) {
                be1 be1Var3 = this.n;
                be1Var3.e.v(be1Var3.b(), this.n.a, b.d(), 2, this.n);
            } else if (b.d() != 18) {
                this.n.l(b, this.m.a());
            } else {
                be1 be1Var4 = this.n;
                Dialog q = be1Var4.e.q(be1Var4.b(), this.n);
                be1 be1Var5 = this.n;
                be1Var5.e.r(be1Var5.b().getApplicationContext(), new wd1(this, q));
            }
        }
    }
}
