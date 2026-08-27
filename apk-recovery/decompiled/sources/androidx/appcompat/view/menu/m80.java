package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class m80 implements hl0 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile hl0 b;

    public m80(hl0 hl0Var) {
        this.b = hl0Var;
    }

    @Override // androidx.appcompat.view.menu.hl0
    public Object get() {
        Object obj = this.a;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj2) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
