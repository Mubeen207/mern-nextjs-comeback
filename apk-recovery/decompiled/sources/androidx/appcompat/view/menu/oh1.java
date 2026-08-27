package androidx.appcompat.view.menu;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class oh1 {
    public final ir1 a;
    public sw1 b;
    public ff1 c;
    public final xe1 d;

    public oh1() {
        this(new ir1());
    }

    public final ff1 a() {
        return this.c;
    }

    public final void b(mt1 mt1Var) {
        jg1 jg1Var;
        try {
            this.b = this.a.b.d();
            if (this.a.a(this.b, (nt1[]) mt1Var.I().toArray(new nt1[0])) instanceof fg1) {
                throw new IllegalStateException("Program loading failed");
            }
            for (lt1 lt1Var : mt1Var.G().I()) {
                List<nt1> I = lt1Var.I();
                String H = lt1Var.H();
                for (nt1 nt1Var : I) {
                    tg1 a = this.a.a(this.b, nt1Var);
                    if (!(a instanceof rg1)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    sw1 sw1Var = this.b;
                    if (sw1Var.g(H)) {
                        tg1 c = sw1Var.c(H);
                        if (!(c instanceof jg1)) {
                            throw new IllegalStateException("Invalid function name: " + H);
                        }
                        jg1Var = (jg1) c;
                    } else {
                        jg1Var = null;
                    }
                    if (jg1Var == null) {
                        throw new IllegalStateException("Rule function is undefined: " + H);
                    }
                    jg1Var.a(this.b, Collections.singletonList(a));
                }
            }
        } catch (Throwable th) {
            throw new sk1(th);
        }
    }

    public final void c(String str, Callable callable) {
        this.a.b(str, callable);
    }

    public final boolean d(kf1 kf1Var) {
        try {
            this.c.b(kf1Var);
            this.a.c.h("runtime.counter", new bg1(Double.valueOf(0.0d)));
            this.d.b(this.b.d(), this.c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new sk1(th);
        }
    }

    public final /* synthetic */ jg1 e() {
        return new of2(this.d);
    }

    public final boolean f() {
        return !this.c.f().isEmpty();
    }

    public final boolean g() {
        return !this.c.d().equals(this.c.a());
    }

    public oh1(ir1 ir1Var) {
        this.a = ir1Var;
        this.b = ir1Var.b.d();
        this.c = new ff1();
        this.d = new xe1();
        ir1Var.b("internal.registerCallback", new Callable() { // from class: androidx.appcompat.view.menu.he1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return oh1.this.e();
            }
        });
        ir1Var.b("internal.eventLogger", new Callable() { // from class: androidx.appcompat.view.menu.cn1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new c32(oh1.this.c);
            }
        });
    }
}
