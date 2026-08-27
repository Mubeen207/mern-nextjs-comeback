package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class oc2 {
    public final Messenger a;
    public final hp1 b;

    public oc2(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (hb2.a(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if (!hb2.a(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            throw new RemoteException();
        } else {
            this.b = new hp1(iBinder);
            this.a = null;
        }
    }

    public final void a(Message message) {
        Messenger messenger = this.a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        hp1 hp1Var = this.b;
        if (hp1Var == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        hp1Var.b(message);
    }
}
