package androidx.appcompat.view.menu;

import java.util.Map;
/* loaded from: classes.dex */
public final class hb1 implements jg0 {
    public final /* synthetic */ ez0 a;
    public final /* synthetic */ jb1 b;

    public hb1(jb1 jb1Var, ez0 ez0Var) {
        this.b = jb1Var;
        this.a = ez0Var;
    }

    @Override // androidx.appcompat.view.menu.jg0
    public final void a(cz0 cz0Var) {
        Map map;
        map = this.b.b;
        map.remove(this.a);
    }
}
