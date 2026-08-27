package androidx.appcompat.view.menu;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class gv1 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ wu1 e;

    public gv1(wu1 wu1Var, String str, long j) {
        this.e = wu1Var;
        pj0.e(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.F().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.F().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
