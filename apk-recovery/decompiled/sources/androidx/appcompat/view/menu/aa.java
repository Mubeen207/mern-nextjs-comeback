package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class aa {
    public static final y9 a(xg xgVar) {
        if (xgVar instanceof bm) {
            y9 l = ((bm) xgVar).l();
            if (l != null) {
                if (!l.J()) {
                    l = null;
                }
                if (l != null) {
                    return l;
                }
            }
            return new y9(xgVar, 2);
        }
        return new y9(xgVar, 1);
    }
}
