package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class oz0 extends r {
    public static final Parcelable.Creator<oz0> CREATOR = new fb1();
    public final int m;
    public List n;

    public oz0(int i, List list) {
        this.m = i;
        this.n = list;
    }

    public final int d() {
        return this.m;
    }

    public final List f() {
        return this.n;
    }

    public final void i(qd0 qd0Var) {
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(qd0Var);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.i(parcel, 1, this.m);
        mr0.q(parcel, 2, this.n, false);
        mr0.b(parcel, a);
    }
}
