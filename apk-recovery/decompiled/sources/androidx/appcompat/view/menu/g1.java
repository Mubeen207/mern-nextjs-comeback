package androidx.appcompat.view.menu;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public abstract class g1 {
    public static void a(Activity activity) {
        Bitmap bitmap;
        Context baseContext = activity.getBaseContext();
        try {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes((int[]) qn0.i.b());
            if (obtainStyledAttributes != null) {
                if (obtainStyledAttributes.getBoolean(((Integer) qn0.l.b()).intValue(), false)) {
                    activity.getWindow().setBackgroundDrawable(WallpaperManager.getInstance(activity).getDrawable());
                }
                if (obtainStyledAttributes.getBoolean(((Integer) qn0.j.b()).intValue(), false)) {
                    activity.getWindow().addFlags(1024);
                }
                obtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (y8.a()) {
            Intent intent = activity.getIntent();
            ApplicationInfo applicationInfo = baseContext.getApplicationInfo();
            PackageManager packageManager = activity.getPackageManager();
            if (intent == null || !activity.isTaskRoot()) {
                return;
            }
            try {
                String d = hz0.d(mv0.N2(), applicationInfo.loadLabel(packageManager));
                Drawable b = b(activity);
                if (b != null) {
                    int launcherLargeIconSize = ((ActivityManager) baseContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmap = um.a(b, launcherLargeIconSize, launcherLargeIconSize);
                } else {
                    bitmap = null;
                }
                activity.setTaskDescription(new ActivityManager.TaskDescription(d, bitmap));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static Drawable b(Activity activity) {
        PackageManager packageManager = activity.getPackageManager();
        try {
            Drawable activityIcon = packageManager.getActivityIcon(activity.getComponentName());
            if (activityIcon != null) {
                return activityIcon;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return activity.getApplicationInfo().loadIcon(packageManager);
    }
}
