package androidx.appcompat.view.menu;

import android.os.IBinder;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class bc {
    public static final jo0 a;
    public static jo0.b b;
    public static jo0.b c;
    public static jo0.e d;
    public static jo0.e e;
    public static jo0.d f;
    public static jo0.d g;
    public static jo0.a h;
    public static jo0.d i;

    static {
        jo0 w = jo0.w("android.app.servertransaction.ClientTransaction");
        a = w;
        b = w.e("mActivityCallbacks");
        c = w.e("mActivityToken");
        d = w.z("obtain", jo0.v("android.app.IApplicationThread"), IBinder.class);
        e = w.z("obtain", jo0.v("android.app.IApplicationThread"));
        f = w.u("addCallback", jo0.v("android.app.servertransaction.ClientTransactionItem"));
        g = w.u("setLifecycleStateRequest", jo0.v("android.app.servertransaction.ActivityLifecycleItem"));
        h = w.c(jo0.v("android.app.IApplicationThread"));
        i = w.u("addTransactionItem", jo0.v("android.app.servertransaction.ClientTransactionItem"));
    }
}
