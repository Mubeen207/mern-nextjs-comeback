package com.snake.helper;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.content.res.Configuration;
import androidx.appcompat.view.menu.s3;
/* loaded from: classes.dex */
public abstract class ProxyJobService extends JobService {

    /* loaded from: classes.dex */
    public static class P0 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P1 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P2 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P3 extends ProxyJobService {
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        s3.a().c(configuration);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        s3.a().d();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        s3.a().e();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        return s3.a().f(jobParameters);
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return s3.a().g(jobParameters);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        s3.a().h(i);
    }
}
