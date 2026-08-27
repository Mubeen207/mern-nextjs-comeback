package androidx.appcompat.view.menu;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.res.Configuration;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class s3 {
    public static final s3 b = new s3();
    public final Map a = new HashMap();

    public static s3 a() {
        return b;
    }

    public JobService b(int i) {
        JobService jobService;
        synchronized (this.a) {
            d70 d70Var = (d70) this.a.get(Integer.valueOf(i));
            if (d70Var == null || (jobService = d70Var.o) == null) {
                d70 i2 = bv0.k().i(mv0.G2(), i);
                if (i2 == null) {
                    return null;
                }
                JobService y2 = mv0.B2().y2(i2.n);
                i2.o = y2;
                if (y2 == null) {
                    return null;
                }
                this.a.put(Integer.valueOf(i), i2);
                return i2.o;
            }
            return jobService;
        }
    }

    public void c(Configuration configuration) {
        for (d70 d70Var : this.a.values()) {
            JobService jobService = d70Var.o;
            if (jobService != null) {
                jobService.onConfigurationChanged(configuration);
            }
        }
    }

    public void d() {
        for (d70 d70Var : this.a.values()) {
            JobService jobService = d70Var.o;
            if (jobService != null) {
                jobService.onDestroy();
            }
        }
    }

    public void e() {
        for (d70 d70Var : this.a.values()) {
            JobService jobService = d70Var.o;
            if (jobService != null) {
                jobService.onLowMemory();
            }
        }
    }

    public boolean f(JobParameters jobParameters) {
        try {
            JobService b2 = b(jobParameters.getJobId());
            if (b2 == null) {
                return false;
            }
            return b2.onStartJob(jobParameters);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean g(JobParameters jobParameters) {
        JobService b2 = b(jobParameters.getJobId());
        if (b2 == null) {
            return false;
        }
        boolean onStopJob = b2.onStopJob(jobParameters);
        b2.onDestroy();
        synchronized (this.a) {
            this.a.remove(Integer.valueOf(jobParameters.getJobId()));
        }
        return onStopJob;
    }

    public void h(int i) {
        for (d70 d70Var : this.a.values()) {
            JobService jobService = d70Var.o;
            if (jobService != null) {
                jobService.onTrimMemory(i);
            }
        }
    }
}
