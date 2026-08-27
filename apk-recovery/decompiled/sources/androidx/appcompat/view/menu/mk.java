package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public class mk implements o41 {
    public final String a;
    public final sx b;

    public mk(Set set, sx sxVar) {
        this.a = e(set);
        this.b = sxVar;
    }

    public static ud c() {
        return ud.e(o41.class).b(il.l(w80.class)).f(new de() { // from class: androidx.appcompat.view.menu.lk
            @Override // androidx.appcompat.view.menu.de
            public final Object a(xd xdVar) {
                o41 d;
                d = mk.d(xdVar);
                return d;
            }
        }).d();
    }

    public static /* synthetic */ o41 d(xd xdVar) {
        return new mk(xdVar.c(w80.class), sx.a());
    }

    public static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            w80 w80Var = (w80) it.next();
            sb.append(w80Var.b());
            sb.append('/');
            sb.append(w80Var.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // androidx.appcompat.view.menu.o41
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + e(this.b.b());
    }
}
