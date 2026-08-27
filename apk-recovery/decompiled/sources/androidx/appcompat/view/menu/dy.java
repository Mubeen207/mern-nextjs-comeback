package androidx.appcompat.view.menu;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.appcompat.view.menu.jf0;
import com.google.android.gms.common.api.GoogleApiActivity;
/* loaded from: classes.dex */
public class dy extends ey {
    public String c;
    public static final Object e = new Object();
    public static final dy f = new dy();
    public static final int d = ey.a;

    public static dy m() {
        return f;
    }

    @Override // androidx.appcompat.view.menu.ey
    public Intent b(Context context, int i, String str) {
        return super.b(context, i, str);
    }

    @Override // androidx.appcompat.view.menu.ey
    public PendingIntent c(Context context, int i, int i2) {
        return super.c(context, i, i2);
    }

    @Override // androidx.appcompat.view.menu.ey
    public final String e(int i) {
        return super.e(i);
    }

    @Override // androidx.appcompat.view.menu.ey
    public int g(Context context) {
        return super.g(context);
    }

    @Override // androidx.appcompat.view.menu.ey
    public int h(Context context, int i) {
        return super.h(context, i);
    }

    @Override // androidx.appcompat.view.menu.ey
    public final boolean j(int i) {
        return super.j(i);
    }

    public Dialog k(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i, dd1.b(activity, b(activity, i, "d"), i2), onCancelListener);
    }

    public PendingIntent l(Context context, ef efVar) {
        return efVar.k() ? efVar.i() : c(context, efVar.d(), 0);
    }

    public boolean n(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k = k(activity, i, i2, onCancelListener);
        if (k == null) {
            return false;
        }
        s(activity, k, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i) {
        t(context, i, null, d(context, i, 0, "n"));
    }

    public final Dialog p(Context context, int i, dd1 dd1Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(fc1.d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = fc1.c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, dd1Var);
        }
        String g = fc1.g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i));
        new IllegalArgumentException();
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(fc1.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final dc1 r(Context context, cc1 cc1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        dc1 dc1Var = new dc1(cc1Var);
        context.registerReceiver(dc1Var, intentFilter);
        dc1Var.a(context);
        if (i(context, "com.google.android.gms")) {
            return dc1Var;
        }
        cc1Var.a();
        dc1Var.b();
        return null;
    }

    public final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        uo.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void t(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null);
        new IllegalArgumentException();
        if (i == 18) {
            u(context);
        } else if (pendingIntent == null) {
        } else {
            String f2 = fc1.f(context, i);
            String e2 = fc1.e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) pj0.i(context.getSystemService("notification"));
            jf0.e x = new jf0.e(context).q(true).e(true).j(f2).x(new jf0.c().h(e2));
            if (rl.c(context)) {
                pj0.l(ti0.e());
                x.v(context.getApplicationInfo().icon).t(2);
                if (rl.d(context)) {
                    x.a(km0.a, resources.getString(bn0.o), pendingIntent);
                } else {
                    x.h(pendingIntent);
                }
            } else {
                x.v(17301642).y(resources.getString(bn0.h)).B(System.currentTimeMillis()).h(pendingIntent).i(e2);
            }
            if (ti0.h()) {
                pj0.l(ti0.h());
                synchronized (e) {
                    str2 = this.c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String b = fc1.b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", b, 4));
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                x.f(str2);
            }
            Notification b2 = x.b();
            if (i == 1 || i == 2 || i == 3) {
                ky.b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b2);
        }
    }

    public final void u(Context context) {
        new ic1(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, b90 b90Var, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog p = p(activity, i, dd1.c(b90Var, b(activity, i, "d"), 2), onCancelListener);
        if (p == null) {
            return false;
        }
        s(activity, p, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, ef efVar, int i) {
        PendingIntent l;
        if (u50.a(context) || (l = l(context, efVar)) == null) {
            return false;
        }
        t(context, efVar.d(), null, pd1.a(context, 0, GoogleApiActivity.a(context, l, i, true), pd1.a | 134217728));
        return true;
    }
}
