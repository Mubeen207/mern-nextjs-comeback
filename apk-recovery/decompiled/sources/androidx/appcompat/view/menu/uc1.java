package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.m2;
import com.google.android.gms.common.api.Scope;
/* loaded from: classes.dex */
public abstract class uc1 {
    public static final m2.g a;
    public static final m2.g b;
    public static final m2.a c;
    public static final m2.a d;
    public static final Scope e;
    public static final Scope f;
    public static final m2 g;
    public static final m2 h;

    static {
        m2.g gVar = new m2.g();
        a = gVar;
        m2.g gVar2 = new m2.g();
        b = gVar2;
        cb1 cb1Var = new cb1();
        c = cb1Var;
        nb1 nb1Var = new nb1();
        d = nb1Var;
        e = new Scope("profile");
        f = new Scope("email");
        g = new m2("SignIn.API", cb1Var, gVar);
        h = new m2("SignIn.INTERNAL_API", nb1Var, gVar2);
    }
}
