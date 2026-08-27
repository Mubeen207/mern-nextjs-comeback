package androidx.appcompat.view.menu;

import android.os.Build;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class rn {

    /* loaded from: classes.dex */
    public static class a {
        public static Set<int[]> a() {
            return b.a();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Set a() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set<Object> set = (Set) invoke;
                for (Object obj : set) {
                    if (!(obj instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    public static Set a() {
        return Build.VERSION.SDK_INT >= 34 ? a.a() : b.a();
    }
}
