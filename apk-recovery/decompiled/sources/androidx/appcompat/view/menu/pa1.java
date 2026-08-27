package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.sy0;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class pa1 {
    public final Executor a;
    public final gp b;
    public final sa1 c;
    public final sy0 d;

    public pa1(Executor executor, gp gpVar, sa1 sa1Var, sy0 sy0Var) {
        this.a = executor;
        this.b = gpVar;
        this.c = sa1Var;
        this.d = sy0Var;
    }

    public void c() {
        this.a.execute(new Runnable() { // from class: androidx.appcompat.view.menu.na1
            @Override // java.lang.Runnable
            public final void run() {
                pa1.this.e();
            }
        });
    }

    public final /* synthetic */ Object d() {
        for (g21 g21Var : this.b.q()) {
            this.c.a(g21Var, 1);
        }
        return null;
    }

    public final /* synthetic */ void e() {
        this.d.d(new sy0.a() { // from class: androidx.appcompat.view.menu.oa1
            @Override // androidx.appcompat.view.menu.sy0.a
            public final Object a() {
                Object d;
                d = pa1.this.d();
                return d;
            }
        });
    }
}
