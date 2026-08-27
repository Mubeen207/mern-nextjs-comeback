package androidx.appcompat.view.menu;

import android.app.Application;
import android.content.Context;
import android.os.IBinder;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class at0 {
    public static final jo0 a;
    public static jo0.d b;

    static {
        jo0 w = jo0.w("android.app.Service");
        a = w;
        b = w.u("attach", Context.class, jo0.v("android.app.ActivityThread"), String.class, IBinder.class, Application.class, Object.class);
    }
}
