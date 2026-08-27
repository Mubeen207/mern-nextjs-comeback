package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class bs0 implements vq {
    public final gl0 a;

    public bs0(gl0 gl0Var) {
        this.a = gl0Var;
    }

    public static xr0 a(ec ecVar) {
        return (xr0) oj0.c(as0.a(ecVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static bs0 b(gl0 gl0Var) {
        return new bs0(gl0Var);
    }

    @Override // androidx.appcompat.view.menu.gl0
    /* renamed from: c */
    public xr0 get() {
        return a((ec) this.a.get());
    }
}
