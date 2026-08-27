package androidx.appcompat.view.menu;

import android.content.Context;
/* loaded from: classes.dex */
public final class ds0 implements vq {
    public final gl0 a;
    public final gl0 b;
    public final gl0 c;
    public final gl0 d;

    public ds0(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3, gl0 gl0Var4) {
        this.a = gl0Var;
        this.b = gl0Var2;
        this.c = gl0Var3;
        this.d = gl0Var4;
    }

    public static ds0 a(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3, gl0 gl0Var4) {
        return new ds0(gl0Var, gl0Var2, gl0Var3, gl0Var4);
    }

    public static sa1 c(Context context, gp gpVar, xr0 xr0Var, ec ecVar) {
        return (sa1) oj0.c(cs0.a(context, gpVar, xr0Var, ecVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // androidx.appcompat.view.menu.gl0
    /* renamed from: b */
    public sa1 get() {
        return c((Context) this.a.get(), (gp) this.b.get(), (xr0) this.c.get(), (ec) this.d.get());
    }
}
