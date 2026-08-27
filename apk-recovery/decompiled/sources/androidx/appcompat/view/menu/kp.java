package androidx.appcompat.view.menu;

import android.content.Context;
/* loaded from: classes.dex */
public final class kp implements vq {
    public final gl0 a;

    public kp(gl0 gl0Var) {
        this.a = gl0Var;
    }

    public static kp a(gl0 gl0Var) {
        return new kp(gl0Var);
    }

    public static String c(Context context) {
        return (String) oj0.c(ip.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // androidx.appcompat.view.menu.gl0
    /* renamed from: b */
    public String get() {
        return c((Context) this.a.get());
    }
}
