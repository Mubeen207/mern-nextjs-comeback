package androidx.appcompat.view.menu;

import android.location.Location;
import android.os.IBinder;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class u10 {
    public static final jo0 a;
    public static jo0.d b;

    /* loaded from: classes.dex */
    public static class a {
        public static final jo0 a;
        public static jo0.e b;

        static {
            jo0 w = jo0.w("android.location.ILocationListener$Stub");
            a = w;
            b = w.z("asInterface", IBinder.class);
        }
    }

    static {
        jo0 w = jo0.w("android.location.ILocationListener");
        a = w;
        b = w.u("onLocationChanged", Location.class);
    }
}
