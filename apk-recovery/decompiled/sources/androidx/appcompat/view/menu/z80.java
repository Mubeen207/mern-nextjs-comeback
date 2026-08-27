package androidx.appcompat.view.menu;

import android.app.Activity;
/* loaded from: classes.dex */
public class z80 {
    public final Object a;

    public z80(Activity activity) {
        pj0.j(activity, "Activity must not be null");
        this.a = activity;
    }

    public final Activity a() {
        return (Activity) this.a;
    }

    public final gv b() {
        my0.a(this.a);
        return null;
    }

    public final boolean c() {
        return this.a instanceof Activity;
    }

    public final boolean d() {
        return false;
    }
}
