package androidx.appcompat.view.menu;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class cv1 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ wu1 e;

    public cv1(wu1 wu1Var, String str, boolean z) {
        this.e = wu1Var;
        pj0.e(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.e.F().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.F().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
