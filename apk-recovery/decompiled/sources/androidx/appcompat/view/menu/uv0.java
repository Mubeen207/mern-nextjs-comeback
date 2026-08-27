package androidx.appcompat.view.menu;

import android.net.Uri;
import android.os.RemoteException;
import android.os.storage.StorageVolume;
/* loaded from: classes.dex */
public class uv0 extends nv0 {
    public static final uv0 d = new uv0(s00.class);

    public uv0(Class cls) {
        super(cls);
    }

    public static uv0 f() {
        return d;
    }

    @Override // androidx.appcompat.view.menu.nv0
    public String d() {
        return "storage_manager";
    }

    public Uri g(String str) {
        try {
            return ((s00) c()).x0(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public StorageVolume[] h(int i, String str, int i2, int i3) {
        try {
            return ((s00) c()).D0(i, str, i2, i3);
        } catch (RemoteException e) {
            e.printStackTrace();
            return new StorageVolume[0];
        }
    }
}
