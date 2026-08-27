package androidx.appcompat.view.menu;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class p10 {
    public static final jo0 a;
    public static jo0.d b;

    static {
        jo0 w = jo0.w("android.content.IIntentReceiver");
        a = w;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        b = w.u("performReceive", Intent.class, cls, String.class, Bundle.class, cls2, cls2, cls);
    }
}
