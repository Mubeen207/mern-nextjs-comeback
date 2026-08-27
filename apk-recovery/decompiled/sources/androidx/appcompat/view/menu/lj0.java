package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class lj0 extends jj0 {
    public final Object c;

    public lj0(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // androidx.appcompat.view.menu.jj0, androidx.appcompat.view.menu.hj0
    public boolean a(Object obj) {
        boolean a;
        c60.e(obj, "instance");
        synchronized (this.c) {
            a = super.a(obj);
        }
        return a;
    }

    @Override // androidx.appcompat.view.menu.jj0, androidx.appcompat.view.menu.hj0
    public Object b() {
        Object b;
        synchronized (this.c) {
            b = super.b();
        }
        return b;
    }
}
