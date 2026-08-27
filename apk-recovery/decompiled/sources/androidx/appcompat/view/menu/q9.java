package androidx.appcompat.view.menu;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public abstract class q9 {
    public static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
