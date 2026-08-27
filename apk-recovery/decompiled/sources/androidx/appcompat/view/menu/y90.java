package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class y90 {
    public static final jo0 a;
    public static jo0.d b;
    public static jo0.d c;

    static {
        jo0 w = jo0.w("android.location.LocationManager$GnssStatusListenerTransport");
        a = w;
        b = w.u("onGnssStarted", new Class[0]);
        c = w.u("onNmeaReceived", Long.TYPE, String.class);
    }
}
