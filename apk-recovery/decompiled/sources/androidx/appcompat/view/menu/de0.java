package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.nd0;
import java.util.HashMap;
/* loaded from: classes.dex */
public class de0 {
    public final nd0 a;
    public b b;
    public final nd0.c c;

    /* loaded from: classes.dex */
    public class a implements nd0.c {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.nd0.c
        public void C(ld0 ld0Var, nd0.d dVar) {
            if (de0.this.b == null) {
                return;
            }
            String str = ld0Var.a;
            ha0.f("MouseCursorChannel", "Received '" + str + "' message.");
            try {
                if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                    try {
                        de0.this.b.a((String) ((HashMap) ld0Var.b).get("kind"));
                        dVar.c(Boolean.TRUE);
                    } catch (Exception e) {
                        dVar.b("error", "Error when setting cursors: " + e.getMessage(), null);
                    }
                }
            } catch (Exception e2) {
                dVar.b("error", "Unhandled error: " + e2.getMessage(), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    public de0(si siVar) {
        a aVar = new a();
        this.c = aVar;
        nd0 nd0Var = new nd0(siVar, "flutter/mousecursor", tw0.b);
        this.a = nd0Var;
        nd0Var.e(aVar);
    }

    public void b(b bVar) {
        this.b = bVar;
    }
}
