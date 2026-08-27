package androidx.appcompat.view.menu;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class d61 {
    public final Map a = new LinkedHashMap();

    public final void a() {
        for (b61 b61Var : this.a.values()) {
            b61Var.a();
        }
        this.a.clear();
    }

    public final b61 b(String str) {
        c60.e(str, "key");
        return (b61) this.a.get(str);
    }

    public final void c(String str, b61 b61Var) {
        c60.e(str, "key");
        c60.e(b61Var, "viewModel");
        b61 b61Var2 = (b61) this.a.put(str, b61Var);
        if (b61Var2 != null) {
            b61Var2.c();
        }
    }
}
