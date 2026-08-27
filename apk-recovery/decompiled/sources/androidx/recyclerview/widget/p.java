package androidx.recyclerview.widget;

import androidx.appcompat.view.menu.hj0;
import androidx.appcompat.view.menu.jj0;
import androidx.appcompat.view.menu.qa0;
import androidx.appcompat.view.menu.qu0;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class p {
    public final qu0 a = new qu0();
    public final qa0 b = new qa0();

    /* loaded from: classes.dex */
    public static class a {
        public static hj0 d = new jj0(20);
        public int a;
        public RecyclerView.l.b b;
        public RecyclerView.l.b c;

        public static void a() {
            do {
            } while (d.b() != null);
        }

        public static a b() {
            a aVar = (a) d.b();
            return aVar == null ? new a() : aVar;
        }

        public static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.c0 c0Var);

        void b(RecyclerView.c0 c0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void c(RecyclerView.c0 c0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void d(RecyclerView.c0 c0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);
    }

    public void a(RecyclerView.c0 c0Var, RecyclerView.l.b bVar) {
        a aVar = (a) this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.a |= 2;
        aVar.b = bVar;
    }

    public void b(RecyclerView.c0 c0Var) {
        a aVar = (a) this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.a |= 1;
    }

    public void c(long j, RecyclerView.c0 c0Var) {
        this.b.h(j, c0Var);
    }

    public void d(RecyclerView.c0 c0Var, RecyclerView.l.b bVar) {
        a aVar = (a) this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.c = bVar;
        aVar.a |= 8;
    }

    public void e(RecyclerView.c0 c0Var, RecyclerView.l.b bVar) {
        a aVar = (a) this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.b = bVar;
        aVar.a |= 4;
    }

    public void f() {
        this.a.clear();
        this.b.a();
    }

    public RecyclerView.c0 g(long j) {
        return (RecyclerView.c0) this.b.d(j);
    }

    public boolean h(RecyclerView.c0 c0Var) {
        a aVar = (a) this.a.get(c0Var);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.c0 c0Var) {
        a aVar = (a) this.a.get(c0Var);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.c0 c0Var) {
        p(c0Var);
    }

    public final RecyclerView.l.b l(RecyclerView.c0 c0Var, int i) {
        a aVar;
        RecyclerView.l.b bVar;
        int f = this.a.f(c0Var);
        if (f >= 0 && (aVar = (a) this.a.m(f)) != null) {
            int i2 = aVar.a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                aVar.a = i3;
                if (i == 4) {
                    bVar = aVar.b;
                } else if (i != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    bVar = aVar.c;
                }
                if ((i3 & 12) == 0) {
                    this.a.k(f);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    public RecyclerView.l.b m(RecyclerView.c0 c0Var) {
        return l(c0Var, 8);
    }

    public RecyclerView.l.b n(RecyclerView.c0 c0Var) {
        return l(c0Var, 4);
    }

    public void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.c0 c0Var = (RecyclerView.c0) this.a.i(size);
            a aVar = (a) this.a.k(size);
            int i = aVar.a;
            if ((i & 3) == 3) {
                bVar.a(c0Var);
            } else if ((i & 1) != 0) {
                RecyclerView.l.b bVar2 = aVar.b;
                if (bVar2 == null) {
                    bVar.a(c0Var);
                } else {
                    bVar.c(c0Var, bVar2, aVar.c);
                }
            } else if ((i & 14) == 14) {
                bVar.b(c0Var, aVar.b, aVar.c);
            } else if ((i & 12) == 12) {
                bVar.d(c0Var, aVar.b, aVar.c);
            } else if ((i & 4) != 0) {
                bVar.c(c0Var, aVar.b, null);
            } else if ((i & 8) != 0) {
                bVar.b(c0Var, aVar.b, aVar.c);
            }
            a.c(aVar);
        }
    }

    public void p(RecyclerView.c0 c0Var) {
        a aVar = (a) this.a.get(c0Var);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    public void q(RecyclerView.c0 c0Var) {
        int n = this.b.n() - 1;
        while (true) {
            if (n < 0) {
                break;
            } else if (c0Var == this.b.o(n)) {
                this.b.j(n);
                break;
            } else {
                n--;
            }
        }
        a aVar = (a) this.a.remove(c0Var);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
