package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class jw1 implements tu1 {
    public static final Map g = new o4();
    public final SharedPreferences a;
    public final Runnable b;
    public final SharedPreferences.OnSharedPreferenceChangeListener c;
    public final Object d;
    public volatile Map e;
    public final List f;

    public jw1(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: androidx.appcompat.view.menu.pw1
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                jw1.this.d(sharedPreferences2, str);
            }
        };
        this.c = onSharedPreferenceChangeListener;
        this.d = new Object();
        this.f = new ArrayList();
        this.a = sharedPreferences;
        this.b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return sharedPreferences;
            }
            if (cu1.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(str.substring(12), 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static jw1 b(Context context, String str, Runnable runnable) {
        jw1 jw1Var;
        if (!cu1.a() || str.startsWith("direct_boot:") || cu1.c(context)) {
            synchronized (jw1.class) {
                try {
                    Map map = g;
                    jw1Var = (jw1) map.get(str);
                    if (jw1Var == null) {
                        jw1Var = new jw1(a(context, str), runnable);
                        map.put(str, jw1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return jw1Var;
        }
        return null;
    }

    public static synchronized void c() {
        synchronized (jw1.class) {
            try {
                for (jw1 jw1Var : g.values()) {
                    jw1Var.a.unregisterOnSharedPreferenceChangeListener(jw1Var.c);
                }
                g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.d) {
            this.e = null;
            this.b.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f.iterator();
                if (it.hasNext()) {
                    my0.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.tu1
    public final Object h(String str) {
        Map<String, ?> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                try {
                    map = this.e;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        Map<String, ?> all = this.a.getAll();
                        this.e = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
