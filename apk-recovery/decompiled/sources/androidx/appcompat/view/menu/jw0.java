package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class jw0 {
    public static final a f = new a(null);
    public final ViewGroup a;
    public final List b;
    public final List c;
    public boolean d;
    public boolean e;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public final jw0 a(ViewGroup viewGroup, rv rvVar) {
            c60.e(viewGroup, "container");
            c60.e(rvVar, "fragmentManager");
            kw0 n0 = rvVar.n0();
            c60.d(n0, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, n0);
        }

        public final jw0 b(ViewGroup viewGroup, kw0 kw0Var) {
            c60.e(viewGroup, "container");
            c60.e(kw0Var, "factory");
            Object tag = viewGroup.getTag(qm0.b);
            if (tag instanceof jw0) {
                return (jw0) tag;
            }
            jw0 a = kw0Var.a(viewGroup);
            c60.d(a, "factory.createController(container)");
            viewGroup.setTag(qm0.b, a);
            return a;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final boolean a;
        public boolean b;
        public boolean c;

        public final void a(ViewGroup viewGroup) {
            c60.e(viewGroup, "container");
            if (!this.c) {
                c(viewGroup);
            }
            this.c = true;
        }

        public boolean b() {
            return this.a;
        }

        public abstract void c(ViewGroup viewGroup);

        public abstract void d(ViewGroup viewGroup);

        public void e(h7 h7Var, ViewGroup viewGroup) {
            c60.e(h7Var, "backEvent");
            c60.e(viewGroup, "container");
        }

        public void f(ViewGroup viewGroup) {
            c60.e(viewGroup, "container");
        }

        public final void g(ViewGroup viewGroup) {
            c60.e(viewGroup, "container");
            if (!this.b) {
                f(viewGroup);
            }
            this.b = true;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends d {
        public final yv l;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(androidx.appcompat.view.menu.jw0.d.b r3, androidx.appcompat.view.menu.jw0.d.a r4, androidx.appcompat.view.menu.yv r5) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                androidx.appcompat.view.menu.c60.e(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                androidx.appcompat.view.menu.c60.e(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                androidx.appcompat.view.menu.c60.e(r5, r0)
                androidx.appcompat.view.menu.fv r0 = r5.k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                androidx.appcompat.view.menu.c60.d(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.l = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.jw0.c.<init>(androidx.appcompat.view.menu.jw0$d$b, androidx.appcompat.view.menu.jw0$d$a, androidx.appcompat.view.menu.yv):void");
        }

        @Override // androidx.appcompat.view.menu.jw0.d
        public void e() {
            super.e();
            i().m = false;
            this.l.m();
        }

        @Override // androidx.appcompat.view.menu.jw0.d
        public void q() {
            if (o()) {
                return;
            }
            super.q();
            if (j() != d.a.ADDING) {
                if (j() == d.a.REMOVING) {
                    fv k = this.l.k();
                    c60.d(k, "fragmentStateManager.fragment");
                    View S0 = k.S0();
                    c60.d(S0, "fragment.requireView()");
                    if (rv.v0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Clearing focus ");
                        sb.append(S0.findFocus());
                        sb.append(" on view ");
                        sb.append(S0);
                        sb.append(" for Fragment ");
                        sb.append(k);
                    }
                    S0.clearFocus();
                    return;
                }
                return;
            }
            fv k2 = this.l.k();
            c60.d(k2, "fragmentStateManager.fragment");
            View findFocus = k2.H.findFocus();
            if (findFocus != null) {
                k2.Y0(findFocus);
                if (rv.v0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("requestFocus: Saved focused view ");
                    sb2.append(findFocus);
                    sb2.append(" for Fragment ");
                    sb2.append(k2);
                }
            }
            View S02 = i().S0();
            c60.d(S02, "this.fragment.requireView()");
            if (S02.getParent() == null) {
                this.l.b();
                S02.setAlpha(0.0f);
            }
            if (S02.getAlpha() == 0.0f && S02.getVisibility() == 0) {
                S02.setVisibility(4);
            }
            S02.setAlpha(k2.G());
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public b a;
        public a b;
        public final fv c;
        public final List d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public final List j;
        public final List k;

        /* loaded from: classes.dex */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes.dex */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;
            
            public static final a m = new a(null);

            /* loaded from: classes.dex */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(lj ljVar) {
                    this();
                }

                public final b a(View view) {
                    c60.e(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i) {
                    if (i != 0) {
                        if (i != 4) {
                            if (i == 8) {
                                return b.GONE;
                            }
                            throw new IllegalArgumentException("Unknown visibility " + i);
                        }
                        return b.INVISIBLE;
                    }
                    return b.VISIBLE;
                }
            }

            /* renamed from: androidx.appcompat.view.menu.jw0$d$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0008b {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    a = iArr;
                }
            }

            public static final b g(int i) {
                return m.b(i);
            }

            public final void e(View view, ViewGroup viewGroup) {
                c60.e(view, "view");
                c60.e(viewGroup, "container");
                int i = C0008b.a[ordinal()];
                if (i == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (rv.v0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Removing view ");
                            sb.append(view);
                            sb.append(" from container ");
                            sb.append(viewGroup2);
                        }
                        viewGroup2.removeView(view);
                    }
                } else if (i == 2) {
                    if (rv.v0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Setting view ");
                        sb2.append(view);
                        sb2.append(" to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (rv.v0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("SpecialEffectsController: Adding view ");
                            sb3.append(view);
                            sb3.append(" to Container ");
                            sb3.append(viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (rv.v0(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("SpecialEffectsController: Setting view ");
                        sb4.append(view);
                        sb4.append(" to GONE");
                    }
                    view.setVisibility(8);
                } else if (i != 4) {
                } else {
                    if (rv.v0(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("SpecialEffectsController: Setting view ");
                        sb5.append(view);
                        sb5.append(" to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class c {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public d(b bVar, a aVar, fv fvVar) {
            c60.e(bVar, "finalState");
            c60.e(aVar, "lifecycleImpact");
            c60.e(fvVar, "fragment");
            this.a = bVar;
            this.b = aVar;
            this.c = fvVar;
            this.d = new ArrayList();
            this.i = true;
            ArrayList arrayList = new ArrayList();
            this.j = arrayList;
            this.k = arrayList;
        }

        public final void a(Runnable runnable) {
            c60.e(runnable, "listener");
            this.d.add(runnable);
        }

        public final void b(b bVar) {
            c60.e(bVar, "effect");
            this.j.add(bVar);
        }

        public final void c(ViewGroup viewGroup) {
            List<b> u;
            c60.e(viewGroup, "container");
            this.h = false;
            if (this.e) {
                return;
            }
            this.e = true;
            if (this.j.isEmpty()) {
                e();
                return;
            }
            u = ad.u(this.k);
            for (b bVar : u) {
                bVar.a(viewGroup);
            }
        }

        public final void d(ViewGroup viewGroup, boolean z) {
            c60.e(viewGroup, "container");
            if (this.e) {
                return;
            }
            if (z) {
                this.g = true;
            }
            c(viewGroup);
        }

        public void e() {
            this.h = false;
            if (this.f) {
                return;
            }
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
            }
            this.f = true;
            for (Runnable runnable : this.d) {
                runnable.run();
            }
        }

        public final void f(b bVar) {
            c60.e(bVar, "effect");
            if (this.j.remove(bVar) && this.j.isEmpty()) {
                e();
            }
        }

        public final List g() {
            return this.k;
        }

        public final b h() {
            return this.a;
        }

        public final fv i() {
            return this.c;
        }

        public final a j() {
            return this.b;
        }

        public final boolean k() {
            return this.i;
        }

        public final boolean l() {
            return this.e;
        }

        public final boolean m() {
            return this.f;
        }

        public final boolean n() {
            return this.g;
        }

        public final boolean o() {
            return this.h;
        }

        public final void p(b bVar, a aVar) {
            c60.e(bVar, "finalState");
            c60.e(aVar, "lifecycleImpact");
            int i = c.a[aVar.ordinal()];
            if (i == 1) {
                if (this.a == b.REMOVED) {
                    if (rv.v0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: For fragment ");
                        sb.append(this.c);
                        sb.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        sb.append(this.b);
                        sb.append(" to ADDING.");
                    }
                    this.a = b.VISIBLE;
                    this.b = a.ADDING;
                    this.i = true;
                }
            } else if (i == 2) {
                if (rv.v0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.c);
                    sb2.append(" mFinalState = ");
                    sb2.append(this.a);
                    sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb2.append(this.b);
                    sb2.append(" to REMOVING.");
                }
                this.a = b.REMOVED;
                this.b = a.REMOVING;
                this.i = true;
            } else if (i == 3 && this.a != b.REMOVED) {
                if (rv.v0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.c);
                    sb3.append(" mFinalState = ");
                    sb3.append(this.a);
                    sb3.append(" -> ");
                    sb3.append(bVar);
                    sb3.append('.');
                }
                this.a = bVar;
            }
        }

        public void q() {
            this.h = true;
        }

        public final void r(boolean z) {
            this.i = z;
        }

        public String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            return "Operation {" + hexString + "} {finalState = " + this.a + " lifecycleImpact = " + this.b + " fragment = " + this.c + '}';
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public jw0(ViewGroup viewGroup) {
        c60.e(viewGroup, "container");
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final void h(jw0 jw0Var, c cVar) {
        c60.e(jw0Var, "this$0");
        c60.e(cVar, "$operation");
        if (jw0Var.b.contains(cVar)) {
            d.b h = cVar.h();
            View view = cVar.i().H;
            c60.d(view, "operation.fragment.mView");
            h.e(view, jw0Var.a);
        }
    }

    public static final void i(jw0 jw0Var, c cVar) {
        c60.e(jw0Var, "this$0");
        c60.e(cVar, "$operation");
        jw0Var.b.remove(cVar);
        jw0Var.c.remove(cVar);
    }

    public static final jw0 u(ViewGroup viewGroup, rv rvVar) {
        return f.a(viewGroup, rvVar);
    }

    public static final jw0 v(ViewGroup viewGroup, kw0 kw0Var) {
        return f.b(viewGroup, kw0Var);
    }

    public final void A(boolean z) {
        this.d = z;
    }

    public final void c(d dVar) {
        c60.e(dVar, "operation");
        if (dVar.k()) {
            d.b h = dVar.h();
            View S0 = dVar.i().S0();
            c60.d(S0, "operation.fragment.requireView()");
            h.e(S0, this.a);
            dVar.r(false);
        }
    }

    public abstract void d(List list, boolean z);

    public void e(List list) {
        Set x;
        List u;
        List u2;
        c60.e(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xc.k(arrayList, ((d) it.next()).g());
        }
        x = ad.x(arrayList);
        u = ad.u(x);
        int size = u.size();
        for (int i = 0; i < size; i++) {
            ((b) u.get(i)).d(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c((d) list.get(i2));
        }
        u2 = ad.u(list);
        int size3 = u2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            d dVar = (d) u2.get(i3);
            if (dVar.g().isEmpty()) {
                dVar.e();
            }
        }
    }

    public final void f() {
        rv.v0(3);
        y(this.c);
        e(this.c);
    }

    public final void g(d.b bVar, d.a aVar, yv yvVar) {
        synchronized (this.b) {
            try {
                fv k = yvVar.k();
                c60.d(k, "fragmentStateManager.fragment");
                d o = o(k);
                if (o == null) {
                    if (yvVar.k().m) {
                        fv k2 = yvVar.k();
                        c60.d(k2, "fragmentStateManager.fragment");
                        o = p(k2);
                    } else {
                        o = null;
                    }
                }
                if (o != null) {
                    o.p(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, yvVar);
                this.b.add(cVar);
                cVar.a(new Runnable() { // from class: androidx.appcompat.view.menu.hw0
                    @Override // java.lang.Runnable
                    public final void run() {
                        jw0.h(jw0.this, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: androidx.appcompat.view.menu.iw0
                    @Override // java.lang.Runnable
                    public final void run() {
                        jw0.i(jw0.this, cVar);
                    }
                });
                u31 u31Var = u31.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(d.b bVar, yv yvVar) {
        c60.e(bVar, "finalState");
        c60.e(yvVar, "fragmentStateManager");
        if (rv.v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(yvVar.k());
        }
        g(bVar, d.a.ADDING, yvVar);
    }

    public final void k(yv yvVar) {
        c60.e(yvVar, "fragmentStateManager");
        if (rv.v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(yvVar.k());
        }
        g(d.b.GONE, d.a.NONE, yvVar);
    }

    public final void l(yv yvVar) {
        c60.e(yvVar, "fragmentStateManager");
        if (rv.v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(yvVar.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, yvVar);
    }

    public final void m(yv yvVar) {
        c60.e(yvVar, "fragmentStateManager");
        if (rv.v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(yvVar.k());
        }
        g(d.b.VISIBLE, d.a.NONE, yvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x016f A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:11:0x0017, B:13:0x0020, B:14:0x0031, B:16:0x0037, B:18:0x0043, B:21:0x0059, B:23:0x0064, B:76:0x0193, B:24:0x006a, B:25:0x007b, B:27:0x0081, B:29:0x008d, B:30:0x009a, B:32:0x00ab, B:33:0x00b1, B:37:0x00c4, B:38:0x00e9, B:40:0x00ef, B:42:0x0102, B:44:0x010c, B:55:0x0130, B:47:0x0116, B:48:0x011a, B:50:0x0120, B:58:0x013c, B:60:0x0140, B:61:0x014c, B:63:0x0152, B:64:0x0162, B:68:0x016b, B:70:0x016f, B:75:0x018e, B:72:0x0178, B:74:0x0182), top: B:81:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.jw0.n():void");
    }

    public final d o(fv fvVar) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (c60.a(dVar.i(), fvVar) && !dVar.l()) {
                break;
            }
        }
        return (d) obj;
    }

    public final d p(fv fvVar) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (c60.a(dVar.i(), fvVar) && !dVar.l()) {
                break;
            }
        }
        return (d) obj;
    }

    public final void q() {
        List<d> w;
        List<d> w2;
        rv.v0(2);
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                z();
                y(this.b);
                w = ad.w(this.c);
                for (d dVar : w) {
                    if (rv.v0(2)) {
                        String str = isAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ";
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(str);
                        sb.append("Cancelling running operation ");
                        sb.append(dVar);
                    }
                    dVar.c(this.a);
                }
                w2 = ad.w(this.b);
                for (d dVar2 : w2) {
                    if (rv.v0(2)) {
                        String str2 = isAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ";
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(str2);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(dVar2);
                    }
                    dVar2.c(this.a);
                }
                u31 u31Var = u31.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (this.e) {
            rv.v0(2);
            this.e = false;
            n();
        }
    }

    public final d.a s(yv yvVar) {
        c60.e(yvVar, "fragmentStateManager");
        fv k = yvVar.k();
        c60.d(k, "fragmentStateManager.fragment");
        d o = o(k);
        d.a j = o != null ? o.j() : null;
        d p = p(k);
        d.a j2 = p != null ? p.j() : null;
        int i = j == null ? -1 : e.a[j.ordinal()];
        return (i == -1 || i == 1) ? j2 : j;
    }

    public final ViewGroup t() {
        return this.a;
    }

    public final void w() {
        Object obj;
        synchronized (this.b) {
            try {
                z();
                List list = this.b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    d dVar = (d) obj;
                    d.b.a aVar = d.b.m;
                    View view = dVar.i().H;
                    c60.d(view, "operation.fragment.mView");
                    d.b a2 = aVar.a(view);
                    d.b h = dVar.h();
                    d.b bVar = d.b.VISIBLE;
                    if (h == bVar && a2 != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) obj;
                fv i = dVar2 != null ? dVar2.i() : null;
                this.e = i != null ? i.X() : false;
                u31 u31Var = u31.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(h7 h7Var) {
        Set x;
        List u;
        c60.e(h7Var, "backEvent");
        if (rv.v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Processing Progress ");
            sb.append(h7Var.a());
        }
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.c) {
            xc.k(arrayList, dVar.g());
        }
        x = ad.x(arrayList);
        u = ad.u(x);
        int size = u.size();
        for (int i = 0; i < size; i++) {
            ((b) u.get(i)).e(h7Var, this.a);
        }
    }

    public final void y(List list) {
        Set x;
        List u;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((d) list.get(i)).q();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xc.k(arrayList, ((d) it.next()).g());
        }
        x = ad.x(arrayList);
        u = ad.u(x);
        int size2 = u.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((b) u.get(i2)).g(this.a);
        }
    }

    public final void z() {
        for (d dVar : this.b) {
            if (dVar.j() == d.a.ADDING) {
                View S0 = dVar.i().S0();
                c60.d(S0, "fragment.requireView()");
                dVar.p(d.b.m.b(S0.getVisibility()), d.a.NONE);
            }
        }
    }
}
