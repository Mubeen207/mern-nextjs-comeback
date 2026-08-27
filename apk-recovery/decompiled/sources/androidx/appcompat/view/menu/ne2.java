package androidx.appcompat.view.menu;

import java.util.List;
/* loaded from: classes.dex */
public final class ne2 extends jg1 {
    public final kf2 o;

    public ne2(kf2 kf2Var) {
        super("internal.logger");
        this.o = kf2Var;
        this.n.put("log", new ef2(this, false, true));
        this.n.put("silent", new sd2(this, "silent"));
        ((jg1) this.n.get("silent")).n("log", new ef2(this, true, true));
        this.n.put("unmonitored", new ye2(this, "unmonitored"));
        ((jg1) this.n.get("unmonitored")).n("log", new ef2(this, false, false));
    }

    @Override // androidx.appcompat.view.menu.jg1
    public final tg1 a(sw1 sw1Var, List list) {
        return tg1.e;
    }
}
