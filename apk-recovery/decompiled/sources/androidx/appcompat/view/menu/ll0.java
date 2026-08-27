package androidx.appcompat.view.menu;

import android.content.Intent;
import android.content.pm.ActivityInfo;
/* loaded from: classes.dex */
public class ll0 {
    public final int a;
    public final ActivityInfo b;
    public final Intent c;
    public final String d;

    public ll0(int i, ActivityInfo activityInfo, Intent intent, String str) {
        this.a = i;
        this.b = activityInfo;
        this.c = intent;
        this.d = str;
    }

    public static ll0 a(Intent intent) {
        return new ll0(intent.getIntExtra("_S_|_user_id_", 0), (ActivityInfo) intent.getParcelableExtra("_S_|_activity_info_"), (Intent) intent.getParcelableExtra("_S_|_target_"), intent.getStringExtra("_S_|_activity_token_v_"));
    }

    public static void b(Intent intent, Intent intent2, ActivityInfo activityInfo, String str, int i) {
        intent.putExtra("_S_|_user_id_", i);
        intent.putExtra("_S_|_activity_info_", activityInfo);
        intent.putExtra("_S_|_target_", intent2);
        intent.putExtra("_S_|_activity_token_v_", str);
    }
}
