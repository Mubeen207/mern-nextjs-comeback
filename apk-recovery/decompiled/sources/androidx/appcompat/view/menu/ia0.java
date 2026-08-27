package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.z5;
/* loaded from: classes.dex */
public abstract class ia0 {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract ia0 a();

        public abstract a b(Integer num);

        public abstract a c(long j);

        public abstract a d(long j);

        public abstract a e(ye0 ye0Var);

        public abstract a f(byte[] bArr);

        public abstract a g(String str);

        public abstract a h(long j);
    }

    public static a a() {
        return new z5.b();
    }

    public static a i(String str) {
        return a().g(str);
    }

    public static a j(byte[] bArr) {
        return a().f(bArr);
    }

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract ye0 e();

    public abstract byte[] f();

    public abstract String g();

    public abstract long h();
}
