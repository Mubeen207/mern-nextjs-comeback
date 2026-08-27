package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.w5;
/* loaded from: classes.dex */
public abstract class q50 {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract q50 a();

        public abstract a b(d11 d11Var);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(b bVar);

        public abstract a f(String str);
    }

    /* loaded from: classes.dex */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a a() {
        return new w5.b();
    }

    public abstract d11 b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
