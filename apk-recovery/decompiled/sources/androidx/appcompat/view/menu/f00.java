package androidx.appcompat.view.menu;

import android.os.IBinder;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class f00 extends j8 {
    public f00() {
        super((IBinder) et0.c.b("appwidget"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return g00.b.b(et0.c.b("appwidget"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("appwidget");
    }

    @Override // androidx.appcompat.view.menu.ob, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        rd0.e(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        d(new b51("startListening", new int[0]));
        d(new b51("stopListening", 0));
        d(new b51("allocateAppWidgetId", 0));
        d(new b51("deleteAppWidgetId", 0));
        d(new b51("deleteHost", 0));
        d(new b51("deleteAllHosts", 0));
        d(new b51("getAppWidgetViews", null));
        d(new b51("getAppWidgetIdsForHost", null));
        d(new b51("createAppWidgetConfigIntentSender", null));
        d(new b51("updateAppWidgetIds", 0));
        d(new b51("updateAppWidgetOptions", 0));
        d(new b51("getAppWidgetOptions", null));
        d(new b51("partiallyUpdateAppWidgetIds", 0));
        d(new b51("updateAppWidgetProvider", 0));
        d(new b51("notifyAppWidgetViewDataChanged", 0));
        d(new b51("getInstalledProvidersForProfile", null));
        d(new b51("getAppWidgetInfo", null));
        Boolean bool = Boolean.FALSE;
        d(new b51("hasBindAppWidgetPermission", bool));
        d(new b51("setBindAppWidgetPermission", 0));
        d(new b51("bindAppWidgetId", bool));
        d(new b51("bindRemoteViewsService", 0));
        d(new b51("unbindRemoteViewsService", 0));
        d(new b51("getAppWidgetIds", new int[0]));
        d(new b51("isBoundWidgetPackage", bool));
    }
}
