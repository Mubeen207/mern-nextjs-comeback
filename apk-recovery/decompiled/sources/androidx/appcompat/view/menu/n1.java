package androidx.appcompat.view.menu;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.LinkedList;
/* loaded from: classes.dex */
public class n1 {
    public static final n1 c = new n1();
    public LinkedList a = null;
    public boolean b = false;

    /* loaded from: classes.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public int a = 0;
        public boolean b = false;

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            n1.this.a.addFirst(activity);
            if (n1.this.a.size() > 100) {
                n1.this.a.removeLast();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            n1.this.a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int i = this.a + 1;
            this.a = i;
            if (i != 1 || this.b) {
                return;
            }
            n1.this.b = true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            boolean isChangingConfigurations = activity.isChangingConfigurations();
            this.b = isChangingConfigurations;
            int i = this.a - 1;
            this.a = i;
            if (i != 0 || isChangingConfigurations) {
                return;
            }
            n1.this.b = false;
        }
    }

    public static n1 c() {
        return c;
    }

    public void d(Application application) {
        this.a = new LinkedList();
        application.registerActivityLifecycleCallbacks(new a());
    }
}
