package androidx.appcompat.view.menu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class v11 implements Cloneable {
    public static final int[] S = {2, 1, 3, 4};
    public static final vh0 T = new a();
    public static ThreadLocal U = new ThreadLocal();
    public ArrayList F;
    public ArrayList G;
    public e P;
    public o4 Q;
    public String m = getClass().getName();
    public long n = -1;
    public long o = -1;
    public TimeInterpolator p = null;
    public ArrayList q = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = null;
    public ArrayList t = null;
    public ArrayList u = null;
    public ArrayList v = null;
    public ArrayList w = null;
    public ArrayList x = null;
    public ArrayList y = null;
    public ArrayList z = null;
    public ArrayList A = null;
    public c21 B = new c21();
    public c21 C = new c21();
    public z11 D = null;
    public int[] E = S;
    public ViewGroup H = null;
    public boolean I = false;
    public ArrayList J = new ArrayList();
    public int K = 0;
    public boolean L = false;
    public boolean M = false;
    public ArrayList N = null;
    public ArrayList O = new ArrayList();
    public vh0 R = T;

    /* loaded from: classes.dex */
    public static class a extends vh0 {
        @Override // androidx.appcompat.view.menu.vh0
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ o4 a;

        public b(o4 o4Var) {
            this.a = o4Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            v11.this.J.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            v11.this.J.add(animator);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            v11.this.s();
            animator.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public View a;
        public String b;
        public b21 c;
        public h81 d;
        public v11 e;

        public d(View view, String str, v11 v11Var, h81 h81Var, b21 b21Var) {
            this.a = view;
            this.b = str;
            this.c = b21Var;
            this.d = h81Var;
            this.e = v11Var;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(v11 v11Var);

        void b(v11 v11Var);

        void c(v11 v11Var);

        void d(v11 v11Var);

        void e(v11 v11Var);
    }

    public static o4 A() {
        o4 o4Var = (o4) U.get();
        if (o4Var == null) {
            o4 o4Var2 = new o4();
            U.set(o4Var2);
            return o4Var2;
        }
        return o4Var;
    }

    public static boolean K(b21 b21Var, b21 b21Var2, String str) {
        Object obj = b21Var.a.get(str);
        Object obj2 = b21Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void d(c21 c21Var, View view, b21 b21Var) {
        c21Var.a.put(view, b21Var);
        int id = view.getId();
        if (id >= 0) {
            if (c21Var.b.indexOfKey(id) >= 0) {
                c21Var.b.put(id, null);
            } else {
                c21Var.b.put(id, view);
            }
        }
        String F = p51.F(view);
        if (F != null) {
            if (c21Var.d.containsKey(F)) {
                c21Var.d.put(F, null);
            } else {
                c21Var.d.put(F, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c21Var.c.f(itemIdAtPosition) < 0) {
                    p51.t0(view, true);
                    c21Var.c.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c21Var.c.d(itemIdAtPosition);
                if (view2 != null) {
                    p51.t0(view2, false);
                    c21Var.c.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public long B() {
        return this.n;
    }

    public List C() {
        return this.q;
    }

    public List D() {
        return this.s;
    }

    public List E() {
        return this.t;
    }

    public List F() {
        return this.r;
    }

    public String[] G() {
        return null;
    }

    public b21 H(View view, boolean z) {
        z11 z11Var = this.D;
        if (z11Var != null) {
            return z11Var.H(view, z);
        }
        return (b21) (z ? this.B : this.C).a.get(view);
    }

    public boolean I(b21 b21Var, b21 b21Var2) {
        if (b21Var == null || b21Var2 == null) {
            return false;
        }
        String[] G = G();
        if (G == null) {
            for (String str : b21Var.a.keySet()) {
                if (K(b21Var, b21Var2, str)) {
                }
            }
            return false;
        }
        for (String str2 : G) {
            if (!K(b21Var, b21Var2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean J(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.u;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList arrayList4 = this.v;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList arrayList5 = this.w;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i = 0; i < size; i++) {
                        if (((Class) this.w.get(i)).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.x == null || p51.F(view) == null || !this.x.contains(p51.F(view))) {
                    if ((this.q.size() == 0 && this.r.size() == 0 && (((arrayList = this.t) == null || arrayList.isEmpty()) && ((arrayList2 = this.s) == null || arrayList2.isEmpty()))) || this.q.contains(Integer.valueOf(id)) || this.r.contains(view)) {
                        return true;
                    }
                    ArrayList arrayList6 = this.s;
                    if (arrayList6 == null || !arrayList6.contains(p51.F(view))) {
                        if (this.t != null) {
                            for (int i2 = 0; i2 < this.t.size(); i2++) {
                                if (((Class) this.t.get(i2)).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void L(o4 o4Var, o4 o4Var2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) sparseArray.valueAt(i);
            if (view2 != null && J(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i))) != null && J(view)) {
                b21 b21Var = (b21) o4Var.get(view2);
                b21 b21Var2 = (b21) o4Var2.get(view);
                if (b21Var != null && b21Var2 != null) {
                    this.F.add(b21Var);
                    this.G.add(b21Var2);
                    o4Var.remove(view2);
                    o4Var2.remove(view);
                }
            }
        }
    }

    public final void M(o4 o4Var, o4 o4Var2) {
        b21 b21Var;
        for (int size = o4Var.size() - 1; size >= 0; size--) {
            View view = (View) o4Var.i(size);
            if (view != null && J(view) && (b21Var = (b21) o4Var2.remove(view)) != null && J(b21Var.b)) {
                this.F.add((b21) o4Var.k(size));
                this.G.add(b21Var);
            }
        }
    }

    public final void N(o4 o4Var, o4 o4Var2, qa0 qa0Var, qa0 qa0Var2) {
        View view;
        int n = qa0Var.n();
        for (int i = 0; i < n; i++) {
            View view2 = (View) qa0Var.o(i);
            if (view2 != null && J(view2) && (view = (View) qa0Var2.d(qa0Var.g(i))) != null && J(view)) {
                b21 b21Var = (b21) o4Var.get(view2);
                b21 b21Var2 = (b21) o4Var2.get(view);
                if (b21Var != null && b21Var2 != null) {
                    this.F.add(b21Var);
                    this.G.add(b21Var2);
                    o4Var.remove(view2);
                    o4Var2.remove(view);
                }
            }
        }
    }

    public final void O(o4 o4Var, o4 o4Var2, o4 o4Var3, o4 o4Var4) {
        View view;
        int size = o4Var3.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) o4Var3.m(i);
            if (view2 != null && J(view2) && (view = (View) o4Var4.get(o4Var3.i(i))) != null && J(view)) {
                b21 b21Var = (b21) o4Var.get(view2);
                b21 b21Var2 = (b21) o4Var2.get(view);
                if (b21Var != null && b21Var2 != null) {
                    this.F.add(b21Var);
                    this.G.add(b21Var2);
                    o4Var.remove(view2);
                    o4Var2.remove(view);
                }
            }
        }
    }

    public final void P(c21 c21Var, c21 c21Var2) {
        o4 o4Var = new o4(c21Var.a);
        o4 o4Var2 = new o4(c21Var2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.E;
            if (i >= iArr.length) {
                c(o4Var, o4Var2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                M(o4Var, o4Var2);
            } else if (i2 == 2) {
                O(o4Var, o4Var2, c21Var.d, c21Var2.d);
            } else if (i2 == 3) {
                L(o4Var, o4Var2, c21Var.b, c21Var2.b);
            } else if (i2 == 4) {
                N(o4Var, o4Var2, c21Var.c, c21Var2.c);
            }
            i++;
        }
    }

    public void Q(View view) {
        if (this.M) {
            return;
        }
        o4 A = A();
        int size = A.size();
        h81 d2 = q61.d(view);
        for (int i = size - 1; i >= 0; i--) {
            d dVar = (d) A.m(i);
            if (dVar.a != null && d2.equals(dVar.d)) {
                l2.b((Animator) A.i(i));
            }
        }
        ArrayList arrayList = this.N;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.N.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).b(this);
            }
        }
        this.L = true;
    }

    public void R(ViewGroup viewGroup) {
        d dVar;
        this.F = new ArrayList();
        this.G = new ArrayList();
        P(this.B, this.C);
        o4 A = A();
        int size = A.size();
        h81 d2 = q61.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) A.i(i);
            if (animator != null && (dVar = (d) A.get(animator)) != null && dVar.a != null && d2.equals(dVar.d)) {
                b21 b21Var = dVar.c;
                View view = dVar.a;
                b21 H = H(view, true);
                b21 w = w(view, true);
                if (H == null && w == null) {
                    w = (b21) this.C.a.get(view);
                }
                if ((H != null || w != null) && dVar.e.I(b21Var, w)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        A.remove(animator);
                    }
                }
            }
        }
        r(viewGroup, this.B, this.C, this.F, this.G);
        W();
    }

    public v11 S(f fVar) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.N.size() == 0) {
            this.N = null;
        }
        return this;
    }

    public v11 T(View view) {
        this.r.remove(view);
        return this;
    }

    public void U(View view) {
        if (this.L) {
            if (!this.M) {
                o4 A = A();
                int size = A.size();
                h81 d2 = q61.d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d dVar = (d) A.m(i);
                    if (dVar.a != null && d2.equals(dVar.d)) {
                        l2.c((Animator) A.i(i));
                    }
                }
                ArrayList arrayList = this.N;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.N.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).d(this);
                    }
                }
            }
            this.L = false;
        }
    }

    public final void V(Animator animator, o4 o4Var) {
        if (animator != null) {
            animator.addListener(new b(o4Var));
            e(animator);
        }
    }

    public void W() {
        d0();
        o4 A = A();
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (A.containsKey(animator)) {
                d0();
                V(animator, A);
            }
        }
        this.O.clear();
        s();
    }

    public v11 X(long j) {
        this.o = j;
        return this;
    }

    public void Y(e eVar) {
        this.P = eVar;
    }

    public v11 Z(TimeInterpolator timeInterpolator) {
        this.p = timeInterpolator;
        return this;
    }

    public v11 a(f fVar) {
        if (this.N == null) {
            this.N = new ArrayList();
        }
        this.N.add(fVar);
        return this;
    }

    public void a0(vh0 vh0Var) {
        if (vh0Var == null) {
            this.R = T;
        } else {
            this.R = vh0Var;
        }
    }

    public v11 b(View view) {
        this.r.add(view);
        return this;
    }

    public void b0(y11 y11Var) {
    }

    public final void c(o4 o4Var, o4 o4Var2) {
        for (int i = 0; i < o4Var.size(); i++) {
            b21 b21Var = (b21) o4Var.m(i);
            if (J(b21Var.b)) {
                this.F.add(b21Var);
                this.G.add(null);
            }
        }
        for (int i2 = 0; i2 < o4Var2.size(); i2++) {
            b21 b21Var2 = (b21) o4Var2.m(i2);
            if (J(b21Var2.b)) {
                this.G.add(b21Var2);
                this.F.add(null);
            }
        }
    }

    public v11 c0(long j) {
        this.n = j;
        return this;
    }

    public void d0() {
        if (this.K == 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.N.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).c(this);
                }
            }
            this.M = false;
        }
        this.K++;
    }

    public void e(Animator animator) {
        if (animator == null) {
            s();
            return;
        }
        if (t() >= 0) {
            animator.setDuration(t());
        }
        if (B() >= 0) {
            animator.setStartDelay(B() + animator.getStartDelay());
        }
        if (v() != null) {
            animator.setInterpolator(v());
        }
        animator.addListener(new c());
        animator.start();
    }

    public String e0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.o != -1) {
            str2 = str2 + "dur(" + this.o + ") ";
        }
        if (this.n != -1) {
            str2 = str2 + "dly(" + this.n + ") ";
        }
        if (this.p != null) {
            str2 = str2 + "interp(" + this.p + ") ";
        }
        if (this.q.size() > 0 || this.r.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.q.size() > 0) {
                for (int i = 0; i < this.q.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.q.get(i);
                }
            }
            if (this.r.size() > 0) {
                for (int i2 = 0; i2 < this.r.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.r.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    public void f() {
        for (int size = this.J.size() - 1; size >= 0; size--) {
            ((Animator) this.J.get(size)).cancel();
        }
        ArrayList arrayList = this.N;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.N.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((f) arrayList2.get(i)).a(this);
        }
    }

    public abstract void g(b21 b21Var);

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.u;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.v;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.w;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (((Class) this.w.get(i)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    b21 b21Var = new b21(view);
                    if (z) {
                        j(b21Var);
                    } else {
                        g(b21Var);
                    }
                    b21Var.c.add(this);
                    i(b21Var);
                    if (z) {
                        d(this.B, view, b21Var);
                    } else {
                        d(this.C, view, b21Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.y;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.z;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.A;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (((Class) this.A.get(i2)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                h(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public void i(b21 b21Var) {
    }

    public abstract void j(b21 b21Var);

    public void n(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        o4 o4Var;
        o(z);
        if ((this.q.size() > 0 || this.r.size() > 0) && (((arrayList = this.s) == null || arrayList.isEmpty()) && ((arrayList2 = this.t) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.q.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.q.get(i)).intValue());
                if (findViewById != null) {
                    b21 b21Var = new b21(findViewById);
                    if (z) {
                        j(b21Var);
                    } else {
                        g(b21Var);
                    }
                    b21Var.c.add(this);
                    i(b21Var);
                    if (z) {
                        d(this.B, findViewById, b21Var);
                    } else {
                        d(this.C, findViewById, b21Var);
                    }
                }
            }
            for (int i2 = 0; i2 < this.r.size(); i2++) {
                View view = (View) this.r.get(i2);
                b21 b21Var2 = new b21(view);
                if (z) {
                    j(b21Var2);
                } else {
                    g(b21Var2);
                }
                b21Var2.c.add(this);
                i(b21Var2);
                if (z) {
                    d(this.B, view, b21Var2);
                } else {
                    d(this.C, view, b21Var2);
                }
            }
        } else {
            h(viewGroup, z);
        }
        if (z || (o4Var = this.Q) == null) {
            return;
        }
        int size = o4Var.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.B.d.remove((String) this.Q.i(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.B.d.put((String) this.Q.m(i4), view2);
            }
        }
    }

    public void o(boolean z) {
        if (z) {
            this.B.a.clear();
            this.B.b.clear();
            this.B.c.a();
            return;
        }
        this.C.a.clear();
        this.C.b.clear();
        this.C.c.a();
    }

    @Override // 
    /* renamed from: p */
    public v11 clone() {
        try {
            v11 v11Var = (v11) super.clone();
            v11Var.O = new ArrayList();
            v11Var.B = new c21();
            v11Var.C = new c21();
            v11Var.F = null;
            v11Var.G = null;
            return v11Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator q(ViewGroup viewGroup, b21 b21Var, b21 b21Var2) {
        return null;
    }

    public void r(ViewGroup viewGroup, c21 c21Var, c21 c21Var2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        b21 b21Var;
        int i;
        Animator animator2;
        b21 b21Var2;
        o4 A = A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            b21 b21Var3 = (b21) arrayList.get(i2);
            b21 b21Var4 = (b21) arrayList2.get(i2);
            if (b21Var3 != null && !b21Var3.c.contains(this)) {
                b21Var3 = null;
            }
            if (b21Var4 != null && !b21Var4.c.contains(this)) {
                b21Var4 = null;
            }
            if ((b21Var3 != null || b21Var4 != null) && (b21Var3 == null || b21Var4 == null || I(b21Var3, b21Var4))) {
                Animator q = q(viewGroup, b21Var3, b21Var4);
                if (q != null) {
                    if (b21Var4 != null) {
                        View view2 = b21Var4.b;
                        String[] G = G();
                        if (G != null && G.length > 0) {
                            b21Var2 = new b21(view2);
                            b21 b21Var5 = (b21) c21Var2.a.get(view2);
                            if (b21Var5 != null) {
                                int i3 = 0;
                                while (i3 < G.length) {
                                    Map map = b21Var2.a;
                                    Animator animator3 = q;
                                    String str = G[i3];
                                    map.put(str, b21Var5.a.get(str));
                                    i3++;
                                    q = animator3;
                                    G = G;
                                }
                            }
                            Animator animator4 = q;
                            int size2 = A.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) A.get((Animator) A.i(i4));
                                if (dVar.c != null && dVar.a == view2 && dVar.b.equals(x()) && dVar.c.equals(b21Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            animator2 = q;
                            b21Var2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        b21Var = b21Var2;
                    } else {
                        view = b21Var3.b;
                        animator = q;
                        b21Var = null;
                    }
                    if (animator != null) {
                        i = size;
                        A.put(animator, new d(view, x(), this, q61.d(viewGroup), b21Var));
                        this.O.add(animator);
                        i2++;
                        size = i;
                    }
                    i = size;
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = (Animator) this.O.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay((sparseIntArray.valueAt(i5) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    public void s() {
        int i = this.K - 1;
        this.K = i;
        if (i == 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.N.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).e(this);
                }
            }
            for (int i3 = 0; i3 < this.B.c.n(); i3++) {
                View view = (View) this.B.c.o(i3);
                if (view != null) {
                    p51.t0(view, false);
                }
            }
            for (int i4 = 0; i4 < this.C.c.n(); i4++) {
                View view2 = (View) this.C.c.o(i4);
                if (view2 != null) {
                    p51.t0(view2, false);
                }
            }
            this.M = true;
        }
    }

    public long t() {
        return this.o;
    }

    public String toString() {
        return e0("");
    }

    public e u() {
        return this.P;
    }

    public TimeInterpolator v() {
        return this.p;
    }

    public b21 w(View view, boolean z) {
        z11 z11Var = this.D;
        if (z11Var != null) {
            return z11Var.w(view, z);
        }
        ArrayList arrayList = z ? this.F : this.G;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            b21 b21Var = (b21) arrayList.get(i);
            if (b21Var == null) {
                return null;
            }
            if (b21Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (b21) (z ? this.G : this.F).get(i);
        }
        return null;
    }

    public String x() {
        return this.m;
    }

    public vh0 y() {
        return this.R;
    }

    public y11 z() {
        return null;
    }
}
