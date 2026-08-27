package androidx.appcompat.view.menu;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class vz {
    public static final jo0 a;
    public static jo0.d b;
    public static jo0.d c;
    public static jo0.d d;

    /* loaded from: classes.dex */
    public static class a {
        public static final jo0 a;
        public static jo0.b b;
        public static jo0.b c;

        static {
            jo0 w = jo0.w("android.app.IActivityManager$ContentProviderHolder");
            a = w;
            b = w.e("info");
            c = w.e("provider");
        }
    }

    static {
        jo0 w = jo0.w("android.app.IActivityManager");
        a = w;
        b = w.u("getTaskForActivity", IBinder.class, Boolean.TYPE);
        Class cls = Integer.TYPE;
        c = w.u("setRequestedOrientation", IBinder.class, cls);
        d = w.u("startActivity", jo0.f("android.app.IApplicationThread"), String.class, Intent.class, String.class, IBinder.class, String.class, cls, cls, jo0.f("android.app.ProfilerInfo"), Bundle.class);
    }
}
