package androidx.appcompat.view.menu;

import android.content.Context;
/* loaded from: classes.dex */
public final class hd0 implements vq {
    public final gl0 a;
    public final gl0 b;

    public hd0(gl0 gl0Var, gl0 gl0Var2) {
        this.a = gl0Var;
        this.b = gl0Var2;
    }

    public static hd0 a(gl0 gl0Var, gl0 gl0Var2) {
        return new hd0(gl0Var, gl0Var2);
    }

    public static gd0 c(Context context, Object obj) {
        return new gd0(context, (ei) obj);
    }

    @Override // androidx.appcompat.view.menu.gl0
    /* renamed from: b */
    public gd0 get() {
        return c((Context) this.a.get(), this.b.get());
    }
}
