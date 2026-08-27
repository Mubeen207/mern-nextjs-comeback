package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class te {
    public static String a(ActivityInfo activityInfo) {
        if (activityInfo.launchMode != 3) {
            String str = activityInfo.taskAffinity;
            return (str == null && activityInfo.applicationInfo.taskAffinity == null) ? activityInfo.packageName : str != null ? str : activityInfo.applicationInfo.taskAffinity;
        }
        return "-SingleInstance-" + activityInfo.packageName + "/" + activityInfo.name;
    }

    public static boolean b(Intent intent, Intent intent2) {
        if (intent == null || intent2 == null) {
            return true;
        }
        if (Objects.equals(intent.getAction(), intent2.getAction()) && Objects.equals(intent.getData(), intent2.getData()) && Objects.equals(intent.getType(), intent2.getType())) {
            String str = intent.getPackage();
            if (str == null && intent.getComponent() != null) {
                str = intent.getComponent().getPackageName();
            }
            String str2 = intent2.getPackage();
            if (str2 == null && intent2.getComponent() != null) {
                str2 = intent2.getComponent().getPackageName();
            }
            if (Objects.equals(str, str2) && Objects.equals(intent.getComponent(), intent2.getComponent())) {
                return Objects.equals(intent.getCategories(), intent2.getCategories());
            }
            return false;
        }
        return false;
    }

    public static boolean c(Intent intent) {
        return "application/vnd.android.package-archive".equals(intent.getType());
    }

    public static boolean d(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null || mv0.E2() == null) {
            return false;
        }
        return component.getPackageName().equals(mv0.E2());
    }

    public static boolean e(Intent[] intentArr) {
        for (Intent intent : intentArr) {
            if (!d(intent)) {
                return false;
            }
        }
        return true;
    }

    public static ComponentName f(ComponentInfo componentInfo) {
        return new ComponentName(componentInfo.packageName, componentInfo.name);
    }
}
