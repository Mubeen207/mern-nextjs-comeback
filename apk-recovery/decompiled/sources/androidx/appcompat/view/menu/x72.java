package androidx.appcompat.view.menu;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class x72 {
    public final /* synthetic */ b72 a;

    public x72(b72 b72Var) {
        this.a = b72Var;
    }

    public final void a() {
        this.a.n();
        if (this.a.i().y(this.a.b().a())) {
            this.a.i().l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.l().K().a("Detected application was in foreground");
                c(this.a.b().a(), false);
            }
        }
    }

    public final void b(long j, boolean z) {
        this.a.n();
        this.a.G();
        if (this.a.i().y(j)) {
            this.a.i().l.a(true);
            if (hd2.a() && this.a.e().s(vi1.x0)) {
                this.a.p().I();
            }
        }
        this.a.i().p.b(j);
        if (this.a.i().l.b()) {
            c(j, z);
        }
    }

    public final void c(long j, boolean z) {
        this.a.n();
        if (this.a.a.p()) {
            this.a.i().p.b(j);
            this.a.l().K().b("Session started, time", Long.valueOf(this.a.b().b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.a.r().a0("auto", "_sid", valueOf, j);
            this.a.i().q.b(valueOf.longValue());
            this.a.i().l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.a.e().s(vi1.m0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.a.r().U("auto", "_s", j, bundle);
            if (wa2.a() && this.a.e().s(vi1.p0)) {
                String a = this.a.i().v.a();
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a);
                this.a.r().U("auto", "_ssr", j, bundle2);
            }
        }
    }
}
