package androidx.appcompat.view.menu;

import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class bw {
    public static final bw a = new bw();
    public static c b = c.d;

    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static final a c = new a(null);
        public static final c d;
        public final Set a;
        public final Map b;

        /* loaded from: classes.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(lj ljVar) {
                this();
            }
        }

        static {
            Set b;
            Map d2;
            b = kt0.b();
            d2 = fb0.d();
            d = new c(b, null, d2);
        }

        public c(Set set, b bVar, Map map) {
            c60.e(set, "flags");
            c60.e(map, "allowedViolations");
            this.a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.b = linkedHashMap;
        }

        public final Set a() {
            return this.a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.b;
        }
    }

    public static final void d(String str, g71 g71Var) {
        c60.e(g71Var, "$violation");
        StringBuilder sb = new StringBuilder();
        sb.append("Policy violation with PENALTY_DEATH in ");
        sb.append(str);
        throw g71Var;
    }

    public static final void f(fv fvVar, String str) {
        c60.e(fvVar, "fragment");
        c60.e(str, "previousFragmentId");
        wv wvVar = new wv(fvVar, str);
        bw bwVar = a;
        bwVar.e(wvVar);
        c b2 = bwVar.b(fvVar);
        if (b2.a().contains(a.DETECT_FRAGMENT_REUSE) && bwVar.j(b2, fvVar.getClass(), wvVar.getClass())) {
            bwVar.c(b2, wvVar);
        }
    }

    public static final void g(fv fvVar, ViewGroup viewGroup) {
        c60.e(fvVar, "fragment");
        c60.e(viewGroup, "container");
        xa1 xa1Var = new xa1(fvVar, viewGroup);
        bw bwVar = a;
        bwVar.e(xa1Var);
        c b2 = bwVar.b(fvVar);
        if (b2.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && bwVar.j(b2, fvVar.getClass(), xa1Var.getClass())) {
            bwVar.c(b2, xa1Var);
        }
    }

    public static final void h(fv fvVar, fv fvVar2, int i) {
        c60.e(fvVar, "fragment");
        c60.e(fvVar2, "expectedParentFragment");
        ya1 ya1Var = new ya1(fvVar, fvVar2, i);
        bw bwVar = a;
        bwVar.e(ya1Var);
        c b2 = bwVar.b(fvVar);
        if (b2.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && bwVar.j(b2, fvVar.getClass(), ya1Var.getClass())) {
            bwVar.c(b2, ya1Var);
        }
    }

    public final c b(fv fvVar) {
        while (fvVar != null) {
            if (fvVar.T()) {
                rv C = fvVar.C();
                c60.d(C, "declaringFragment.parentFragmentManager");
                if (C.o0() != null) {
                    c o0 = C.o0();
                    c60.b(o0);
                    return o0;
                }
            }
            fvVar = fvVar.B();
        }
        return b;
    }

    public final void c(c cVar, final g71 g71Var) {
        fv a2 = g71Var.a();
        final String name = a2.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Policy violation in ");
            sb.append(name);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            i(a2, new Runnable() { // from class: androidx.appcompat.view.menu.aw
                @Override // java.lang.Runnable
                public final void run() {
                    bw.d(name, g71Var);
                }
            });
        }
    }

    public final void e(g71 g71Var) {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("StrictMode violation in ");
            sb.append(g71Var.a().getClass().getName());
        }
    }

    public final void i(fv fvVar, Runnable runnable) {
        if (fvVar.T()) {
            fvVar.C().j0();
            throw null;
        } else {
            runnable.run();
        }
    }

    public final boolean j(c cVar, Class cls, Class cls2) {
        boolean n;
        Set set = (Set) cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!c60.a(cls2.getSuperclass(), g71.class)) {
            n = ad.n(set, cls2.getSuperclass());
            if (n) {
                return false;
            }
        }
        return !set.contains(cls2);
    }
}
