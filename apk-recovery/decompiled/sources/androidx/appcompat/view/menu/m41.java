package androidx.appcompat.view.menu;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class m41 implements vq {
    public final gl0 a;
    public final gl0 b;
    public final gl0 c;
    public final gl0 d;
    public final gl0 e;
    public final gl0 f;
    public final gl0 g;
    public final gl0 h;
    public final gl0 i;

    public m41(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3, gl0 gl0Var4, gl0 gl0Var5, gl0 gl0Var6, gl0 gl0Var7, gl0 gl0Var8, gl0 gl0Var9) {
        this.a = gl0Var;
        this.b = gl0Var2;
        this.c = gl0Var3;
        this.d = gl0Var4;
        this.e = gl0Var5;
        this.f = gl0Var6;
        this.g = gl0Var7;
        this.h = gl0Var8;
        this.i = gl0Var9;
    }

    public static m41 a(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3, gl0 gl0Var4, gl0 gl0Var5, gl0 gl0Var6, gl0 gl0Var7, gl0 gl0Var8, gl0 gl0Var9) {
        return new m41(gl0Var, gl0Var2, gl0Var3, gl0Var4, gl0Var5, gl0Var6, gl0Var7, gl0Var8, gl0Var9);
    }

    public static l41 c(Context context, r7 r7Var, gp gpVar, sa1 sa1Var, Executor executor, sy0 sy0Var, ec ecVar, ec ecVar2, xb xbVar) {
        return new l41(context, r7Var, gpVar, sa1Var, executor, sy0Var, ecVar, ecVar2, xbVar);
    }

    @Override // androidx.appcompat.view.menu.gl0
    /* renamed from: b */
    public l41 get() {
        return c((Context) this.a.get(), (r7) this.b.get(), (gp) this.c.get(), (sa1) this.d.get(), (Executor) this.e.get(), (sy0) this.f.get(), (ec) this.g.get(), (ec) this.h.get(), (xb) this.i.get());
    }
}
