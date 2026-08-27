package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public class tz1 {
    public static volatile tz1 b;
    public static final tz1 c = new tz1(true);
    public final Map a = Collections.emptyMap();

    /* loaded from: classes.dex */
    public static final class a {
        public final Object a;
        public final int b;

        public a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public tz1(boolean z) {
    }

    public static tz1 a() {
        tz1 tz1Var = b;
        if (tz1Var != null) {
            return tz1Var;
        }
        synchronized (tz1.class) {
            try {
                tz1 tz1Var2 = b;
                if (tz1Var2 != null) {
                    return tz1Var2;
                }
                tz1 a2 = r02.a(tz1.class);
                b = a2;
                return a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final t02.d b(z32 z32Var, int i) {
        my0.a(this.a.get(new a(z32Var, i)));
        return null;
    }
}
