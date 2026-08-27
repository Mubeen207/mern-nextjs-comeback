package androidx.appcompat.view.menu;

import android.view.View;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class dw {
    public static final dw a;
    public static final fw b;
    public static final fw c;

    static {
        dw dwVar = new dw();
        a = dwVar;
        b = new ew();
        c = dwVar.b();
    }

    public static final void a(fv fvVar, fv fvVar2, boolean z, o4 o4Var, boolean z2) {
        c60.e(fvVar, "inFragment");
        c60.e(fvVar2, "outFragment");
        c60.e(o4Var, "sharedElements");
        if (z) {
            fvVar2.t();
        } else {
            fvVar.t();
        }
    }

    public static final void c(o4 o4Var, o4 o4Var2) {
        c60.e(o4Var, "<this>");
        c60.e(o4Var2, "namedViews");
        int size = o4Var.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!o4Var2.containsKey((String) o4Var.m(size))) {
                o4Var.k(size);
            }
        }
    }

    public static final void d(List list, int i) {
        c60.e(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }

    public final fw b() {
        try {
            c60.c(gw.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (fw) gw.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
