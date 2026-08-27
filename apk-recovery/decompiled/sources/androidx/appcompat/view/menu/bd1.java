package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class bd1 extends eb1 {
    public bd1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void u2(ld1 ld1Var, yc1 yc1Var) {
        Parcel h = h();
        gc1.b(h, ld1Var);
        gc1.c(h, yc1Var);
        j(12, h);
    }
}
