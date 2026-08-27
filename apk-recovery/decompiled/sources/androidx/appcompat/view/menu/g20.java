package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public interface g20 extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends nh1 implements g20 {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static g20 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof g20 ? (g20) queryLocalInterface : new bi1(iBinder);
        }
    }
}
