package androidx.appcompat.view.menu;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public final class y42 {
    public static final y42 c = new y42();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final r52 a = new v22();

    public static y42 a() {
        return c;
    }

    public final m52 b(Class cls) {
        y02.f(cls, "messageType");
        m52 m52Var = (m52) this.b.get(cls);
        if (m52Var == null) {
            m52 a = this.a.a(cls);
            y02.f(cls, "messageType");
            y02.f(a, "schema");
            m52 m52Var2 = (m52) this.b.putIfAbsent(cls, a);
            return m52Var2 != null ? m52Var2 : a;
        }
        return m52Var;
    }

    public final m52 c(Object obj) {
        return b(obj.getClass());
    }
}
