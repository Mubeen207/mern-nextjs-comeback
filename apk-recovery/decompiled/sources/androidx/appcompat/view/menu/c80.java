package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.nd0;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class c80 {
    public final nd0 a;
    public b b;
    public final nd0.c c;

    /* loaded from: classes.dex */
    public class a implements nd0.c {
        public Map a = new HashMap();

        public a() {
        }

        @Override // androidx.appcompat.view.menu.nd0.c
        public void C(ld0 ld0Var, nd0.d dVar) {
            if (c80.this.b == null) {
                dVar.c(this.a);
                return;
            }
            String str = ld0Var.a;
            str.hashCode();
            if (!str.equals("getKeyboardState")) {
                dVar.a();
                return;
            }
            try {
                this.a = c80.this.b.a();
            } catch (IllegalStateException e) {
                dVar.b("error", e.getMessage(), null);
            }
            dVar.c(this.a);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Map a();
    }

    public c80(i8 i8Var) {
        a aVar = new a();
        this.c = aVar;
        nd0 nd0Var = new nd0(i8Var, "flutter/keyboard", tw0.b);
        this.a = nd0Var;
        nd0Var.e(aVar);
    }

    public void b(b bVar) {
        this.b = bVar;
    }
}
