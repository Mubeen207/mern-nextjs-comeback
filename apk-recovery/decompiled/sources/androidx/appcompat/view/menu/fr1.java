package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.appcompat.view.menu.z7;
/* loaded from: classes.dex */
public final class fr1 extends pe1 {
    public final IBinder g;
    public final /* synthetic */ z7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr1(z7 z7Var, int i, IBinder iBinder, Bundle bundle) {
        super(z7Var, i, bundle);
        this.h = z7Var;
        this.g = iBinder;
    }

    @Override // androidx.appcompat.view.menu.pe1
    public final void f(ef efVar) {
        if (this.h.G != null) {
            this.h.G.j(efVar);
        }
        this.h.L(efVar);
    }

    @Override // androidx.appcompat.view.menu.pe1
    public final boolean g() {
        z7.a aVar;
        z7.a aVar2;
        try {
            IBinder iBinder = this.g;
            pj0.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.E().equals(interfaceDescriptor)) {
                String E = this.h.E();
                StringBuilder sb = new StringBuilder();
                sb.append("service descriptor mismatch: ");
                sb.append(E);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                return false;
            }
            IInterface s = this.h.s(this.g);
            if (s != null) {
                if (z7.g0(this.h, 2, 4, s) || z7.g0(this.h, 3, 4, s)) {
                    this.h.K = null;
                    Bundle x = this.h.x();
                    z7 z7Var = this.h;
                    aVar = z7Var.F;
                    if (aVar != null) {
                        aVar2 = z7Var.F;
                        aVar2.k(x);
                    }
                    return true;
                }
                return false;
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
