package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class x11 {
    public static v11 a = new l5();
    public static ThreadLocal b = new ThreadLocal();
    public static ArrayList c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public v11 a;
        public ViewGroup b;

        /* renamed from: androidx.appcompat.view.menu.x11$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0034a extends w11 {
            public final /* synthetic */ o4 a;

            public C0034a(o4 o4Var) {
                this.a = o4Var;
            }

            @Override // androidx.appcompat.view.menu.v11.f
            public void e(v11 v11Var) {
                ((ArrayList) this.a.get(a.this.b)).remove(v11Var);
                v11Var.S(this);
            }
        }

        public a(v11 v11Var, ViewGroup viewGroup) {
            this.a = v11Var;
            this.b = viewGroup;
        }

        public final void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (x11.c.remove(this.b)) {
                o4 b = x11.b();
                ArrayList arrayList = (ArrayList) b.get(this.b);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    b.put(this.b, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.a);
                this.a.a(new C0034a(b));
                this.a.n(this.b, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((v11) it.next()).U(this.b);
                    }
                }
                this.a.R(this.b);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            x11.c.remove(this.b);
            ArrayList arrayList = (ArrayList) x11.b().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((v11) it.next()).U(this.b);
                }
            }
            this.a.o(true);
        }
    }

    public static void a(ViewGroup viewGroup, v11 v11Var) {
        if (c.contains(viewGroup) || !p51.O(viewGroup)) {
            return;
        }
        c.add(viewGroup);
        if (v11Var == null) {
            v11Var = a;
        }
        v11 clone = v11Var.clone();
        d(viewGroup, clone);
        vr0.b(viewGroup, null);
        c(viewGroup, clone);
    }

    public static o4 b() {
        o4 o4Var;
        WeakReference weakReference = (WeakReference) b.get();
        if (weakReference == null || (o4Var = (o4) weakReference.get()) == null) {
            o4 o4Var2 = new o4();
            b.set(new WeakReference(o4Var2));
            return o4Var2;
        }
        return o4Var;
    }

    public static void c(ViewGroup viewGroup, v11 v11Var) {
        if (v11Var == null || viewGroup == null) {
            return;
        }
        a aVar = new a(v11Var, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void d(ViewGroup viewGroup, v11 v11Var) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((v11) it.next()).Q(viewGroup);
            }
        }
        if (v11Var != null) {
            v11Var.n(viewGroup, true);
        }
        vr0.a(viewGroup);
    }
}
