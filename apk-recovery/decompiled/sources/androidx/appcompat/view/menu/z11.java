package androidx.appcompat.view.menu;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.v11;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class z11 extends v11 {
    public int X;
    public ArrayList V = new ArrayList();
    public boolean W = true;
    public boolean Y = false;
    public int Z = 0;

    /* loaded from: classes.dex */
    public class a extends w11 {
        public final /* synthetic */ v11 a;

        public a(v11 v11Var) {
            this.a = v11Var;
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void e(v11 v11Var) {
            this.a.W();
            v11Var.S(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends w11 {
        public z11 a;

        public b(z11 z11Var) {
            this.a = z11Var;
        }

        @Override // androidx.appcompat.view.menu.w11, androidx.appcompat.view.menu.v11.f
        public void c(v11 v11Var) {
            z11 z11Var = this.a;
            if (z11Var.Y) {
                return;
            }
            z11Var.d0();
            this.a.Y = true;
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void e(v11 v11Var) {
            z11 z11Var = this.a;
            int i = z11Var.X - 1;
            z11Var.X = i;
            if (i == 0) {
                z11Var.Y = false;
                z11Var.s();
            }
            v11Var.S(this);
        }
    }

    @Override // androidx.appcompat.view.menu.v11
    public void Q(View view) {
        super.Q(view);
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            ((v11) this.V.get(i)).Q(view);
        }
    }

    @Override // androidx.appcompat.view.menu.v11
    public void U(View view) {
        super.U(view);
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            ((v11) this.V.get(i)).U(view);
        }
    }

    @Override // androidx.appcompat.view.menu.v11
    public void W() {
        if (this.V.isEmpty()) {
            d0();
            s();
            return;
        }
        r0();
        if (this.W) {
            Iterator it = this.V.iterator();
            while (it.hasNext()) {
                ((v11) it.next()).W();
            }
            return;
        }
        for (int i = 1; i < this.V.size(); i++) {
            ((v11) this.V.get(i - 1)).a(new a((v11) this.V.get(i)));
        }
        v11 v11Var = (v11) this.V.get(0);
        if (v11Var != null) {
            v11Var.W();
        }
    }

    @Override // androidx.appcompat.view.menu.v11
    public void Y(v11.e eVar) {
        super.Y(eVar);
        this.Z |= 8;
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            ((v11) this.V.get(i)).Y(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.v11
    public void a0(vh0 vh0Var) {
        super.a0(vh0Var);
        this.Z |= 4;
        if (this.V != null) {
            for (int i = 0; i < this.V.size(); i++) {
                ((v11) this.V.get(i)).a0(vh0Var);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.v11
    public void b0(y11 y11Var) {
        super.b0(y11Var);
        this.Z |= 2;
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            ((v11) this.V.get(i)).b0(y11Var);
        }
    }

    @Override // androidx.appcompat.view.menu.v11
    public String e0(String str) {
        String e0 = super.e0(str);
        for (int i = 0; i < this.V.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(e0);
            sb.append("\n");
            sb.append(((v11) this.V.get(i)).e0(str + "  "));
            e0 = sb.toString();
        }
        return e0;
    }

    @Override // androidx.appcompat.view.menu.v11
    /* renamed from: f0 */
    public z11 a(v11.f fVar) {
        return (z11) super.a(fVar);
    }

    @Override // androidx.appcompat.view.menu.v11
    public void g(b21 b21Var) {
        if (J(b21Var.b)) {
            Iterator it = this.V.iterator();
            while (it.hasNext()) {
                v11 v11Var = (v11) it.next();
                if (v11Var.J(b21Var.b)) {
                    v11Var.g(b21Var);
                    b21Var.c.add(v11Var);
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.v11
    /* renamed from: g0 */
    public z11 b(View view) {
        for (int i = 0; i < this.V.size(); i++) {
            ((v11) this.V.get(i)).b(view);
        }
        return (z11) super.b(view);
    }

    public z11 h0(v11 v11Var) {
        i0(v11Var);
        long j = this.o;
        if (j >= 0) {
            v11Var.X(j);
        }
        if ((this.Z & 1) != 0) {
            v11Var.Z(v());
        }
        if ((this.Z & 2) != 0) {
            z();
            v11Var.b0(null);
        }
        if ((this.Z & 4) != 0) {
            v11Var.a0(y());
        }
        if ((this.Z & 8) != 0) {
            v11Var.Y(u());
        }
        return this;
    }

    @Override // androidx.appcompat.view.menu.v11
    public void i(b21 b21Var) {
        super.i(b21Var);
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            ((v11) this.V.get(i)).i(b21Var);
        }
    }

    public final void i0(v11 v11Var) {
        this.V.add(v11Var);
        v11Var.D = this;
    }

    @Override // androidx.appcompat.view.menu.v11
    public void j(b21 b21Var) {
        if (J(b21Var.b)) {
            Iterator it = this.V.iterator();
            while (it.hasNext()) {
                v11 v11Var = (v11) it.next();
                if (v11Var.J(b21Var.b)) {
                    v11Var.j(b21Var);
                    b21Var.c.add(v11Var);
                }
            }
        }
    }

    public v11 j0(int i) {
        if (i < 0 || i >= this.V.size()) {
            return null;
        }
        return (v11) this.V.get(i);
    }

    public int k0() {
        return this.V.size();
    }

    @Override // androidx.appcompat.view.menu.v11
    /* renamed from: l0 */
    public z11 S(v11.f fVar) {
        return (z11) super.S(fVar);
    }

    @Override // androidx.appcompat.view.menu.v11
    /* renamed from: m0 */
    public z11 T(View view) {
        for (int i = 0; i < this.V.size(); i++) {
            ((v11) this.V.get(i)).T(view);
        }
        return (z11) super.T(view);
    }

    @Override // androidx.appcompat.view.menu.v11
    /* renamed from: n0 */
    public z11 X(long j) {
        ArrayList arrayList;
        super.X(j);
        if (this.o >= 0 && (arrayList = this.V) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((v11) this.V.get(i)).X(j);
            }
        }
        return this;
    }

    @Override // androidx.appcompat.view.menu.v11
    /* renamed from: o0 */
    public z11 Z(TimeInterpolator timeInterpolator) {
        this.Z |= 1;
        ArrayList arrayList = this.V;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((v11) this.V.get(i)).Z(timeInterpolator);
            }
        }
        return (z11) super.Z(timeInterpolator);
    }

    @Override // androidx.appcompat.view.menu.v11
    /* renamed from: p */
    public v11 clone() {
        z11 z11Var = (z11) super.clone();
        z11Var.V = new ArrayList();
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            z11Var.i0(((v11) this.V.get(i)).clone());
        }
        return z11Var;
    }

    public z11 p0(int i) {
        if (i == 0) {
            this.W = true;
        } else if (i != 1) {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        } else {
            this.W = false;
        }
        return this;
    }

    @Override // androidx.appcompat.view.menu.v11
    /* renamed from: q0 */
    public z11 c0(long j) {
        return (z11) super.c0(j);
    }

    @Override // androidx.appcompat.view.menu.v11
    public void r(ViewGroup viewGroup, c21 c21Var, c21 c21Var2, ArrayList arrayList, ArrayList arrayList2) {
        long B = B();
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            v11 v11Var = (v11) this.V.get(i);
            if (B > 0 && (this.W || i == 0)) {
                long B2 = v11Var.B();
                if (B2 > 0) {
                    v11Var.c0(B2 + B);
                } else {
                    v11Var.c0(B);
                }
            }
            v11Var.r(viewGroup, c21Var, c21Var2, arrayList, arrayList2);
        }
    }

    public final void r0() {
        b bVar = new b(this);
        Iterator it = this.V.iterator();
        while (it.hasNext()) {
            ((v11) it.next()).a(bVar);
        }
        this.X = this.V.size();
    }
}
