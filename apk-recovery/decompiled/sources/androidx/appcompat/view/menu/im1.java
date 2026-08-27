package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
/* loaded from: classes.dex */
public interface im1 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(km1 km1Var);

    void getAppInstanceId(km1 km1Var);

    void getCachedAppInstanceId(km1 km1Var);

    void getConditionalUserProperties(String str, String str2, km1 km1Var);

    void getCurrentScreenClass(km1 km1Var);

    void getCurrentScreenName(km1 km1Var);

    void getGmpAppId(km1 km1Var);

    void getMaxUserProperties(String str, km1 km1Var);

    void getSessionId(km1 km1Var);

    void getTestFlag(km1 km1Var, int i);

    void getUserProperties(String str, String str2, boolean z, km1 km1Var);

    void initForTests(Map map);

    void initialize(g20 g20Var, mn1 mn1Var, long j);

    void isDataCollectionEnabled(km1 km1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, km1 km1Var, long j);

    void logHealthData(int i, String str, g20 g20Var, g20 g20Var2, g20 g20Var3);

    void onActivityCreated(g20 g20Var, Bundle bundle, long j);

    void onActivityDestroyed(g20 g20Var, long j);

    void onActivityPaused(g20 g20Var, long j);

    void onActivityResumed(g20 g20Var, long j);

    void onActivitySaveInstanceState(g20 g20Var, km1 km1Var, long j);

    void onActivityStarted(g20 g20Var, long j);

    void onActivityStopped(g20 g20Var, long j);

    void performAction(Bundle bundle, km1 km1Var, long j);

    void registerOnMeasurementEventListener(gn1 gn1Var);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(g20 g20Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(gn1 gn1Var);

    void setInstanceIdProvider(in1 in1Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, g20 g20Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(gn1 gn1Var);
}
