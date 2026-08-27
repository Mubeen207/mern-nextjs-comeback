package androidx.appcompat.view.menu;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
public final class mk1 implements Runnable {
    public final /* synthetic */ LifecycleCallback m;
    public final /* synthetic */ String n;
    public final /* synthetic */ wm1 o;

    public mk1(wm1 wm1Var, LifecycleCallback lifecycleCallback, String str) {
        this.o = wm1Var;
        this.m = lifecycleCallback;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        wm1 wm1Var = this.o;
        i = wm1Var.c0;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.m;
            bundle = wm1Var.d0;
            if (bundle != null) {
                bundle3 = wm1Var.d0;
                bundle2 = bundle3.getBundle(this.n);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i2 = this.o.c0;
        if (i2 >= 2) {
            this.m.j();
        }
        i3 = this.o.c0;
        if (i3 >= 3) {
            this.m.h();
        }
        i4 = this.o.c0;
        if (i4 >= 4) {
            this.m.k();
        }
        i5 = this.o.c0;
        if (i5 >= 5) {
            this.m.g();
        }
    }
}
