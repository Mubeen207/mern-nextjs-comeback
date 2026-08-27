package androidx.appcompat.view.menu;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public class hr1 extends Handler {
    public final Looper a;

    public hr1(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }

    public hr1(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.a = Looper.getMainLooper();
    }
}
