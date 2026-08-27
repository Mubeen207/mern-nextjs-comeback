package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class ho0 {
    public q70 a(jx jxVar) {
        return jxVar;
    }

    public n70 b(Class cls) {
        return new pb(cls);
    }

    public p70 c(Class cls, String str) {
        return new mh0(cls, str);
    }

    public r70 d(tk0 tk0Var) {
        return tk0Var;
    }

    public String e(ix ixVar) {
        String obj = ixVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String f(j80 j80Var) {
        return e(j80Var);
    }
}
