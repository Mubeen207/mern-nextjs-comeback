package androidx.appcompat.view.menu;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class b61 {
    public final Map a = new HashMap();
    public final Set b = new LinkedHashSet();
    public volatile boolean c = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void a() {
        this.c = true;
        Map map = this.a;
        if (map != null) {
            synchronized (map) {
                try {
                    for (Object obj : this.a.values()) {
                        b(obj);
                    }
                } finally {
                }
            }
        }
        Set set = this.b;
        if (set != null) {
            synchronized (set) {
                try {
                    for (Closeable closeable : this.b) {
                        b(closeable);
                    }
                } finally {
                }
            }
            this.b.clear();
        }
        c();
    }

    public void c() {
    }
}
