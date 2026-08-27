package androidx.appcompat.view.menu;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class np0 implements xd {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final xd g;

    /* loaded from: classes.dex */
    public static class a implements vl0 {
        public final Set a;
        public final vl0 b;

        public a(Set set, vl0 vl0Var) {
            this.a = set;
            this.b = vl0Var;
        }
    }

    public np0(ud udVar, xd xdVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (il ilVar : udVar.g()) {
            if (ilVar.d()) {
                if (ilVar.f()) {
                    hashSet4.add(ilVar.b());
                } else {
                    hashSet.add(ilVar.b());
                }
            } else if (ilVar.c()) {
                hashSet3.add(ilVar.b());
            } else if (ilVar.f()) {
                hashSet5.add(ilVar.b());
            } else {
                hashSet2.add(ilVar.b());
            }
        }
        if (!udVar.k().isEmpty()) {
            hashSet.add(xl0.b(vl0.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = udVar.k();
        this.g = xdVar;
    }

    @Override // androidx.appcompat.view.menu.xd
    public Object a(Class cls) {
        if (this.a.contains(xl0.b(cls))) {
            Object a2 = this.g.a(cls);
            return !cls.equals(vl0.class) ? a2 : new a(this.f, (vl0) a2);
        }
        throw new ll(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // androidx.appcompat.view.menu.xd
    public hl0 b(xl0 xl0Var) {
        if (this.b.contains(xl0Var)) {
            return this.g.b(xl0Var);
        }
        throw new ll(String.format("Attempting to request an undeclared dependency Provider<%s>.", xl0Var));
    }

    @Override // androidx.appcompat.view.menu.xd
    public hl0 d(Class cls) {
        return b(xl0.b(cls));
    }

    @Override // androidx.appcompat.view.menu.xd
    public Object e(xl0 xl0Var) {
        if (this.a.contains(xl0Var)) {
            return this.g.e(xl0Var);
        }
        throw new ll(String.format("Attempting to request an undeclared dependency %s.", xl0Var));
    }

    @Override // androidx.appcompat.view.menu.xd
    public Set f(xl0 xl0Var) {
        if (this.d.contains(xl0Var)) {
            return this.g.f(xl0Var);
        }
        throw new ll(String.format("Attempting to request an undeclared dependency Set<%s>.", xl0Var));
    }

    @Override // androidx.appcompat.view.menu.xd
    public hl0 g(xl0 xl0Var) {
        if (this.e.contains(xl0Var)) {
            return this.g.g(xl0Var);
        }
        throw new ll(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", xl0Var));
    }
}
