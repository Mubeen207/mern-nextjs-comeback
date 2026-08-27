package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.a6;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ka0 {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract ka0 a();

        public abstract a b(yb ybVar);

        public abstract a c(List list);

        public abstract a d(Integer num);

        public abstract a e(String str);

        public abstract a f(wl0 wl0Var);

        public abstract a g(long j);

        public abstract a h(long j);

        public a i(int i) {
            return d(Integer.valueOf(i));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new a6.b();
    }

    public abstract yb b();

    public abstract List c();

    public abstract Integer d();

    public abstract String e();

    public abstract wl0 f();

    public abstract long g();

    public abstract long h();
}
