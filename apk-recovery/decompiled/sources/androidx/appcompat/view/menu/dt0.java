package androidx.appcompat.view.menu;

import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class dt0 {
    public final Map a;

    /* loaded from: classes.dex */
    public static final class a {
        public static final dt0 a = new dt0();
    }

    public static dt0 a() {
        return a.a;
    }

    public static IBinder b(String str) {
        return a().c(str);
    }

    public static void d() {
        bv0.h().t("activity_manager");
        bv0.h().t("job_manager");
        bv0.h().t("package_manager");
        bv0.h().t("storage_manager");
        bv0.h().t("user_manager");
        bv0.h().t("account_manager");
        bv0.h().t("location_manager");
        bv0.h().t("notification_manager");
    }

    public IBinder c(String str) {
        return (IBinder) this.a.get(str);
    }

    public dt0() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put("activity_manager", hv0.h());
        hashMap.put("job_manager", o6.k());
        hashMap.put("package_manager", x6.w2());
        hashMap.put("storage_manager", b7.h());
        hashMap.put("user_manager", f7.k());
        hashMap.put("account_manager", ev0.I2());
        hashMap.put("location_manager", t6.w2());
        hashMap.put("notification_manager", sv0.k());
    }
}
