package androidx.appcompat.view.menu;

import android.os.Trace;
/* loaded from: classes.dex */
public abstract class q11 {
    public static void a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
