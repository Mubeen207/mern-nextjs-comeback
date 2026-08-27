package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class mm1 extends uj1 implements im1 {
    public mm1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void beginAdUnitExposure(String str, long j) {
        Parcel h = h();
        h.writeString(str);
        h.writeLong(j);
        k(23, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel h = h();
        h.writeString(str);
        h.writeString(str2);
        yj1.d(h, bundle);
        k(9, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void endAdUnitExposure(String str, long j) {
        Parcel h = h();
        h.writeString(str);
        h.writeLong(j);
        k(24, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void generateEventId(km1 km1Var) {
        Parcel h = h();
        yj1.c(h, km1Var);
        k(22, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void getCachedAppInstanceId(km1 km1Var) {
        Parcel h = h();
        yj1.c(h, km1Var);
        k(19, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void getConditionalUserProperties(String str, String str2, km1 km1Var) {
        Parcel h = h();
        h.writeString(str);
        h.writeString(str2);
        yj1.c(h, km1Var);
        k(10, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void getCurrentScreenClass(km1 km1Var) {
        Parcel h = h();
        yj1.c(h, km1Var);
        k(17, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void getCurrentScreenName(km1 km1Var) {
        Parcel h = h();
        yj1.c(h, km1Var);
        k(16, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void getGmpAppId(km1 km1Var) {
        Parcel h = h();
        yj1.c(h, km1Var);
        k(21, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void getMaxUserProperties(String str, km1 km1Var) {
        Parcel h = h();
        h.writeString(str);
        yj1.c(h, km1Var);
        k(6, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void getUserProperties(String str, String str2, boolean z, km1 km1Var) {
        Parcel h = h();
        h.writeString(str);
        h.writeString(str2);
        yj1.e(h, z);
        yj1.c(h, km1Var);
        k(5, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void initialize(g20 g20Var, mn1 mn1Var, long j) {
        Parcel h = h();
        yj1.c(h, g20Var);
        yj1.d(h, mn1Var);
        h.writeLong(j);
        k(1, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel h = h();
        h.writeString(str);
        h.writeString(str2);
        yj1.d(h, bundle);
        yj1.e(h, z);
        yj1.e(h, z2);
        h.writeLong(j);
        k(2, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void logHealthData(int i, String str, g20 g20Var, g20 g20Var2, g20 g20Var3) {
        Parcel h = h();
        h.writeInt(i);
        h.writeString(str);
        yj1.c(h, g20Var);
        yj1.c(h, g20Var2);
        yj1.c(h, g20Var3);
        k(33, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void onActivityCreated(g20 g20Var, Bundle bundle, long j) {
        Parcel h = h();
        yj1.c(h, g20Var);
        yj1.d(h, bundle);
        h.writeLong(j);
        k(27, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void onActivityDestroyed(g20 g20Var, long j) {
        Parcel h = h();
        yj1.c(h, g20Var);
        h.writeLong(j);
        k(28, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void onActivityPaused(g20 g20Var, long j) {
        Parcel h = h();
        yj1.c(h, g20Var);
        h.writeLong(j);
        k(29, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void onActivityResumed(g20 g20Var, long j) {
        Parcel h = h();
        yj1.c(h, g20Var);
        h.writeLong(j);
        k(30, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void onActivitySaveInstanceState(g20 g20Var, km1 km1Var, long j) {
        Parcel h = h();
        yj1.c(h, g20Var);
        yj1.c(h, km1Var);
        h.writeLong(j);
        k(31, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void onActivityStarted(g20 g20Var, long j) {
        Parcel h = h();
        yj1.c(h, g20Var);
        h.writeLong(j);
        k(25, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void onActivityStopped(g20 g20Var, long j) {
        Parcel h = h();
        yj1.c(h, g20Var);
        h.writeLong(j);
        k(26, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel h = h();
        yj1.d(h, bundle);
        h.writeLong(j);
        k(8, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void setCurrentScreen(g20 g20Var, String str, String str2, long j) {
        Parcel h = h();
        yj1.c(h, g20Var);
        h.writeString(str);
        h.writeString(str2);
        h.writeLong(j);
        k(15, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void setDataCollectionEnabled(boolean z) {
        Parcel h = h();
        yj1.e(h, z);
        k(39, h);
    }

    @Override // androidx.appcompat.view.menu.im1
    public final void setUserProperty(String str, String str2, g20 g20Var, boolean z, long j) {
        Parcel h = h();
        h.writeString(str);
        h.writeString(str2);
        yj1.c(h, g20Var);
        yj1.e(h, z);
        h.writeLong(j);
        k(4, h);
    }
}
