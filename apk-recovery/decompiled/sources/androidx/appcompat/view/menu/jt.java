package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.kt;
import androidx.lifecycle.f;
import java.util.List;
/* loaded from: classes.dex */
public abstract class jt extends Activity implements kt.c, d90 {
    public static final int e = View.generateViewId();
    public boolean a = false;
    public kt b;
    public androidx.lifecycle.i c;
    public final OnBackInvokedCallback d;

    /* loaded from: classes.dex */
    public class a implements OnBackAnimationCallback {
        public a() {
        }

        public void onBackCancelled() {
            jt.this.H();
        }

        public void onBackInvoked() {
            jt.this.I();
        }

        public void onBackProgressed(BackEvent backEvent) {
            jt.this.X(backEvent);
        }

        public void onBackStarted(BackEvent backEvent) {
            jt.this.T(backEvent);
        }
    }

    public jt() {
        this.d = Build.VERSION.SDK_INT < 33 ? null : M();
        this.c = new androidx.lifecycle.i(this);
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public xo0 A() {
        return N() == lt.opaque ? xo0.surface : xo0.texture;
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public boolean B() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public io.flutter.embedding.engine.a D(Context context) {
        return null;
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public d21 E() {
        return N() == lt.opaque ? d21.opaque : d21.transparent;
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public void F(io.flutter.embedding.engine.a aVar) {
        if (this.b.p()) {
            return;
        }
        ox.a(aVar);
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public void G(ku kuVar) {
    }

    public void H() {
        if (U("cancelBackGesture")) {
            this.b.h();
        }
    }

    public void I() {
        if (U("commitBackGesture")) {
            this.b.i();
        }
    }

    public final void J() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    public final void K() {
        if (N() == lt.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final View L() {
        return this.b.u(null, null, null, e, A() == xo0.surface);
    }

    public final OnBackInvokedCallback M() {
        return Build.VERSION.SDK_INT >= 34 ? new a() : new OnBackInvokedCallback() { // from class: androidx.appcompat.view.menu.ht
            public final void onBackInvoked() {
                jt.this.onBackPressed();
            }
        };
    }

    public lt N() {
        return getIntent().hasExtra("background_mode") ? lt.valueOf(getIntent().getStringExtra("background_mode")) : lt.opaque;
    }

    public io.flutter.embedding.engine.a O() {
        return this.b.n();
    }

    public Bundle P() {
        return getPackageManager().getActivityInfo(getComponentName(), PackageParser.PARSE_IS_PRIVILEGED).metaData;
    }

    public final boolean Q() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    public void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.d);
            this.a = true;
        }
    }

    public void S() {
        W();
        kt ktVar = this.b;
        if (ktVar != null) {
            ktVar.J();
            this.b = null;
        }
    }

    public void T(BackEvent backEvent) {
        if (U("startBackGesture")) {
            this.b.L(backEvent);
        }
    }

    public final boolean U(String str) {
        kt ktVar = this.b;
        if (ktVar == null) {
            ha0.g("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        } else if (ktVar.o()) {
            return true;
        } else {
            ha0.g("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
            return false;
        }
    }

    public final void V() {
        try {
            Bundle P = P();
            if (P != null) {
                int i = P.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i != -1) {
                    setTheme(i);
                }
            } else {
                ha0.f("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            ha0.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public void W() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.d);
            this.a = false;
        }
    }

    public void X(BackEvent backEvent) {
        if (U("updateBackGestureProgress")) {
            this.b.M(backEvent);
        }
    }

    @Override // androidx.appcompat.view.menu.pi0.d
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public Context b() {
        return this;
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public void c() {
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public Activity d() {
        return this;
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public void e() {
        ha0.g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + O() + " evicted by another attaching activity");
        kt ktVar = this.b;
        if (ktVar != null) {
            ktVar.v();
            this.b.w();
        }
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public void f() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // androidx.appcompat.view.menu.pi0.d
    public void g(boolean z) {
        if (z && !this.a) {
            R();
        } else if (z || !this.a) {
        } else {
            W();
        }
    }

    @Override // androidx.appcompat.view.menu.kt.c, androidx.appcompat.view.menu.d90
    public androidx.lifecycle.f h() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public String i() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public String j() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle P = P();
            if (P != null) {
                return P.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public List m() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public boolean n() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public boolean o() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (q() != null || this.b.p()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (U("onActivityResult")) {
            this.b.r(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (U("onBackPressed")) {
            this.b.t();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        V();
        super.onCreate(bundle);
        kt ktVar = new kt(this);
        this.b = ktVar;
        ktVar.s(this);
        this.b.B(bundle);
        this.c.h(f.a.ON_CREATE);
        K();
        setContentView(L());
        J();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (U("onDestroy")) {
            this.b.v();
            this.b.w();
        }
        S();
        this.c.h(f.a.ON_DESTROY);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (U("onNewIntent")) {
            this.b.x(intent);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (U("onPause")) {
            this.b.y();
        }
        this.c.h(f.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (U("onPostResume")) {
            this.b.z();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (U("onRequestPermissionsResult")) {
            this.b.A(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.c.h(f.a.ON_RESUME);
        if (U("onResume")) {
            this.b.C();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (U("onSaveInstanceState")) {
            this.b.D(bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.c.h(f.a.ON_START);
        if (U("onStart")) {
            this.b.E();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        if (U("onStop")) {
            this.b.F();
        }
        this.c.h(f.a.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (U("onTrimMemory")) {
            this.b.G(i);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (U("onUserLeaveHint")) {
            this.b.H();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (U("onWindowFocusChanged")) {
            this.b.I(z);
        }
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public boolean p() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public String q() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public boolean r() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : q() == null;
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public String s() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle P = P();
            String string = P != null ? P.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public void t(io.flutter.embedding.engine.a aVar) {
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public String u() {
        try {
            Bundle P = P();
            if (P != null) {
                return P.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public pi0 v(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new pi0(d(), aVar.p(), this);
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public String w() {
        String dataString;
        if (Q() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public boolean x() {
        try {
            Bundle P = P();
            if (P != null) {
                return P.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public void y(mu muVar) {
    }

    @Override // androidx.appcompat.view.menu.kt.c
    public ju z() {
        return ju.a(getIntent());
    }
}
