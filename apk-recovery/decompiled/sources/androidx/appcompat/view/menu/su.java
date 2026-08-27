package androidx.appcompat.view.menu;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.d80;
import androidx.appcompat.view.menu.ee0;
import androidx.appcompat.view.menu.tt;
import androidx.appcompat.view.menu.uu;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class su extends FrameLayout implements ee0.c, d80.e {
    public ku a;
    public mu b;
    public tt c;
    public yo0 d;
    public yo0 e;
    public final Set f;
    public boolean g;
    public io.flutter.embedding.engine.a h;
    public final Set i;
    public ee0 j;
    public io.flutter.plugin.editing.c k;
    public nw0 l;
    public w90 m;
    public d80 n;
    public h2 o;
    public io.flutter.view.a p;
    public TextServicesManager q;
    public i81 r;
    public final FlutterRenderer.g s;
    public final a.k t;
    public final ContentObserver u;
    public final nu v;
    public final pf w;

    /* loaded from: classes.dex */
    public class a implements a.k {
        public a() {
        }

        @Override // io.flutter.view.a.k
        public void a(boolean z, boolean z2) {
            su.this.z(z, z2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ContentObserver {
        public b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            if (su.this.h == null) {
                return;
            }
            ha0.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
            su.this.B();
        }
    }

    /* loaded from: classes.dex */
    public class c implements nu {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.nu
        public void c() {
            su.this.g = false;
            for (nu nuVar : su.this.f) {
                nuVar.c();
            }
        }

        @Override // androidx.appcompat.view.menu.nu
        public void f() {
            su.this.g = true;
            for (nu nuVar : su.this.f) {
                nuVar.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements pf {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.pf, androidx.window.extensions.core.util.function.Consumer
        /* renamed from: a */
        public void accept(ba1 ba1Var) {
            su.this.setWindowInfoListenerDisplayFeatures(ba1Var);
        }
    }

    /* loaded from: classes.dex */
    public class e implements nu {
        public final /* synthetic */ FlutterRenderer a;
        public final /* synthetic */ Runnable b;

        public e(FlutterRenderer flutterRenderer, Runnable runnable) {
            this.a = flutterRenderer;
            this.b = runnable;
        }

        @Override // androidx.appcompat.view.menu.nu
        public void c() {
        }

        @Override // androidx.appcompat.view.menu.nu
        public void f() {
            this.a.l(this);
            this.b.run();
            su suVar = su.this;
            if ((suVar.d instanceof tt) || suVar.c == null) {
                return;
            }
            su.this.c.a();
            su.this.x();
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public su(Context context, ku kuVar) {
        this(context, (AttributeSet) null, kuVar);
    }

    public static /* synthetic */ boolean w(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals("com.google.android.inputmethod.latin");
    }

    public void A(Runnable runnable) {
        if (this.c == null) {
            ha0.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        yo0 yo0Var = this.e;
        if (yo0Var == null) {
            ha0.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.d = yo0Var;
        this.e = null;
        FlutterRenderer s = this.h.s();
        if (this.h != null && s != null) {
            this.d.b();
            s.g(new e(s, runnable));
            return;
        }
        this.c.a();
        x();
        runnable.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r1 != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L13
            androidx.appcompat.view.menu.tt0$c r0 = androidx.appcompat.view.menu.tt0.c.dark
            goto L15
        L13:
            androidx.appcompat.view.menu.tt0$c r0 = androidx.appcompat.view.menu.tt0.c.light
        L15:
            android.view.textservice.TextServicesManager r1 = r6.q
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3e
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L3c
            java.util.List r1 = androidx.appcompat.view.menu.pu.a(r1)
            java.util.stream.Stream r1 = r1.stream()
            androidx.appcompat.view.menu.ru r4 = new androidx.appcompat.view.menu.ru
            r4.<init>()
            boolean r1 = r1.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.q
            boolean r4 = androidx.appcompat.view.menu.qu.a(r4)
            if (r4 == 0) goto L3e
            if (r1 == 0) goto L3e
        L3c:
            r1 = r3
            goto L3f
        L3e:
            r1 = r2
        L3f:
            io.flutter.embedding.engine.a r4 = r6.h
            androidx.appcompat.view.menu.tt0 r4 = r4.u()
            androidx.appcompat.view.menu.tt0$b r4 = r4.d()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            androidx.appcompat.view.menu.tt0$b r4 = r4.f(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            androidx.appcompat.view.menu.tt0$b r4 = r4.c(r5)
            androidx.appcompat.view.menu.tt0$b r1 = r4.d(r1)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r3)
            if (r4 != r3) goto L78
            r2 = r3
        L78:
            androidx.appcompat.view.menu.tt0$b r1 = r1.b(r2)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            androidx.appcompat.view.menu.tt0$b r1 = r1.g(r2)
            androidx.appcompat.view.menu.tt0$b r0 = r1.e(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.su.B():void");
    }

    public final void C() {
        if (!v()) {
            ha0.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.s.a = getResources().getDisplayMetrics().density;
        this.s.p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.h.s().o(this.s);
    }

    @Override // androidx.appcompat.view.menu.d80.e
    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        this.k.j(sparseArray);
    }

    @Override // androidx.appcompat.view.menu.ee0.c
    public PointerIcon b(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    @Override // androidx.appcompat.view.menu.d80.e
    public boolean c(KeyEvent keyEvent) {
        return this.k.p(keyEvent);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.h;
        return aVar != null ? aVar.q().y(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (v() && this.n.b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.a aVar = this.p;
        if (aVar == null || !aVar.z()) {
            return null;
        }
        return this.p;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.h;
    }

    @Override // androidx.appcompat.view.menu.d80.e
    public i8 getBinaryMessenger() {
        return this.h.k();
    }

    public tt getCurrentImageSurface() {
        return this.c;
    }

    public boolean k() {
        tt ttVar = this.c;
        if (ttVar != null) {
            return ttVar.e();
        }
        return false;
    }

    public void l(nu nuVar) {
        this.f.add(nuVar);
    }

    public void m(tt ttVar) {
        io.flutter.embedding.engine.a aVar = this.h;
        if (aVar != null) {
            ttVar.c(aVar.s());
        }
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        ha0.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (v()) {
            if (aVar == this.h) {
                ha0.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                ha0.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                s();
            }
        }
        this.h = aVar;
        FlutterRenderer s = aVar.s();
        this.g = s.i();
        this.d.c(s);
        s.g(this.v);
        this.j = new ee0(this, this.h.n());
        this.k = new io.flutter.plugin.editing.c(this, this.h.x(), this.h.q());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.q = textServicesManager;
            this.l = new nw0(textServicesManager, this.h.v());
        } catch (Exception unused) {
            ha0.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.m = this.h.m();
        this.n = new d80(this);
        this.o = new h2(this.h.s(), false);
        io.flutter.view.a aVar2 = new io.flutter.view.a(this, aVar.h(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.h.q());
        this.p = aVar2;
        aVar2.X(this.t);
        z(this.p.z(), this.p.B());
        this.h.q().a(this.p);
        this.h.q().w(this.h.s());
        this.k.o().restartInput(this);
        B();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.u);
        C();
        aVar.q().x(this);
        Iterator it = this.i.iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        } else if (this.g) {
            this.v.f();
        }
    }

    public final f o() {
        Context context = getContext();
        int i = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 2) {
            if (rotation == 1) {
                return f.RIGHT;
            }
            if (rotation == 3) {
                return f.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return f.BOTH;
            }
        }
        return f.NONE;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Insets insets;
        int i;
        int i2;
        int i3;
        int i4;
        int ime;
        Insets insets2;
        int i5;
        int i6;
        int i7;
        int i8;
        int systemGestures;
        Insets insets3;
        int i9;
        int i10;
        int i11;
        int i12;
        Insets waterfallInsets;
        int i13;
        int i14;
        int i15;
        int i16;
        int statusBars;
        Insets systemGestureInsets;
        int i17;
        int i18;
        int i19;
        int i20;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i21 = Build.VERSION.SDK_INT;
        if (i21 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            FlutterRenderer.g gVar = this.s;
            i17 = systemGestureInsets.top;
            gVar.l = i17;
            FlutterRenderer.g gVar2 = this.s;
            i18 = systemGestureInsets.right;
            gVar2.m = i18;
            FlutterRenderer.g gVar3 = this.s;
            i19 = systemGestureInsets.bottom;
            gVar3.n = i19;
            FlutterRenderer.g gVar4 = this.s;
            i20 = systemGestureInsets.left;
            gVar4.o = i20;
        }
        boolean z = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z2 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i21 >= 30) {
            int navigationBars = z2 ? WindowInsets.Type.navigationBars() : 0;
            if (z) {
                statusBars = WindowInsets.Type.statusBars();
                navigationBars |= statusBars;
            }
            insets = windowInsets.getInsets(navigationBars);
            FlutterRenderer.g gVar5 = this.s;
            i = insets.top;
            gVar5.d = i;
            FlutterRenderer.g gVar6 = this.s;
            i2 = insets.right;
            gVar6.e = i2;
            FlutterRenderer.g gVar7 = this.s;
            i3 = insets.bottom;
            gVar7.f = i3;
            FlutterRenderer.g gVar8 = this.s;
            i4 = insets.left;
            gVar8.g = i4;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            FlutterRenderer.g gVar9 = this.s;
            i5 = insets2.top;
            gVar9.h = i5;
            FlutterRenderer.g gVar10 = this.s;
            i6 = insets2.right;
            gVar10.i = i6;
            FlutterRenderer.g gVar11 = this.s;
            i7 = insets2.bottom;
            gVar11.j = i7;
            FlutterRenderer.g gVar12 = this.s;
            i8 = insets2.left;
            gVar12.k = i8;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            FlutterRenderer.g gVar13 = this.s;
            i9 = insets3.top;
            gVar13.l = i9;
            FlutterRenderer.g gVar14 = this.s;
            i10 = insets3.right;
            gVar14.m = i10;
            FlutterRenderer.g gVar15 = this.s;
            i11 = insets3.bottom;
            gVar15.n = i11;
            FlutterRenderer.g gVar16 = this.s;
            i12 = insets3.left;
            gVar16.o = i12;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                waterfallInsets = displayCutout.getWaterfallInsets();
                FlutterRenderer.g gVar17 = this.s;
                int i22 = gVar17.d;
                i13 = waterfallInsets.top;
                gVar17.d = Math.max(Math.max(i22, i13), displayCutout.getSafeInsetTop());
                FlutterRenderer.g gVar18 = this.s;
                int i23 = gVar18.e;
                i14 = waterfallInsets.right;
                gVar18.e = Math.max(Math.max(i23, i14), displayCutout.getSafeInsetRight());
                FlutterRenderer.g gVar19 = this.s;
                int i24 = gVar19.f;
                i15 = waterfallInsets.bottom;
                gVar19.f = Math.max(Math.max(i24, i15), displayCutout.getSafeInsetBottom());
                FlutterRenderer.g gVar20 = this.s;
                int i25 = gVar20.g;
                i16 = waterfallInsets.left;
                gVar20.g = Math.max(Math.max(i25, i16), displayCutout.getSafeInsetLeft());
            }
        } else {
            f fVar = f.NONE;
            if (!z2) {
                fVar = o();
            }
            this.s.d = z ? windowInsets.getSystemWindowInsetTop() : 0;
            this.s.e = (fVar == f.RIGHT || fVar == f.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.s.f = (z2 && t(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.s.g = (fVar == f.LEFT || fVar == f.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.g gVar21 = this.s;
            gVar21.h = 0;
            gVar21.i = 0;
            gVar21.j = t(windowInsets);
            this.s.k = 0;
        }
        ha0.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.s.d + ", Left: " + this.s.g + ", Right: " + this.s.e + "\nKeyboard insets: Bottom: " + this.s.j + ", Left: " + this.s.k + ", Right: " + this.s.i + "System Gesture Insets - Left: " + this.s.o + ", Top: " + this.s.l + ", Right: " + this.s.m + ", Bottom: " + this.s.j);
        C();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = r();
        Activity b2 = r61.b(getContext());
        i81 i81Var = this.r;
        if (i81Var == null || b2 == null) {
            return;
        }
        i81Var.a(b2, lg.h(getContext()), this.w);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.h != null) {
            ha0.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.m.d(configuration);
            B();
            r61.a(getContext(), this.h);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !v() ? super.onCreateInputConnection(editorInfo) : this.k.m(this, this.n, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        i81 i81Var = this.r;
        if (i81Var != null) {
            i81Var.b(this.w);
        }
        this.r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (v() && this.o.i(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !v() ? super.onHoverEvent(motionEvent) : this.p.I(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        this.k.x(viewStructure, i);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ha0.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i3 + " x " + i4 + ", it is now " + i + " x " + i2);
        FlutterRenderer.g gVar = this.s;
        gVar.b = i;
        gVar.c = i2;
        C();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (v()) {
            requestUnbufferedDispatch(motionEvent);
            return this.o.j(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        this.d.d();
        tt ttVar = this.c;
        if (ttVar == null) {
            tt q = q();
            this.c = q;
            addView(q);
        } else {
            ttVar.k(getWidth(), getHeight());
        }
        this.e = this.d;
        tt ttVar2 = this.c;
        this.d = ttVar2;
        io.flutter.embedding.engine.a aVar = this.h;
        if (aVar != null) {
            ttVar2.c(aVar.s());
        }
    }

    public tt q() {
        return new tt(getContext(), getWidth(), getHeight(), tt.b.background);
    }

    public i81 r() {
        try {
            return new i81(new k81(j81.a.d(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void s() {
        ha0.f("FlutterView", "Detaching from a FlutterEngine: " + this.h);
        if (!v()) {
            ha0.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator it = this.i.iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
        getContext().getContentResolver().unregisterContentObserver(this.u);
        this.h.q().F();
        this.h.q().d();
        this.p.P();
        this.p = null;
        this.k.o().restartInput(this);
        this.k.n();
        this.n.d();
        nw0 nw0Var = this.l;
        if (nw0Var != null) {
            nw0Var.b();
        }
        ee0 ee0Var = this.j;
        if (ee0Var != null) {
            ee0Var.c();
        }
        FlutterRenderer s = this.h.s();
        this.g = false;
        s.l(this.v);
        s.q();
        s.n(false);
        yo0 yo0Var = this.e;
        if (yo0Var != null && this.d == this.c) {
            this.d = yo0Var;
        }
        this.d.a();
        x();
        this.e = null;
        this.h = null;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        yo0 yo0Var = this.d;
        if (yo0Var instanceof ku) {
            ((ku) yo0Var).setVisibility(i);
        }
    }

    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(ba1 ba1Var) {
        DisplayCutout displayCutout;
        List<jm> a2 = ba1Var.a();
        ArrayList arrayList = new ArrayList();
        for (jm jmVar : a2) {
            ha0.f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + jmVar.a().toString() + " and type = " + jmVar.getClass().getSimpleName());
            if (jmVar instanceof uu) {
                uu uuVar = (uu) jmVar;
                arrayList.add(new FlutterRenderer.c(jmVar.a(), uuVar.b() == uu.a.d ? FlutterRenderer.e.HINGE : FlutterRenderer.e.FOLD, uuVar.getState() == uu.b.c ? FlutterRenderer.d.POSTURE_FLAT : uuVar.getState() == uu.b.d ? FlutterRenderer.d.POSTURE_HALF_OPENED : FlutterRenderer.d.UNKNOWN));
            } else {
                arrayList.add(new FlutterRenderer.c(jmVar.a(), FlutterRenderer.e.UNKNOWN, FlutterRenderer.d.UNKNOWN));
            }
        }
        WindowInsets rootWindowInsets = getRootWindowInsets();
        if (rootWindowInsets != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                ha0.f("FlutterView", "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new FlutterRenderer.c(rect, FlutterRenderer.e.CUTOUT));
            }
        }
        this.s.q = arrayList;
        C();
    }

    public final int t(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    public final void u() {
        ha0.f("FlutterView", "Initializing FlutterView");
        if (this.a != null) {
            ha0.f("FlutterView", "Internally using a FlutterSurfaceView.");
            addView(this.a);
        } else if (this.b != null) {
            ha0.f("FlutterView", "Internally using a FlutterTextureView.");
            addView(this.b);
        } else {
            ha0.f("FlutterView", "Internally using a FlutterImageView.");
            addView(this.c);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAutofill(1);
    }

    public boolean v() {
        io.flutter.embedding.engine.a aVar = this.h;
        return aVar != null && aVar.s() == this.d.getAttachedRenderer();
    }

    public final void x() {
        tt ttVar = this.c;
        if (ttVar != null) {
            ttVar.g();
            removeView(this.c);
            this.c = null;
        }
    }

    public void y(nu nuVar) {
        this.f.remove(nuVar);
    }

    public final void z(boolean z, boolean z2) {
        boolean z3 = false;
        if (this.h.s().j()) {
            setWillNotDraw(false);
            return;
        }
        if (!z && !z2) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    public su(Context context, mu muVar) {
        this(context, (AttributeSet) null, muVar);
    }

    public su(Context context, AttributeSet attributeSet, ku kuVar) {
        super(context, attributeSet);
        this.f = new HashSet();
        this.i = new HashSet();
        this.s = new FlutterRenderer.g();
        this.t = new a();
        this.u = new b(new Handler(Looper.getMainLooper()));
        this.v = new c();
        this.w = new d();
        this.a = kuVar;
        this.d = kuVar;
        u();
    }

    public su(Context context, AttributeSet attributeSet, mu muVar) {
        super(context, attributeSet);
        this.f = new HashSet();
        this.i = new HashSet();
        this.s = new FlutterRenderer.g();
        this.t = new a();
        this.u = new b(new Handler(Looper.getMainLooper()));
        this.v = new c();
        this.w = new d();
        this.b = muVar;
        this.d = muVar;
        u();
    }
}
