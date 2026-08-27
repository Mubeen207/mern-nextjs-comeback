package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.os.Bundle;
import android.os.Parcel;
import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ys1 extends ak1 implements at1 {
    public ys1() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // androidx.appcompat.view.menu.ak1
    public final boolean h(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                yj1.f(parcel);
                g0((ri1) yj1.a(parcel, ri1.CREATOR), (fb2) yj1.a(parcel, fb2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                yj1.f(parcel);
                L0((y92) yj1.a(parcel, y92.CREATOR), (fb2) yj1.a(parcel, fb2.CREATOR));
                parcel2.writeNoException();
                return true;
            case t02.c.c /* 3 */:
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                yj1.f(parcel);
                i2((fb2) yj1.a(parcel, fb2.CREATOR));
                parcel2.writeNoException();
                return true;
            case t02.c.e /* 5 */:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                yj1.f(parcel);
                A((ri1) yj1.a(parcel, ri1.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case t02.c.f /* 6 */:
                yj1.f(parcel);
                C1((fb2) yj1.a(parcel, fb2.CREATOR));
                parcel2.writeNoException();
                return true;
            case t02.c.g /* 7 */:
                boolean h = yj1.h(parcel);
                yj1.f(parcel);
                List T = T((fb2) yj1.a(parcel, fb2.CREATOR), h);
                parcel2.writeNoException();
                parcel2.writeTypedList(T);
                return true;
            case 9:
                String readString3 = parcel.readString();
                yj1.f(parcel);
                byte[] E1 = E1((ri1) yj1.a(parcel, ri1.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(E1);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                yj1.f(parcel);
                V1(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                yj1.f(parcel);
                String P1 = P1((fb2) yj1.a(parcel, fb2.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(P1);
                return true;
            case 12:
                yj1.f(parcel);
                o((lf1) yj1.a(parcel, lf1.CREATOR), (fb2) yj1.a(parcel, fb2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                yj1.f(parcel);
                I((lf1) yj1.a(parcel, lf1.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                yj1.f(parcel);
                List m1 = m1(parcel.readString(), parcel.readString(), yj1.h(parcel), (fb2) yj1.a(parcel, fb2.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(m1);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean h2 = yj1.h(parcel);
                yj1.f(parcel);
                List r0 = r0(readString7, readString8, readString9, h2);
                parcel2.writeNoException();
                parcel2.writeTypedList(r0);
                return true;
            case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                yj1.f(parcel);
                List o0 = o0(parcel.readString(), parcel.readString(), (fb2) yj1.a(parcel, fb2.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(o0);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                yj1.f(parcel);
                List Z1 = Z1(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(Z1);
                return true;
            case 18:
                yj1.f(parcel);
                S((fb2) yj1.a(parcel, fb2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                yj1.f(parcel);
                G0((Bundle) yj1.a(parcel, Bundle.CREATOR), (fb2) yj1.a(parcel, fb2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                yj1.f(parcel);
                F0((fb2) yj1.a(parcel, fb2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 21:
                yj1.f(parcel);
                kg1 Q0 = Q0((fb2) yj1.a(parcel, fb2.CREATOR));
                parcel2.writeNoException();
                yj1.g(parcel2, Q0);
                return true;
            case 24:
                yj1.f(parcel);
                List s = s((fb2) yj1.a(parcel, fb2.CREATOR), (Bundle) yj1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(s);
                return true;
        }
    }
}
