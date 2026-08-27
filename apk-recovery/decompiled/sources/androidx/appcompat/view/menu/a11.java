package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class a11 extends lp0 {
    public final WeakReference b;

    public a11(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable a = a(i);
        Context context = (Context) this.b.get();
        if (a != null && context != null) {
            hp0.g().v(context, i, a);
        }
        return a;
    }
}
