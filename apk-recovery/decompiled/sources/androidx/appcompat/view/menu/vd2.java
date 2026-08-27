package androidx.appcompat.view.menu;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class vd2 extends qe2 {
    public vd2(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // androidx.appcompat.view.menu.qe2
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new ve2(4, "Invalid response to one way request", null));
        }
    }

    @Override // androidx.appcompat.view.menu.qe2
    public final boolean b() {
        return true;
    }
}
