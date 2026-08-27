package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class ap1 implements ServiceConnection {
    public final int l;
    public final /* synthetic */ z7 m;

    public ap1(z7 z7Var, int i) {
        this.m = z7Var;
        this.l = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        z7 z7Var = this.m;
        if (iBinder == null) {
            z7.d0(z7Var, 16);
            return;
        }
        obj = z7Var.y;
        synchronized (obj) {
            try {
                z7 z7Var2 = this.m;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                z7Var2.z = (queryLocalInterface == null || !(queryLocalInterface instanceof l10)) ? new ef1(iBinder) : (l10) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.m.e0(0, null, this.l);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.m.y;
        synchronized (obj) {
            this.m.z = null;
        }
        Handler handler = this.m.w;
        handler.sendMessage(handler.obtainMessage(6, this.l, 1));
    }
}
