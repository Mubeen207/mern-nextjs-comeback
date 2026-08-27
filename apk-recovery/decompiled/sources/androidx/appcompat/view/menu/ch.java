package androidx.appcompat.view.menu;

import android.os.OutcomeReceiver;
import androidx.appcompat.view.menu.qp0;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class ch extends AtomicBoolean implements OutcomeReceiver {
    public final xg m;

    public ch(xg xgVar) {
        super(false);
        this.m = xgVar;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            xg xgVar = this.m;
            qp0.a aVar = qp0.m;
            xgVar.n(qp0.a(rp0.a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.m.n(qp0.a(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
