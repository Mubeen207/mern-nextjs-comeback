package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class kh1 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final hi1 f;

    public kh1(fx1 fx1Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        hi1 hi1Var;
        pj0.e(str2);
        pj0.e(str3);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            fx1Var.l().L().b("Event created with reverse previous/current timestamps. appId", st1.v(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    fx1Var.l().G().a("Param name can't be null");
                    it.remove();
                } else {
                    Object s0 = fx1Var.L().s0(next, bundle2.get(next));
                    if (s0 == null) {
                        fx1Var.l().L().b("Param value can't be null", fx1Var.D().f(next));
                        it.remove();
                    } else {
                        fx1Var.L().N(bundle2, next, s0);
                    }
                }
            }
            hi1Var = new hi1(bundle2);
        } else {
            hi1Var = new hi1(new Bundle());
        }
        this.f = hi1Var;
    }

    public final kh1 a(fx1 fx1Var, long j) {
        return new kh1(fx1Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + valueOf + "}";
    }

    public kh1(fx1 fx1Var, String str, String str2, String str3, long j, long j2, hi1 hi1Var) {
        pj0.e(str2);
        pj0.e(str3);
        pj0.i(hi1Var);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            fx1Var.l().L().c("Event created with reverse previous/current timestamps. appId, name", st1.v(str2), st1.v(str3));
        }
        this.f = hi1Var;
    }
}
