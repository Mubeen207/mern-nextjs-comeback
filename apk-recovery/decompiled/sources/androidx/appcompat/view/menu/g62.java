package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.appcompat.view.menu.z7;
/* loaded from: classes.dex */
public final class g62 implements ServiceConnection, z7.a, z7.b {
    public volatile boolean l;
    public volatile tt1 m;
    public final /* synthetic */ k42 n;

    public g62(k42 k42Var) {
        this.n = k42Var;
    }

    public final void a() {
        this.n.n();
        Context a = this.n.a();
        synchronized (this) {
            try {
                if (this.l) {
                    this.n.l().K().a("Connection attempt already in progress");
                } else if (this.m != null && (this.m.f() || this.m.a())) {
                    this.n.l().K().a("Already awaiting connection attempt");
                } else {
                    this.m = new tt1(a, Looper.getMainLooper(), this, this);
                    this.n.l().K().a("Connecting to remote service");
                    this.l = true;
                    pj0.i(this.m);
                    this.m.q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Intent intent) {
        g62 g62Var;
        this.n.n();
        Context a = this.n.a();
        hf b = hf.b();
        synchronized (this) {
            try {
                if (this.l) {
                    this.n.l().K().a("Connection attempt already in progress");
                    return;
                }
                this.n.l().K().a("Using local app measurement service");
                this.l = true;
                g62Var = this.n.c;
                b.a(a, intent, g62Var, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.m != null && (this.m.a() || this.m.f())) {
            this.m.n();
        }
        this.m = null;
    }

    @Override // androidx.appcompat.view.menu.z7.a
    public final void h(int i) {
        pj0.d("MeasurementServiceConnection.onConnectionSuspended");
        this.n.l().F().a("Service connection suspended");
        this.n.h().D(new o62(this));
    }

    @Override // androidx.appcompat.view.menu.z7.b
    public final void j(ef efVar) {
        pj0.d("MeasurementServiceConnection.onConnectionFailed");
        st1 E = this.n.a.E();
        if (E != null) {
            E.L().b("Service connection failed", efVar);
        }
        synchronized (this) {
            this.l = false;
            this.m = null;
        }
        this.n.h().D(new m62(this));
    }

    @Override // androidx.appcompat.view.menu.z7.a
    public final void k(Bundle bundle) {
        pj0.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                pj0.i(this.m);
                this.n.h().D(new i62(this, (at1) this.m.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.m = null;
                this.l = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        g62 g62Var;
        pj0.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.l = false;
                this.n.l().G().a("Service connected with null binder");
                return;
            }
            at1 at1Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    at1Var = queryLocalInterface instanceof at1 ? (at1) queryLocalInterface : new et1(iBinder);
                    this.n.l().K().a("Bound to IMeasurementService interface");
                } else {
                    this.n.l().G().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.n.l().G().a("Service connect failed to get IMeasurementService");
            }
            if (at1Var == null) {
                this.l = false;
                try {
                    hf b = hf.b();
                    Context a = this.n.a();
                    g62Var = this.n.c;
                    b.c(a, g62Var);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.n.h().D(new e62(this, at1Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        pj0.d("MeasurementServiceConnection.onServiceDisconnected");
        this.n.l().F().a("Service disconnected");
        this.n.h().D(new k62(this, componentName));
    }
}
