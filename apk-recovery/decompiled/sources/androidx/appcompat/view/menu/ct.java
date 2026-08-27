package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.lx;
/* loaded from: classes.dex */
public abstract /* synthetic */ class ct {
    public static final void a(kh khVar) {
        if (khVar.d(t60.d) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + khVar).toString());
    }

    public static final xs b(xs xsVar, kh khVar) {
        a(khVar);
        return c60.a(khVar, bo.m) ? xsVar : xsVar instanceof lx ? lx.a.a((lx) xsVar, khVar, 0, null, 6, null) : new ya(xsVar, khVar, 0, null, 12, null);
    }
}
