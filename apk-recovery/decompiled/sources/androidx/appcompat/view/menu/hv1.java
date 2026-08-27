package androidx.appcompat.view.menu;

import android.database.ContentObserver;
import android.os.Handler;
/* loaded from: classes.dex */
public final class hv1 extends ContentObserver {
    public hv1(dv1 dv1Var, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        rv1.m();
    }
}
