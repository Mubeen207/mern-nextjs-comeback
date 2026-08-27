package androidx.appcompat.view.menu;

import android.app.job.JobInfo;
import android.os.IBinder;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class r10 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            objArr[0] = Integer.valueOf(bv0.k().f(mv0.D2().n, ((Integer) objArr[0]).intValue()));
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            bv0.k().g(mv0.D2().n);
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            objArr[0] = bv0.k().j((JobInfo) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            objArr[0] = bv0.k().j((JobInfo) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    public r10() {
        super((IBinder) et0.c.b("jobscheduler"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return q10.b.b(et0.c.b("jobscheduler"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("jobscheduler");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        e("schedule", new d());
        e("cancel", new a());
        e("cancelAll", new b());
        e("enqueue", new c());
    }
}
