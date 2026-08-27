package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class z90 {
    public static final jo0 a;
    public static jo0.d b;

    static {
        jo0 w = jo0.w("android.location.LocationManager$GpsStatusListenerTransport");
        a = w;
        b = w.u("onNmeaReceived", Long.TYPE, String.class);
    }
}
