package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class l32 implements b42 {
    public b42[] a;

    public l32(b42... b42VarArr) {
        this.a = b42VarArr;
    }

    @Override // androidx.appcompat.view.menu.b42
    public final v32 a(Class cls) {
        b42[] b42VarArr;
        for (b42 b42Var : this.a) {
            if (b42Var.b(cls)) {
                return b42Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // androidx.appcompat.view.menu.b42
    public final boolean b(Class cls) {
        for (b42 b42Var : this.a) {
            if (b42Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
