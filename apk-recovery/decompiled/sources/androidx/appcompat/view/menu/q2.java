package androidx.appcompat.view.menu;

import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class q2 {
    public static o2 a(Status status) {
        return status.k() ? new ep0(status) : new o2(status);
    }
}
