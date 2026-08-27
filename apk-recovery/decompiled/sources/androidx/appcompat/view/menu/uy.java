package androidx.appcompat.view.menu;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class uy extends vy {
    private volatile uy _immediate;
    public final Handler o;
    public final String p;
    public final boolean q;
    public final uy r;

    public uy(Handler handler, String str, boolean z) {
        super(null);
        this.o = handler;
        this.p = str;
        this.q = z;
        this._immediate = z ? this : null;
        uy uyVar = this._immediate;
        if (uyVar == null) {
            uyVar = new uy(handler, str, true);
            this._immediate = uyVar;
        }
        this.r = uyVar;
    }

    @Override // androidx.appcompat.view.menu.nh
    public void A(kh khVar, Runnable runnable) {
        if (this.o.post(runnable)) {
            return;
        }
        H(khVar, runnable);
    }

    @Override // androidx.appcompat.view.menu.nh
    public boolean D(kh khVar) {
        return (this.q && c60.a(Looper.myLooper(), this.o.getLooper())) ? false : true;
    }

    public final void H(kh khVar, Runnable runnable) {
        a70.c(khVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        fm.b().A(khVar, runnable);
    }

    @Override // androidx.appcompat.view.menu.ta0
    /* renamed from: I */
    public uy F() {
        return this.r;
    }

    public boolean equals(Object obj) {
        return (obj instanceof uy) && ((uy) obj).o == this.o;
    }

    public int hashCode() {
        return System.identityHashCode(this.o);
    }

    @Override // androidx.appcompat.view.menu.nh
    public String toString() {
        String G = G();
        if (G == null) {
            String str = this.p;
            if (str == null) {
                str = this.o.toString();
            }
            if (this.q) {
                return str + ".immediate";
            }
            return str;
        }
        return G;
    }

    public /* synthetic */ uy(Handler handler, String str, int i, lj ljVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public uy(Handler handler, String str) {
        this(handler, str, false);
    }
}
