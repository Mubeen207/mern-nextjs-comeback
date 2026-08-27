package androidx.appcompat.view.menu;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
/* loaded from: classes.dex */
public final class f82 extends p82 {
    public final AlarmManager d;
    public eh1 e;
    public Integer f;

    public f82(r82 r82Var) {
        super(r82Var);
        this.d = (AlarmManager) a().getSystemService("alarm");
    }

    private final void D() {
        JobScheduler jobScheduler = (JobScheduler) a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(A());
        }
    }

    public final int A() {
        if (this.f == null) {
            String packageName = a().getPackageName();
            this.f = Integer.valueOf(("measurement" + packageName).hashCode());
        }
        return this.f.intValue();
    }

    public final PendingIntent B() {
        Context a = a();
        return zk1.a(a, 0, new Intent().setClassName(a, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zk1.b);
    }

    public final eh1 C() {
        if (this.e == null) {
            this.e = new l82(this, this.b.i0());
        }
        return this.e;
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ cc b() {
        return super.b();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ pf1 d() {
        return super.d();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ tf1 e() {
        return super.e();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ fi1 f() {
        return super.f();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ pt1 g() {
        return super.g();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ mw1 h() {
        return super.h();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ wu1 i() {
        return super.i();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ aa2 j() {
        return super.j();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ st1 l() {
        return super.l();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ l92 o() {
        return super.o();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ ze2 p() {
        return super.p();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ og1 q() {
        return super.q();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ uv1 r() {
        return super.r();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ s62 s() {
        return super.s();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ n82 t() {
        return super.t();
    }

    @Override // androidx.appcompat.view.menu.p82
    public final boolean x() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        D();
        return false;
    }

    public final void y(long j) {
        u();
        Context a = a();
        if (!aa2.c0(a)) {
            l().F().a("Receiver not registered/enabled");
        }
        if (!aa2.d0(a, false)) {
            l().F().a("Service not registered/enabled");
        }
        z();
        l().K().b("Scheduling upload, millis", Long.valueOf(j));
        b().b();
        if (j < Math.max(0L, ((Long) vi1.z.a(null)).longValue()) && !C().e()) {
            C().b(j);
        }
        Context a2 = a();
        ComponentName componentName = new ComponentName(a2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int A = A();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        dl1.c(a2, new JobInfo.Builder(A, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void z() {
        u();
        l().K().a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        C().a();
        D();
    }
}
