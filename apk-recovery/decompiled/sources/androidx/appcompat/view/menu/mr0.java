package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public abstract class mr0 {
    public static int a(Parcel parcel) {
        return r(parcel, 20293);
    }

    public static void b(Parcel parcel, int i) {
        s(parcel, i);
    }

    public static void c(Parcel parcel, int i, boolean z) {
        t(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            t(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            t(parcel, i, 0);
        }
    }

    public static void e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                t(parcel, i, 0);
                return;
            }
            return;
        }
        int r = r(parcel, i);
        parcel.writeBundle(bundle);
        s(parcel, r);
    }

    public static void f(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            t(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            t(parcel, i, 0);
        }
    }

    public static void g(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            t(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            t(parcel, i, 0);
        }
    }

    public static void h(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                t(parcel, i, 0);
                return;
            }
            return;
        }
        int r = r(parcel, i);
        parcel.writeStrongBinder(iBinder);
        s(parcel, r);
    }

    public static void i(Parcel parcel, int i, int i2) {
        t(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void j(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                t(parcel, i, 0);
                return;
            }
            return;
        }
        int r = r(parcel, i);
        parcel.writeIntArray(iArr);
        s(parcel, r);
    }

    public static void k(Parcel parcel, int i, long j) {
        t(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void l(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            t(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            t(parcel, i, 0);
        }
    }

    public static void m(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                t(parcel, i, 0);
                return;
            }
            return;
        }
        int r = r(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        s(parcel, r);
    }

    public static void n(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                t(parcel, i, 0);
                return;
            }
            return;
        }
        int r = r(parcel, i);
        parcel.writeString(str);
        s(parcel, r);
    }

    public static void o(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                t(parcel, i, 0);
                return;
            }
            return;
        }
        int r = r(parcel, i);
        parcel.writeStringList(list);
        s(parcel, r);
    }

    public static void p(Parcel parcel, int i, Parcelable[] parcelableArr, int i2, boolean z) {
        if (parcelableArr == null) {
            if (z) {
                t(parcel, i, 0);
                return;
            }
            return;
        }
        int r = r(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                u(parcel, parcelable, i2);
            }
        }
        s(parcel, r);
    }

    public static void q(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                t(parcel, i, 0);
                return;
            }
            return;
        }
        int r = r(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                u(parcel, parcelable, 0);
            }
        }
        s(parcel, r);
    }

    public static int r(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void s(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void t(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void u(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
