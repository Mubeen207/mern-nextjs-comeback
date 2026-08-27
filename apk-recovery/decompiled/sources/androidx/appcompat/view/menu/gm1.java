package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.appcompat.view.menu.g20;
import androidx.appcompat.view.menu.t02;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class gm1 extends ak1 implements im1 {
    public gm1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static im1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof im1 ? (im1) queryLocalInterface : new mm1(iBinder);
    }

    @Override // androidx.appcompat.view.menu.ak1
    public final boolean h(int i, Parcel parcel, Parcel parcel2, int i2) {
        km1 om1Var;
        km1 km1Var = null;
        km1 km1Var2 = null;
        km1 km1Var3 = null;
        km1 km1Var4 = null;
        gn1 gn1Var = null;
        gn1 gn1Var2 = null;
        gn1 gn1Var3 = null;
        km1 km1Var5 = null;
        km1 km1Var6 = null;
        km1 km1Var7 = null;
        km1 km1Var8 = null;
        km1 km1Var9 = null;
        km1 km1Var10 = null;
        in1 in1Var = null;
        km1 km1Var11 = null;
        km1 km1Var12 = null;
        km1 km1Var13 = null;
        km1 km1Var14 = null;
        switch (i) {
            case 1:
                long readLong = parcel.readLong();
                yj1.f(parcel);
                initialize(g20.a.asInterface(parcel.readStrongBinder()), (mn1) yj1.a(parcel, mn1.CREATOR), readLong);
                break;
            case 2:
                boolean h = yj1.h(parcel);
                boolean h2 = yj1.h(parcel);
                long readLong2 = parcel.readLong();
                yj1.f(parcel);
                logEvent(parcel.readString(), parcel.readString(), (Bundle) yj1.a(parcel, Bundle.CREATOR), h, h2, readLong2);
                break;
            case t02.c.c /* 3 */:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) yj1.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    om1Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    om1Var = queryLocalInterface instanceof km1 ? (km1) queryLocalInterface : new om1(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                yj1.f(parcel);
                logEventAndBundle(readString, readString2, bundle, om1Var, readLong3);
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                g20 asInterface = g20.a.asInterface(parcel.readStrongBinder());
                boolean h3 = yj1.h(parcel);
                long readLong4 = parcel.readLong();
                yj1.f(parcel);
                setUserProperty(readString3, readString4, asInterface, h3, readLong4);
                break;
            case t02.c.e /* 5 */:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean h4 = yj1.h(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var = queryLocalInterface2 instanceof km1 ? (km1) queryLocalInterface2 : new om1(readStrongBinder2);
                }
                yj1.f(parcel);
                getUserProperties(readString5, readString6, h4, km1Var);
                break;
            case t02.c.f /* 6 */:
                String readString7 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var14 = queryLocalInterface3 instanceof km1 ? (km1) queryLocalInterface3 : new om1(readStrongBinder3);
                }
                yj1.f(parcel);
                getMaxUserProperties(readString7, km1Var14);
                break;
            case t02.c.g /* 7 */:
                String readString8 = parcel.readString();
                long readLong5 = parcel.readLong();
                yj1.f(parcel);
                setUserId(readString8, readLong5);
                break;
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                long readLong6 = parcel.readLong();
                yj1.f(parcel);
                setConditionalUserProperty((Bundle) yj1.a(parcel, Bundle.CREATOR), readLong6);
                break;
            case 9:
                yj1.f(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) yj1.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var13 = queryLocalInterface4 instanceof km1 ? (km1) queryLocalInterface4 : new om1(readStrongBinder4);
                }
                yj1.f(parcel);
                getConditionalUserProperties(readString9, readString10, km1Var13);
                break;
            case 11:
                boolean h5 = yj1.h(parcel);
                long readLong7 = parcel.readLong();
                yj1.f(parcel);
                setMeasurementEnabled(h5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                yj1.f(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                yj1.f(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                yj1.f(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                g20 asInterface2 = g20.a.asInterface(parcel.readStrongBinder());
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                long readLong11 = parcel.readLong();
                yj1.f(parcel);
                setCurrentScreen(asInterface2, readString11, readString12, readLong11);
                break;
            case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var12 = queryLocalInterface5 instanceof km1 ? (km1) queryLocalInterface5 : new om1(readStrongBinder5);
                }
                yj1.f(parcel);
                getCurrentScreenName(km1Var12);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var11 = queryLocalInterface6 instanceof km1 ? (km1) queryLocalInterface6 : new om1(readStrongBinder6);
                }
                yj1.f(parcel);
                getCurrentScreenClass(km1Var11);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    in1Var = queryLocalInterface7 instanceof in1 ? (in1) queryLocalInterface7 : new on1(readStrongBinder7);
                }
                yj1.f(parcel);
                setInstanceIdProvider(in1Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var10 = queryLocalInterface8 instanceof km1 ? (km1) queryLocalInterface8 : new om1(readStrongBinder8);
                }
                yj1.f(parcel);
                getCachedAppInstanceId(km1Var10);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var9 = queryLocalInterface9 instanceof km1 ? (km1) queryLocalInterface9 : new om1(readStrongBinder9);
                }
                yj1.f(parcel);
                getAppInstanceId(km1Var9);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var8 = queryLocalInterface10 instanceof km1 ? (km1) queryLocalInterface10 : new om1(readStrongBinder10);
                }
                yj1.f(parcel);
                getGmpAppId(km1Var8);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var7 = queryLocalInterface11 instanceof km1 ? (km1) queryLocalInterface11 : new om1(readStrongBinder11);
                }
                yj1.f(parcel);
                generateEventId(km1Var7);
                break;
            case 23:
                String readString13 = parcel.readString();
                long readLong12 = parcel.readLong();
                yj1.f(parcel);
                beginAdUnitExposure(readString13, readLong12);
                break;
            case 24:
                String readString14 = parcel.readString();
                long readLong13 = parcel.readLong();
                yj1.f(parcel);
                endAdUnitExposure(readString14, readLong13);
                break;
            case 25:
                g20 asInterface3 = g20.a.asInterface(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                yj1.f(parcel);
                onActivityStarted(asInterface3, readLong14);
                break;
            case 26:
                g20 asInterface4 = g20.a.asInterface(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                yj1.f(parcel);
                onActivityStopped(asInterface4, readLong15);
                break;
            case 27:
                long readLong16 = parcel.readLong();
                yj1.f(parcel);
                onActivityCreated(g20.a.asInterface(parcel.readStrongBinder()), (Bundle) yj1.a(parcel, Bundle.CREATOR), readLong16);
                break;
            case 28:
                g20 asInterface5 = g20.a.asInterface(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                yj1.f(parcel);
                onActivityDestroyed(asInterface5, readLong17);
                break;
            case 29:
                g20 asInterface6 = g20.a.asInterface(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                yj1.f(parcel);
                onActivityPaused(asInterface6, readLong18);
                break;
            case 30:
                g20 asInterface7 = g20.a.asInterface(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                yj1.f(parcel);
                onActivityResumed(asInterface7, readLong19);
                break;
            case 31:
                g20 asInterface8 = g20.a.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var6 = queryLocalInterface12 instanceof km1 ? (km1) queryLocalInterface12 : new om1(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                yj1.f(parcel);
                onActivitySaveInstanceState(asInterface8, km1Var6, readLong20);
                break;
            case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
                Bundle bundle2 = (Bundle) yj1.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var5 = queryLocalInterface13 instanceof km1 ? (km1) queryLocalInterface13 : new om1(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                yj1.f(parcel);
                performAction(bundle2, km1Var5, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString15 = parcel.readString();
                g20 asInterface9 = g20.a.asInterface(parcel.readStrongBinder());
                g20 asInterface10 = g20.a.asInterface(parcel.readStrongBinder());
                g20 asInterface11 = g20.a.asInterface(parcel.readStrongBinder());
                yj1.f(parcel);
                logHealthData(readInt, readString15, asInterface9, asInterface10, asInterface11);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    gn1Var3 = queryLocalInterface14 instanceof gn1 ? (gn1) queryLocalInterface14 : new kn1(readStrongBinder14);
                }
                yj1.f(parcel);
                setEventInterceptor(gn1Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    gn1Var2 = queryLocalInterface15 instanceof gn1 ? (gn1) queryLocalInterface15 : new kn1(readStrongBinder15);
                }
                yj1.f(parcel);
                registerOnMeasurementEventListener(gn1Var2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    gn1Var = queryLocalInterface16 instanceof gn1 ? (gn1) queryLocalInterface16 : new kn1(readStrongBinder16);
                }
                yj1.f(parcel);
                unregisterOnMeasurementEventListener(gn1Var);
                break;
            case 37:
                HashMap b = yj1.b(parcel);
                yj1.f(parcel);
                initForTests(b);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var4 = queryLocalInterface17 instanceof km1 ? (km1) queryLocalInterface17 : new om1(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                yj1.f(parcel);
                getTestFlag(km1Var4, readInt2);
                break;
            case 39:
                boolean h6 = yj1.h(parcel);
                yj1.f(parcel);
                setDataCollectionEnabled(h6);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var3 = queryLocalInterface18 instanceof km1 ? (km1) queryLocalInterface18 : new om1(readStrongBinder18);
                }
                yj1.f(parcel);
                isDataCollectionEnabled(km1Var3);
                break;
            case 41:
            default:
                return false;
            case 42:
                yj1.f(parcel);
                setDefaultEventParameters((Bundle) yj1.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                long readLong22 = parcel.readLong();
                yj1.f(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                long readLong23 = parcel.readLong();
                yj1.f(parcel);
                setConsent((Bundle) yj1.a(parcel, Bundle.CREATOR), readLong23);
                break;
            case 45:
                long readLong24 = parcel.readLong();
                yj1.f(parcel);
                setConsentThirdParty((Bundle) yj1.a(parcel, Bundle.CREATOR), readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    km1Var2 = queryLocalInterface19 instanceof km1 ? (km1) queryLocalInterface19 : new om1(readStrongBinder19);
                }
                yj1.f(parcel);
                getSessionId(km1Var2);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
