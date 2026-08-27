package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.UserManager;
/* loaded from: classes.dex */
public abstract class r41 {

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(Context context) {
        return a.a(context);
    }
}
