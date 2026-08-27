package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Binder;
import android.os.IBinder;
import java.util.UUID;
/* loaded from: classes.dex */
public class p1 extends Binder {
    public lz0 l = null;
    public IBinder m = null;
    public IBinder n = null;
    public ActivityInfo o = null;
    public ComponentName p = null;
    public Intent q = null;
    public int r = 0;
    public boolean s = false;
    public bk0 t = null;
    public String u = null;

    public static p1 a(Intent intent, ActivityInfo activityInfo, IBinder iBinder, int i) {
        p1 p1Var = new p1();
        p1Var.q = intent;
        p1Var.o = activityInfo;
        p1Var.p = new ComponentName(activityInfo.packageName, activityInfo.name);
        p1Var.n = iBinder;
        p1Var.r = i;
        p1Var.u = UUID.randomUUID().toString();
        return p1Var;
    }
}
