package androidx.appcompat.view.menu;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.util.ArrayMap;
import androidx.appcompat.view.menu.t1;
import androidx.appcompat.view.menu.vz;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class fg {
    public static final Set a = new HashSet();

    public static void a(Object obj) {
        if (!y8.d()) {
            ot0.b.e(obj, null);
            return;
        }
        Object c = pt0.b.c(obj);
        if (c != null) {
            mt0.b.e(c, null);
        }
    }

    public static void b() {
        Object b = rt0.b.b();
        if (b != null) {
            a(b);
        }
        Object b2 = qt0.b.b();
        if (b2 != null) {
            a(b2);
        }
        Object b3 = nt0.b.b();
        if (b3 != null) {
            a(b3);
        }
    }

    public static void c() {
        b();
        bv0.m().getContentResolver().call(Uri.parse("content://settings"), "", (String) null, (Bundle) null);
        for (Object obj : ((ArrayMap) t1.j.c(bv0.D())).values()) {
            String[] strArr = (String[]) t1.e.b.c(obj);
            if (strArr != null && strArr.length > 0) {
                String str = strArr[0];
                Set set = a;
                if (!set.contains(str)) {
                    set.add(str);
                    t1.e.c.e(obj, new ig().m((IInterface) t1.e.c.c(obj), bv0.o()));
                    t1.e.b.e(obj, new String[]{str});
                }
            }
        }
    }

    public static void d(Object obj, String str) {
        IInterface l;
        IInterface iInterface = y8.d() ? (IInterface) gg.b.c(obj) : (IInterface) vz.a.c.c(obj);
        if (iInterface instanceof Proxy) {
            return;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 103772132:
                if (str.equals("media")) {
                    c = 0;
                    break;
                }
                break;
            case 783201304:
                if (str.equals("telephony")) {
                    c = 1;
                    break;
                }
                break;
            case 1434631203:
                if (str.equals("settings")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                l = new zy0().l(iInterface, bv0.o());
                break;
            default:
                l = new ig().m(iInterface, bv0.o());
                break;
        }
        if (y8.d()) {
            gg.b.e(obj, l);
        } else {
            vz.a.c.e(obj, l);
        }
    }
}
