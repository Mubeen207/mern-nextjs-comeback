package androidx.appcompat.view.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class f52 {
    public Map a = new HashMap();

    public final tg1 a(String str) {
        if (this.a.containsKey(str)) {
            try {
                return (tg1) ((Callable) this.a.get(str)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: " + str);
            }
        }
        return tg1.e;
    }

    public final void b(String str, Callable callable) {
        this.a.put(str, callable);
    }
}
