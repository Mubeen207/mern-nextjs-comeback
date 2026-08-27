package androidx.appcompat.view.menu;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class pk1 {
    public static final ClassLoader a = pk1.class.getClassLoader();

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
