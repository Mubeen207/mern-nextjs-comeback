package androidx.appcompat.view.menu;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class bt0 extends IServiceConnection.Stub {
    public static final Map n = new HashMap();
    public final IServiceConnection l;
    public final ComponentName m;

    /* loaded from: classes.dex */
    public class a implements IBinder.DeathRecipient {
        public final /* synthetic */ IBinder l;

        public a(IBinder iBinder) {
            this.l = iBinder;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            bt0.n.remove(this.l);
            this.l.unlinkToDeath(this, 0);
        }
    }

    public bt0(IServiceConnection iServiceConnection, ComponentName componentName) {
        this.l = iServiceConnection;
        this.m = componentName;
    }

    public static IServiceConnection k(IServiceConnection iServiceConnection, Intent intent) {
        IBinder asBinder = iServiceConnection.asBinder();
        bt0 bt0Var = (bt0) n.get(asBinder);
        if (bt0Var == null) {
            try {
                asBinder.linkToDeath(new a(asBinder), 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            bt0 bt0Var2 = new bt0(iServiceConnection, intent.getComponent());
            n.put(asBinder, bt0Var2);
            return bt0Var2;
        }
        return bt0Var;
    }

    public static bt0 u2(IBinder iBinder) {
        return (bt0) n.get(iBinder);
    }

    @Override // android.app.IServiceConnection
    public void connected(ComponentName componentName, IBinder iBinder) {
        j(componentName, iBinder, false);
    }

    public void j(ComponentName componentName, IBinder iBinder, boolean z) {
        if (y8.d()) {
            z20.b.b(this.l, this.m, iBinder, Boolean.valueOf(z));
        } else {
            this.l.connected(componentName, iBinder);
        }
    }
}
