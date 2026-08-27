package androidx.appcompat.view.menu;

import android.content.IIntentReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class d50 extends IIntentReceiver.Stub {
    public static final Map m = new HashMap();
    public final WeakReference l;

    /* loaded from: classes.dex */
    public class a implements IBinder.DeathRecipient {
        public final /* synthetic */ IBinder l;

        public a(IBinder iBinder) {
            this.l = iBinder;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            d50.m.remove(this.l);
            this.l.unlinkToDeath(this, 0);
        }
    }

    public d50(IIntentReceiver iIntentReceiver) {
        this.l = new WeakReference(iIntentReceiver);
    }

    public static IIntentReceiver j(IIntentReceiver iIntentReceiver) {
        if (iIntentReceiver instanceof d50) {
            return iIntentReceiver;
        }
        IBinder asBinder = iIntentReceiver.asBinder();
        d50 d50Var = (d50) m.get(asBinder);
        if (d50Var == null) {
            try {
                asBinder.linkToDeath(new a(asBinder), 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            d50 d50Var2 = new d50(iIntentReceiver);
            m.put(asBinder, d50Var2);
            return d50Var2;
        }
        return d50Var;
    }

    @Override // android.content.IIntentReceiver
    public void performReceive(Intent intent, int i, String str, Bundle bundle, boolean z, boolean z2, int i2) {
        intent.setExtrasClassLoader(mv0.H2().getClassLoader());
        ml0 a2 = ml0.a(intent);
        Intent intent2 = a2.a;
        if (intent2 != null) {
            intent2.setExtrasClassLoader(mv0.H2().getClassLoader());
            intent = a2.a;
        }
        Intent intent3 = intent;
        IIntentReceiver iIntentReceiver = (IIntentReceiver) this.l.get();
        if (iIntentReceiver != null) {
            p10.b.b(iIntentReceiver, intent3, Integer.valueOf(i), str, bundle, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2));
        }
    }
}
