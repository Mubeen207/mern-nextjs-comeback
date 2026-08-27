package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class hp1 implements Parcelable {
    public static final Parcelable.Creator<hp1> CREATOR = new kk1();
    public Messenger m;

    public hp1(IBinder iBinder) {
        this.m = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.m;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void b(Message message) {
        Messenger messenger = this.m;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((hp1) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.m;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
