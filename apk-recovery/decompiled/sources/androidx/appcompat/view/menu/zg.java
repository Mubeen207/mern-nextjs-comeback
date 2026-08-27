package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.kh;
/* loaded from: classes.dex */
public abstract class zg extends y7 {
    public final kh n;
    public transient xg o;

    public zg(xg xgVar, kh khVar) {
        super(xgVar);
        this.n = khVar;
    }

    @Override // androidx.appcompat.view.menu.xg
    public kh b() {
        kh khVar = this.n;
        c60.b(khVar);
        return khVar;
    }

    @Override // androidx.appcompat.view.menu.y7
    public void l() {
        xg xgVar = this.o;
        if (xgVar != null && xgVar != this) {
            kh.b d = b().d(ah.b);
            c60.b(d);
            ((ah) d).x(xgVar);
        }
        this.o = md.m;
    }

    public final xg m() {
        xg xgVar = this.o;
        if (xgVar == null) {
            ah ahVar = (ah) b().d(ah.b);
            if (ahVar == null || (xgVar = ahVar.z(this)) == null) {
                xgVar = this;
            }
            this.o = xgVar;
        }
        return xgVar;
    }

    public zg(xg xgVar) {
        this(xgVar, xgVar != null ? xgVar.b() : null);
    }
}
