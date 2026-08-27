package androidx.appcompat.view.menu;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
/* loaded from: classes.dex */
public class ul0 {
    public final Intent a;
    public final ServiceInfo b;
    public final IBinder c;
    public final int d;
    public final int e;

    public ul0(Intent intent, ServiceInfo serviceInfo, IBinder iBinder, int i, int i2) {
        this.a = intent;
        this.b = serviceInfo;
        this.d = i;
        this.e = i2;
        this.c = iBinder;
    }

    public static ul0 a(Intent intent) {
        return new ul0((Intent) intent.getParcelableExtra("_S_|_target_"), (ServiceInfo) intent.getParcelableExtra("_S_|_service_info_"), e9.a(intent, "_S_|_token_"), intent.getIntExtra("_S_|_user_id_", 0), intent.getIntExtra("_S_|_start_id_", 0));
    }

    public static void b(Intent intent, Intent intent2, ServiceInfo serviceInfo, IBinder iBinder, int i, int i2) {
        intent.putExtra("_S_|_target_", intent2);
        intent.putExtra("_S_|_service_info_", serviceInfo);
        intent.putExtra("_S_|_user_id_", i);
        intent.putExtra("_S_|_start_id_", i2);
        e9.c(intent, "_S_|_token_", iBinder);
    }
}
