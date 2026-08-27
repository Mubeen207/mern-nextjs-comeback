package androidx.appcompat.view.menu;

import android.os.IBinder;
import androidx.appcompat.view.menu.jo0;
import java.util.List;
/* loaded from: classes.dex */
public abstract class u1 {
    public static final jo0 a;
    public static jo0.d b;
    public static jo0.d c;
    public static jo0.d d;

    static {
        jo0 w = jo0.w("android.app.ActivityThread");
        a = w;
        b = w.u("handleNewIntent", IBinder.class, List.class, Boolean.TYPE);
        c = w.u("handleNewIntent", IBinder.class, List.class);
        d = w.u("handleNewIntent", jo0.v("android.app.ActivityThread$ActivityClientRecord"), List.class);
    }
}
