package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Parcel;
import androidx.appcompat.view.menu.g20;
/* loaded from: classes.dex */
public final class me2 extends ve1 {
    public me2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final g20 k(g20 g20Var, String str, int i, g20 g20Var2) {
        Parcel j = j();
        rk1.e(j, g20Var);
        j.writeString(str);
        j.writeInt(i);
        rk1.e(j, g20Var2);
        Parcel h = h(2, j);
        g20 asInterface = g20.a.asInterface(h.readStrongBinder());
        h.recycle();
        return asInterface;
    }

    public final g20 u2(g20 g20Var, String str, int i, g20 g20Var2) {
        Parcel j = j();
        rk1.e(j, g20Var);
        j.writeString(str);
        j.writeInt(i);
        rk1.e(j, g20Var2);
        Parcel h = h(3, j);
        g20 asInterface = g20.a.asInterface(h.readStrongBinder());
        h.recycle();
        return asInterface;
    }
}
