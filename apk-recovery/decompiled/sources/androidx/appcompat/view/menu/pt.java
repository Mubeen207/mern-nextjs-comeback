package androidx.appcompat.view.menu;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class pt {
    public static volatile pt b;
    public final Map a = new HashMap();

    public static pt b() {
        if (b == null) {
            synchronized (pt.class) {
                try {
                    if (b == null) {
                        b = new pt();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public io.flutter.embedding.engine.b a(String str) {
        return (io.flutter.embedding.engine.b) this.a.get(str);
    }
}
