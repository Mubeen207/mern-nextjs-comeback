package androidx.appcompat.view.menu;

import android.content.Context;
/* loaded from: classes.dex */
public final class fi implements vq {
    public final gl0 a;
    public final gl0 b;
    public final gl0 c;

    public fi(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3) {
        this.a = gl0Var;
        this.b = gl0Var2;
        this.c = gl0Var3;
    }

    public static fi a(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3) {
        return new fi(gl0Var, gl0Var2, gl0Var3);
    }

    public static ei c(Context context, ec ecVar, ec ecVar2) {
        return new ei(context, ecVar, ecVar2);
    }

    @Override // androidx.appcompat.view.menu.gl0
    /* renamed from: b */
    public ei get() {
        return c((Context) this.a.get(), (ec) this.b.get(), (ec) this.c.get());
    }
}
