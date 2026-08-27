package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class ow1 {
    public final Resources a;
    public final String b;

    public ow1(Context context, String str) {
        pj0.i(context);
        this.a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.b = a(context);
        } else {
            this.b = str;
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(cn0.a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
