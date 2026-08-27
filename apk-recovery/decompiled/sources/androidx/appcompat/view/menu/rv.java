package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageParser;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.bw;
import androidx.appcompat.view.menu.cw;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.f;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class rv {
    public static boolean Q = false;
    public static boolean R = true;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public ArrayList L;
    public ArrayList M;
    public uv N;
    public bw.c O;
    public boolean b;
    public ArrayList e;
    public fg0 g;
    public iv x;
    public fv y;
    public fv z;
    public final ArrayList a = new ArrayList();
    public final zv c = new zv();
    public ArrayList d = new ArrayList();
    public final lv f = new lv(this);
    public n7 h = null;
    public boolean i = false;
    public final eg0 j = new a(false);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final Map n = Collections.synchronizedMap(new HashMap());
    public ArrayList o = new ArrayList();
    public final mv p = new mv(this);
    public final CopyOnWriteArrayList q = new CopyOnWriteArrayList();
    public final pf r = new pf() { // from class: androidx.appcompat.view.menu.nv
        @Override // androidx.appcompat.view.menu.pf, androidx.window.extensions.core.util.function.Consumer
        public final void accept(Object obj) {
            rv.this.D0((Configuration) obj);
        }
    };
    public final pf s = new pf() { // from class: androidx.appcompat.view.menu.ov
        @Override // androidx.appcompat.view.menu.pf, androidx.window.extensions.core.util.function.Consumer
        public final void accept(Object obj) {
            rv.this.E0((Integer) obj);
        }
    };
    public final pf t = new pf() { // from class: androidx.appcompat.view.menu.pv
        @Override // androidx.appcompat.view.menu.pf, androidx.window.extensions.core.util.function.Consumer
        public final void accept(Object obj) {
            rv rvVar = rv.this;
            my0.a(obj);
            rvVar.F0(null);
        }
    };
    public final pf u = new pf() { // from class: androidx.appcompat.view.menu.qv
        @Override // androidx.appcompat.view.menu.pf, androidx.window.extensions.core.util.function.Consumer
        public final void accept(Object obj) {
            rv rvVar = rv.this;
            my0.a(obj);
            rvVar.G0(null);
        }
    };
    public final yc0 v = new b();
    public int w = -1;
    public jv A = null;
    public jv B = new c();
    public kw0 C = null;
    public kw0 D = new d();
    public ArrayDeque E = new ArrayDeque();
    public Runnable P = new e();

    /* loaded from: classes.dex */
    public class a extends eg0 {
        public a(boolean z) {
            super(z);
        }

        @Override // androidx.appcompat.view.menu.eg0
        public void a() {
            if (rv.v0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("handleOnBackCancelled. PREDICTIVE_BACK = ");
                sb.append(rv.R);
                sb.append(" fragment manager ");
                sb.append(rv.this);
            }
            if (rv.R) {
                rv.this.m();
                rv.this.h = null;
            }
        }

        @Override // androidx.appcompat.view.menu.eg0
        public void b() {
            if (rv.v0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("handleOnBackPressed. PREDICTIVE_BACK = ");
                sb.append(rv.R);
                sb.append(" fragment manager ");
                sb.append(rv.this);
            }
            rv.this.r0();
        }

        @Override // androidx.appcompat.view.menu.eg0
        public void c(h7 h7Var) {
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("handleOnBackProgressed. PREDICTIVE_BACK = ");
                sb.append(rv.R);
                sb.append(" fragment manager ");
                sb.append(rv.this);
            }
            rv rvVar = rv.this;
            if (rvVar.h != null) {
                for (jw0 jw0Var : rvVar.r(new ArrayList(Collections.singletonList(rv.this.h)), 0, 1)) {
                    jw0Var.x(h7Var);
                }
                Iterator it = rv.this.o.iterator();
                if (it.hasNext()) {
                    my0.a(it.next());
                    throw null;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.eg0
        public void d(h7 h7Var) {
            if (rv.v0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("handleOnBackStarted. PREDICTIVE_BACK = ");
                sb.append(rv.R);
                sb.append(" fragment manager ");
                sb.append(rv.this);
            }
            if (rv.R) {
                rv.this.N();
                rv.this.R0();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements yc0 {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.yc0
        public boolean a(MenuItem menuItem) {
            return rv.this.C(menuItem);
        }

        @Override // androidx.appcompat.view.menu.yc0
        public void b(Menu menu, MenuInflater menuInflater) {
            rv.this.x(menu, menuInflater);
        }

        @Override // androidx.appcompat.view.menu.yc0
        public void c(Menu menu) {
            rv.this.F(menu);
        }
    }

    /* loaded from: classes.dex */
    public class c extends jv {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.jv
        public fv a(ClassLoader classLoader, String str) {
            rv.this.j0();
            rv.this.j0();
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class d implements kw0 {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.kw0
        public jw0 a(ViewGroup viewGroup) {
            return new ck(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            rv.this.Q(true);
        }
    }

    /* loaded from: classes.dex */
    public class f implements vv {
        public final /* synthetic */ fv a;

        public f(fv fvVar) {
            this.a = fvVar;
        }
    }

    /* loaded from: classes.dex */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public String m;
        public int n;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel) {
            this.m = parcel.readString();
            this.n = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.m);
            parcel.writeInt(this.n);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* loaded from: classes.dex */
    public class i implements h {
        public final String a;
        public final int b;
        public final int c;

        public i(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.appcompat.view.menu.rv.h
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            fv fvVar = rv.this.z;
            if (fvVar == null || this.b >= 0 || this.a != null || !fvVar.p().M0()) {
                return rv.this.P0(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class j implements h {
        public j() {
        }

        @Override // androidx.appcompat.view.menu.rv.h
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            boolean Q0 = rv.this.Q0(arrayList, arrayList2);
            rv rvVar = rv.this;
            rvVar.i = true;
            if (!rvVar.o.isEmpty() && arrayList.size() > 0) {
                ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(rv.this.c0((n7) it.next()));
                }
                Iterator it2 = rv.this.o.iterator();
                while (it2.hasNext()) {
                    my0.a(it2.next());
                    Iterator it3 = linkedHashSet.iterator();
                    if (it3.hasNext()) {
                        fv fvVar = (fv) it3.next();
                        throw null;
                    }
                }
            }
            return Q0;
        }
    }

    public static void S(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        while (i2 < i3) {
            n7 n7Var = (n7) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                n7Var.o(-1);
                n7Var.t();
            } else {
                n7Var.o(1);
                n7Var.s();
            }
            i2++;
        }
    }

    public static int W0(int i2) {
        int i3 = 4097;
        if (i2 != 4097) {
            if (i2 != 8194) {
                i3 = 8197;
                if (i2 == 8197) {
                    return 4100;
                }
                if (i2 == 4099) {
                    return 4099;
                }
                if (i2 != 4100) {
                    return 0;
                }
            }
            return i3;
        }
        return 8194;
    }

    public static rv Z(View view) {
        fv a0 = a0(view);
        if (a0 == null) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (a0.T()) {
            return a0.p();
        } else {
            throw new IllegalStateException("The Fragment " + a0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    public static fv a0(View view) {
        while (view != null) {
            fv p0 = p0(view);
            if (p0 != null) {
                return p0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static fv p0(View view) {
        Object tag = view.getTag(qm0.a);
        if (tag instanceof fv) {
            return (fv) tag;
        }
        return null;
    }

    public static boolean v0(int i2) {
        return Q || Log.isLoggable("FragmentManager", i2);
    }

    public void A(boolean z) {
        for (fv fvVar : this.c.m()) {
            if (fvVar != null) {
                fvVar.F0();
                if (z) {
                    fvVar.u.A(true);
                }
            }
        }
    }

    public boolean A0(fv fvVar) {
        if (fvVar == null) {
            return true;
        }
        rv rvVar = fvVar.t;
        return fvVar.equals(rvVar.m0()) && A0(rvVar.y);
    }

    public void B() {
        for (fv fvVar : this.c.j()) {
            if (fvVar != null) {
                fvVar.k0(fvVar.U());
                fvVar.u.B();
            }
        }
    }

    public boolean B0(int i2) {
        return this.w >= i2;
    }

    public boolean C(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (fv fvVar : this.c.m()) {
            if (fvVar != null && fvVar.G0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean C0() {
        return this.G || this.H;
    }

    public final void D(fv fvVar) {
        if (fvVar == null || !fvVar.equals(V(fvVar.e))) {
            return;
        }
        fvVar.J0();
    }

    public final /* synthetic */ void D0(Configuration configuration) {
        if (x0()) {
            v(configuration, false);
        }
    }

    public void E() {
        J(5);
    }

    public final /* synthetic */ void E0(Integer num) {
        if (x0() && num.intValue() == 80) {
            A(false);
        }
    }

    public boolean F(Menu menu) {
        boolean z = false;
        if (this.w < 1) {
            return false;
        }
        for (fv fvVar : this.c.m()) {
            if (fvVar != null && z0(fvVar) && fvVar.I0(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final /* synthetic */ void F0(ge0 ge0Var) {
        if (x0()) {
            throw null;
        }
    }

    public void G() {
        e1();
        D(this.z);
    }

    public final /* synthetic */ void G0(fi0 fi0Var) {
        if (x0()) {
            throw null;
        }
    }

    public void H() {
        this.G = false;
        this.H = false;
        this.N.m(false);
        J(7);
    }

    public void H0(int i2, boolean z) {
        if (i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.w) {
            this.w = i2;
            this.c.r();
            d1();
        }
    }

    public void I() {
        this.G = false;
        this.H = false;
        this.N.m(false);
        J(5);
    }

    public void I0() {
    }

    public final void J(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            H0(i2, false);
            for (jw0 jw0Var : q()) {
                jw0Var.q();
            }
            this.b = false;
            Q(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public void J0(FragmentContainerView fragmentContainerView) {
        View view;
        for (yv yvVar : this.c.i()) {
            fv k = yvVar.k();
            if (k.x == fragmentContainerView.getId() && (view = k.H) != null && view.getParent() == null) {
                k.G = fragmentContainerView;
                yvVar.b();
            }
        }
    }

    public void K() {
        this.H = true;
        this.N.m(true);
        J(4);
    }

    public void K0(yv yvVar) {
        fv k = yvVar.k();
        if (k.I) {
            if (this.b) {
                this.J = true;
                return;
            }
            k.I = false;
            yvVar.m();
        }
    }

    public void L() {
        J(2);
    }

    public void L0(int i2, int i3, boolean z) {
        if (i2 >= 0) {
            O(new i(null, i2, i3), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public final void M() {
        if (this.J) {
            this.J = false;
            d1();
        }
    }

    public boolean M0() {
        return O0(null, -1, 0);
    }

    public final void N() {
        for (jw0 jw0Var : q()) {
            jw0Var.q();
        }
    }

    public boolean N0(int i2, int i3) {
        if (i2 >= 0) {
            return O0(null, i2, i3);
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void O(h hVar, boolean z) {
        if (!z) {
            if (!this.I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        synchronized (this.a) {
            try {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean O0(String str, int i2, int i3) {
        Q(false);
        P(true);
        fv fvVar = this.z;
        if (fvVar == null || i2 >= 0 || str != null || !fvVar.p().M0()) {
            boolean P0 = P0(this.K, this.L, str, i2, i3);
            if (P0) {
                this.b = true;
                try {
                    T0(this.K, this.L);
                } finally {
                    o();
                }
            }
            e1();
            M();
            this.c.b();
            return P0;
        }
        return true;
    }

    public final void P(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (!this.I) {
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        throw new IllegalStateException("FragmentManager has been destroyed");
    }

    public boolean P0(ArrayList arrayList, ArrayList arrayList2, String str, int i2, int i3) {
        int W = W(str, i2, (i3 & 1) != 0);
        if (W < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= W; size--) {
            arrayList.add((n7) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean Q(boolean z) {
        P(z);
        boolean z2 = false;
        while (d0(this.K, this.L)) {
            z2 = true;
            this.b = true;
            try {
                T0(this.K, this.L);
            } finally {
                o();
            }
        }
        e1();
        M();
        this.c.b();
        return z2;
    }

    public boolean Q0(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.d;
        n7 n7Var = (n7) arrayList3.get(arrayList3.size() - 1);
        this.h = n7Var;
        Iterator it = n7Var.c.iterator();
        while (it.hasNext()) {
            fv fvVar = ((cw.a) it.next()).b;
            if (fvVar != null) {
                fvVar.m = true;
            }
        }
        return P0(arrayList, arrayList2, null, -1, 0);
    }

    public void R(h hVar, boolean z) {
        if (z) {
            return;
        }
        P(z);
        if (hVar.a(this.K, this.L)) {
            this.b = true;
            try {
                T0(this.K, this.L);
            } finally {
                o();
            }
        }
        e1();
        M();
        this.c.b();
    }

    public void R0() {
        O(new j(), false);
    }

    public void S0(fv fvVar) {
        if (v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fvVar);
            sb.append(" nesting=");
            sb.append(fvVar.s);
        }
        boolean z = !fvVar.V();
        if (!fvVar.A || z) {
            this.c.s(fvVar);
            if (w0(fvVar)) {
                this.F = true;
            }
            fvVar.l = true;
            b1(fvVar);
        }
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        boolean z = ((n7) arrayList.get(i2)).r;
        ArrayList arrayList3 = this.M;
        if (arrayList3 == null) {
            this.M = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.M.addAll(this.c.m());
        fv m0 = m0();
        boolean z2 = false;
        for (int i4 = i2; i4 < i3; i4++) {
            n7 n7Var = (n7) arrayList.get(i4);
            m0 = !((Boolean) arrayList2.get(i4)).booleanValue() ? n7Var.u(this.M, m0) : n7Var.x(this.M, m0);
            z2 = z2 || n7Var.i;
        }
        this.M.clear();
        if (!z && this.w >= 1) {
            for (int i5 = i2; i5 < i3; i5++) {
                Iterator it = ((n7) arrayList.get(i5)).c.iterator();
                while (it.hasNext()) {
                    fv fvVar = ((cw.a) it.next()).b;
                    if (fvVar != null && fvVar.t != null) {
                        this.c.p(s(fvVar));
                    }
                }
            }
        }
        S(arrayList, arrayList2, i2, i3);
        boolean booleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
        if (z2 && !this.o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(c0((n7) it2.next()));
            }
            if (this.h == null) {
                Iterator it3 = this.o.iterator();
                while (it3.hasNext()) {
                    my0.a(it3.next());
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        fv fvVar2 = (fv) it4.next();
                        throw null;
                    }
                }
                Iterator it5 = this.o.iterator();
                while (it5.hasNext()) {
                    my0.a(it5.next());
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        fv fvVar3 = (fv) it6.next();
                        throw null;
                    }
                }
            }
        }
        for (int i6 = i2; i6 < i3; i6++) {
            n7 n7Var2 = (n7) arrayList.get(i6);
            if (booleanValue) {
                for (int size = n7Var2.c.size() - 1; size >= 0; size--) {
                    fv fvVar4 = ((cw.a) n7Var2.c.get(size)).b;
                    if (fvVar4 != null) {
                        s(fvVar4).m();
                    }
                }
            } else {
                Iterator it7 = n7Var2.c.iterator();
                while (it7.hasNext()) {
                    fv fvVar5 = ((cw.a) it7.next()).b;
                    if (fvVar5 != null) {
                        s(fvVar5).m();
                    }
                }
            }
        }
        H0(this.w, true);
        for (jw0 jw0Var : r(arrayList, i2, i3)) {
            jw0Var.A(booleanValue);
            jw0Var.w();
            jw0Var.n();
        }
        while (i2 < i3) {
            n7 n7Var3 = (n7) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue() && n7Var3.v >= 0) {
                n7Var3.v = -1;
            }
            n7Var3.w();
            i2++;
        }
        if (z2) {
            U0();
        }
    }

    public final void T0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((n7) arrayList.get(i2)).r) {
                if (i3 != i2) {
                    T(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((n7) arrayList.get(i3)).r) {
                        i3++;
                    }
                }
                T(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            T(arrayList, arrayList2, i3, size);
        }
    }

    public boolean U() {
        boolean Q2 = Q(true);
        b0();
        return Q2;
    }

    public final void U0() {
        if (this.o.size() <= 0) {
            return;
        }
        my0.a(this.o.get(0));
        throw null;
    }

    public fv V(String str) {
        return this.c.e(str);
    }

    public void V0(Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && bundle.getBundle(str) != null) {
                throw null;
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && bundle.getBundle(str2) != null) {
                throw null;
            }
        }
        this.c.v(hashMap);
        tv tvVar = (tv) bundle.getParcelable("state");
        if (tvVar == null) {
            return;
        }
        this.c.t();
        Iterator it = tvVar.m.iterator();
        while (it.hasNext()) {
            Bundle z = this.c.z((String) it.next(), null);
            if (z != null) {
                fv h2 = this.N.h(((xv) z.getParcelable("state")).n);
                h2.getClass();
                if (v0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("restoreSaveState: re-attaching retained ");
                    sb.append(h2);
                }
                fv k = new yv(this.p, this.c, h2, z).k();
                k.b = z;
                k.t = this;
                if (v0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(k.e);
                    sb2.append("): ");
                    sb2.append(k);
                }
                throw null;
            }
        }
        for (fv fvVar : this.N.j()) {
            if (!this.c.c(fvVar.e)) {
                if (v0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(fvVar);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(tvVar.m);
                }
                this.N.l(fvVar);
                fvVar.t = this;
                yv yvVar = new yv(this.p, this.c, fvVar);
                yvVar.r(1);
                yvVar.m();
                fvVar.l = true;
                yvVar.m();
            }
        }
        this.c.u(tvVar.n);
        if (tvVar.o != null) {
            this.d = new ArrayList(tvVar.o.length);
            int i2 = 0;
            while (true) {
                o7[] o7VarArr = tvVar.o;
                if (i2 >= o7VarArr.length) {
                    break;
                }
                n7 b2 = o7VarArr[i2].b(this);
                if (v0(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreAllState: back stack #");
                    sb4.append(i2);
                    sb4.append(" (index ");
                    sb4.append(b2.v);
                    sb4.append("): ");
                    sb4.append(b2);
                    PrintWriter printWriter = new PrintWriter(new na0("FragmentManager"));
                    b2.r("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(b2);
                i2++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.k.set(tvVar.p);
        String str3 = tvVar.q;
        if (str3 != null) {
            fv V = V(str3);
            this.z = V;
            D(V);
        }
        ArrayList arrayList = tvVar.r;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.l.put((String) arrayList.get(i3), (p7) tvVar.s.get(i3));
            }
        }
        this.E = new ArrayDeque(tvVar.t);
    }

    public final int W(String str, int i2, boolean z) {
        if (this.d.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            n7 n7Var = (n7) this.d.get(size);
            if ((str != null && str.equals(n7Var.v())) || (i2 >= 0 && i2 == n7Var.v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            n7 n7Var2 = (n7) this.d.get(size - 1);
            if ((str == null || !str.equals(n7Var2.v())) && (i2 < 0 || i2 != n7Var2.v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public fv X(int i2) {
        return this.c.f(i2);
    }

    public Bundle X0() {
        o7[] o7VarArr;
        Bundle bundle = new Bundle();
        b0();
        N();
        Q(true);
        this.G = true;
        this.N.m(true);
        ArrayList w = this.c.w();
        HashMap k = this.c.k();
        if (k.isEmpty()) {
            v0(2);
        } else {
            ArrayList x = this.c.x();
            int size = this.d.size();
            if (size > 0) {
                o7VarArr = new o7[size];
                for (int i2 = 0; i2 < size; i2++) {
                    o7VarArr[i2] = new o7((n7) this.d.get(i2));
                    if (v0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding back stack #");
                        sb.append(i2);
                        sb.append(": ");
                        sb.append(this.d.get(i2));
                    }
                }
            } else {
                o7VarArr = null;
            }
            tv tvVar = new tv();
            tvVar.m = w;
            tvVar.n = x;
            tvVar.o = o7VarArr;
            tvVar.p = this.k.get();
            fv fvVar = this.z;
            if (fvVar != null) {
                tvVar.q = fvVar.e;
            }
            tvVar.r.addAll(this.l.keySet());
            tvVar.s.addAll(this.l.values());
            tvVar.t = new ArrayList(this.E);
            bundle.putParcelable("state", tvVar);
            for (String str : this.m.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.m.get(str));
            }
            for (String str2 : k.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) k.get(str2));
            }
        }
        return bundle;
    }

    public fv Y(String str) {
        return this.c.g(str);
    }

    public void Y0(fv fvVar, boolean z) {
        ViewGroup h0 = h0(fvVar);
        if (h0 == null || !(h0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) h0).setDrawDisappearingViewsLast(!z);
    }

    public void Z0(fv fvVar, f.b bVar) {
        if (fvVar.equals(V(fvVar.e))) {
            fvVar.Q = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fvVar + " is not an active fragment of FragmentManager " + this);
    }

    public void a1(fv fvVar) {
        if (fvVar == null || fvVar.equals(V(fvVar.e))) {
            fv fvVar2 = this.z;
            this.z = fvVar;
            D(fvVar2);
            D(this.z);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fvVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void b0() {
        for (jw0 jw0Var : q()) {
            jw0Var.r();
        }
    }

    public final void b1(fv fvVar) {
        ViewGroup h0 = h0(fvVar);
        if (h0 == null || fvVar.r() + fvVar.u() + fvVar.E() + fvVar.F() <= 0) {
            return;
        }
        if (h0.getTag(qm0.c) == null) {
            h0.setTag(qm0.c, fvVar);
        }
        ((fv) h0.getTag(qm0.c)).a1(fvVar.D());
    }

    public Set c0(n7 n7Var) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < n7Var.c.size(); i2++) {
            fv fvVar = ((cw.a) n7Var.c.get(i2)).b;
            if (fvVar != null && n7Var.i) {
                hashSet.add(fvVar);
            }
        }
        return hashSet;
    }

    public void c1(fv fvVar) {
        if (v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fvVar);
        }
        if (fvVar.z) {
            fvVar.z = false;
            fvVar.M = !fvVar.M;
        }
    }

    public final boolean d0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.a) {
            if (!this.a.isEmpty()) {
                int size = this.a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((h) this.a.get(i2)).a(arrayList, arrayList2);
                }
                this.a.clear();
                throw null;
            }
        }
        return false;
    }

    public final void d1() {
        for (yv yvVar : this.c.i()) {
            K0(yvVar);
        }
    }

    public int e0() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    public final void e1() {
        synchronized (this.a) {
            try {
                boolean z = true;
                if (!this.a.isEmpty()) {
                    this.j.g(true);
                    if (v0(3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("FragmentManager ");
                        sb.append(this);
                        sb.append(" enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                z = (e0() <= 0 || !A0(this.y)) ? false : false;
                if (v0(3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("OnBackPressedCallback for FragmentManager ");
                    sb2.append(this);
                    sb2.append(" enabled state is ");
                    sb2.append(z);
                }
                this.j.g(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(n7 n7Var) {
        this.d.add(n7Var);
    }

    public final uv f0(fv fvVar) {
        return this.N.i(fvVar);
    }

    public yv g(fv fvVar) {
        String str = fvVar.P;
        if (str != null) {
            bw.f(fvVar, str);
        }
        if (v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fvVar);
        }
        yv s = s(fvVar);
        fvVar.t = this;
        this.c.p(s);
        if (!fvVar.A) {
            this.c.a(fvVar);
            fvVar.l = false;
            if (fvVar.H == null) {
                fvVar.M = false;
            }
            if (w0(fvVar)) {
                this.F = true;
            }
        }
        return s;
    }

    public iv g0() {
        return this.x;
    }

    public void h(vv vvVar) {
        this.q.add(vvVar);
    }

    public final ViewGroup h0(fv fvVar) {
        ViewGroup viewGroup = fvVar.G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fvVar.x > 0 && this.x.b()) {
            View a2 = this.x.a(fvVar.x);
            if (a2 instanceof ViewGroup) {
                return (ViewGroup) a2;
            }
        }
        return null;
    }

    public int i() {
        return this.k.getAndIncrement();
    }

    public jv i0() {
        jv jvVar = this.A;
        if (jvVar != null) {
            return jvVar;
        }
        fv fvVar = this.y;
        return fvVar != null ? fvVar.t.i0() : this.B;
    }

    public void j(kv kvVar, iv ivVar, fv fvVar) {
        this.x = ivVar;
        this.y = fvVar;
        if (fvVar != null) {
            h(new f(fvVar));
        }
        if (this.y != null) {
            e1();
        }
        if (fvVar != null) {
            this.N = fvVar.t.f0(fvVar);
        } else {
            this.N = new uv(false);
        }
        this.N.m(C0());
        this.c.y(this.N);
    }

    public kv j0() {
        return null;
    }

    public void k(fv fvVar) {
        if (v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fvVar);
        }
        if (fvVar.A) {
            fvVar.A = false;
            if (fvVar.k) {
                return;
            }
            this.c.a(fvVar);
            if (v0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("add from attach: ");
                sb2.append(fvVar);
            }
            if (w0(fvVar)) {
                this.F = true;
            }
        }
    }

    public mv k0() {
        return this.p;
    }

    public cw l() {
        return new n7(this);
    }

    public fv l0() {
        return this.y;
    }

    public void m() {
        n7 n7Var = this.h;
        if (n7Var != null) {
            n7Var.u = false;
            n7Var.e();
            U();
            Iterator it = this.o.iterator();
            if (it.hasNext()) {
                my0.a(it.next());
                throw null;
            }
        }
    }

    public fv m0() {
        return this.z;
    }

    public boolean n() {
        boolean z = false;
        for (fv fvVar : this.c.j()) {
            if (fvVar != null) {
                z = w0(fvVar);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public kw0 n0() {
        kw0 kw0Var = this.C;
        if (kw0Var != null) {
            return kw0Var;
        }
        fv fvVar = this.y;
        return fvVar != null ? fvVar.t.n0() : this.D;
    }

    public final void o() {
        this.b = false;
        this.L.clear();
        this.K.clear();
    }

    public bw.c o0() {
        return this.O;
    }

    public final void p() {
        throw null;
    }

    public final Set q() {
        HashSet hashSet = new HashSet();
        for (yv yvVar : this.c.i()) {
            ViewGroup viewGroup = yvVar.k().G;
            if (viewGroup != null) {
                hashSet.add(jw0.v(viewGroup, n0()));
            }
        }
        return hashSet;
    }

    public d61 q0(fv fvVar) {
        return this.N.k(fvVar);
    }

    public Set r(ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator it = ((n7) arrayList.get(i2)).c.iterator();
            while (it.hasNext()) {
                fv fvVar = ((cw.a) it.next()).b;
                if (fvVar != null && (viewGroup = fvVar.G) != null) {
                    hashSet.add(jw0.u(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public void r0() {
        Q(true);
        if (!R || this.h == null) {
            if (this.j.e()) {
                v0(3);
                M0();
                return;
            }
            v0(3);
            this.g.e();
            return;
        }
        if (!this.o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(c0(this.h));
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                my0.a(it.next());
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    fv fvVar = (fv) it2.next();
                    throw null;
                }
            }
        }
        Iterator it3 = this.h.c.iterator();
        while (it3.hasNext()) {
            fv fvVar2 = ((cw.a) it3.next()).b;
            if (fvVar2 != null) {
                fvVar2.m = false;
            }
        }
        for (jw0 jw0Var : r(new ArrayList(Collections.singletonList(this.h)), 0, 1)) {
            jw0Var.f();
        }
        this.h = null;
        e1();
        if (v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("OnBackPressedCallback enabled=");
            sb.append(this.j.e());
            sb.append(" for  FragmentManager ");
            sb.append(this);
        }
    }

    public yv s(fv fvVar) {
        yv l = this.c.l(fvVar.e);
        if (l != null) {
            return l;
        }
        new yv(this.p, this.c, fvVar);
        throw null;
    }

    public void s0(fv fvVar) {
        if (v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fvVar);
        }
        if (fvVar.z) {
            return;
        }
        fvVar.z = true;
        fvVar.M = true ^ fvVar.M;
        b1(fvVar);
    }

    public void t(fv fvVar) {
        if (v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fvVar);
        }
        if (fvVar.A) {
            return;
        }
        fvVar.A = true;
        if (fvVar.k) {
            if (v0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("remove from detach: ");
                sb2.append(fvVar);
            }
            this.c.s(fvVar);
            if (w0(fvVar)) {
                this.F = true;
            }
            b1(fvVar);
        }
    }

    public void t0(fv fvVar) {
        if (fvVar.k && w0(fvVar)) {
            this.F = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) PackageParser.PARSE_IS_PRIVILEGED);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        fv fvVar = this.y;
        if (fvVar != null) {
            sb.append(fvVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            sb.append("null");
        }
        sb.append("}}");
        return sb.toString();
    }

    public void u() {
        this.G = false;
        this.H = false;
        this.N.m(false);
        J(4);
    }

    public boolean u0() {
        return this.I;
    }

    public void v(Configuration configuration, boolean z) {
        for (fv fvVar : this.c.m()) {
            if (fvVar != null) {
                fvVar.y0(configuration);
                if (z) {
                    fvVar.u.v(configuration, true);
                }
            }
        }
    }

    public void w() {
        this.G = false;
        this.H = false;
        this.N.m(false);
        J(1);
    }

    public final boolean w0(fv fvVar) {
        return (fvVar.D && fvVar.E) || fvVar.u.n();
    }

    public boolean x(Menu menu, MenuInflater menuInflater) {
        if (this.w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (fv fvVar : this.c.m()) {
            if (fvVar != null && z0(fvVar) && fvVar.A0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fvVar);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                fv fvVar2 = (fv) this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fvVar2)) {
                    fvVar2.g0();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final boolean x0() {
        fv fvVar = this.y;
        if (fvVar == null) {
            return true;
        }
        return fvVar.T() && this.y.C().x0();
    }

    public void y() {
        this.I = true;
        Q(true);
        N();
        p();
        J(-1);
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.j.f();
            this.g = null;
        }
    }

    public boolean y0(fv fvVar) {
        if (fvVar == null) {
            return false;
        }
        return fvVar.U();
    }

    public void z() {
        J(1);
    }

    public boolean z0(fv fvVar) {
        if (fvVar == null) {
            return true;
        }
        return fvVar.W();
    }
}
