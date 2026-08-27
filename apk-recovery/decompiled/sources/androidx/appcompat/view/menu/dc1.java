package androidx.appcompat.view.menu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* loaded from: classes.dex */
public final class dc1 extends BroadcastReceiver {
    public Context a;
    public final cc1 b;

    public dc1(cc1 cc1Var) {
        this.b = cc1Var;
    }

    public final void a(Context context) {
        this.a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.b.a();
            b();
        }
    }
}
