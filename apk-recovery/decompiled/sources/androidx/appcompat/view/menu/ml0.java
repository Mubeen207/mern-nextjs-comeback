package androidx.appcompat.view.menu;

import android.content.Intent;
/* loaded from: classes.dex */
public class ml0 {
    public final Intent a;
    public final int b;

    public ml0(Intent intent, int i) {
        this.a = intent;
        this.b = i;
    }

    public static ml0 a(Intent intent) {
        return new ml0((Intent) intent.getParcelableExtra("_S_|_target_"), intent.getIntExtra("_S_|_user_id_", 0));
    }

    public static void b(Intent intent, Intent intent2, int i) {
        intent.putExtra("_S_|_target_", intent2);
        intent.putExtra("_S_|_user_id_", i);
    }

    public String toString() {
        return "ProxyBroadcastRecord{mIntent=" + this.a + ", mUserId=" + this.b + '}';
    }
}
