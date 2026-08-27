package androidx.appcompat.view.menu;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class wc1 extends ec1 {
    public final ez0 b;

    public wc1(int i, ez0 ez0Var) {
        super(i);
        this.b = ez0Var;
    }

    @Override // androidx.appcompat.view.menu.md1
    public final void a(Status status) {
        this.b.d(new o2(status));
    }

    @Override // androidx.appcompat.view.menu.md1
    public final void b(Exception exc) {
        this.b.d(exc);
    }

    @Override // androidx.appcompat.view.menu.md1
    public final void c(wb1 wb1Var) {
        try {
            h(wb1Var);
        } catch (DeadObjectException e) {
            a(md1.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(md1.e(e2));
        } catch (RuntimeException e3) {
            this.b.d(e3);
        }
    }

    public abstract void h(wb1 wb1Var);
}
