package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class tv0 extends nv0 {
    public static final tv0 d = new tv0(r00.class);

    public tv0(Class cls) {
        super(cls);
    }

    public static tv0 g() {
        return d;
    }

    public ResolveInfo A(Intent intent, String str, int i, int i2) {
        try {
            return ((r00) c()).D(intent, str, i, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public ResolveInfo B(Intent intent, int i, String str, int i2) {
        try {
            return ((r00) c()).W(intent, i, str, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    @Override // androidx.appcompat.view.menu.nv0
    public String d() {
        return "package_manager";
    }

    public final void f(Throwable th) {
        th.printStackTrace();
    }

    public ActivityInfo h(ComponentName componentName, int i, int i2) {
        try {
            return ((r00) c()).U1(componentName, i, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public ApplicationInfo i(String str, int i, int i2) {
        try {
            return ((r00) c()).c0(str, i, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public List j(int i, int i2) {
        try {
            return ((r00) c()).I0(i, i2);
        } catch (RemoteException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List k(int i, int i2) {
        try {
            return ((r00) c()).n1(i, i2);
        } catch (RemoteException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public Intent l(String str, int i) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.INFO");
        intent.setPackage(str);
        List w = w(intent, 0, intent.resolveTypeIfNeeded(bv0.m().getContentResolver()), i);
        if (w == null || w.size() <= 0) {
            intent.removeCategory("android.intent.category.INFO");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(str);
            w = w(intent, 0, intent.resolveTypeIfNeeded(bv0.m().getContentResolver()), i);
        }
        if (w == null || w.size() <= 0) {
            return null;
        }
        Intent intent2 = new Intent(intent);
        intent2.setFlags(268435456);
        intent2.setClassName(((ResolveInfo) w.get(0)).activityInfo.packageName, ((ResolveInfo) w.get(0)).activityInfo.name);
        return intent2;
    }

    public PackageInfo m(String str, int i, int i2) {
        try {
            return ((r00) c()).z1(str, i, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public String[] n(int i) {
        try {
            return ((r00) c()).l1(i, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    public ProviderInfo o(ComponentName componentName, int i, int i2) {
        try {
            return ((r00) c()).X1(componentName, i, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public ActivityInfo p(ComponentName componentName, int i, int i2) {
        try {
            return ((r00) c()).o2(componentName, i, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public ServiceInfo q(ComponentName componentName, int i, int i2) {
        try {
            return ((r00) c()).g1(componentName, i, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public int r(int i) {
        try {
            return ((r00) c()).f2(i);
        } catch (RemoteException e) {
            f(e);
            return -1;
        }
    }

    public p50 s(String str, o50 o50Var, int i) {
        try {
            return ((r00) c()).U0(str, o50Var, i);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public boolean t(String str, int i) {
        try {
            return ((r00) c()).F1(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List u(Intent intent, int i, String str, int i2) {
        try {
            return ((r00) c()).b0(intent, i, str, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public List v(String str, int i, int i2, int i3) {
        try {
            return ((r00) c()).g2(str, i, i2, i3);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public List w(Intent intent, int i, String str, int i2) {
        try {
            return ((r00) c()).W0(intent, i, str, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public List x(Intent intent, int i, int i2) {
        try {
            return ((r00) c()).O0(intent, i, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public ResolveInfo y(Intent intent, int i, String str, int i2) {
        try {
            return ((r00) c()).n(intent, i, str, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }

    public ProviderInfo z(String str, int i, int i2) {
        try {
            return ((r00) c()).z0(str, i, i2);
        } catch (RemoteException e) {
            f(e);
            return null;
        }
    }
}
