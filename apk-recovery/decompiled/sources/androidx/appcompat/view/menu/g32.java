package androidx.appcompat.view.menu;

import android.net.Uri;
/* loaded from: classes.dex */
public final class g32 implements Runnable {
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Uri n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ u22 q;

    public g32(u22 u22Var, boolean z, Uri uri, String str, String str2) {
        this.q = u22Var;
        this.m = z;
        this.n = uri;
        this.o = str;
        this.p = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u22.a(this.q, this.m, this.n, this.o, this.p);
    }
}
