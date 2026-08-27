package androidx.appcompat.view.menu;

import java.util.List;
/* loaded from: classes.dex */
public final class lc2 extends jg1 {
    public final /* synthetic */ eb2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc2(k72 k72Var, String str, eb2 eb2Var) {
        super(str);
        this.o = eb2Var;
    }

    @Override // androidx.appcompat.view.menu.jg1
    public final tg1 a(sw1 sw1Var, List list) {
        lu1.g("getValue", 2, list);
        tg1 b = sw1Var.b((tg1) list.get(0));
        tg1 b2 = sw1Var.b((tg1) list.get(1));
        String h = this.o.h(b.g());
        return h != null ? new xg1(h) : b2;
    }
}
