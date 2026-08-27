package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class ta1 {
    public static final int a = Process.myUid();
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Method g;
    public static final Method h;
    public static final Method i;

    /* JADX WARN: Can't wrap try/catch for region: R(24:1|(2:2|3)|4|(21:47|48|7|8|9|10|11|12|13|(12:39|40|16|(9:35|36|19|(6:31|32|22|(2:27|28)|24|25)|21|22|(0)|24|25)|18|19|(0)|21|22|(0)|24|25)|15|16|(0)|18|19|(0)|21|22|(0)|24|25)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            androidx.appcompat.view.menu.ta1.a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L18
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L18
            r5[r3] = r6     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r5 = r4
        L19:
            androidx.appcompat.view.menu.ta1.b = r5
            boolean r5 = androidx.appcompat.view.menu.ti0.c()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L31
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L31
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L31
            r5[r3] = r8     // Catch: java.lang.Exception -> L31
            r5[r2] = r6     // Catch: java.lang.Exception -> L31
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L31
            goto L32
        L31:
            r0 = r4
        L32:
            androidx.appcompat.view.menu.ta1.c = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L3d
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L3d
            goto L3e
        L3d:
            r0 = r4
        L3e:
            androidx.appcompat.view.menu.ta1.d = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L4d
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4d
            r0[r3] = r5     // Catch: java.lang.Exception -> L4d
            java.lang.String r5 = "get"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: java.lang.Exception -> L4d
            goto L4e
        L4d:
            r0 = r4
        L4e:
            androidx.appcompat.view.menu.ta1.e = r0
            boolean r0 = androidx.appcompat.view.menu.ti0.c()
            if (r0 == 0) goto L63
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L63
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L63
            r0[r3] = r5     // Catch: java.lang.Exception -> L63
            java.lang.String r5 = "getName"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: java.lang.Exception -> L63
            goto L64
        L63:
            r0 = r4
        L64:
            androidx.appcompat.view.menu.ta1.f = r0
            boolean r0 = androidx.appcompat.view.menu.ti0.i()
            if (r0 == 0) goto L75
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L75
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L75
            goto L76
        L75:
            r0 = r4
        L76:
            androidx.appcompat.view.menu.ta1.g = r0
            boolean r0 = androidx.appcompat.view.menu.ti0.i()
            if (r0 == 0) goto L93
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L93
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L93
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L93
            r5[r3] = r7     // Catch: java.lang.Exception -> L93
            r5[r2] = r6     // Catch: java.lang.Exception -> L93
            java.lang.String r6 = "addNode"
            java.lang.reflect.Method r0 = r0.getMethod(r6, r5)     // Catch: java.lang.Exception -> L93
            goto L94
        L93:
            r0 = r4
        L94:
            androidx.appcompat.view.menu.ta1.h = r0
            boolean r0 = androidx.appcompat.view.menu.ti0.i()
            if (r0 == 0) goto La7
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> La7
            java.lang.reflect.Method r4 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> La7
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> La7
        La7:
            androidx.appcompat.view.menu.ta1.i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ta1.<clinit>():void");
    }

    public static void a(WorkSource workSource, int i2, String str) {
        Method method = c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i2), str);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        Method method2 = b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo c2 = va1.a(context).c(str, 0);
                if (c2 == null) {
                    "Could not get applicationInfo from package: ".concat(str);
                    return null;
                }
                int i2 = c2.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i2, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                "Could not find package: ".concat(str);
            }
        }
        return null;
    }

    public static boolean c(Context context) {
        return (context == null || context.getPackageManager() == null || va1.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }
}
