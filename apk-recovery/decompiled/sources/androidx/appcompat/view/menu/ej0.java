package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.bj0;
import androidx.appcompat.view.menu.ej0;
import androidx.appcompat.view.menu.zd0;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public class ej0 implements zi0 {
    public static Class[] w = {SurfaceView.class};
    public h2 b;
    public Context c;
    public su d;
    public TextureRegistry e;
    public io.flutter.plugin.editing.c f;
    public bj0 g;
    public int o = 0;
    public boolean p = false;
    public boolean q = true;
    public boolean u = false;
    public final bj0.g v = new a();
    public final xi0 a = new xi0();
    public final HashMap i = new HashMap();
    public final d0 h = new d0();
    public final HashMap j = new HashMap();
    public final SparseArray m = new SparseArray();
    public final HashSet r = new HashSet();
    public final HashSet s = new HashSet();
    public final SparseArray n = new SparseArray();
    public final SparseArray k = new SparseArray();
    public final SparseArray l = new SparseArray();
    public final zd0 t = zd0.a();

    /* loaded from: classes.dex */
    public class a implements bj0.g {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.bj0.g
        public void a(bj0.e eVar, final bj0.b bVar) {
            int i0 = ej0.this.i0(eVar.b);
            int i02 = ej0.this.i0(eVar.c);
            int i = eVar.a;
            if (ej0.this.b(i)) {
                final float L = ej0.this.L();
                final io.flutter.plugin.platform.a aVar = (io.flutter.plugin.platform.a) ej0.this.i.get(Integer.valueOf(i));
                ej0.this.Q(aVar);
                aVar.i(i0, i02, new Runnable(aVar, L, bVar) { // from class: androidx.appcompat.view.menu.dj0
                    public final /* synthetic */ io.flutter.plugin.platform.a n;
                    public final /* synthetic */ float o;
                    public final /* synthetic */ bj0.b p;

                    {
                        this.o = L;
                        this.p = bVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ej0.a.this.k(this.n, this.o, this.p);
                    }
                });
                return;
            }
            my0.a(ej0.this.k.get(i));
            yi0 yi0Var = (yi0) ej0.this.n.get(i);
            ha0.b("PlatformViewsController", "Resizing unknown platform view with id: " + i);
        }

        @Override // androidx.appcompat.view.menu.bj0.g
        public void b(boolean z) {
            ej0.this.q = z;
        }

        @Override // androidx.appcompat.view.menu.bj0.g
        public void c(int i, double d, double d2) {
            if (ej0.this.b(i)) {
                return;
            }
            yi0 yi0Var = (yi0) ej0.this.n.get(i);
            ha0.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i);
        }

        @Override // androidx.appcompat.view.menu.bj0.g
        public void d(int i, int i2) {
            if (!ej0.l0(i2)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i2 + "(view id: " + i + ")");
            } else if (!ej0.this.b(i)) {
                my0.a(ej0.this.k.get(i));
                ha0.b("PlatformViewsController", "Setting direction to an unknown view with id: " + i);
            } else {
                View e = ((io.flutter.plugin.platform.a) ej0.this.i.get(Integer.valueOf(i))).e();
                if (e != null) {
                    e.setLayoutDirection(i2);
                    return;
                }
                ha0.b("PlatformViewsController", "Setting direction to a null view with id: " + i);
            }
        }

        @Override // androidx.appcompat.view.menu.bj0.g
        public void e(bj0.f fVar) {
            int i = fVar.a;
            float f = ej0.this.c.getResources().getDisplayMetrics().density;
            if (ej0.this.b(i)) {
                ((io.flutter.plugin.platform.a) ej0.this.i.get(Integer.valueOf(i))).b(ej0.this.h0(f, fVar, true));
                return;
            }
            my0.a(ej0.this.k.get(i));
            ha0.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i);
        }

        @Override // androidx.appcompat.view.menu.bj0.g
        public void f(bj0.d dVar) {
            ej0.this.I(19);
            ej0.this.J(dVar);
            ej0.this.C(dVar, false);
            ej0.this.z(null, dVar);
        }

        @Override // androidx.appcompat.view.menu.bj0.g
        public long g(bj0.d dVar) {
            ej0.this.J(dVar);
            int i = dVar.a;
            if (ej0.this.n.get(i) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i);
            } else if (ej0.this.e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i);
            } else if (ej0.this.d != null) {
                ej0.this.C(dVar, true);
                throw null;
            } else {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i);
            }
        }

        @Override // androidx.appcompat.view.menu.bj0.g
        public void h(int i) {
            if (!ej0.this.b(i)) {
                my0.a(ej0.this.k.get(i));
                ha0.b("PlatformViewsController", "Clearing focus on an unknown view with id: " + i);
                return;
            }
            View e = ((io.flutter.plugin.platform.a) ej0.this.i.get(Integer.valueOf(i))).e();
            if (e != null) {
                e.clearFocus();
                return;
            }
            ha0.b("PlatformViewsController", "Clearing focus on a null view with id: " + i);
        }

        @Override // androidx.appcompat.view.menu.bj0.g
        public void i(int i) {
            my0.a(ej0.this.k.get(i));
            ha0.b("PlatformViewsController", "Disposing unknown platform view with id: " + i);
        }

        public final /* synthetic */ void k(io.flutter.plugin.platform.a aVar, float f, bj0.b bVar) {
            ej0.this.k0(aVar);
            if (ej0.this.c != null) {
                f = ej0.this.L();
            }
            bVar.a(new bj0.c(ej0.this.g0(aVar.d(), f), ej0.this.g0(aVar.c(), f)));
        }
    }

    public static MotionEvent.PointerCoords a0(Object obj, float f) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d = f;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d);
        return pointerCoords;
    }

    public static List b0(Object obj, float f) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            arrayList.add(a0(obj2, f));
        }
        return arrayList;
    }

    public static MotionEvent.PointerProperties c0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    public static List d0(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            arrayList.add(c0(obj2));
        }
        return arrayList;
    }

    public static void j0(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    public static boolean l0(int i) {
        return i == 0 || i == 1;
    }

    public FlutterOverlaySurface A() {
        return B(new mi0(this.d.getContext(), this.d.getWidth(), this.d.getHeight(), this.h));
    }

    public FlutterOverlaySurface B(mi0 mi0Var) {
        int i = this.o;
        this.o = i + 1;
        this.m.put(i, mi0Var);
        return new FlutterOverlaySurface(i, mi0Var.getSurface());
    }

    public ui0 C(bj0.d dVar, boolean z) {
        this.a.a(dVar.b);
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.b);
    }

    public void D() {
        for (int i = 0; i < this.m.size(); i++) {
            mi0 mi0Var = (mi0) this.m.valueAt(i);
            mi0Var.a();
            mi0Var.g();
        }
    }

    public void E() {
        bj0 bj0Var = this.g;
        if (bj0Var != null) {
            bj0Var.d(null);
        }
        D();
        this.g = null;
        this.c = null;
        this.e = null;
    }

    public void F() {
        for (int i = 0; i < this.n.size(); i++) {
            this.d.removeView((yi0) this.n.valueAt(i));
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            this.d.removeView((yt) this.l.valueAt(i2));
        }
        D();
        e0();
        this.d = null;
        this.p = false;
        if (this.k.size() <= 0) {
            return;
        }
        my0.a(this.k.valueAt(0));
        throw null;
    }

    public void G() {
        this.f = null;
    }

    public final void H() {
        while (this.k.size() > 0) {
            this.v.i(this.k.keyAt(0));
        }
    }

    public final void I(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= i) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i2 + ", required API level is: " + i);
    }

    public final void J(bj0.d dVar) {
        if (l0(dVar.g)) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.g + "(view id: " + dVar.a + ")");
    }

    public final void K(boolean z) {
        for (int i = 0; i < this.m.size(); i++) {
            int keyAt = this.m.keyAt(i);
            mi0 mi0Var = (mi0) this.m.valueAt(i);
            if (this.r.contains(Integer.valueOf(keyAt))) {
                this.d.m(mi0Var);
                z &= mi0Var.e();
            } else {
                if (!this.p) {
                    mi0Var.a();
                }
                mi0Var.setVisibility(8);
                this.d.removeView(mi0Var);
            }
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            int keyAt2 = this.l.keyAt(i2);
            View view = (View) this.l.get(keyAt2);
            if (!this.s.contains(Integer.valueOf(keyAt2)) || (!z && this.q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public final float L() {
        return this.c.getResources().getDisplayMetrics().density;
    }

    public wi0 M() {
        return this.a;
    }

    public void N(int i) {
        my0.a(this.k.get(i));
        throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
    }

    public final void O() {
        if (!this.q || this.p) {
            return;
        }
        this.d.p();
        this.p = true;
    }

    public final /* synthetic */ void P() {
        K(false);
    }

    public final void Q(io.flutter.plugin.platform.a aVar) {
        io.flutter.plugin.editing.c cVar = this.f;
        if (cVar == null) {
            return;
        }
        cVar.s();
        aVar.f();
    }

    public void R() {
    }

    public void S() {
        this.r.clear();
        this.s.clear();
    }

    public void T() {
        H();
    }

    public void U(int i, int i2, int i3, int i4, int i5) {
        if (this.m.get(i) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i + ") doesn't exist");
        }
        O();
        View view = (mi0) this.m.get(i);
        if (view.getParent() == null) {
            this.d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        this.r.add(Integer.valueOf(i));
    }

    public void V(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        O();
        N(i);
        yt ytVar = (yt) this.l.get(i);
        ytVar.a(flutterMutatorsStack, i2, i3, i4, i5);
        ytVar.setVisibility(0);
        ytVar.bringToFront();
        new FrameLayout.LayoutParams(i6, i7);
        my0.a(this.k.get(i));
        throw null;
    }

    public void W() {
        boolean z = false;
        if (this.p && this.s.isEmpty()) {
            this.p = false;
            this.d.A(new Runnable() { // from class: androidx.appcompat.view.menu.cj0
                @Override // java.lang.Runnable
                public final void run() {
                    ej0.this.P();
                }
            });
            return;
        }
        if (this.p && this.d.k()) {
            z = true;
        }
        K(z);
    }

    public void X() {
        H();
    }

    public void Y() {
        for (io.flutter.plugin.platform.a aVar : this.i.values()) {
            aVar.h();
        }
    }

    public void Z(int i) {
        if (i < 40) {
            return;
        }
        for (io.flutter.plugin.platform.a aVar : this.i.values()) {
            aVar.a();
        }
    }

    @Override // androidx.appcompat.view.menu.zi0
    public void a(io.flutter.view.a aVar) {
        this.h.b(aVar);
    }

    @Override // androidx.appcompat.view.menu.zi0
    public boolean b(int i) {
        return this.i.containsKey(Integer.valueOf(i));
    }

    @Override // androidx.appcompat.view.menu.zi0
    public View c(int i) {
        if (b(i)) {
            return ((io.flutter.plugin.platform.a) this.i.get(Integer.valueOf(i))).e();
        }
        my0.a(this.k.get(i));
        return null;
    }

    @Override // androidx.appcompat.view.menu.zi0
    public void d() {
        this.h.b(null);
    }

    public final void e0() {
        if (this.d == null) {
            ha0.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            this.d.removeView((View) this.m.valueAt(i));
        }
        this.m.clear();
    }

    public void f0(boolean z) {
        this.u = z;
    }

    public final int g0(double d, float f) {
        return (int) Math.round(d / f);
    }

    public MotionEvent h0(float f, bj0.f fVar, boolean z) {
        MotionEvent b = this.t.b(zd0.a.c(fVar.p));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) b0(fVar.g, f).toArray(new MotionEvent.PointerCoords[fVar.e]);
        if (z || b == null) {
            return MotionEvent.obtain(fVar.b.longValue(), fVar.c.longValue(), fVar.d, fVar.e, (MotionEvent.PointerProperties[]) d0(fVar.f).toArray(new MotionEvent.PointerProperties[fVar.e]), pointerCoordsArr, fVar.h, fVar.i, fVar.j, fVar.k, fVar.l, fVar.m, fVar.n, fVar.o);
        }
        j0(b, pointerCoordsArr);
        return b;
    }

    public final int i0(double d) {
        return (int) Math.round(d * L());
    }

    public final void k0(io.flutter.plugin.platform.a aVar) {
        io.flutter.plugin.editing.c cVar = this.f;
        if (cVar == null) {
            return;
        }
        cVar.E();
        aVar.g();
    }

    public void u(Context context, TextureRegistry textureRegistry, si siVar) {
        if (this.c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.c = context;
        this.e = textureRegistry;
        bj0 bj0Var = new bj0(siVar);
        this.g = bj0Var;
        bj0Var.d(this.v);
    }

    public void v(io.flutter.plugin.editing.c cVar) {
        this.f = cVar;
    }

    public void w(FlutterRenderer flutterRenderer) {
        this.b = new h2(flutterRenderer, true);
    }

    public void x(su suVar) {
        this.d = suVar;
        for (int i = 0; i < this.n.size(); i++) {
            this.d.addView((yi0) this.n.valueAt(i));
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            this.d.addView((yt) this.l.valueAt(i2));
        }
        if (this.k.size() <= 0) {
            return;
        }
        my0.a(this.k.valueAt(0));
        throw null;
    }

    public boolean y(View view) {
        if (view != null && this.j.containsKey(view.getContext())) {
            View view2 = (View) this.j.get(view.getContext());
            if (view2 == view) {
                return true;
            }
            return view2.checkInputConnectionProxy(view);
        }
        return false;
    }

    public final void z(ui0 ui0Var, bj0.d dVar) {
        I(19);
        ha0.e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.a);
    }
}
