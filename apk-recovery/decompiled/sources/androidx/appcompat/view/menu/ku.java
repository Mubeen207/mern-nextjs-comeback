package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
/* loaded from: classes.dex */
public class ku extends SurfaceView implements yo0 {
    public final boolean a;
    public boolean b;
    public boolean c;
    public FlutterRenderer d;
    public final SurfaceHolder.Callback e;
    public final nu f;

    /* loaded from: classes.dex */
    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            ha0.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (ku.this.p()) {
                ku.this.k(i2, i3);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            ha0.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            ku.this.b = true;
            if (ku.this.p()) {
                ku.this.l();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            ha0.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            ku.this.b = false;
            if (ku.this.p()) {
                ku.this.m();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements nu {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.nu
        public void c() {
        }

        @Override // androidx.appcompat.view.menu.nu
        public void f() {
            ha0.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            ku.this.setAlpha(1.0f);
            if (ku.this.d != null) {
                ku.this.d.l(this);
            }
        }
    }

    public ku(Context context, boolean z) {
        this(context, null, z);
    }

    private void n() {
        if (this.a) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.e);
        setAlpha(0.0f);
    }

    @Override // androidx.appcompat.view.menu.yo0
    public void a() {
        if (this.d == null) {
            ha0.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            ha0.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            m();
        }
        setAlpha(0.0f);
        this.d.l(this.f);
        this.d = null;
    }

    @Override // androidx.appcompat.view.menu.yo0
    public void b() {
        FlutterRenderer flutterRenderer = this.d;
        if (flutterRenderer == null) {
            ha0.g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        flutterRenderer.g(this.f);
        if (o()) {
            ha0.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
        this.c = false;
    }

    @Override // androidx.appcompat.view.menu.yo0
    public void c(FlutterRenderer flutterRenderer) {
        ha0.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.d != null) {
            ha0.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.d.q();
            this.d.l(this.f);
        }
        this.d = flutterRenderer;
        b();
    }

    @Override // androidx.appcompat.view.menu.yo0
    public void d() {
        if (this.d == null) {
            ha0.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.c = true;
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], (getRight() + i) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // androidx.appcompat.view.menu.yo0
    public FlutterRenderer getAttachedRenderer() {
        return this.d;
    }

    public final void k(int i, int i2) {
        if (this.d == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        ha0.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
        this.d.r(i, i2);
    }

    public final void l() {
        if (this.d == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.d.p(getHolder().getSurface(), this.c);
    }

    public final void m() {
        FlutterRenderer flutterRenderer = this.d;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.q();
    }

    public boolean o() {
        return this.b;
    }

    public final boolean p() {
        return (this.d == null || this.c) ? false : true;
    }

    public ku(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.b = false;
        this.c = false;
        this.e = new a();
        this.f = new b();
        this.a = z;
        n();
    }
}
