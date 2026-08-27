package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.Map;
/* loaded from: classes.dex */
public class tz extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().f((Account) objArr[0]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class a0 extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Boolean.valueOf(dv0.p().I((Account) objArr[0]));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().g((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class b0 extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Boolean.valueOf(dv0.p().J((Account) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue()));
        }
    }

    /* loaded from: classes.dex */
    public static class c extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().h((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class c0 extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().K((Account) objArr[0], (String) objArr[1], (String) objArr[2]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Boolean.valueOf(dv0.p().i((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2]));
        }
    }

    /* loaded from: classes.dex */
    public static class d0 extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().M((Account) objArr[0], (String) objArr[1]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Boolean.valueOf(dv0.p().k((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2], (Map) objArr[3]));
        }
    }

    /* loaded from: classes.dex */
    public static class e0 extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().N((Account) objArr[0], (String) objArr[1], (String) objArr[2]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().l((Account) objArr[0]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class f0 extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().P((String[]) objArr[0], (String) objArr[1]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().m((IAccountManagerResponse) objArr[0], (Account) objArr[1], (Bundle) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class g0 extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().Q((Account) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue());
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().n((IAccountManagerResponse) objArr[0], (Account) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue());
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class h0 extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().R((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), (Bundle) objArr[4]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().o((IAccountManagerResponse) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().q((IAccountManagerResponse) objArr[0], (String) objArr[1], (String[]) objArr[2]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class k extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Integer.valueOf(dv0.p().r((Account) objArr[0], (String) objArr[1]));
        }
    }

    /* loaded from: classes.dex */
    public static class l extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return dv0.p().s((String) objArr[0], (String) objArr[1]);
        }
    }

    /* loaded from: classes.dex */
    public static class m extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return dv0.p().t((String) objArr[0]);
        }
    }

    /* loaded from: classes.dex */
    public static class n extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().v((IAccountManagerResponse) objArr[0], (String) objArr[1], (String[]) objArr[2]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class o extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return dv0.p().w((String) objArr[0], (String) objArr[1]);
        }
    }

    /* loaded from: classes.dex */
    public static class p extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return dv0.p().x((String) objArr[0], ((Integer) objArr[1]).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static class q extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().y((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class r extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().z((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class s extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return dv0.p().A();
        }
    }

    /* loaded from: classes.dex */
    public static class t extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return dv0.p().B((Account) objArr[0]);
        }
    }

    /* loaded from: classes.dex */
    public static class u extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return dv0.p().C((Account) objArr[0]);
        }
    }

    /* loaded from: classes.dex */
    public static class v extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return dv0.p().D((Account) objArr[0], (String) objArr[1]);
        }
    }

    /* loaded from: classes.dex */
    public static class w extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().E((String) objArr[0], (String) objArr[1]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class x extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return dv0.p().F((Account) objArr[0], (String) objArr[1]);
        }
    }

    /* loaded from: classes.dex */
    public static class y extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().G((String[]) objArr[0], (String) objArr[1]);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class z extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dv0.p().H((IAccountManagerResponse) objArr[0], (Account) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return 0;
        }
    }

    public tz() {
        super((IBinder) et0.c.b("account"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return sz.b.b(et0.c.b("account"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("account");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        e("getPassword", new u());
        e("getUserData", new v());
        e("getAuthenticatorTypes", new s());
        e("getAccountsForPackage", new p());
        e("getAccountsByTypeForPackage", new o());
        e("getAccountByTypeAndFeatures", new j());
        e("getAccountsByFeatures", new n());
        e("getAccountsAsUser", new m());
        e("addAccountExplicitly", new d());
        e("removeAccountAsUser", new z());
        e("removeAccountExplicitly", new a0());
        e("copyAccountToUser", new h());
        e("invalidateAuthToken", new w());
        e("peekAuthToken", new x());
        e("setAuthToken", new c0());
        e("setPassword", new d0());
        e("clearPassword", new f());
        e("setUserData", new e0());
        e("updateAppPermission", new g0());
        e("getAuthToken", new q());
        e("addAccount", new b());
        e("addAccountAsUser", new c());
        e("updateCredentials", new h0());
        e("editProperties", new i());
        e("confirmCredentialsAsUser", new g());
        e("accountAuthenticated", new a());
        e("getAuthTokenLabel", new r());
        e("getPackagesAndVisibilityForAccount", new t());
        e("addAccountExplicitlyWithVisibility", new e());
        e("setAccountVisibility", new b0());
        e("getAccountVisibility", new k());
        e("getAccountsAndVisibilityForPackage", new l());
        e("registerAccountListener", new y());
        e("unregisterAccountListener", new f0());
    }
}
