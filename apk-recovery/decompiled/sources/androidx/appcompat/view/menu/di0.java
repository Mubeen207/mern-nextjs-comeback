package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ci0;
import androidx.appcompat.view.menu.e6;
/* loaded from: classes.dex */
public abstract class di0 {
    public static di0 a = a().a();

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract di0 a();

        public abstract a b(String str);

        public abstract a c(long j);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(ci0.a aVar);

        public abstract a h(long j);
    }

    public static a a() {
        return new e6.b().h(0L).g(ci0.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract ci0.a g();

    public abstract long h();

    public boolean i() {
        return g() == ci0.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == ci0.a.NOT_GENERATED || g() == ci0.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == ci0.a.REGISTERED;
    }

    public boolean l() {
        return g() == ci0.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == ci0.a.ATTEMPT_MIGRATION;
    }

    public abstract a n();

    public di0 o(String str, long j, long j2) {
        return n().b(str).c(j).h(j2).a();
    }

    public di0 p() {
        return n().b(null).a();
    }

    public di0 q(String str) {
        return n().e(str).g(ci0.a.REGISTER_ERROR).a();
    }

    public di0 r() {
        return n().g(ci0.a.NOT_GENERATED).a();
    }

    public di0 s(String str, String str2, long j, String str3, long j2) {
        return n().d(str).g(ci0.a.REGISTERED).b(str3).f(str2).c(j2).h(j).a();
    }

    public di0 t(String str) {
        return n().d(str).g(ci0.a.UNREGISTERED).a();
    }
}
