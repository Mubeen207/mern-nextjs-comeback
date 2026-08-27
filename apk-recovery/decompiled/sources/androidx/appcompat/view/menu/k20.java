package androidx.appcompat.view.menu;

import android.os.IBinder;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class k20 {
    public static final jo0 a;
    public static jo0.e b;

    static {
        jo0 w = jo0.w("android.service.persistentdata.IPersistentDataBlockService$Stub");
        a = w;
        b = w.z("asInterface", IBinder.class);
    }
}
