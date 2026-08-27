package androidx.appcompat.view.menu;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class be1 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean b;
    public final AtomicReference c;
    public final Handler d;
    public final dy e;

    public be1(b90 b90Var, dy dyVar) {
        super(b90Var);
        this.c = new AtomicReference(null);
        this.d = new ce1(Looper.getMainLooper());
        this.e = dyVar;
    }

    public static final int p(td1 td1Var) {
        if (td1Var == null) {
            return -1;
        }
        return td1Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i, int i2, Intent intent) {
        td1 td1Var = (td1) this.c.get();
        if (i != 1) {
            if (i == 2) {
                int g = this.e.g(b());
                if (g == 0) {
                    o();
                    return;
                } else if (td1Var == null) {
                    return;
                } else {
                    if (td1Var.b().d() == 18 && g == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            o();
            return;
        } else if (i2 == 0) {
            if (td1Var == null) {
                return;
            }
            l(new ef(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, td1Var.b().toString()), p(td1Var));
            return;
        }
        if (td1Var != null) {
            l(td1Var.b(), td1Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.c.set(bundle.getBoolean("resolving_error", false) ? new td1(new ef(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        td1 td1Var = (td1) this.c.get();
        if (td1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", td1Var.a());
        bundle.putInt("failed_status", td1Var.b().d());
        bundle.putParcelable("failed_resolution", td1Var.b().i());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.b = false;
    }

    public final void l(ef efVar, int i) {
        this.c.set(null);
        m(efVar, i);
    }

    public abstract void m(ef efVar, int i);

    public abstract void n();

    public final void o() {
        this.c.set(null);
        n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new ef(13, null), p((td1) this.c.get()));
    }

    public final void s(ef efVar, int i) {
        td1 td1Var = new td1(efVar, i);
        if (zd1.a(this.c, null, td1Var)) {
            this.d.post(new yd1(this, td1Var));
        }
    }
}
