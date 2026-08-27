package androidx.appcompat.view.menu;

import android.content.SharedPreferences;
import android.util.Pair;
/* loaded from: classes.dex */
public final class ev1 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ wu1 e;

    public final Pair a() {
        long abs;
        this.e.n();
        this.e.n();
        long c = c();
        if (c == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c - this.e.b().a());
        }
        long j = this.d;
        if (abs < j) {
            return null;
        }
        if (abs > (j << 1)) {
            d();
            return null;
        }
        String string = this.e.F().getString(this.c, null);
        long j2 = this.e.F().getLong(this.b, 0L);
        d();
        return (string == null || j2 <= 0) ? wu1.z : new Pair(string, Long.valueOf(j2));
    }

    public final void b(String str, long j) {
        this.e.n();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.F().getLong(this.b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.e.F().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1L);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.e.j().U0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.e.F().edit();
        if (z) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j3);
        edit2.apply();
    }

    public final long c() {
        return this.e.F().getLong(this.a, 0L);
    }

    public final void d() {
        this.e.n();
        long a = this.e.b().a();
        SharedPreferences.Editor edit = this.e.F().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, a);
        edit.apply();
    }

    public ev1(wu1 wu1Var, String str, long j) {
        this.e = wu1Var;
        pj0.e(str);
        pj0.a(j > 0);
        this.a = str + ":start";
        this.b = str + ":count";
        this.c = str + ":value";
        this.d = j;
    }
}
