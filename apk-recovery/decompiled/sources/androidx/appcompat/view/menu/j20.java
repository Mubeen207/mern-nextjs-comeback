package androidx.appcompat.view.menu;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class j20 extends j8 {

    /* loaded from: classes.dex */
    public class a extends pd0 {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.f(objArr);
            rd0.i(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public j20() {
        super((IBinder) et0.c.b("permissionmgr"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return i20.b.b(et0.c.b("permissionmgr"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("permissionmgr");
        t1.d.d(obj2);
        PackageManager packageManager = (PackageManager) tg.d.c(t1.m.b(bv0.D(), new Object[0]));
        if (packageManager != null) {
            try {
                c4.c.e(packageManager, obj2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        d(new gi0("getPermissionInfo"));
        d(new gi0("getPermissionFlags"));
        d(new gi0("updatePermissionFlags"));
        d(new gi0("grantRuntimePermission"));
        d(new gi0("revokeRuntimePermission"));
        d(new gi0("shouldShowRequestPermissionRationale"));
        d(new gi0("isPermissionRevokedByPolicy"));
        d(new gi0("startOneTimePermissionSession"));
        d(new gi0("stopOneTimePermissionSession"));
        d(new gi0("setAutoRevokeExempted"));
        d(new gi0("isAutoRevokeExempted"));
        if (y8.j()) {
            d(new gi0("getAllowlistedRestrictedPermissions"));
            d(new gi0("addAllowlistedRestrictedPermission"));
            d(new gi0("removeAllowlistedRestrictedPermission"));
        } else if (Build.VERSION.SDK_INT == 31) {
            d(new gi0("revokePostNotificationPermissionWithoutKillForTest"));
        } else {
            d(new gi0("checkPermission"));
            d(new j31("checkUidPermission", 1));
            d(new gi0("getWhitelistedRestrictedPermissions"));
            d(new gi0("addWhitelistedRestrictedPermission"));
            d(new gi0("removeWhitelistedRestrictedPermission"));
            d(new gi0("setDefaultBrowser"));
            d(new gi0("grantDefaultPermissionsToActiveLuiApp"));
            e("checkDeviceIdentifierAccess", new a());
        }
    }
}
