package androidx.appcompat.view.menu;

import android.content.Context;
/* loaded from: classes.dex */
public class va1 {
    public static va1 b = new va1();
    public dh0 a = null;

    public static dh0 a(Context context) {
        return b.b(context);
    }

    public final synchronized dh0 b(Context context) {
        try {
            if (this.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.a = new dh0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
