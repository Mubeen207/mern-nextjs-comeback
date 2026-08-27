package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
/* loaded from: classes.dex */
public abstract class f31 {
    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 == 0 || typeface == null) {
                    return null;
                }
                int weight = typeface.getWeight();
                i3 = configuration.fontWeightAdjustment;
                return Typeface.create(typeface, xb0.b(weight + i3, 1, 1000), typeface.isItalic());
            }
            return null;
        }
        return null;
    }
}
