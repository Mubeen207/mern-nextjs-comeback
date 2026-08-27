package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class m8 implements ServiceConnection {
    public boolean l = false;
    public final BlockingQueue m = new LinkedBlockingQueue();

    public IBinder a(long j, TimeUnit timeUnit) {
        pj0.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.l) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.l = true;
        IBinder iBinder = (IBinder) this.m.poll(j, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.m.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
