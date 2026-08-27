package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.gi;
/* loaded from: classes.dex */
public final class le0 extends gi {
    public le0() {
        this(null, 1, null);
    }

    public final void b(gi.b bVar, Object obj) {
        c60.e(bVar, "key");
        a().put(bVar, obj);
    }

    public le0(gi giVar) {
        c60.e(giVar, "initialExtras");
        a().putAll(giVar.a());
    }

    public /* synthetic */ le0(gi giVar, int i, lj ljVar) {
        this((i & 1) != 0 ? gi.a.b : giVar);
    }
}
