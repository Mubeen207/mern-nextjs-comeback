package androidx.appcompat.view.menu;

import android.os.IBinder;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class l30 {
    public static final jo0 a = jo0.w("vivo.app.systemdefence.ISystemDefenceManager");

    /* loaded from: classes.dex */
    public static class a {
        public static final jo0 a;
        public static jo0.e b;

        static {
            jo0 w = jo0.w("vivo.app.systemdefence.ISystemDefenceManager$Stub");
            a = w;
            b = w.z("asInterface", IBinder.class);
        }
    }
}
