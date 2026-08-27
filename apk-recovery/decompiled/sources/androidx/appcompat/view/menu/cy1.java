package androidx.appcompat.view.menu;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class cy1 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ nx1 d;

    public cy1(nx1 nx1Var, String str, String str2, String str3) {
        this.d = nx1Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        r82 r82Var;
        r82 r82Var2;
        r82Var = this.d.l;
        r82Var.o0();
        r82Var2 = this.d.l;
        return r82Var2.e0().y0(this.a, this.b, this.c);
    }
}
