package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class j22 extends l22 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List e(Object obj, long j, int i) {
        h22 h22Var;
        List f = f(obj, j);
        if (f.isEmpty()) {
            List h22Var2 = f instanceof f22 ? new h22(i) : ((f instanceof u42) && (f instanceof q12)) ? ((q12) f).e(i) : new ArrayList(i);
            z72.j(obj, j, h22Var2);
            return h22Var2;
        }
        if (c.isAssignableFrom(f.getClass())) {
            ArrayList arrayList = new ArrayList(f.size() + i);
            arrayList.addAll(f);
            z72.j(obj, j, arrayList);
            h22Var = arrayList;
        } else if (!(f instanceof q72)) {
            if ((f instanceof u42) && (f instanceof q12)) {
                q12 q12Var = (q12) f;
                if (q12Var.c()) {
                    return f;
                }
                q12 e = q12Var.e(f.size() + i);
                z72.j(obj, j, e);
                return e;
            }
            return f;
        } else {
            h22 h22Var3 = new h22(f.size() + i);
            h22Var3.addAll((q72) f);
            z72.j(obj, j, h22Var3);
            h22Var = h22Var3;
        }
        return h22Var;
    }

    public static List f(Object obj, long j) {
        return (List) z72.B(obj, j);
    }

    @Override // androidx.appcompat.view.menu.l22
    public final void b(Object obj, Object obj2, long j) {
        List f = f(obj2, j);
        List e = e(obj, j, f.size());
        int size = e.size();
        int size2 = f.size();
        if (size > 0 && size2 > 0) {
            e.addAll(f);
        }
        if (size > 0) {
            f = e;
        }
        z72.j(obj, j, f);
    }

    @Override // androidx.appcompat.view.menu.l22
    public final void d(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) z72.B(obj, j);
        if (list instanceof f22) {
            unmodifiableList = ((f22) list).m();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof u42) && (list instanceof q12)) {
                q12 q12Var = (q12) list;
                if (q12Var.c()) {
                    q12Var.o();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        z72.j(obj, j, unmodifiableList);
    }

    public j22() {
        super();
    }
}
