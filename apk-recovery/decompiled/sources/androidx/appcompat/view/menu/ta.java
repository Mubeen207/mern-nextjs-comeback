package androidx.appcompat.view.menu;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public abstract class ta extends g implements sa {
    public final sa p;

    public ta(kh khVar, sa saVar, boolean z, boolean z2) {
        super(khVar, z, z2);
        this.p = saVar;
    }

    @Override // androidx.appcompat.view.menu.os0
    public boolean A() {
        return this.p.A();
    }

    @Override // androidx.appcompat.view.menu.e70
    public void L(Throwable th) {
        CancellationException A0 = e70.A0(this, th, null, 1, null);
        this.p.e(A0);
        J(A0);
    }

    public final sa L0() {
        return this.p;
    }

    @Override // androidx.appcompat.view.menu.e70, androidx.appcompat.view.menu.t60
    public final void e(CancellationException cancellationException) {
        if (g0()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new u60(O(), null, this);
        }
        L(cancellationException);
    }

    @Override // androidx.appcompat.view.menu.yn0
    public za iterator() {
        return this.p.iterator();
    }

    @Override // androidx.appcompat.view.menu.os0
    public boolean k(Throwable th) {
        return this.p.k(th);
    }

    @Override // androidx.appcompat.view.menu.os0
    public Object q(Object obj, xg xgVar) {
        return this.p.q(obj, xgVar);
    }

    @Override // androidx.appcompat.view.menu.os0
    public void v(kw kwVar) {
        this.p.v(kwVar);
    }

    @Override // androidx.appcompat.view.menu.os0
    public Object y(Object obj) {
        return this.p.y(obj);
    }
}
