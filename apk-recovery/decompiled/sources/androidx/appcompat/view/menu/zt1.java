package androidx.appcompat.view.menu;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class zt1 {
    public String a;
    public String b;
    public long c;
    public Bundle d;

    public zt1(String str, String str2, Bundle bundle, long j) {
        this.a = str;
        this.b = str2;
        this.d = bundle == null ? new Bundle() : bundle;
        this.c = j;
    }

    public static zt1 b(ri1 ri1Var) {
        return new zt1(ri1Var.m, ri1Var.o, ri1Var.n.k(), ri1Var.p);
    }

    public final ri1 a() {
        return new ri1(this.a, new hi1(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        String valueOf = String.valueOf(this.d);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }
}
