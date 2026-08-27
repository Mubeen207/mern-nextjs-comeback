package androidx.appcompat.view.menu;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
/* loaded from: classes.dex */
public class y60 implements sa1 {
    public final Context a;
    public final gp b;
    public final xr0 c;

    public y60(Context context, gp gpVar, xr0 xr0Var) {
        this.a = context;
        this.b = gpVar;
        this.c = xr0Var;
    }

    @Override // androidx.appcompat.view.menu.sa1
    public void a(g21 g21Var, int i) {
        b(g21Var, i, false);
    }

    @Override // androidx.appcompat.view.menu.sa1
    public void b(g21 g21Var, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int c = c(g21Var);
        if (!z && d(jobScheduler, c, i)) {
            pa0.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", g21Var);
            return;
        }
        long g = this.b.g(g21Var);
        JobInfo.Builder c2 = this.c.c(new JobInfo.Builder(c, componentName), g21Var.d(), g, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", g21Var.b());
        persistableBundle.putInt("priority", yj0.a(g21Var.d()));
        if (g21Var.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(g21Var.c(), 0));
        }
        c2.setExtras(persistableBundle);
        pa0.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", g21Var, Integer.valueOf(c), Long.valueOf(this.c.g(g21Var.d(), g, i)), Long.valueOf(g), Integer.valueOf(i));
        jobScheduler.schedule(c2.build());
    }

    public int c(g21 g21Var) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(g21Var.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(yj0.a(g21Var.d())).array());
        if (g21Var.c() != null) {
            adler32.update(g21Var.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }
}
