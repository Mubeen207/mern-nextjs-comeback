package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class mg {
    public static void a(Context context) {
        int i = 0;
        do {
            try {
                if (!(context instanceof ContextWrapper)) {
                    tg.d.e(context, null);
                    context.getPackageManager();
                    tg.b.e(context, bv0.o());
                    ug.b.e(context, bv0.o());
                    jg.b.e(context.getContentResolver(), bv0.o());
                    if (y8.h()) {
                        b(tg.f.b(context, new Object[0]), mv0.J2());
                        return;
                    }
                    return;
                }
                context = ((ContextWrapper) context).getBaseContext();
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } while (i < 10);
    }

    public static void b(Object obj, int i) {
        jo0.b bVar;
        if (obj == null || (bVar = f5.b) == null) {
            return;
        }
        Object c = bVar.c(obj);
        g5.b.e(c, bv0.o());
        g5.c.e(c, Integer.valueOf(i));
        b(f5.c.b(obj, new Object[0]), i);
    }
}
