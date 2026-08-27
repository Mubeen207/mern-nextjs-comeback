package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class je0 {
    public static boolean a(ie0 ie0Var, Object obj) {
        if (obj == ie0Var) {
            return true;
        }
        if (obj instanceof ie0) {
            return ie0Var.a().equals(((ie0) obj).a());
        }
        return false;
    }
}
