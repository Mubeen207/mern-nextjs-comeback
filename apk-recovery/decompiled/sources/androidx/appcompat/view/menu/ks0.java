package androidx.appcompat.view.menu;

import android.content.Context;
/* loaded from: classes.dex */
public final class ks0 implements vq {
    public final gl0 a;
    public final gl0 b;
    public final gl0 c;

    public ks0(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3) {
        this.a = gl0Var;
        this.b = gl0Var2;
        this.c = gl0Var3;
    }

    public static ks0 a(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3) {
        return new ks0(gl0Var, gl0Var2, gl0Var3);
    }

    public static js0 c(Context context, String str, int i) {
        return new js0(context, str, i);
    }

    @Override // androidx.appcompat.view.menu.gl0
    /* renamed from: b */
    public js0 get() {
        return c((Context) this.a.get(), (String) this.b.get(), ((Integer) this.c.get()).intValue());
    }
}
