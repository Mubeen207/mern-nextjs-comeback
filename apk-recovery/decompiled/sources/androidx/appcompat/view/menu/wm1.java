package androidx.appcompat.view.menu;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class wm1 extends fv implements b90 {
    public static final WeakHashMap e0 = new WeakHashMap();
    public final Map b0 = Collections.synchronizedMap(new o4());
    public int c0 = 0;
    public Bundle d0;

    public static wm1 h1(gv gvVar) {
        wm1 wm1Var;
        WeakReference weakReference = (WeakReference) e0.get(gvVar);
        if (weakReference == null || (wm1Var = (wm1) weakReference.get()) == null) {
            throw null;
        }
        return wm1Var;
    }

    @Override // androidx.appcompat.view.menu.b90
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.b0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.b0.put(str, lifecycleCallback);
        if (this.c0 > 0) {
            new wy1(Looper.getMainLooper()).post(new mk1(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.appcompat.view.menu.fv
    public final void b0(Bundle bundle) {
        super.b0(bundle);
        this.c0 = 1;
        this.d0 = bundle;
        for (Map.Entry entry : this.b0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.appcompat.view.menu.b90
    public final LifecycleCallback d(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.b0.get(str));
    }

    @Override // androidx.appcompat.view.menu.b90
    public final /* synthetic */ Activity e() {
        j();
        return null;
    }

    @Override // androidx.appcompat.view.menu.fv
    public final void q0() {
        super.q0();
        this.c0 = 3;
        for (LifecycleCallback lifecycleCallback : this.b0.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // androidx.appcompat.view.menu.fv
    public final void r0(Bundle bundle) {
        super.r0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.b0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.appcompat.view.menu.fv
    public final void s0() {
        super.s0();
        this.c0 = 2;
        for (LifecycleCallback lifecycleCallback : this.b0.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // androidx.appcompat.view.menu.fv
    public final void t0() {
        super.t0();
        this.c0 = 4;
        for (LifecycleCallback lifecycleCallback : this.b0.values()) {
            lifecycleCallback.k();
        }
    }
}
