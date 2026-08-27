package androidx.appcompat.view.menu;

import android.content.Context;
/* loaded from: classes.dex */
public abstract class nv1 {
    public static volatile ug0 a = ug0.a();
    public static final Object b = new Object();

    public static boolean a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L1b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r5.append(r6)
            return r1
        L1b:
            androidx.appcompat.view.menu.ug0 r6 = androidx.appcompat.view.menu.nv1.a
            boolean r6 = r6.c()
            if (r6 == 0) goto L30
            androidx.appcompat.view.menu.ug0 r5 = androidx.appcompat.view.menu.nv1.a
            java.lang.Object r5 = r5.b()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L30:
            java.lang.Object r6 = androidx.appcompat.view.menu.nv1.b
            monitor-enter(r6)
            androidx.appcompat.view.menu.ug0 r0 = androidx.appcompat.view.menu.nv1.a     // Catch: java.lang.Throwable -> L49
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            androidx.appcompat.view.menu.ug0 r5 = androidx.appcompat.view.menu.nv1.a     // Catch: java.lang.Throwable -> L49
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L49
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L49
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L49
            return r5
        L49:
            r5 = move-exception
            goto L97
        L4b:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L49
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L58
            goto L78
        L58:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L49
            r4 = 29
            if (r3 >= r4) goto L66
            r3 = r1
            goto L68
        L66:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L68:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L7f
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L49
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L7f
        L78:
            boolean r5 = a(r5)     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L7f
            r1 = 1
        L7f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L49
            androidx.appcompat.view.menu.ug0 r5 = androidx.appcompat.view.menu.ug0.d(r5)     // Catch: java.lang.Throwable -> L49
            androidx.appcompat.view.menu.nv1.a = r5     // Catch: java.lang.Throwable -> L49
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L49
            androidx.appcompat.view.menu.ug0 r5 = androidx.appcompat.view.menu.nv1.a
            java.lang.Object r5 = r5.b()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L97:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L49
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.nv1.b(android.content.Context, android.net.Uri):boolean");
    }
}
