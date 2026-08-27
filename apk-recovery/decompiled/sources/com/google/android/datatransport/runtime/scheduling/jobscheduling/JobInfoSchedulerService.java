package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.appcompat.view.menu.g21;
import androidx.appcompat.view.menu.n21;
import androidx.appcompat.view.menu.yj0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public final /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        n21.f(getApplicationContext());
        g21.a d = g21.a().b(string).d(yj0.b(i));
        if (string2 != null) {
            d.c(Base64.decode(string2, 0));
        }
        n21.c().e().v(d.a(), i2, new Runnable() { // from class: androidx.appcompat.view.menu.z60
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
