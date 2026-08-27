package androidx.appcompat.view.menu;

import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class eg0 {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public iw c;

    public eg0(boolean z) {
        this.a = z;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(h7 h7Var);

    public abstract void d(h7 h7Var);

    public final boolean e() {
        return this.a;
    }

    public final void f() {
        for (w9 w9Var : this.b) {
            w9Var.cancel();
        }
    }

    public final void g(boolean z) {
        this.a = z;
        iw iwVar = this.c;
        if (iwVar != null) {
            iwVar.d();
        }
    }
}
