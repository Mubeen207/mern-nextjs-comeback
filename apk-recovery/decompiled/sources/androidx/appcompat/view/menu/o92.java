package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class o92 {
    public static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;

    public o92(String str, String str2, int i, boolean z) {
        pj0.e(str);
        this.a = str;
        pj0.e(str2);
        this.b = str2;
        this.c = null;
        this.d = i;
        this.e = z;
    }

    public final int a() {
        return this.d;
    }

    public final ComponentName b() {
        return this.c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.a != null) {
            if (this.e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.a);
                try {
                    bundle = context.getContentResolver().call(f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    "Dynamic intent resolution failed: ".concat(e.toString());
                    bundle = null;
                }
                r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
                if (r1 == null) {
                    "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.a));
                }
            }
            return r1 != null ? r1 : new Intent(this.a).setPackage(this.b);
        }
        return new Intent().setComponent(this.c);
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o92) {
            o92 o92Var = (o92) obj;
            return zf0.a(this.a, o92Var.a) && zf0.a(this.b, o92Var.b) && zf0.a(this.c, o92Var.c) && this.d == o92Var.d && this.e == o92Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return zf0.b(this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e));
    }

    public final String toString() {
        String str = this.a;
        if (str == null) {
            pj0.i(this.c);
            return this.c.flattenToString();
        }
        return str;
    }
}
