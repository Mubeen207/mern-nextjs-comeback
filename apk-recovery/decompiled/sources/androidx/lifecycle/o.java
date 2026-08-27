package androidx.lifecycle;

import androidx.appcompat.view.menu.c60;
import androidx.appcompat.view.menu.d90;
import androidx.appcompat.view.menu.pr0;
import androidx.lifecycle.f;
/* loaded from: classes.dex */
public final class o implements h {
    public final pr0 a;

    public o(pr0 pr0Var) {
        c60.e(pr0Var, "provider");
        this.a = pr0Var;
    }

    @Override // androidx.lifecycle.h
    public void c(d90 d90Var, f.a aVar) {
        c60.e(d90Var, "source");
        c60.e(aVar, "event");
        if (aVar == f.a.ON_CREATE) {
            d90Var.h().c(this);
            this.a.c();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
