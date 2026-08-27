package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.view.menu.ao;
import androidx.appcompat.view.menu.c60;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class g {
    public static final g a = new g();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static final class a extends ao {
        @Override // androidx.appcompat.view.menu.ao, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            c60.e(activity, "activity");
            n.b.c(activity);
        }
    }

    public static final void a(Context context) {
        c60.e(context, "context");
        if (b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        c60.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
