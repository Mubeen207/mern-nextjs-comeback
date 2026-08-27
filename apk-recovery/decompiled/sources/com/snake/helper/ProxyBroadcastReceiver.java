package com.snake.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.appcompat.view.menu.bv0;
import androidx.appcompat.view.menu.ml0;
import androidx.appcompat.view.menu.zh0;
/* loaded from: classes.dex */
public class ProxyBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.setExtrasClassLoader(context.getClassLoader());
        ml0 a = ml0.a(intent);
        if (a.a == null) {
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        try {
            bv0.j().z(a.a, new zh0(goAsync), a.b);
        } catch (RemoteException unused) {
            goAsync.finish();
        }
    }
}
