package androidx.appcompat.view.menu;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class sx {
    public static volatile sx b;
    public final Set a = new HashSet();

    public static sx a() {
        sx sxVar = b;
        if (sxVar == null) {
            synchronized (sx.class) {
                try {
                    sxVar = b;
                    if (sxVar == null) {
                        sxVar = new sx();
                        b = sxVar;
                    }
                } finally {
                }
            }
        }
        return sxVar;
    }

    public Set b() {
        Set unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
