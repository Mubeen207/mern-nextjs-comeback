package androidx.appcompat.view.menu;

import android.location.ILocationListener;
import android.os.IBinder;
import android.os.IInterface;
import androidx.appcompat.view.menu.jo0;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
/* loaded from: classes.dex */
public class w10 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Arrays.asList("gps", "network");
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return qv0.l() ? "gps" : method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return qv0.l() ? qv0.f().i(mv0.N2(), mv0.E2()).b() : method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return qv0.l() ? qv0.f().i(mv0.N2(), mv0.E2()).b() : method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (qv0.l()) {
                return qv0.f().i(mv0.N2(), mv0.E2()).b();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            Object invoke = method.invoke(obj, objArr);
            if (qv0.l()) {
                jo0.b bVar = kl0.b;
                Boolean bool = Boolean.FALSE;
                bVar.e(invoke, bool);
                if (qv0.f().h(mv0.N2(), mv0.E2()) == null) {
                    kl0.c.e(invoke, bool);
                }
            }
            return invoke;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (qv0.l()) {
                Object c = rd0.c(objArr, y90.a.p());
                if (c != null) {
                    y90.b.b(c, new Object[0]);
                    p6 i = qv0.f().i(mv0.N2(), mv0.E2());
                    if (i != null) {
                        try {
                            String format = new SimpleDateFormat("HHmmss:SS", Locale.US).format(new Date());
                            String c2 = p6.c(i.d());
                            String c3 = p6.c(i.e());
                            String f = p6.f(i);
                            String i2 = p6.i(i);
                            String a = p6.a(String.format("$GPGGA,%s,%s,%s,%s,%s,1,%s,692,.00,M,.00,M,,,", format, c2, f, c3, i2, Integer.valueOf(i.b().getExtras().getInt("satellites"))));
                            String a2 = p6.a(String.format("$GPRMC,%s,A,%s,%s,%s,%s,0,0,260717,,,A,", format, c2, f, c3, i2));
                            y90.c.b(c, Long.valueOf(System.currentTimeMillis()), "$GPGSV,1,1,04,12,05,159,36,15,41,087,15,19,38,262,30,31,56,146,19,*73");
                            if (y8.c()) {
                                z90.b.b(c, Long.valueOf(System.currentTimeMillis()), "$GPGSV,1,1,04,12,05,159,36,15,41,087,15,19,38,262,30,31,56,146,19,*73");
                                z90.b.b(c, Long.valueOf(System.currentTimeMillis()), a);
                                z90.b.b(c, Long.valueOf(System.currentTimeMillis()), "$GPVTG,0,T,0,M,0,N,0,K,A,*25");
                                z90.b.b(c, Long.valueOf(System.currentTimeMillis()), a2);
                                z90.b.b(c, Long.valueOf(System.currentTimeMillis()), "$GPGSA,A,2,12,15,19,31,,,,,,,,,604,712,986,*27");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                return Boolean.TRUE;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            Object d;
            if (qv0.l() && (d = rd0.d(objArr, ILocationListener.Stub.class)) != null) {
                try {
                    aa0.b.e(d, new x90().l(aa0.b.b()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.h(objArr);
            if (qv0.l()) {
                return 0;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            Object obj2 = objArr[0];
            if (obj2 instanceof IInterface) {
                qv0.f().m(((IInterface) obj2).asBinder());
                return 0;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class k extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (qv0.l()) {
                Object obj2 = objArr[1];
                if (obj2 instanceof IInterface) {
                    qv0.f().n(((IInterface) obj2).asBinder());
                    return 0;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class l extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Boolean.valueOf(Objects.equals((String) objArr[0], "gps"));
        }
    }

    /* loaded from: classes.dex */
    public static class m extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public w10() {
        super((IBinder) et0.c.b("location"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return v10.b.b(et0.c.b("location"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("location");
    }

    @Override // androidx.appcompat.view.menu.ob, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        rd0.f(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        e("registerGnssStatusCallback", new g());
        e("registerLocationListener", new h());
        e("getLastLocation", new e());
        e("getLastKnownLocation", new d());
        e("getCurrentLocation", new c());
        e("requestLocationUpdates", new k());
        e("removeUpdates", new j());
        e("getProviderProperties", new f());
        e("removeGpsStatusListener", new i());
        e("getBestProvider", new b());
        e("getAllProviders", new a());
        e("isProviderEnabledForUser", new l());
        e("setExtraLocationControllerPackageEnabled", new m());
    }
}
