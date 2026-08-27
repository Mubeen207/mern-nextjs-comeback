package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class e52 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        yp0 yp0Var = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            switch (lr0.i(n)) {
                case 1:
                    yp0Var = (yp0) lr0.c(parcel, n, yp0.CREATOR);
                    break;
                case 2:
                    z = lr0.j(parcel, n);
                    break;
                case t02.c.c /* 3 */:
                    z2 = lr0.j(parcel, n);
                    break;
                case 4:
                    iArr = lr0.b(parcel, n);
                    break;
                case t02.c.e /* 5 */:
                    i = lr0.p(parcel, n);
                    break;
                case t02.c.f /* 6 */:
                    iArr2 = lr0.b(parcel, n);
                    break;
                default:
                    lr0.t(parcel, n);
                    break;
            }
        }
        lr0.h(parcel, u);
        return new ff(yp0Var, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ff[i];
    }
}
