package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class sp0 {
    public static Object a(int i, Object obj, hx hxVar, tp0 tp0Var) {
        Object apply;
        if (i < 1) {
            return hxVar.apply(obj);
        }
        do {
            apply = hxVar.apply(obj);
            obj = tp0Var.a(obj, apply);
            if (obj == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return apply;
    }
}
