package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* loaded from: classes.dex */
public final class mv1 implements ServiceConnection {
    public final String l;
    public final /* synthetic */ ov1 m;

    public mv1(ov1 ov1Var, String str) {
        this.m = ov1Var;
        this.l = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.m.a.l().L().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            ck1 j = xk1.j(iBinder);
            if (j == null) {
                this.m.a.l().L().a("Install Referrer Service implementation was not found");
                return;
            }
            this.m.a.l().K().a("Install Referrer Service connected");
            this.m.a.h().D(new sv1(this, j, this));
        } catch (RuntimeException e) {
            this.m.a.l().L().b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.m.a.l().K().a("Install Referrer Service disconnected");
    }
}
