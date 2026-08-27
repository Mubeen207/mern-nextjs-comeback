package androidx.appcompat.view.menu;

import android.os.IBinder;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class d9 {
    public static final jo0 a;
    public static jo0.d b;
    public static jo0.d c;

    static {
        jo0 w = jo0.w("android.os.Bundle");
        a = w;
        b = w.u("getIBinder", String.class);
        c = w.u("putIBinder", String.class, IBinder.class);
    }
}
