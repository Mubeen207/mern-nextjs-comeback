package androidx.appcompat.view.menu;

import android.content.Intent;
import android.os.IBinder;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class xz {
    public static final jo0 a;
    public static jo0.d b;

    static {
        jo0 w = jo0.w("android.app.IActivityManager");
        a = w;
        Class cls = Integer.TYPE;
        b = w.u("finishActivity", IBinder.class, cls, Intent.class, cls);
    }
}
