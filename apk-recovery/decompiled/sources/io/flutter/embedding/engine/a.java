package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.appcompat.view.menu.a01;
import androidx.appcompat.view.menu.a90;
import androidx.appcompat.view.menu.ck0;
import androidx.appcompat.view.menu.de0;
import androidx.appcompat.view.menu.ej0;
import androidx.appcompat.view.menu.fk0;
import androidx.appcompat.view.menu.ha0;
import androidx.appcompat.view.menu.i1;
import androidx.appcompat.view.menu.ii0;
import androidx.appcompat.view.menu.m7;
import androidx.appcompat.view.menu.mp0;
import androidx.appcompat.view.menu.mw0;
import androidx.appcompat.view.menu.ot;
import androidx.appcompat.view.menu.ox;
import androidx.appcompat.view.menu.pk;
import androidx.appcompat.view.menu.r61;
import androidx.appcompat.view.menu.si;
import androidx.appcompat.view.menu.te0;
import androidx.appcompat.view.menu.tt0;
import androidx.appcompat.view.menu.ut;
import androidx.appcompat.view.menu.uy0;
import androidx.appcompat.view.menu.v90;
import androidx.appcompat.view.menu.w90;
import androidx.appcompat.view.menu.xt;
import androidx.appcompat.view.menu.z;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class a implements r61.a {
    public final FlutterJNI a;
    public final FlutterRenderer b;
    public final si c;
    public final ot d;
    public final w90 e;
    public final z f;
    public final pk g;
    public final a90 h;
    public final v90 i;
    public final de0 j;
    public final te0 k;
    public final m7 l;
    public final mp0 m;
    public final ii0 n;
    public final ck0 o;
    public final tt0 p;
    public final mw0 q;
    public final uy0 r;
    public final a01 s;
    public final ej0 t;
    public final Set u;
    public final b v;

    /* renamed from: io.flutter.embedding.engine.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0067a implements b {
        public C0067a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            ha0.f("FlutterEngine", "onPreEngineRestart()");
            for (b bVar : a.this.u) {
                bVar.b();
            }
            a.this.t.X();
            a.this.m.g();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();
    }

    public a(Context context, xt xtVar, FlutterJNI flutterJNI, ej0 ej0Var, String[] strArr, boolean z, boolean z2) {
        this(context, xtVar, flutterJNI, ej0Var, strArr, z, z2, null);
    }

    @Override // androidx.appcompat.view.menu.r61.a
    public void a(float f, float f2, float f3) {
        this.a.updateDisplayMetrics(0, f, f2, f3);
    }

    public void e(b bVar) {
        this.u.add(bVar);
    }

    public final void f() {
        ha0.f("FlutterEngine", "Attaching to JNI.");
        this.a.attachToNative();
        if (!y()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    public void g() {
        ha0.f("FlutterEngine", "Destroying.");
        for (b bVar : this.u) {
            bVar.a();
        }
        this.d.l();
        this.t.T();
        this.c.j();
        this.a.removeEngineLifecycleListener(this.v);
        this.a.setDeferredComponentManager(null);
        this.a.detachFromNativeAndReleaseResources();
        ut.e().a();
    }

    public z h() {
        return this.f;
    }

    public i1 i() {
        return this.d;
    }

    public m7 j() {
        return this.l;
    }

    public si k() {
        return this.c;
    }

    public a90 l() {
        return this.h;
    }

    public w90 m() {
        return this.e;
    }

    public de0 n() {
        return this.j;
    }

    public te0 o() {
        return this.k;
    }

    public ii0 p() {
        return this.n;
    }

    public ej0 q() {
        return this.t;
    }

    public ck0 r() {
        return this.o;
    }

    public FlutterRenderer s() {
        return this.b;
    }

    public mp0 t() {
        return this.m;
    }

    public tt0 u() {
        return this.p;
    }

    public mw0 v() {
        return this.q;
    }

    public uy0 w() {
        return this.r;
    }

    public a01 x() {
        return this.s;
    }

    public final boolean y() {
        return this.a.isAttached();
    }

    public a z(Context context, si.b bVar, String str, List list, ej0 ej0Var, boolean z, boolean z2) {
        if (y()) {
            return new a(context, null, this.a.spawn(bVar.c, bVar.b, str, list), ej0Var, null, z, z2);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    public a(Context context, xt xtVar, FlutterJNI flutterJNI, ej0 ej0Var, String[] strArr, boolean z, boolean z2, io.flutter.embedding.engine.b bVar) {
        AssetManager assets;
        this.u = new HashSet();
        this.v = new C0067a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        ut e = ut.e();
        flutterJNI = flutterJNI == null ? e.d().a() : flutterJNI;
        this.a = flutterJNI;
        si siVar = new si(flutterJNI, assets);
        this.c = siVar;
        siVar.i();
        ut.e().a();
        this.f = new z(siVar, flutterJNI);
        this.g = new pk(siVar);
        this.h = new a90(siVar);
        v90 v90Var = new v90(siVar);
        this.i = v90Var;
        this.j = new de0(siVar);
        this.k = new te0(siVar);
        this.l = new m7(siVar);
        this.n = new ii0(siVar);
        this.o = new ck0(siVar, context.getPackageManager());
        this.m = new mp0(siVar, z2);
        this.p = new tt0(siVar);
        this.q = new mw0(siVar);
        this.r = new uy0(siVar);
        this.s = new a01(siVar);
        w90 w90Var = new w90(context, v90Var);
        this.e = w90Var;
        xtVar = xtVar == null ? e.c() : xtVar;
        if (!flutterJNI.isAttached()) {
            xtVar.k(context.getApplicationContext());
            xtVar.f(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.v);
        flutterJNI.setPlatformViewsController(ej0Var);
        flutterJNI.setLocalizationPlugin(w90Var);
        e.a();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            f();
        }
        this.b = new FlutterRenderer(flutterJNI);
        this.t = ej0Var;
        ej0Var.R();
        ot otVar = new ot(context.getApplicationContext(), this, xtVar, bVar);
        this.d = otVar;
        w90Var.d(context.getResources().getConfiguration());
        if (z && xtVar.e()) {
            ox.a(this);
        }
        r61.a(context, this);
        otVar.j(new fk0(r()));
    }
}
