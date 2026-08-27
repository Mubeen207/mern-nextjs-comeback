package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Looper;
/* loaded from: classes.dex */
public final class pf1 {
    public final boolean a = false;

    public pf1(Context context) {
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
