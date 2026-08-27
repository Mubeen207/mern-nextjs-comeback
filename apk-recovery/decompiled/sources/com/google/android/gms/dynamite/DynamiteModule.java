package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import androidx.appcompat.view.menu.ey;
import androidx.appcompat.view.menu.kc2;
import androidx.appcompat.view.menu.me2;
import androidx.appcompat.view.menu.p92;
import androidx.appcompat.view.menu.pj0;
import androidx.appcompat.view.menu.rd2;
import androidx.appcompat.view.menu.ym1;
import androidx.appcompat.view.menu.zf0;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class DynamiteModule {
    public static Boolean h = null;
    public static String i = null;
    public static boolean j = false;
    public static int k = -1;
    public static Boolean l;
    public static rd2 q;
    public static me2 r;
    public final Context a;
    public static final ThreadLocal m = new ThreadLocal();
    public static final ThreadLocal n = new ym1();
    public static final b.a o = new com.google.android.gms.dynamite.a();
    public static final b b = new com.google.android.gms.dynamite.b();
    public static final b c = new c();
    public static final b d = new d();
    public static final b e = new e();
    public static final b f = new f();
    public static final b g = new g();
    public static final b p = new h();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public /* synthetic */ a(String str, kc2 kc2Var) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th, kc2 kc2Var) {
            super(str, th);
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0058b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        C0058b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        pj0.i(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (zf0.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb = new StringBuilder();
            sb.append("Module descriptor id '");
            sb.append(valueOf);
            sb.append("' didn't match expected id '");
            sb.append(str);
            sb.append("'");
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Local module descriptor class for ");
            sb2.append(str);
            sb2.append(" not found.");
            return 0;
        } catch (Exception e2) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage()));
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return e(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule d(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.b r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x014b, code lost:
        if (i(r11) != false) goto L39;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x018d -> B:135:0x0192). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x018f -> B:135:0x0192). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.n     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            r12.<init>()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            if (r10 == 0) goto La9
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            if (r11 == 0) goto La9
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            if (r12 <= 0) goto L90
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.dynamite.DynamiteModule.i = r2     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L70
            if (r2 < 0) goto L72
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.dynamite.DynamiteModule.k = r2     // Catch: java.lang.Throwable -> L70
            goto L72
        L70:
            r11 = move-exception
            goto L8e
        L72:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L70
            if (r2 < 0) goto L85
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L81
            goto L82
        L81:
            r9 = r11
        L82:
            com.google.android.gms.dynamite.DynamiteModule.j = r9     // Catch: java.lang.Throwable -> L70
            r11 = r9
        L85:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L70
            boolean r1 = i(r10)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            if (r1 == 0) goto L90
            r10 = r0
            goto L90
        L8e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L70
            throw r11     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
        L90:
            if (r13 == 0) goto La3
            if (r11 != 0) goto L95
            goto La3
        L95:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            throw r11     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
        L9d:
            r11 = move-exception
            goto La1
        L9f:
            r11 = move-exception
            goto Lb7
        La1:
            r0 = r10
            goto Lc4
        La3:
            if (r10 == 0) goto La8
            r10.close()
        La8:
            return r12
        La9:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            throw r11     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
        Lb1:
            r10 = move-exception
            r11 = r10
            goto Lc4
        Lb4:
            r10 = move-exception
            r11 = r10
            r10 = r0
        Lb7:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch: java.lang.Throwable -> L9d
            if (r12 == 0) goto Lbc
            throw r11     // Catch: java.lang.Throwable -> L9d
        Lbc:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> L9d
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch: java.lang.Throwable -> L9d
            throw r12     // Catch: java.lang.Throwable -> L9d
        Lc4:
            if (r0 == 0) goto Lc9
            r0.close()
        Lc9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static DynamiteModule g(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    public static void h(ClassLoader classLoader) {
        me2 me2Var;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                me2Var = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                me2Var = queryLocalInterface instanceof me2 ? (me2) queryLocalInterface : new me2(iBinder);
            }
            r = me2Var;
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (InstantiationException e4) {
            e = e4;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (NoSuchMethodException e5) {
            e = e5;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (InvocationTargetException e6) {
            e = e6;
            throw new a("Failed to instantiate dynamite loader", e, null);
        }
    }

    public static boolean i(Cursor cursor) {
        p92 p92Var = (p92) m.get();
        if (p92Var == null || p92Var.a != null) {
            return false;
        }
        p92Var.a = cursor;
        return true;
    }

    public static boolean j(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(l)) {
            return true;
        }
        boolean z = false;
        if (l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (ey.f().h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            l = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                j = true;
            }
        }
        return z;
    }

    public static rd2 k(Context context) {
        rd2 rd2Var;
        synchronized (DynamiteModule.class) {
            rd2 rd2Var2 = q;
            if (rd2Var2 != null) {
                return rd2Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    rd2Var = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    rd2Var = queryLocalInterface instanceof rd2 ? (rd2) queryLocalInterface : new rd2(iBinder);
                }
                if (rd2Var != null) {
                    q = rd2Var;
                    return rd2Var;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
            }
            return null;
        }
    }

    public IBinder c(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }
}
