package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.nd0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class mw0 {
    public final nd0 a;
    public b b;
    public final nd0.c c;

    /* loaded from: classes.dex */
    public class a implements nd0.c {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.nd0.c
        public void C(ld0 ld0Var, nd0.d dVar) {
            if (mw0.this.b == null) {
                ha0.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = ld0Var.a;
            Object obj = ld0Var.b;
            ha0.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.a();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                mw0.this.b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e) {
                dVar.b("error", e.getMessage(), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str, String str2, nd0.d dVar);
    }

    public mw0(si siVar) {
        a aVar = new a();
        this.c = aVar;
        nd0 nd0Var = new nd0(siVar, "flutter/spellcheck", tw0.b);
        this.a = nd0Var;
        nd0Var.e(aVar);
    }

    public void b(b bVar) {
        this.b = bVar;
    }
}
