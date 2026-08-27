package androidx.appcompat.view.menu;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.IInterface;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes.dex */
public class d20 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            int intValue = ((Integer) objArr[f()]).intValue();
            rv0.l().f(intValue, (String) objArr[g()]);
            return 0;
        }

        public int f() {
            return g() + 1;
        }

        public int g() {
            return y8.g() ? 2 : 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            for (NotificationChannelGroup notificationChannelGroup : (List) ph0.e.b(objArr[1], new Object[0])) {
                rv0.l().h(notificationChannelGroup);
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            List<NotificationChannel> list = (List) ph0.e.b(objArr[1], new Object[0]);
            if (list == null) {
                return 0;
            }
            for (NotificationChannel notificationChannel : list) {
                rv0.l().g(notificationChannel);
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rv0.l().i((String) objArr[1]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rv0.l().j((String) objArr[1]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            int intValue = ((Integer) objArr[f()]).intValue();
            rv0.l().k(intValue, (String) objArr[g()], (Notification) rd0.c(objArr, Notification.class));
            return 0;
        }

        public int f() {
            return g() + 1;
        }

        public int g() {
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return rv0.l().m((String) objArr[objArr.length - 1]);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return qh0.a(rv0.l().n(mv0.E2()));
        }
    }

    /* loaded from: classes.dex */
    public static class i extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return qh0.a(rv0.l().o(mv0.E2()));
        }
    }

    /* loaded from: classes.dex */
    public static class j extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (y8.i()) {
                rd0.f(objArr);
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    public d20() {
        super(((IInterface) mf0.c.b(new Object[0])).asBinder());
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return mf0.c.b(new Object[0]);
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        mf0.b.d(g());
        l("notification");
    }

    @Override // androidx.appcompat.view.menu.ob, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        rd0.e(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        e("getNotificationChannel", new g());
        e("getNotificationChannels", new i());
        e("cancelNotificationWithTag", new a());
        e("enqueueNotificationWithTag", new f());
        e("createNotificationChannels", new c());
        e("deleteNotificationChannel", new d());
        e("createNotificationChannelGroups", new b());
        e("deleteNotificationChannelGroup", new e());
        e("getNotificationChannelGroups", new h());
        e("removeEdgeNotification", new j());
    }
}
