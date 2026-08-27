package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.io.FileDescriptor;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class j8 extends ob implements IBinder {
    public final IBinder p;

    public j8(IBinder iBinder) {
        this.p = iBinder;
    }

    @Override // android.os.IBinder
    public void dump(FileDescriptor fileDescriptor, String[] strArr) {
        this.p.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
        this.p.dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public String getInterfaceDescriptor() {
        return this.p.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public boolean isBinderAlive() {
        return this.p.isBinderAlive();
    }

    @Override // androidx.appcompat.view.menu.ob
    public void j() {
    }

    public void l(String str) {
        Map map = (Map) et0.b.b();
        for (String str2 : map.keySet()) {
        }
        map.put(str, this);
    }

    @Override // android.os.IBinder
    public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.p.linkToDeath(deathRecipient, i);
    }

    @Override // android.os.IBinder
    public boolean pingBinder() {
        return this.p.pingBinder();
    }

    @Override // android.os.IBinder
    public IInterface queryLocalInterface(String str) {
        return (IInterface) g();
    }

    @Override // android.os.IBinder
    public boolean transact(int i, Parcel parcel, Parcel parcel2, int i2) {
        return this.p.transact(i, parcel, parcel2, i2);
    }

    @Override // android.os.IBinder
    public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        return this.p.unlinkToDeath(deathRecipient, i);
    }
}
