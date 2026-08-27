package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.b0;
import androidx.appcompat.view.menu.p0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.q0;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class k extends b0 {
    public final RecyclerView d;
    public final a e;

    /* loaded from: classes.dex */
    public static class a extends b0 {
        public final k d;
        public Map e = new WeakHashMap();

        public a(k kVar) {
            this.d = kVar;
        }

        @Override // androidx.appcompat.view.menu.b0
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            b0 b0Var = (b0) this.e.get(view);
            return b0Var != null ? b0Var.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.appcompat.view.menu.b0
        public q0 b(View view) {
            b0 b0Var = (b0) this.e.get(view);
            return b0Var != null ? b0Var.b(view) : super.b(view);
        }

        @Override // androidx.appcompat.view.menu.b0
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            b0 b0Var = (b0) this.e.get(view);
            if (b0Var != null) {
                b0Var.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.appcompat.view.menu.b0
        public void g(View view, p0 p0Var) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                super.g(view, p0Var);
                return;
            }
            this.d.d.getLayoutManager().U0(view, p0Var);
            b0 b0Var = (b0) this.e.get(view);
            if (b0Var != null) {
                b0Var.g(view, p0Var);
            } else {
                super.g(view, p0Var);
            }
        }

        @Override // androidx.appcompat.view.menu.b0
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            b0 b0Var = (b0) this.e.get(view);
            if (b0Var != null) {
                b0Var.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.appcompat.view.menu.b0
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            b0 b0Var = (b0) this.e.get(viewGroup);
            return b0Var != null ? b0Var.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.appcompat.view.menu.b0
        public boolean j(View view, int i, Bundle bundle) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                return super.j(view, i, bundle);
            }
            b0 b0Var = (b0) this.e.get(view);
            if (b0Var != null) {
                if (b0Var.j(view, i, bundle)) {
                    return true;
                }
            } else if (super.j(view, i, bundle)) {
                return true;
            }
            return this.d.d.getLayoutManager().o1(view, i, bundle);
        }

        @Override // androidx.appcompat.view.menu.b0
        public void l(View view, int i) {
            b0 b0Var = (b0) this.e.get(view);
            if (b0Var != null) {
                b0Var.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // androidx.appcompat.view.menu.b0
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            b0 b0Var = (b0) this.e.get(view);
            if (b0Var != null) {
                b0Var.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public b0 n(View view) {
            return (b0) this.e.remove(view);
        }

        public void o(View view) {
            b0 i = p51.i(view);
            if (i == null || i == this) {
                return;
            }
            this.e.put(view, i);
        }
    }

    public k(RecyclerView recyclerView) {
        this.d = recyclerView;
        b0 n = n();
        if (n == null || !(n instanceof a)) {
            this.e = new a(this);
        } else {
            this.e = (a) n;
        }
    }

    @Override // androidx.appcompat.view.menu.b0
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().Q0(accessibilityEvent);
        }
    }

    @Override // androidx.appcompat.view.menu.b0
    public void g(View view, p0 p0Var) {
        super.g(view, p0Var);
        if (o() || this.d.getLayoutManager() == null) {
            return;
        }
        this.d.getLayoutManager().S0(p0Var);
    }

    @Override // androidx.appcompat.view.menu.b0
    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().m1(i, bundle);
    }

    public b0 n() {
        return this.e;
    }

    public boolean o() {
        return this.d.k0();
    }
}
