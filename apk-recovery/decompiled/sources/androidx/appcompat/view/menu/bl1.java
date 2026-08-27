package androidx.appcompat.view.menu;

import java.net.URL;
import java.net.URLConnection;
/* loaded from: classes.dex */
public abstract class bl1 {
    public static bl1 a = new hl1();

    public static synchronized bl1 a() {
        bl1 bl1Var;
        synchronized (bl1.class) {
            bl1Var = a;
        }
        return bl1Var;
    }

    public abstract URLConnection b(URL url, String str);
}
