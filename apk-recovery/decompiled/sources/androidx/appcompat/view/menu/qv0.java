package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class qv0 extends nv0 {
    public static final qv0 d = new qv0(o00.class);

    public qv0(Class cls) {
        super(cls);
    }

    public static qv0 f() {
        return d;
    }

    public static boolean l() {
        return f().k(mv0.N2(), mv0.E2()) != 0;
    }

    @Override // androidx.appcompat.view.menu.nv0
    public String d() {
        return "location_manager";
    }

    public List g(int i, String str) {
        try {
            return ((o00) c()).p2(i, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public n6 h(int i, String str) {
        try {
            return ((o00) c()).h2(i, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public p6 i(int i, String str) {
        try {
            return ((o00) c()).B(i, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List j(int i, String str) {
        try {
            return ((o00) c()).J0(i, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int k(int i, String str) {
        try {
            return ((o00) c()).K0(i, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void m(IBinder iBinder) {
        try {
            ((o00) c()).x(iBinder);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void n(IBinder iBinder) {
        try {
            ((o00) c()).k0(iBinder, mv0.E2(), mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
