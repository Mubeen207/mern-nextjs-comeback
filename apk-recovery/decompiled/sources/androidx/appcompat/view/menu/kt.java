package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.window.BackEvent;
import androidx.appcompat.view.menu.pi0;
import androidx.appcompat.view.menu.si;
import io.flutter.embedding.engine.b;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class kt implements qp {
    public c a;
    public io.flutter.embedding.engine.a b;
    public su c;
    public pi0 d;
    public ViewTreeObserver.OnPreDrawListener e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Integer j;
    public io.flutter.embedding.engine.b k;
    public final nu l;

    /* loaded from: classes.dex */
    public class a implements nu {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.nu
        public void c() {
            kt.this.a.c();
            kt.this.g = false;
        }

        @Override // androidx.appcompat.view.menu.nu
        public void f() {
            kt.this.a.f();
            kt.this.g = true;
            kt.this.h = true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ su a;

        public b(su suVar) {
            this.a = suVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (kt.this.g && kt.this.e != null) {
                this.a.getViewTreeObserver().removeOnPreDrawListener(this);
                kt.this.e = null;
            }
            return kt.this.g;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends pi0.d {
        xo0 A();

        boolean B();

        io.flutter.embedding.engine.a D(Context context);

        d21 E();

        void F(io.flutter.embedding.engine.a aVar);

        void G(ku kuVar);

        Context b();

        void c();

        Activity d();

        void e();

        void f();

        androidx.lifecycle.f h();

        String i();

        String j();

        List m();

        boolean n();

        boolean o();

        boolean p();

        String q();

        boolean r();

        String s();

        void t(io.flutter.embedding.engine.a aVar);

        String u();

        pi0 v(Activity activity, io.flutter.embedding.engine.a aVar);

        String w();

        boolean x();

        void y(mu muVar);

        ju z();
    }

    public kt(c cVar) {
        this(cVar, null);
    }

    public void A(int i, String[] strArr, int[] iArr) {
        l();
        if (this.b == null) {
            ha0.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        ha0.f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.b.i().b(i, strArr, iArr);
    }

    public void B(Bundle bundle) {
        Bundle bundle2;
        byte[] bArr;
        ha0.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        l();
        if (bundle != null) {
            bundle2 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
        } else {
            bundle2 = null;
            bArr = null;
        }
        if (this.a.r()) {
            this.b.t().j(bArr);
        }
        if (this.a.n()) {
            this.b.i().f(bundle2);
        }
    }

    public void C() {
        io.flutter.embedding.engine.a aVar;
        ha0.f("FlutterActivityAndFragmentDelegate", "onResume()");
        l();
        if (!this.a.p() || (aVar = this.b) == null) {
            return;
        }
        aVar.l().e();
    }

    public void D(Bundle bundle) {
        ha0.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        l();
        if (this.a.r()) {
            bundle.putByteArray("framework", this.b.t().h());
        }
        if (this.a.n()) {
            Bundle bundle2 = new Bundle();
            this.b.i().h(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    public void E() {
        ha0.f("FlutterActivityAndFragmentDelegate", "onStart()");
        l();
        k();
        Integer num = this.j;
        if (num != null) {
            this.c.setVisibility(num.intValue());
        }
    }

    public void F() {
        io.flutter.embedding.engine.a aVar;
        ha0.f("FlutterActivityAndFragmentDelegate", "onStop()");
        l();
        if (this.a.p() && (aVar = this.b) != null) {
            aVar.l().d();
        }
        this.j = Integer.valueOf(this.c.getVisibility());
        this.c.setVisibility(8);
        io.flutter.embedding.engine.a aVar2 = this.b;
        if (aVar2 != null) {
            aVar2.s().k(40);
        }
    }

    public void G(int i) {
        l();
        io.flutter.embedding.engine.a aVar = this.b;
        if (aVar != null) {
            if (this.h && i >= 10) {
                aVar.k().h();
                this.b.w().a();
            }
            this.b.s().k(i);
            this.b.q().Z(i);
        }
    }

    public void H() {
        l();
        if (this.b == null) {
            ha0.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        ha0.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
        this.b.i().i();
    }

    public void I(boolean z) {
        io.flutter.embedding.engine.a aVar;
        l();
        StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        sb.append(z ? "true" : "false");
        ha0.f("FlutterActivityAndFragmentDelegate", sb.toString());
        if (!this.a.p() || (aVar = this.b) == null) {
            return;
        }
        if (z) {
            aVar.l().a();
        } else {
            aVar.l().f();
        }
    }

    public void J() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public void K() {
        ha0.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String q = this.a.q();
        if (q != null) {
            io.flutter.embedding.engine.a a2 = nt.b().a(q);
            this.b = a2;
            this.f = true;
            if (a2 != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + q + "'");
        }
        c cVar = this.a;
        io.flutter.embedding.engine.a D = cVar.D(cVar.b());
        this.b = D;
        if (D != null) {
            this.f = true;
            return;
        }
        String i = this.a.i();
        if (i == null) {
            ha0.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            io.flutter.embedding.engine.b bVar = this.k;
            if (bVar == null) {
                bVar = new io.flutter.embedding.engine.b(this.a.b(), this.a.z().b());
            }
            this.b = bVar.a(g(new b.C0068b(this.a.b()).h(false).l(this.a.r())));
            this.f = false;
            return;
        }
        io.flutter.embedding.engine.b a3 = pt.b().a(i);
        if (a3 != null) {
            this.b = a3.a(g(new b.C0068b(this.a.b())));
            this.f = false;
            return;
        }
        throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + i + "'");
    }

    public void L(BackEvent backEvent) {
        l();
        if (this.b == null) {
            ha0.g("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
            return;
        }
        ha0.f("FlutterActivityAndFragmentDelegate", "Forwarding startBackGesture() to FlutterEngine.");
        this.b.j().d(backEvent);
    }

    public void M(BackEvent backEvent) {
        l();
        if (this.b == null) {
            ha0.g("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
            return;
        }
        ha0.f("FlutterActivityAndFragmentDelegate", "Forwarding updateBackGestureProgress() to FlutterEngine.");
        this.b.j().e(backEvent);
    }

    public void N() {
        pi0 pi0Var = this.d;
        if (pi0Var != null) {
            pi0Var.E();
        }
    }

    @Override // androidx.appcompat.view.menu.qp
    public void e() {
        if (!this.a.o()) {
            this.a.e();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public final b.C0068b g(b.C0068b c0068b) {
        String w = this.a.w();
        if (w == null || w.isEmpty()) {
            w = ut.e().c().g();
        }
        si.b bVar = new si.b(w, this.a.s());
        String j = this.a.j();
        if (j == null && (j = q(this.a.d().getIntent())) == null) {
            j = "/";
        }
        return c0068b.i(bVar).k(j).j(this.a.m());
    }

    public void h() {
        l();
        if (this.b == null) {
            ha0.g("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            return;
        }
        ha0.f("FlutterActivityAndFragmentDelegate", "Forwarding cancelBackGesture() to FlutterEngine.");
        this.b.j().b();
    }

    public void i() {
        l();
        if (this.b == null) {
            ha0.g("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            return;
        }
        ha0.f("FlutterActivityAndFragmentDelegate", "Forwarding commitBackGesture() to FlutterEngine.");
        this.b.j().c();
    }

    public final void j(su suVar) {
        if (this.a.A() != xo0.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.e != null) {
            suVar.getViewTreeObserver().removeOnPreDrawListener(this.e);
        }
        this.e = new b(suVar);
        suVar.getViewTreeObserver().addOnPreDrawListener(this.e);
    }

    public final void k() {
        String str;
        if (this.a.q() == null && !this.b.k().g()) {
            String j = this.a.j();
            if (j == null && (j = q(this.a.d().getIntent())) == null) {
                j = "/";
            }
            String u = this.a.u();
            if (("Executing Dart entrypoint: " + this.a.s() + ", library uri: " + u) == null) {
                str = "\"\"";
            } else {
                str = u + ", and sending initial route: " + j;
            }
            ha0.f("FlutterActivityAndFragmentDelegate", str);
            this.b.o().c(j);
            String w = this.a.w();
            if (w == null || w.isEmpty()) {
                w = ut.e().c().g();
            }
            this.b.k().e(u == null ? new si.b(w, this.a.s()) : new si.b(w, u, this.a.s()), this.a.m());
        }
    }

    public final void l() {
        if (this.a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    @Override // androidx.appcompat.view.menu.qp
    /* renamed from: m */
    public Activity f() {
        Activity d = this.a.d();
        if (d != null) {
            return d;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    public io.flutter.embedding.engine.a n() {
        return this.b;
    }

    public boolean o() {
        return this.i;
    }

    public boolean p() {
        return this.f;
    }

    public final String q(Intent intent) {
        Uri data;
        if (!this.a.x() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public void r(int i, int i2, Intent intent) {
        l();
        if (this.b == null) {
            ha0.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        ha0.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i + "\nresultCode: " + i2 + "\ndata: " + intent);
        this.b.i().a(i, i2, intent);
    }

    public void s(Context context) {
        l();
        if (this.b == null) {
            K();
        }
        if (this.a.n()) {
            ha0.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.b.i().d(this, this.a.h());
        }
        c cVar = this.a;
        this.d = cVar.v(cVar.d(), this.b);
        this.a.F(this.b);
        this.i = true;
    }

    public void t() {
        l();
        if (this.b == null) {
            ha0.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            return;
        }
        ha0.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
        this.b.o().a();
    }

    public View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i, boolean z) {
        ha0.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        l();
        if (this.a.A() == xo0.surface) {
            ku kuVar = new ku(this.a.b(), this.a.E() == d21.transparent);
            this.a.G(kuVar);
            this.c = new su(this.a.b(), kuVar);
        } else {
            mu muVar = new mu(this.a.b());
            muVar.setOpaque(this.a.E() == d21.opaque);
            this.a.y(muVar);
            this.c = new su(this.a.b(), muVar);
        }
        this.c.l(this.l);
        if (this.a.B()) {
            ha0.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.c.n(this.b);
        }
        this.c.setId(i);
        if (z) {
            j(this.c);
        }
        return this.c;
    }

    public void v() {
        ha0.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        l();
        if (this.e != null) {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this.e);
            this.e = null;
        }
        su suVar = this.c;
        if (suVar != null) {
            suVar.s();
            this.c.y(this.l);
        }
    }

    public void w() {
        io.flutter.embedding.engine.a aVar;
        if (this.i) {
            ha0.f("FlutterActivityAndFragmentDelegate", "onDetach()");
            l();
            this.a.t(this.b);
            if (this.a.n()) {
                ha0.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
                if (this.a.d().isChangingConfigurations()) {
                    this.b.i().c();
                } else {
                    this.b.i().g();
                }
            }
            pi0 pi0Var = this.d;
            if (pi0Var != null) {
                pi0Var.q();
                this.d = null;
            }
            if (this.a.p() && (aVar = this.b) != null) {
                aVar.l().b();
            }
            if (this.a.o()) {
                this.b.g();
                if (this.a.q() != null) {
                    nt.b().d(this.a.q());
                }
                this.b = null;
            }
            this.i = false;
        }
    }

    public void x(Intent intent) {
        l();
        if (this.b == null) {
            ha0.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        ha0.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.b.i().e(intent);
        String q = q(intent);
        if (q == null || q.isEmpty()) {
            return;
        }
        this.b.o().b(q);
    }

    public void y() {
        io.flutter.embedding.engine.a aVar;
        ha0.f("FlutterActivityAndFragmentDelegate", "onPause()");
        l();
        if (!this.a.p() || (aVar = this.b) == null) {
            return;
        }
        aVar.l().c();
    }

    public void z() {
        ha0.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        l();
        if (this.b == null) {
            ha0.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        N();
        this.b.q().Y();
    }

    public kt(c cVar, io.flutter.embedding.engine.b bVar) {
        this.l = new a();
        this.a = cVar;
        this.h = false;
        this.k = bVar;
    }
}
