package androidx.appcompat.view.menu;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.UiAutomation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.snake.helper.Native;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class b8 extends Instrumentation {
    public Instrumentation l;

    @Override // android.app.Instrumentation
    public void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.l.addMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public void addResults(Bundle bundle) {
        this.l.addResults(bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        this.l.callActivityOnCreate(activity, bundle);
        Iterator it = bv0.h().i().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        this.l.callActivityOnDestroy(activity);
        Iterator it = bv0.h().i().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("callActivityOnNewIntent: ");
        sb.append(activity.getClass().getSimpleName());
        sb.append(" action=");
        sb.append(intent != null ? intent.getAction() : "null");
        this.l.callActivityOnNewIntent(activity, intent);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        this.l.callActivityOnPause(activity);
        Iterator it = bv0.h().i().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        this.l.callActivityOnPostCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(Activity activity) {
        this.l.callActivityOnRestart(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        this.l.callActivityOnRestoreInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        StringBuilder sb = new StringBuilder();
        sb.append("callActivityOnResume: ");
        sb.append(activity);
        this.l.callActivityOnResume(activity);
        try {
            Native.ac(activity, Native.class.getDeclaredMethod("pjowqpxe", Object.class, Object.class, Object.class));
            uq.g(activity);
        } catch (Throwable unused) {
        }
        Iterator it = bv0.h().i().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        this.l.callActivityOnSaveInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        this.l.callActivityOnStart(activity);
        Iterator it = bv0.h().i().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        this.l.callActivityOnStop(activity);
        Iterator it = bv0.h().i().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnUserLeaving(Activity activity) {
        this.l.callActivityOnUserLeaving(activity);
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        this.l.callApplicationOnCreate(application);
    }

    @Override // android.app.Instrumentation
    public boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        return this.l.checkMonitorHit(activityMonitor, i);
    }

    @Override // android.app.Instrumentation
    public void endPerformanceSnapshot() {
        this.l.endPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public void finish(int i, Bundle bundle) {
        this.l.finish(i, bundle);
    }

    @Override // android.app.Instrumentation
    public Bundle getAllocCounts() {
        return this.l.getAllocCounts();
    }

    @Override // android.app.Instrumentation
    public Bundle getBinderCounts() {
        return this.l.getBinderCounts();
    }

    @Override // android.app.Instrumentation
    public ComponentName getComponentName() {
        return this.l.getComponentName();
    }

    @Override // android.app.Instrumentation
    public Context getContext() {
        return this.l.getContext();
    }

    @Override // android.app.Instrumentation
    public Context getTargetContext() {
        return this.l.getTargetContext();
    }

    @Override // android.app.Instrumentation
    public UiAutomation getUiAutomation() {
        return this.l.getUiAutomation();
    }

    @Override // android.app.Instrumentation
    public boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        return this.l.invokeContextMenuAction(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        return this.l.invokeMenuActionSync(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public boolean isProfiling() {
        return this.l.isProfiling();
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        return this.l.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    @Override // android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) {
        return this.l.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        this.l.onCreate(bundle);
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
        this.l.onDestroy();
    }

    @Override // android.app.Instrumentation
    public boolean onException(Object obj, Throwable th) {
        return this.l.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        this.l.onStart();
    }

    @Override // android.app.Instrumentation
    public void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.l.removeMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public void runOnMainSync(Runnable runnable) {
        this.l.runOnMainSync(runnable);
    }

    @Override // android.app.Instrumentation
    public void sendCharacterSync(int i) {
        this.l.sendCharacterSync(i);
    }

    @Override // android.app.Instrumentation
    public void sendKeyDownUpSync(int i) {
        this.l.sendKeyDownUpSync(i);
    }

    @Override // android.app.Instrumentation
    public void sendKeySync(KeyEvent keyEvent) {
        this.l.sendKeySync(keyEvent);
    }

    @Override // android.app.Instrumentation
    public void sendPointerSync(MotionEvent motionEvent) {
        this.l.sendPointerSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public void sendStatus(int i, Bundle bundle) {
        this.l.sendStatus(i, bundle);
    }

    @Override // android.app.Instrumentation
    public void sendStringSync(String str) {
        this.l.sendStringSync(str);
    }

    @Override // android.app.Instrumentation
    public void sendTrackballEventSync(MotionEvent motionEvent) {
        this.l.sendTrackballEventSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public void setAutomaticPerformanceSnapshots() {
        this.l.setAutomaticPerformanceSnapshots();
    }

    @Override // android.app.Instrumentation
    public void setInTouchMode(boolean z) {
        this.l.setInTouchMode(z);
    }

    @Override // android.app.Instrumentation
    public void start() {
        this.l.start();
    }

    @Override // android.app.Instrumentation
    public Activity startActivitySync(Intent intent) {
        return this.l.startActivitySync(intent);
    }

    @Override // android.app.Instrumentation
    public void startAllocCounting() {
        this.l.startAllocCounting();
    }

    @Override // android.app.Instrumentation
    public void startPerformanceSnapshot() {
        this.l.startPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public void startProfiling() {
        this.l.startProfiling();
    }

    @Override // android.app.Instrumentation
    public void stopAllocCounting() {
        this.l.stopAllocCounting();
    }

    @Override // android.app.Instrumentation
    public void stopProfiling() {
        this.l.stopProfiling();
    }

    @Override // android.app.Instrumentation
    public void waitForIdle(Runnable runnable) {
        this.l.waitForIdle(runnable);
    }

    @Override // android.app.Instrumentation
    public void waitForIdleSync() {
        this.l.waitForIdleSync();
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        return this.l.waitForMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        return this.l.waitForMonitorWithTimeout(activityMonitor, j);
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.l.addMonitor(intentFilter, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.l.callActivityOnPostCreate(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.l.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.l.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
        Iterator it = bv0.h().i().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        return this.l.newActivity(classLoader, str, intent);
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.l.addMonitor(str, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.l.callActivityOnCreate(activity, bundle, persistableBundle);
        Iterator it = bv0.h().i().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
    }
}
