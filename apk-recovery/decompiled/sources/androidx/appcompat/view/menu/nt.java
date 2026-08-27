package androidx.appcompat.view.menu;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class nt {
    public static nt b;
    public final Map a = new HashMap();

    public static nt b() {
        if (b == null) {
            b = new nt();
        }
        return b;
    }

    public io.flutter.embedding.engine.a a(String str) {
        return (io.flutter.embedding.engine.a) this.a.get(str);
    }

    public void c(String str, io.flutter.embedding.engine.a aVar) {
        if (aVar != null) {
            this.a.put(str, aVar);
        } else {
            this.a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
