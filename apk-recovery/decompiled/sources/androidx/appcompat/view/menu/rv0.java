package androidx.appcompat.view.menu;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class rv0 extends nv0 {
    public static final rv0 d = new rv0(p00.class);

    public rv0(Class cls) {
        super(cls);
    }

    public static rv0 l() {
        return d;
    }

    @Override // androidx.appcompat.view.menu.nv0
    public String d() {
        return "notification_manager";
    }

    public void f(int i, String str) {
        try {
            ((p00) c()).Y0(i, str, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void g(NotificationChannel notificationChannel) {
        try {
            ((p00) c()).a0(notificationChannel, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void h(NotificationChannelGroup notificationChannelGroup) {
        try {
            ((p00) c()).e0(notificationChannelGroup, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void i(String str) {
        try {
            ((p00) c()).p1(str, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void j(String str) {
        try {
            ((p00) c()).V(str, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void k(int i, String str, Notification notification) {
        try {
            ((p00) c()).R(i, str, notification, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public NotificationChannel m(String str) {
        try {
            return ((p00) c()).V0(str, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List n(String str) {
        try {
            return ((p00) c()).H0(str, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List o(String str) {
        try {
            return ((p00) c()).p(str, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
