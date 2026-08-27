package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Parcel;
import androidx.appcompat.view.menu.g20;
/* loaded from: classes.dex */
public final class rd2 extends ve1 {
    public rd2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int k() {
        Parcel h = h(6, j());
        int readInt = h.readInt();
        h.recycle();
        return readInt;
    }

    public final int u2(g20 g20Var, String str, boolean z) {
        Parcel j = j();
        rk1.e(j, g20Var);
        j.writeString(str);
        rk1.c(j, z);
        Parcel h = h(3, j);
        int readInt = h.readInt();
        h.recycle();
        return readInt;
    }

    public final int v2(g20 g20Var, String str, boolean z) {
        Parcel j = j();
        rk1.e(j, g20Var);
        j.writeString(str);
        rk1.c(j, z);
        Parcel h = h(5, j);
        int readInt = h.readInt();
        h.recycle();
        return readInt;
    }

    public final g20 w2(g20 g20Var, String str, int i) {
        Parcel j = j();
        rk1.e(j, g20Var);
        j.writeString(str);
        j.writeInt(i);
        Parcel h = h(2, j);
        g20 asInterface = g20.a.asInterface(h.readStrongBinder());
        h.recycle();
        return asInterface;
    }

    public final g20 x2(g20 g20Var, String str, int i, g20 g20Var2) {
        Parcel j = j();
        rk1.e(j, g20Var);
        j.writeString(str);
        j.writeInt(i);
        rk1.e(j, g20Var2);
        Parcel h = h(8, j);
        g20 asInterface = g20.a.asInterface(h.readStrongBinder());
        h.recycle();
        return asInterface;
    }

    public final g20 y2(g20 g20Var, String str, int i) {
        Parcel j = j();
        rk1.e(j, g20Var);
        j.writeString(str);
        j.writeInt(i);
        Parcel h = h(4, j);
        g20 asInterface = g20.a.asInterface(h.readStrongBinder());
        h.recycle();
        return asInterface;
    }

    public final g20 z2(g20 g20Var, String str, boolean z, long j) {
        Parcel j2 = j();
        rk1.e(j2, g20Var);
        j2.writeString(str);
        rk1.c(j2, z);
        j2.writeLong(j);
        Parcel h = h(7, j2);
        g20 asInterface = g20.a.asInterface(h.readStrongBinder());
        h.recycle();
        return asInterface;
    }
}
