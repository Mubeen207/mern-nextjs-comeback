package androidx.appcompat.view.menu;

import android.net.Uri;
/* loaded from: classes.dex */
public final class hw1 {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final uw i;

    public hw1(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final rv1 a(String str, double d) {
        return rv1.c(this, str, Double.valueOf(-3.0d), true);
    }

    public final rv1 b(String str, long j) {
        return rv1.d(this, str, Long.valueOf(j), true);
    }

    public final rv1 c(String str, String str2) {
        return rv1.e(this, str, str2, true);
    }

    public final rv1 d(String str, boolean z) {
        return rv1.b(this, str, Boolean.valueOf(z), true);
    }

    public final hw1 e() {
        return new hw1(this.a, this.b, this.c, this.d, this.e, this.f, true, this.h, this.i);
    }

    public final hw1 f() {
        if (this.c.isEmpty()) {
            uw uwVar = this.i;
            if (uwVar == null) {
                return new hw1(this.a, this.b, this.c, this.d, true, this.f, this.g, this.h, uwVar);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public hw1(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, uw uwVar) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = uwVar;
    }
}
