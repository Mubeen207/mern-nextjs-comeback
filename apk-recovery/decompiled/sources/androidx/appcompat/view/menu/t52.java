package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class t52 extends v52 {
    public t52(int i) {
        super(i);
    }

    @Override // androidx.appcompat.view.menu.v52
    public final void f() {
        if (!o()) {
            if (g() > 0) {
                my0.a(h(0).getKey());
                throw null;
            }
            Iterator it = j().iterator();
            if (it.hasNext()) {
                my0.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.f();
    }
}
