package androidx.appcompat.view.menu;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
/* loaded from: classes.dex */
public final class ff2 {
    public final fx1 a;

    public ff2(fx1 fx1Var) {
        this.a = fx1Var;
    }

    public final void a() {
        this.a.h().n();
        if (d()) {
            if (e()) {
                this.a.F().w.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.a.H().z0("auto", "_cmpx", bundle);
            } else {
                String a = this.a.F().w.a();
                if (TextUtils.isEmpty(a)) {
                    this.a.l().I().a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.a.F().x.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    Object obj = pair.first;
                    this.a.H().z0(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.a.F().w.b(null);
            }
            this.a.F().x.b(0L);
        }
    }

    public final void b(String str, Bundle bundle) {
        String str2;
        this.a.h().n();
        if (this.a.p()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            str2 = null;
        } else {
            str = (str == null || str.isEmpty()) ? "auto" : "auto";
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str3 : bundle.keySet()) {
                builder.appendQueryParameter(str3, bundle.getString(str3));
            }
            str2 = builder.build().toString();
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.a.F().w.b(str2);
        this.a.F().x.b(this.a.b().a());
    }

    public final void c() {
        if (d() && e()) {
            this.a.F().w.b(null);
        }
    }

    public final boolean d() {
        return this.a.F().x.a() > 0;
    }

    public final boolean e() {
        return d() && this.a.b().a() - this.a.F().x.a() > this.a.z().x(null, vi1.V);
    }
}
