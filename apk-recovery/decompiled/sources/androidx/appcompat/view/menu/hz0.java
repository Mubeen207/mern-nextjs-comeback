package androidx.appcompat.view.menu;

import android.app.ActivityManager;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class hz0 {
    public static ActivityManager.TaskDescription a(ActivityManager.TaskDescription taskDescription) {
        String label = taskDescription.getLabel();
        Bitmap icon = taskDescription.getIcon();
        if (label == null || icon == null) {
            String d = d(mv0.N2(), c());
            Drawable b = b();
            if (b == null) {
                return taskDescription;
            }
            int launcherLargeIconSize = ((ActivityManager) bv0.m().getSystemService("activity")).getLauncherLargeIconSize();
            return new ActivityManager.TaskDescription(d, um.a(b, launcherLargeIconSize, launcherLargeIconSize), taskDescription.getPrimaryColor());
        }
        return taskDescription;
    }

    public static Drawable b() {
        try {
            return bv0.r().getApplicationIcon(mv0.E2());
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static CharSequence c() {
        try {
            PackageManager r = bv0.r();
            return r.getApplicationLabel(r.getApplicationInfo(mv0.E2(), 0));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String d(int i, CharSequence charSequence) {
        return String.format(Locale.ENGLISH, "[Snake Engine] %s", charSequence);
    }
}
