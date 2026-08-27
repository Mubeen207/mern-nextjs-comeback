package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class f70 {
    public static final py0 a = new py0("COMPLETING_ALREADY");
    public static final py0 b = new py0("COMPLETING_WAITING_CHILDREN");
    public static final py0 c = new py0("COMPLETING_RETRY");
    public static final py0 d = new py0("TOO_LATE_TO_CANCEL");
    public static final py0 e = new py0("SEALED");
    public static final zn f = new zn(false);
    public static final zn g = new zn(true);

    public static final Object g(Object obj) {
        return obj instanceof y40 ? new z40((y40) obj) : obj;
    }

    public static final Object h(Object obj) {
        y40 y40Var;
        z40 z40Var = obj instanceof z40 ? (z40) obj : null;
        return (z40Var == null || (y40Var = z40Var.a) == null) ? obj : y40Var;
    }
}
