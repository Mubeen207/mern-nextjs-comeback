package androidx.appcompat.view.menu;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.PersistableBundle;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class r3 extends b8 implements o10 {

    /* loaded from: classes.dex */
    public static final class a {
        public static final r3 a = new r3();
    }

    public static void c() {
        if (((Instrumentation) t1.i.c(bv0.D())) != g()) {
            t1.i.e(bv0.D(), g());
        }
    }

    public static r3 g() {
        return a.a;
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return !f(h());
    }

    @Override // androidx.appcompat.view.menu.o10
    public void b() {
        try {
            Instrumentation h = h();
            if (h != this && !f(h)) {
                this.l = h;
                t1.i.e(bv0.D(), this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.appcompat.view.menu.b8, android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        d(activity);
        super.callActivityOnCreate(activity, bundle, persistableBundle);
    }

    @Override // androidx.appcompat.view.menu.b8, android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        StringBuilder sb = new StringBuilder();
        sb.append("callActivityOnResume: ");
        sb.append(activity);
        super.callActivityOnResume(activity);
    }

    @Override // androidx.appcompat.view.menu.b8, android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        e();
        super.callApplicationOnCreate(application);
    }

    public final void d(Activity activity) {
        e();
        nz.c().b(uz.class);
        ActivityInfo activityInfo = (ActivityInfo) c1.b.c(activity);
        mg.a(activity);
        g1.a(activity);
        if (activityInfo.theme != 0) {
            activity.getTheme().applyStyle(activityInfo.theme, true);
        }
        k1.b(activity, activityInfo.screenOrientation);
    }

    public final void e() {
        nz.c().b(ry.class);
    }

    public final boolean f(Instrumentation instrumentation) {
        Field[] declaredFields;
        if (instrumentation instanceof r3) {
            return true;
        }
        Class<?> cls = instrumentation.getClass();
        if (Instrumentation.class.equals(cls)) {
            return false;
        }
        do {
            for (Field field : cls.getDeclaredFields()) {
                if (Instrumentation.class.isAssignableFrom(field.getType())) {
                    field.setAccessible(true);
                    try {
                        if (field.get(instrumentation) instanceof r3) {
                            return true;
                        }
                    } catch (Exception unused) {
                        return false;
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (!Instrumentation.class.equals(cls));
        return false;
    }

    public final Instrumentation h() {
        return (Instrumentation) t1.i.c(bv0.D());
    }

    @Override // androidx.appcompat.view.menu.b8, android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        try {
            if (str.startsWith(bv0.o())) {
                classLoader = bv0.class.getClassLoader();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("newActivity: className ");
            sb.append(str);
            return super.newActivity(classLoader, str, intent);
        } catch (ClassNotFoundException unused) {
            return this.l.newActivity(classLoader, str, intent);
        }
    }

    @Override // androidx.appcompat.view.menu.b8, android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) {
        mg.a(context);
        return super.newApplication(classLoader, str, context);
    }

    @Override // androidx.appcompat.view.menu.b8, android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        d(activity);
        super.callActivityOnCreate(activity, bundle);
    }
}
