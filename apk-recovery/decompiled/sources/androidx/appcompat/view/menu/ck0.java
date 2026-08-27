package androidx.appcompat.view.menu;

import android.content.pm.PackageManager;
import androidx.appcompat.view.menu.nd0;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public class ck0 {
    public final nd0 a;
    public final PackageManager b;
    public b c;
    public final nd0.c d;

    /* loaded from: classes.dex */
    public class a implements nd0.c {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.nd0.c
        public void C(ld0 ld0Var, nd0.d dVar) {
            if (ck0.this.c == null) {
                return;
            }
            String str = ld0Var.a;
            Object obj = ld0Var.b;
            str.hashCode();
            if (str.equals("ProcessText.processTextAction")) {
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    boolean booleanValue = ((Boolean) arrayList.get(2)).booleanValue();
                    ck0.this.c.e((String) arrayList.get(0), (String) arrayList.get(1), booleanValue, dVar);
                } catch (IllegalStateException e) {
                    dVar.b("error", e.getMessage(), null);
                }
            } else if (!str.equals("ProcessText.queryTextActions")) {
                dVar.a();
            } else {
                try {
                    dVar.c(ck0.this.c.d());
                } catch (IllegalStateException e2) {
                    dVar.b("error", e2.getMessage(), null);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Map d();

        void e(String str, String str2, boolean z, nd0.d dVar);
    }

    public ck0(si siVar, PackageManager packageManager) {
        a aVar = new a();
        this.d = aVar;
        this.b = packageManager;
        nd0 nd0Var = new nd0(siVar, "flutter/processtext", tw0.b);
        this.a = nd0Var;
        nd0Var.e(aVar);
    }

    public void b(b bVar) {
        this.c = bVar;
    }
}
