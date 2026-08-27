package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.sy0;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class yj implements wr0 {
    public static final Logger f = Logger.getLogger(n21.class.getName());
    public final sa1 a;
    public final Executor b;
    public final r7 c;
    public final gp d;
    public final sy0 e;

    public yj(Executor executor, r7 r7Var, sa1 sa1Var, gp gpVar, sy0 sy0Var) {
        this.b = executor;
        this.c = r7Var;
        this.a = sa1Var;
        this.d = gpVar;
        this.e = sy0Var;
    }

    @Override // androidx.appcompat.view.menu.wr0
    public void a(final g21 g21Var, final ap apVar, final q21 q21Var) {
        this.b.execute(new Runnable() { // from class: androidx.appcompat.view.menu.vj
            @Override // java.lang.Runnable
            public final void run() {
                yj.this.e(g21Var, q21Var, apVar);
            }
        });
    }

    public final /* synthetic */ Object d(g21 g21Var, ap apVar) {
        this.d.k(g21Var, apVar);
        this.a.a(g21Var, 1);
        return null;
    }

    public final /* synthetic */ void e(final g21 g21Var, q21 q21Var, ap apVar) {
        try {
            f21 a = this.c.a(g21Var.b());
            if (a == null) {
                String format = String.format("Transport backend '%s' is not registered", g21Var.b());
                f.warning(format);
                q21Var.a(new IllegalArgumentException(format));
                return;
            }
            final ap a2 = a.a(apVar);
            this.e.d(new sy0.a() { // from class: androidx.appcompat.view.menu.wj
                @Override // androidx.appcompat.view.menu.sy0.a
                public final Object a() {
                    Object d;
                    d = yj.this.d(g21Var, a2);
                    return d;
                }
            });
            q21Var.a(null);
        } catch (Exception e) {
            Logger logger = f;
            logger.warning("Error scheduling event " + e.getMessage());
            q21Var.a(e);
        }
    }
}
