package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.nd0;
import java.util.HashMap;
/* loaded from: classes.dex */
public class te0 {
    public final nd0 a;
    public final nd0.c b;

    /* loaded from: classes.dex */
    public class a implements nd0.c {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.nd0.c
        public void C(ld0 ld0Var, nd0.d dVar) {
            dVar.c(null);
        }
    }

    public te0(si siVar) {
        a aVar = new a();
        this.b = aVar;
        nd0 nd0Var = new nd0(siVar, "flutter/navigation", q60.a);
        this.a = nd0Var;
        nd0Var.e(aVar);
    }

    public void a() {
        ha0.f("NavigationChannel", "Sending message to pop route.");
        this.a.c("popRoute", null);
    }

    public void b(String str) {
        ha0.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap hashMap = new HashMap();
        hashMap.put("location", str);
        this.a.c("pushRouteInformation", hashMap);
    }

    public void c(String str) {
        ha0.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.a.c("setInitialRoute", str);
    }
}
