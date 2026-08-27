package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class lr0 {

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.lr0.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int i) {
        int s = s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + s);
        return readBundle;
    }

    public static int[] b(Parcel parcel, int i) {
        int s = s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + s);
        return createIntArray;
    }

    public static Parcelable c(Parcel parcel, int i, Parcelable.Creator creator) {
        int s = s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + s);
        return parcelable;
    }

    public static String d(Parcel parcel, int i) {
        int s = s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + s);
        return readString;
    }

    public static ArrayList e(Parcel parcel, int i) {
        int s = s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + s);
        return createStringArrayList;
    }

    public static Object[] f(Parcel parcel, int i, Parcelable.Creator creator) {
        int s = s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + s);
        return createTypedArray;
    }

    public static ArrayList g(Parcel parcel, int i, Parcelable.Creator creator) {
        int s = s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + s);
        return createTypedArrayList;
    }

    public static void h(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new a("Overread allowed size end=" + i, parcel);
    }

    public static int i(int i) {
        return (char) i;
    }

    public static boolean j(Parcel parcel, int i) {
        w(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean k(Parcel parcel, int i) {
        int s = s(parcel, i);
        if (s == 0) {
            return null;
        }
        v(parcel, i, s, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double l(Parcel parcel, int i) {
        int s = s(parcel, i);
        if (s == 0) {
            return null;
        }
        v(parcel, i, s, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Float m(Parcel parcel, int i) {
        int s = s(parcel, i);
        if (s == 0) {
            return null;
        }
        v(parcel, i, s, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int n(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder o(Parcel parcel, int i) {
        int s = s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + s);
        return readStrongBinder;
    }

    public static int p(Parcel parcel, int i) {
        w(parcel, i, 4);
        return parcel.readInt();
    }

    public static long q(Parcel parcel, int i) {
        w(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long r(Parcel parcel, int i) {
        int s = s(parcel, i);
        if (s == 0) {
            return null;
        }
        v(parcel, i, s, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int s(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void t(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + s(parcel, i));
    }

    public static int u(Parcel parcel) {
        int n = n(parcel);
        int s = s(parcel, n);
        int dataPosition = parcel.dataPosition();
        if (i(n) == 20293) {
            int i = s + dataPosition;
            if (i < dataPosition || i > parcel.dataSize()) {
                throw new a("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
            }
            return i;
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(n))), parcel);
    }

    public static void v(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        throw new a("Expected size " + i3 + " got " + i2 + " (0x" + hexString + ")", parcel);
    }

    public static void w(Parcel parcel, int i, int i2) {
        int s = s(parcel, i);
        if (s == i2) {
            return;
        }
        String hexString = Integer.toHexString(s);
        throw new a("Expected size " + i2 + " got " + s + " (0x" + hexString + ")", parcel);
    }
}
