package androidx.appcompat.view.menu;

import android.content.res.Configuration;
import android.os.LocaleList;
/* loaded from: classes.dex */
public abstract class af {

    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        public static void b(Configuration configuration, s90 s90Var) {
            configuration.setLocales((LocaleList) s90Var.c());
        }
    }

    public static s90 a(Configuration configuration) {
        return s90.d(a.a(configuration));
    }
}
