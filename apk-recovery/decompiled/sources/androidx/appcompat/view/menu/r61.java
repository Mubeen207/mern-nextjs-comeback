package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
/* loaded from: classes.dex */
public abstract class r61 {

    /* loaded from: classes.dex */
    public interface a {
        void a(float f, float f2, float f3);
    }

    public static void a(Context context, a aVar) {
        Activity b = b(context);
        if (b != null) {
            ea1 a2 = fa1.b().a(b);
            aVar.a(a2.a().width(), a2.a().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static Activity b(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
