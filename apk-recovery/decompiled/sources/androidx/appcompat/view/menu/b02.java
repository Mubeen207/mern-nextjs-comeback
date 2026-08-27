package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class b02 {
    public final Context a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public long f;
    public mn1 g;
    public boolean h;
    public Long i;
    public String j;

    public b02(Context context, mn1 mn1Var, Long l) {
        this.h = true;
        pj0.i(context);
        Context applicationContext = context.getApplicationContext();
        pj0.i(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (mn1Var != null) {
            this.g = mn1Var;
            this.b = mn1Var.r;
            this.c = mn1Var.q;
            this.d = mn1Var.p;
            this.h = mn1Var.o;
            this.f = mn1Var.n;
            this.j = mn1Var.t;
            Bundle bundle = mn1Var.s;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
