package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.appcompat.view.menu.fs;
import androidx.appcompat.view.menu.ik1;
import androidx.appcompat.view.menu.mz0;
import androidx.appcompat.view.menu.pj0;
import androidx.appcompat.view.menu.pn1;
import androidx.appcompat.view.menu.y22;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final pn1 a;

    public FirebaseAnalytics(pn1 pn1Var) {
        pj0.i(pn1Var);
        this.a = pn1Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(pn1.e(context));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Keep
    public static y22 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        pn1 f = pn1.f(context, null, null, null, bundle);
        if (f == null) {
            return null;
        }
        return new ik1(f);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) mz0.b(fs.q().a(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.a.j(activity, str, str2);
    }
}
