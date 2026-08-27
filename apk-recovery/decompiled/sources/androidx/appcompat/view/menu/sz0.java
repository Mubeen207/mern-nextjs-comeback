package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class sz0 {
    public static final jo0 a;
    public static jo0.e b;
    public static jo0.b c;
    public static jo0.b d;
    public static jo0.d e;

    static {
        jo0 w = jo0.w("android.telephony.TelephonyManager");
        a = w;
        b = w.z("getSubscriberInfoService", new Class[0]);
        c = w.e("sServiceHandleCacheEnabled");
        d = w.e("sIPhoneSubInfo");
        e = w.u("getSubscriberInfo", new Class[0]);
    }
}
