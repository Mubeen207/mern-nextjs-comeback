package com.snake.helper;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import androidx.appcompat.view.menu.x3;
/* loaded from: classes.dex */
public abstract class ProxyService extends Service {

    /* loaded from: classes.dex */
    public static class P0 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P1 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P2 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P3 extends ProxyService {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return x3.c().f(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x3.c().g(configuration);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        x3.c().h();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        x3.c().i();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        x3.c().j(intent);
        return 2;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        x3.c().k(i);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        x3.c().l(intent);
        return false;
    }
}
