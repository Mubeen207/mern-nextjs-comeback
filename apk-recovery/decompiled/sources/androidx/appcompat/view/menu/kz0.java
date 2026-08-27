package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class kz0 extends bz0 {
    public final Runnable o;

    public kz0(Runnable runnable, long j, fz0 fz0Var) {
        super(j, fz0Var);
        this.o = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.o.run();
        } finally {
            this.n.a();
        }
    }

    public String toString() {
        return "Task[" + hj.a(this.o) + '@' + hj.b(this.o) + ", " + this.m + ", " + this.n + ']';
    }
}
