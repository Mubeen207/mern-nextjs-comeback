package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class xg0 implements hl0 {
    public static final nk c = new nk() { // from class: androidx.appcompat.view.menu.vg0
        @Override // androidx.appcompat.view.menu.nk
        public final void a(hl0 hl0Var) {
            xg0.d(hl0Var);
        }
    };
    public static final hl0 d = new hl0() { // from class: androidx.appcompat.view.menu.wg0
        @Override // androidx.appcompat.view.menu.hl0
        public final Object get() {
            Object e;
            e = xg0.e();
            return e;
        }
    };
    public nk a;
    public volatile hl0 b;

    public xg0(nk nkVar, hl0 hl0Var) {
        this.a = nkVar;
        this.b = hl0Var;
    }

    public static xg0 c() {
        return new xg0(c, d);
    }

    public static /* synthetic */ void d(hl0 hl0Var) {
    }

    public static /* synthetic */ Object e() {
        return null;
    }

    public void f(hl0 hl0Var) {
        nk nkVar;
        if (this.b != d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            nkVar = this.a;
            this.a = null;
            this.b = hl0Var;
        }
        nkVar.a(hl0Var);
    }

    @Override // androidx.appcompat.view.menu.hl0
    public Object get() {
        return this.b.get();
    }
}
