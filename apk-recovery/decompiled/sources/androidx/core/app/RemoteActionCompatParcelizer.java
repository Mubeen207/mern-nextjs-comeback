package androidx.core.app;

import android.app.PendingIntent;
import androidx.appcompat.view.menu.k51;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(k51 k51Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) k51Var.v(remoteActionCompat.a, 1);
        remoteActionCompat.b = k51Var.l(remoteActionCompat.b, 2);
        remoteActionCompat.c = k51Var.l(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) k51Var.r(remoteActionCompat.d, 4);
        remoteActionCompat.e = k51Var.h(remoteActionCompat.e, 5);
        remoteActionCompat.f = k51Var.h(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, k51 k51Var) {
        k51Var.x(false, false);
        k51Var.M(remoteActionCompat.a, 1);
        k51Var.D(remoteActionCompat.b, 2);
        k51Var.D(remoteActionCompat.c, 3);
        k51Var.H(remoteActionCompat.d, 4);
        k51Var.z(remoteActionCompat.e, 5);
        k51Var.z(remoteActionCompat.f, 6);
    }
}
