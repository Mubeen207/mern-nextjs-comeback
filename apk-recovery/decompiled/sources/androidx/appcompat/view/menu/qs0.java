package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.i6;
/* loaded from: classes.dex */
public abstract class qs0 {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract qs0 a();

        public abstract a b(lo loVar);

        public abstract a c(wo woVar);

        public abstract a d(u11 u11Var);

        public abstract a e(g21 g21Var);

        public abstract a f(String str);
    }

    public static a a() {
        return new i6.b();
    }

    public abstract lo b();

    public abstract wo c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    public abstract u11 e();

    public abstract g21 f();

    public abstract String g();
}
