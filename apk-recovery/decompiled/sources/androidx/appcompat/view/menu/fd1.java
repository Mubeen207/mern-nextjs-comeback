package androidx.appcompat.view.menu;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class fd1 extends ec1 {
    public final dz0 b;
    public final ez0 c;
    public final ex0 d;

    public fd1(int i, dz0 dz0Var, ez0 ez0Var, ex0 ex0Var) {
        super(i);
        this.c = ez0Var;
        this.b = dz0Var;
        this.d = ex0Var;
        if (i == 2 && dz0Var.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // androidx.appcompat.view.menu.md1
    public final void a(Status status) {
        this.c.d(this.d.a(status));
    }

    @Override // androidx.appcompat.view.menu.md1
    public final void b(Exception exc) {
        this.c.d(exc);
    }

    @Override // androidx.appcompat.view.menu.md1
    public final void c(wb1 wb1Var) {
        try {
            this.b.b(wb1Var.u(), this.c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(md1.e(e2));
        } catch (RuntimeException e3) {
            this.c.d(e3);
        }
    }

    @Override // androidx.appcompat.view.menu.md1
    public final void d(jb1 jb1Var, boolean z) {
        jb1Var.b(this.c, z);
    }

    @Override // androidx.appcompat.view.menu.ec1
    public final boolean f(wb1 wb1Var) {
        return this.b.c();
    }

    @Override // androidx.appcompat.view.menu.ec1
    public final mr[] g(wb1 wb1Var) {
        return this.b.e();
    }
}
