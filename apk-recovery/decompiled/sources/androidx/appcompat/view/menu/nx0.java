package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
/* loaded from: classes.dex */
public class nx0 {
    public final Resources a;
    public final String b;

    public nx0(Context context) {
        pj0.i(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(cn0.a);
    }

    public String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
