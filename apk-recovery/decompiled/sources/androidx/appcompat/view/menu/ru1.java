package androidx.appcompat.view.menu;

import android.database.ContentObserver;
import android.os.Handler;
/* loaded from: classes.dex */
public final class ru1 extends ContentObserver {
    public final /* synthetic */ gu1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru1(gu1 gu1Var, Handler handler) {
        super(null);
        this.a = gu1Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.e();
    }
}
