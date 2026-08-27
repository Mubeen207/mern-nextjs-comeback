package androidx.appcompat.view.menu;

import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public final class nf1 extends hr1 {
    public final /* synthetic */ aq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf1(aq0 aq0Var, Looper looper) {
        super(looper);
        this.b = aq0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        aq0.e(this.b, message);
    }
}
