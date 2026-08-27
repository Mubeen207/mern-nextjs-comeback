package androidx.appcompat.view.menu;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public abstract class ty {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
