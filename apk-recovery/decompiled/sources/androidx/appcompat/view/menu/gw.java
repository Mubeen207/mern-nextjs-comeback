package androidx.appcompat.view.menu;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.v11;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class gw extends fw {

    /* loaded from: classes.dex */
    public class a extends v11.e {
        public final /* synthetic */ Rect a;

        public a(Rect rect) {
            this.a = rect;
        }
    }

    /* loaded from: classes.dex */
    public class b implements v11.f {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public b(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void a(v11 v11Var) {
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void b(v11 v11Var) {
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void c(v11 v11Var) {
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void d(v11 v11Var) {
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void e(v11 v11Var) {
            v11Var.S(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends w11 {
        public final /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // androidx.appcompat.view.menu.w11, androidx.appcompat.view.menu.v11.f
        public void c(v11 v11Var) {
            Object obj = this.a;
            if (obj != null) {
                gw.this.D(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                gw.this.D(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                gw.this.D(obj3, this.f, null);
            }
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void e(v11 v11Var) {
            v11Var.S(this);
        }
    }

    /* loaded from: classes.dex */
    public class d extends v11.e {
        public final /* synthetic */ Rect a;

        public d(Rect rect) {
            this.a = rect;
        }
    }

    public static boolean C(v11 v11Var) {
        return (fw.l(v11Var.C()) && fw.l(v11Var.D()) && fw.l(v11Var.E())) ? false : true;
    }

    @Override // androidx.appcompat.view.menu.fw
    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        z11 z11Var = (z11) obj;
        if (z11Var != null) {
            z11Var.F().clear();
            z11Var.F().addAll(arrayList2);
            D(z11Var, arrayList, arrayList2);
        }
    }

    @Override // androidx.appcompat.view.menu.fw
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        z11 z11Var = new z11();
        z11Var.h0((v11) obj);
        return z11Var;
    }

    public void D(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        v11 v11Var = (v11) obj;
        int i = 0;
        if (v11Var instanceof z11) {
            z11 z11Var = (z11) v11Var;
            int k0 = z11Var.k0();
            while (i < k0) {
                D(z11Var.j0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!C(v11Var)) {
            List F = v11Var.F();
            if (F.size() == arrayList.size() && F.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    v11Var.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    v11Var.T((View) arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.fw
    public void a(Object obj, View view) {
        if (obj != null) {
            ((v11) obj).b(view);
        }
    }

    @Override // androidx.appcompat.view.menu.fw
    public void b(Object obj, ArrayList arrayList) {
        v11 v11Var = (v11) obj;
        if (v11Var == null) {
            return;
        }
        int i = 0;
        if (v11Var instanceof z11) {
            z11 z11Var = (z11) v11Var;
            int k0 = z11Var.k0();
            while (i < k0) {
                b(z11Var.j0(i), arrayList);
                i++;
            }
        } else if (C(v11Var) || !fw.l(v11Var.F())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                v11Var.b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.fw
    public void e(ViewGroup viewGroup, Object obj) {
        x11.a(viewGroup, (v11) obj);
    }

    @Override // androidx.appcompat.view.menu.fw
    public boolean g(Object obj) {
        return obj instanceof v11;
    }

    @Override // androidx.appcompat.view.menu.fw
    public Object h(Object obj) {
        if (obj != null) {
            return ((v11) obj).clone();
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.fw
    public Object o(Object obj, Object obj2, Object obj3) {
        v11 v11Var = (v11) obj;
        v11 v11Var2 = (v11) obj2;
        v11 v11Var3 = (v11) obj3;
        if (v11Var != null && v11Var2 != null) {
            v11Var = new z11().h0(v11Var).h0(v11Var2).p0(1);
        } else if (v11Var == null) {
            v11Var = v11Var2 != null ? v11Var2 : null;
        }
        if (v11Var3 != null) {
            z11 z11Var = new z11();
            if (v11Var != null) {
                z11Var.h0(v11Var);
            }
            z11Var.h0(v11Var3);
            return z11Var;
        }
        return v11Var;
    }

    @Override // androidx.appcompat.view.menu.fw
    public Object p(Object obj, Object obj2, Object obj3) {
        z11 z11Var = new z11();
        if (obj != null) {
            z11Var.h0((v11) obj);
        }
        if (obj2 != null) {
            z11Var.h0((v11) obj2);
        }
        if (obj3 != null) {
            z11Var.h0((v11) obj3);
        }
        return z11Var;
    }

    @Override // androidx.appcompat.view.menu.fw
    public void r(Object obj, View view, ArrayList arrayList) {
        ((v11) obj).a(new b(view, arrayList));
    }

    @Override // androidx.appcompat.view.menu.fw
    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((v11) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.appcompat.view.menu.fw
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((v11) obj).Y(new d(rect));
        }
    }

    @Override // androidx.appcompat.view.menu.fw
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((v11) obj).Y(new a(rect));
        }
    }

    @Override // androidx.appcompat.view.menu.fw
    public void z(Object obj, View view, ArrayList arrayList) {
        z11 z11Var = (z11) obj;
        List F = z11Var.F();
        F.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fw.f(F, (View) arrayList.get(i));
        }
        F.add(view);
        arrayList.add(view);
        b(z11Var, arrayList);
    }
}
