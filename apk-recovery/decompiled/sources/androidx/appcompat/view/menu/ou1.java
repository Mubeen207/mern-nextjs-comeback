package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ou1 implements Runnable {
    public final /* synthetic */ vw1 m;

    public ou1(vw1 vw1Var) {
        this.m = vw1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ig0 ig0Var;
        ig0 ig0Var2;
        obj = this.m.b;
        synchronized (obj) {
            try {
                vw1 vw1Var = this.m;
                ig0Var = vw1Var.c;
                if (ig0Var != null) {
                    ig0Var2 = vw1Var.c;
                    ig0Var2.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
