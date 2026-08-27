package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import androidx.appcompat.view.menu.e1;
import androidx.appcompat.view.menu.t1;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class ry implements o10, Handler.Callback {
    public Handler.Callback l;
    public final AtomicBoolean m = new AtomicBoolean(false);

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        Handler.Callback e = e();
        return (e == null || e == this) ? false : true;
    }

    @Override // androidx.appcompat.view.menu.o10
    public void b() {
        Handler.Callback e = e();
        this.l = e;
        if (e != null && (e == this || e.getClass().getName().equals(getClass().getName()))) {
            this.l = null;
        }
        sy.b.e(d(), this);
    }

    public final void c() {
        try {
            Object b = e1.d.b(new Object[0]);
            if (b instanceof Proxy) {
                return;
            }
            uz uzVar = new uz(b);
            uzVar.k(true);
            uzVar.b();
            e1.a.b.e(e1.b.c(e1.c.b(new Object[0])), uzVar.g());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final Handler d() {
        return (Handler) t1.g.c(bv0.D());
    }

    public final Handler.Callback e() {
        return (Handler.Callback) sy.b.c(d());
    }

    public final Object f(Object obj) {
        for (Object obj2 : (List) bc.b.c(obj)) {
            if (k80.a.p().getName().equals(obj2.getClass().getCanonicalName())) {
                return obj2;
            }
        }
        return null;
    }

    public final boolean g(Object obj) {
        if (mv0.D2() != null) {
            String E2 = mv0.E2();
            ServiceInfo serviceInfo = (ServiceInfo) t1.c.b.c(obj);
            if (!serviceInfo.name.equals(nl0.i(mv0.F2())) && !serviceInfo.name.equals(nl0.g(mv0.F2()))) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(E2, serviceInfo.name));
                bv0.j().E(intent, null, false, mv0.N2());
                return true;
            }
        }
        return false;
    }

    public final boolean h(Object obj) {
        Intent intent;
        IBinder iBinder;
        ll0 a;
        ActivityInfo activityInfo;
        Object f = y8.e() ? f(obj) : obj;
        if (f == null) {
            return false;
        }
        if (y8.e()) {
            intent = (Intent) k80.c.c(f);
            iBinder = (IBinder) bc.c.c(obj);
        } else {
            intent = (Intent) t1.a.d.c(f);
            iBinder = (IBinder) t1.a.e.c(f);
        }
        if (intent != null && (activityInfo = (a = ll0.a(intent)).b) != null) {
            if (mv0.D2() == null) {
                bv0.j().y(activityInfo.packageName, activityInfo.processName, a.a);
                Intent l = bv0.u().l(activityInfo.packageName, a.a);
                intent.setExtrasClassLoader(getClass().getClassLoader());
                ll0.b(intent, l, a.b, a.d, a.a);
                if (y8.e()) {
                    k80.c.e(f, intent);
                    k80.b.e(f, activityInfo);
                } else {
                    t1.a.d.e(f, intent);
                    t1.a.c.e(f, activityInfo);
                }
                return true;
            } else if (!mv0.B2().S2()) {
                mv0.B2().x2(activityInfo.packageName, activityInfo.processName);
                return true;
            } else {
                bv0.j().r(((Integer) vz.b.b(l1.c.b(new Object[0]), iBinder, Boolean.FALSE)).intValue(), iBinder, a.d);
                int i = Build.VERSION.SDK_INT;
                if (i == 31 || (i == 30 && Build.VERSION.PREVIEW_SDK_INT == 1)) {
                    Object b = t1.n.b(bv0.D(), iBinder);
                    t1.a.d.e(b, a.c);
                    t1.a.c.e(b, activityInfo);
                    t1.a.g.e(b, mv0.B2().L2());
                    c();
                } else if (y8.e()) {
                    k80.c.e(f, a.c);
                    k80.b.e(f, activityInfo);
                } else {
                    t1.a.d.e(f, a.c);
                    t1.a.c.e(f, activityInfo);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x0020, B:10:0x0028, B:18:0x005d, B:20:0x006d, B:23:0x0079, B:25:0x007d, B:13:0x0039, B:15:0x0049, B:17:0x0051), top: B:31:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #0 {all -> 0x0088, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x0020, B:10:0x0028, B:18:0x005d, B:20:0x006d, B:23:0x0079, B:25:0x007d, B:13:0x0039, B:15:0x0049, B:17:0x0051), top: B:31:0x000a }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.m
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            r2 = 0
            if (r0 != 0) goto L8d
            boolean r0 = androidx.appcompat.view.menu.y8.e()     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L39
            int r0 = r5.what     // Catch: java.lang.Throwable -> L88
            androidx.appcompat.view.menu.jo0$b r3 = androidx.appcompat.view.menu.t1.d.c     // Catch: java.lang.Throwable -> L88
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L88
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L88
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L88
            if (r0 != r3) goto L5d
            java.lang.Object r0 = r5.obj     // Catch: java.lang.Throwable -> L88
            boolean r0 = r4.h(r0)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L5d
            android.os.Handler r0 = r4.d()     // Catch: java.lang.Throwable -> L88
            android.os.Message r5 = android.os.Message.obtain(r5)     // Catch: java.lang.Throwable -> L88
            r0.sendMessageAtFrontOfQueue(r5)     // Catch: java.lang.Throwable -> L88
        L33:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.m
            r5.set(r2)
            return r1
        L39:
            int r0 = r5.what     // Catch: java.lang.Throwable -> L88
            androidx.appcompat.view.menu.jo0$b r3 = androidx.appcompat.view.menu.t1.d.d     // Catch: java.lang.Throwable -> L88
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L88
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L88
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L88
            if (r0 != r3) goto L5d
            java.lang.Object r0 = r5.obj     // Catch: java.lang.Throwable -> L88
            boolean r0 = r4.h(r0)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L5d
            android.os.Handler r0 = r4.d()     // Catch: java.lang.Throwable -> L88
            android.os.Message r5 = android.os.Message.obtain(r5)     // Catch: java.lang.Throwable -> L88
            r0.sendMessageAtFrontOfQueue(r5)     // Catch: java.lang.Throwable -> L88
            goto L33
        L5d:
            int r0 = r5.what     // Catch: java.lang.Throwable -> L88
            androidx.appcompat.view.menu.jo0$b r1 = androidx.appcompat.view.menu.t1.d.b     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L88
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L88
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L88
            if (r0 != r1) goto L79
            java.lang.Object r5 = r5.obj     // Catch: java.lang.Throwable -> L88
            boolean r5 = r4.g(r5)     // Catch: java.lang.Throwable -> L88
        L73:
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.m
            r0.set(r2)
            return r5
        L79:
            android.os.Handler$Callback r0 = r4.l     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L82
            boolean r5 = r0.handleMessage(r5)     // Catch: java.lang.Throwable -> L88
            goto L73
        L82:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.m
            r5.set(r2)
            return r2
        L88:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.m
            r5.set(r2)
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ry.handleMessage(android.os.Message):boolean");
    }
}
