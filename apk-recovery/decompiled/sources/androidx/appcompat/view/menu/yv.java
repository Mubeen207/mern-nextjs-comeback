package androidx.appcompat.view.menu;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.jw0;
import androidx.appcompat.view.menu.t02;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.f;
/* loaded from: classes.dex */
public class yv {
    public final mv a;
    public final zv b;
    public final fv c;
    public boolean d = false;
    public int e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            p51.h0(this.a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.b.values().length];
            a = iArr;
            try {
                iArr[f.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[f.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public yv(mv mvVar, zv zvVar, fv fvVar) {
        this.a = mvVar;
        this.b = zvVar;
        this.c = fvVar;
    }

    public void a() {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.c);
        }
        Bundle bundle = this.c.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.c.w0(bundle2);
        this.a.a(this.c, bundle2, false);
    }

    public void b() {
        fv a0 = rv.a0(this.c.G);
        fv B = this.c.B();
        if (a0 != null && !a0.equals(B)) {
            fv fvVar = this.c;
            bw.h(fvVar, a0, fvVar.x);
        }
        int h = this.b.h(this.c);
        fv fvVar2 = this.c;
        fvVar2.G.addView(fvVar2.H, h);
    }

    public void c() {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.c);
        }
        fv fvVar = this.c;
        fv fvVar2 = fvVar.g;
        yv yvVar = null;
        if (fvVar2 != null) {
            yv l = this.b.l(fvVar2.e);
            if (l == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.g + " that does not belong to this FragmentManager!");
            }
            fv fvVar3 = this.c;
            fvVar3.h = fvVar3.g.e;
            fvVar3.g = null;
            yvVar = l;
        } else {
            String str = fvVar.h;
            if (str != null && (yvVar = this.b.l(str)) == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.h + " that does not belong to this FragmentManager!");
            }
        }
        if (yvVar != null) {
            yvVar.m();
        }
        fv fvVar4 = this.c;
        fvVar4.t.j0();
        fvVar4.getClass();
        fv fvVar5 = this.c;
        fvVar5.v = fvVar5.t.l0();
        this.a.f(this.c, false);
        this.c.x0();
        this.a.b(this.c, false);
    }

    public int d() {
        fv fvVar = this.c;
        if (fvVar.t == null) {
            return fvVar.a;
        }
        int i = this.e;
        int i2 = b.a[fvVar.Q.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        fv fvVar2 = this.c;
        if (fvVar2.o) {
            if (fvVar2.p) {
                i = Math.max(this.e, 2);
                View view = this.c.H;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, fvVar2.a) : Math.min(i, 1);
            }
        }
        if (!this.c.k) {
            i = Math.min(i, 1);
        }
        fv fvVar3 = this.c;
        ViewGroup viewGroup = fvVar3.G;
        jw0.d.a s = viewGroup != null ? jw0.u(viewGroup, fvVar3.C()).s(this) : null;
        if (s == jw0.d.a.ADDING) {
            i = Math.min(i, 6);
        } else if (s == jw0.d.a.REMOVING) {
            i = Math.max(i, 3);
        } else {
            fv fvVar4 = this.c;
            if (fvVar4.l) {
                i = fvVar4.V() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        fv fvVar5 = this.c;
        if (fvVar5.I && fvVar5.a < 5) {
            i = Math.min(i, 4);
        }
        fv fvVar6 = this.c;
        if (fvVar6.m && fvVar6.G != null) {
            i = Math.max(i, 3);
        }
        if (rv.v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(i);
            sb.append(" for ");
            sb.append(this.c);
        }
        return i;
    }

    public void e() {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.c);
        }
        Bundle bundle = this.c.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        fv fvVar = this.c;
        if (fvVar.O) {
            fvVar.a = 1;
            fvVar.T0();
            return;
        }
        this.a.g(fvVar, bundle2, false);
        this.c.z0(bundle2);
        this.a.c(this.c, bundle2, false);
    }

    public void f() {
        String str;
        if (this.c.o) {
            return;
        }
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.c);
        }
        Bundle bundle = this.c.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater E0 = this.c.E0(bundle2);
        fv fvVar = this.c;
        ViewGroup viewGroup2 = fvVar.G;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fvVar.x;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fvVar.t.g0().a(this.c.x);
                if (viewGroup == null) {
                    fv fvVar2 = this.c;
                    if (!fvVar2.q) {
                        try {
                            str = fvVar2.I().getResourceName(this.c.x);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.x) + " (" + str + ") for fragment " + this.c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    bw.g(this.c, viewGroup);
                }
            }
        }
        fv fvVar3 = this.c;
        fvVar3.G = viewGroup;
        fvVar3.B0(E0, viewGroup, bundle2);
        if (this.c.H != null) {
            if (rv.v0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("moveto VIEW_CREATED: ");
                sb2.append(this.c);
            }
            this.c.H.setSaveFromParentEnabled(false);
            fv fvVar4 = this.c;
            fvVar4.H.setTag(qm0.a, fvVar4);
            if (viewGroup != null) {
                b();
            }
            fv fvVar5 = this.c;
            if (fvVar5.z) {
                fvVar5.H.setVisibility(8);
            }
            if (this.c.H.isAttachedToWindow()) {
                p51.h0(this.c.H);
            } else {
                View view = this.c.H;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.c.O0();
            mv mvVar = this.a;
            fv fvVar6 = this.c;
            mvVar.l(fvVar6, fvVar6.H, bundle2, false);
            int visibility = this.c.H.getVisibility();
            this.c.b1(this.c.H.getAlpha());
            fv fvVar7 = this.c;
            if (fvVar7.G != null && visibility == 0) {
                View findFocus = fvVar7.H.findFocus();
                if (findFocus != null) {
                    this.c.Y0(findFocus);
                    if (rv.v0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("requestFocus: Saved focused view ");
                        sb3.append(findFocus);
                        sb3.append(" for Fragment ");
                        sb3.append(this.c);
                    }
                }
                this.c.H.setAlpha(0.0f);
            }
        }
        this.c.a = 2;
    }

    public void g() {
        fv e;
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.c);
        }
        fv fvVar = this.c;
        boolean z = fvVar.l && !fvVar.V();
        if (z) {
            fv fvVar2 = this.c;
            if (!fvVar2.n) {
                this.b.z(fvVar2.e, null);
            }
        }
        if (z || this.b.n().n(this.c)) {
            this.c.getClass();
            throw null;
        }
        String str = this.c.h;
        if (str != null && (e = this.b.e(str)) != null && e.B) {
            this.c.g = e;
        }
        this.c.a = 0;
    }

    public void h() {
        View view;
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.c);
        }
        fv fvVar = this.c;
        ViewGroup viewGroup = fvVar.G;
        if (viewGroup != null && (view = fvVar.H) != null) {
            viewGroup.removeView(view);
        }
        this.c.C0();
        this.a.m(this.c, false);
        fv fvVar2 = this.c;
        fvVar2.G = null;
        fvVar2.H = null;
        fvVar2.S = null;
        fvVar2.T.e(null);
        this.c.p = false;
    }

    public void i() {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.c);
        }
        this.c.D0();
        this.a.d(this.c, false);
        fv fvVar = this.c;
        fvVar.a = -1;
        fvVar.getClass();
        fv fvVar2 = this.c;
        fvVar2.v = null;
        fvVar2.t = null;
        if ((!fvVar2.l || fvVar2.V()) && !this.b.n().n(this.c)) {
            return;
        }
        if (rv.v0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("initState called for fragment: ");
            sb2.append(this.c);
        }
        this.c.S();
    }

    public void j() {
        fv fvVar = this.c;
        if (fvVar.o && fvVar.p && !fvVar.r) {
            if (rv.v0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.c);
            }
            Bundle bundle = this.c.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fv fvVar2 = this.c;
            fvVar2.B0(fvVar2.E0(bundle2), null, bundle2);
            View view = this.c.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fv fvVar3 = this.c;
                fvVar3.H.setTag(qm0.a, fvVar3);
                fv fvVar4 = this.c;
                if (fvVar4.z) {
                    fvVar4.H.setVisibility(8);
                }
                this.c.O0();
                mv mvVar = this.a;
                fv fvVar5 = this.c;
                mvVar.l(fvVar5, fvVar5.H, bundle2, false);
                this.c.a = 2;
            }
        }
    }

    public fv k() {
        return this.c;
    }

    public final boolean l(View view) {
        if (view == this.c.H) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.H) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.d) {
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(k());
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z = false;
            while (true) {
                int d = d();
                fv fvVar = this.c;
                int i = fvVar.a;
                if (d == i) {
                    if (!z && i == -1 && fvVar.l && !fvVar.V() && !this.c.n) {
                        if (rv.v0(3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Cleaning up state of never attached fragment: ");
                            sb2.append(this.c);
                        }
                        this.b.n().e(this.c, true);
                        this.b.q(this);
                        if (rv.v0(3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("initState called for fragment: ");
                            sb3.append(this.c);
                        }
                        this.c.S();
                    }
                    fv fvVar2 = this.c;
                    if (fvVar2.M) {
                        if (fvVar2.H != null && (viewGroup = fvVar2.G) != null) {
                            jw0 u = jw0.u(viewGroup, fvVar2.C());
                            if (this.c.z) {
                                u.k(this);
                            } else {
                                u.m(this);
                            }
                        }
                        fv fvVar3 = this.c;
                        rv rvVar = fvVar3.t;
                        if (rvVar != null) {
                            rvVar.t0(fvVar3);
                        }
                        fv fvVar4 = this.c;
                        fvVar4.M = false;
                        fvVar4.k0(fvVar4.z);
                        this.c.u.B();
                    }
                    this.d = false;
                    return;
                }
                if (d > i) {
                    switch (i + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case t02.c.c /* 3 */:
                            a();
                            continue;
                        case 4:
                            if (fvVar.H != null && (viewGroup3 = fvVar.G) != null) {
                                jw0.u(viewGroup3, fvVar.C()).j(jw0.d.b.g(this.c.H.getVisibility()), this);
                            }
                            this.c.a = 4;
                            continue;
                        case t02.c.e /* 5 */:
                            s();
                            continue;
                        case t02.c.f /* 6 */:
                            fvVar.a = 6;
                            continue;
                        case t02.c.g /* 7 */:
                            o();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            if (fvVar.n && this.b.o(fvVar.e) == null) {
                                this.b.z(this.c.e, p());
                            }
                            g();
                            continue;
                        case 1:
                            h();
                            this.c.a = 1;
                            continue;
                        case 2:
                            fvVar.p = false;
                            fvVar.a = 2;
                            continue;
                        case t02.c.c /* 3 */:
                            if (rv.v0(3)) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("movefrom ACTIVITY_CREATED: ");
                                sb4.append(this.c);
                            }
                            fv fvVar5 = this.c;
                            if (fvVar5.n) {
                                this.b.z(fvVar5.e, p());
                            } else if (fvVar5.H != null && fvVar5.c == null) {
                                q();
                            }
                            fv fvVar6 = this.c;
                            if (fvVar6.H != null && (viewGroup2 = fvVar6.G) != null) {
                                jw0.u(viewGroup2, fvVar6.C()).l(this);
                            }
                            this.c.a = 3;
                            continue;
                        case 4:
                            t();
                            continue;
                        case t02.c.e /* 5 */:
                            fvVar.a = 5;
                            continue;
                        case t02.c.f /* 6 */:
                            n();
                            continue;
                        default:
                            continue;
                    }
                }
                z = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public void n() {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.c);
        }
        this.c.H0();
        this.a.e(this.c, false);
    }

    public void o() {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.c);
        }
        View x = this.c.x();
        if (x != null && l(x)) {
            boolean requestFocus = x.requestFocus();
            if (rv.v0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(x);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.c.H.findFocus());
            }
        }
        this.c.Y0(null);
        this.c.K0();
        this.a.h(this.c, false);
        this.b.z(this.c.e, null);
        fv fvVar = this.c;
        fvVar.b = null;
        fvVar.c = null;
        fvVar.d = null;
    }

    public Bundle p() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        fv fvVar = this.c;
        if (fvVar.a == -1 && (bundle = fvVar.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new xv(this.c));
        if (this.c.a > -1) {
            Bundle bundle3 = new Bundle();
            this.c.L0(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.i(this.c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.c.V.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle X0 = this.c.u.X0();
            if (!X0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", X0);
            }
            if (this.c.H != null) {
                q();
            }
            SparseArray<? extends Parcelable> sparseArray = this.c.c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.c.d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.c.f;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void q() {
        if (this.c.H == null) {
            return;
        }
        if (rv.v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Saving view state for fragment ");
            sb.append(this.c);
            sb.append(" with view ");
            sb.append(this.c.H);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.H.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.S.g(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.c.d = bundle;
    }

    public void r(int i) {
        this.e = i;
    }

    public void s() {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.c);
        }
        this.c.M0();
        this.a.j(this.c, false);
    }

    public void t() {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.c);
        }
        this.c.N0();
        this.a.k(this.c, false);
    }

    public yv(mv mvVar, zv zvVar, fv fvVar, Bundle bundle) {
        this.a = mvVar;
        this.b = zvVar;
        this.c = fvVar;
        fvVar.c = null;
        fvVar.d = null;
        fvVar.s = 0;
        fvVar.p = false;
        fvVar.k = false;
        fv fvVar2 = fvVar.g;
        fvVar.h = fvVar2 != null ? fvVar2.e : null;
        fvVar.g = null;
        fvVar.b = bundle;
        fvVar.f = bundle.getBundle("arguments");
    }
}
