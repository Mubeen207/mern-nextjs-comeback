package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.os.IBinder;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class z20 {
    public static final jo0 a;
    public static jo0.d b;

    static {
        jo0 w = jo0.w("android.app.IServiceConnection");
        a = w;
        b = w.u("connected", ComponentName.class, IBinder.class, Boolean.TYPE);
    }
}
