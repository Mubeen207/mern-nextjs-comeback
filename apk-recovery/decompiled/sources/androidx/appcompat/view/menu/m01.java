package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class m01 {
    public static final m01 a = new m01();
    public static final ThreadLocal b = n01.a(new py0("ThreadLocalEventLoop"));

    public final bp a() {
        ThreadLocal threadLocal = b;
        bp bpVar = (bp) threadLocal.get();
        if (bpVar == null) {
            bp a2 = ep.a();
            threadLocal.set(a2);
            return a2;
        }
        return bpVar;
    }

    public final void b() {
        b.set(null);
    }

    public final void c(bp bpVar) {
        b.set(bpVar);
    }
}
