package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.nd0;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class pk {
    public final nd0 a;
    public Map b;
    public final nd0.c c;

    /* loaded from: classes.dex */
    public class a implements nd0.c {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.nd0.c
        public void C(ld0 ld0Var, nd0.d dVar) {
            pk.a(pk.this);
        }
    }

    public pk(si siVar) {
        a aVar = new a();
        this.c = aVar;
        nd0 nd0Var = new nd0(siVar, "flutter/deferredcomponent", tw0.b);
        this.a = nd0Var;
        nd0Var.e(aVar);
        ut.e().a();
        this.b = new HashMap();
    }

    public static /* synthetic */ qk a(pk pkVar) {
        pkVar.getClass();
        return null;
    }
}
