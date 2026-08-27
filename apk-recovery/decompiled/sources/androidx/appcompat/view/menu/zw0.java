package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class zw0 {
    public static final py0 a = new py0("NONE");
    public static final py0 b = new py0("PENDING");

    public static final ne0 a(Object obj) {
        if (obj == null) {
            obj = rf0.a;
        }
        return new yw0(obj);
    }

    public static final /* synthetic */ py0 b() {
        return a;
    }

    public static final /* synthetic */ py0 c() {
        return b;
    }

    public static final xs d(xw0 xw0Var, kh khVar, int i, u8 u8Var) {
        return (((i < 0 || i >= 2) && i != -2) || u8Var != u8.DROP_OLDEST) ? bu0.a(xw0Var, khVar, i, u8Var) : xw0Var;
    }
}
