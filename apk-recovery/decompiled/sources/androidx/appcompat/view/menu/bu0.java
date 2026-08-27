package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class bu0 {
    public static final py0 a = new py0("NO_VALUE");

    public static final xs a(au0 au0Var, kh khVar, int i, u8 u8Var) {
        return ((i == 0 || i == -3) && u8Var == u8.SUSPEND) ? au0Var : new ya(au0Var, khVar, i, u8Var);
    }
}
