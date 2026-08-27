package androidx.appcompat.view.menu;

import android.app.ActivityManager;
import android.os.IBinder;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class a00 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            objArr[1] = hz0.a((ActivityManager.TaskDescription) objArr[1]);
            return method.invoke(obj, objArr);
        }
    }

    public a00() {
        super((IBinder) et0.c.b("activity_task"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return zz.b.b(et0.c.b("activity_task"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("activity_task");
        xu0.b.e(s1.b.b(), zz.b.b(this));
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        c(j1.a());
        e("setTaskDescription", new a());
    }
}
