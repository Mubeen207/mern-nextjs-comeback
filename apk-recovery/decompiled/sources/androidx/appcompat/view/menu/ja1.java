package androidx.appcompat.view.menu;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.appcompat.view.menu.ma1;
/* loaded from: classes.dex */
public class ja1 extends Binder {
    public final a l;

    /* loaded from: classes.dex */
    public interface a {
        cz0 a(Intent intent);
    }

    public ja1(a aVar) {
        this.l = aVar;
    }

    public void c(final ma1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        this.l.a(aVar.a).c(new lc0(), new jg0() { // from class: androidx.appcompat.view.menu.ia1
            @Override // androidx.appcompat.view.menu.jg0
            public final void a(cz0 cz0Var) {
                ma1.a.this.d();
            }
        });
    }
}
