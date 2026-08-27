package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class q3 {
    public static volatile q3 d;
    public static final Object e = new Object();
    public final Context c;
    public final Set b = new HashSet();
    public final Map a = new HashMap();

    public q3(Context context) {
        this.c = context.getApplicationContext();
    }

    public static q3 e(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new q3(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public void a() {
        try {
            try {
                o11.c("Startup");
                b(this.c.getPackageManager().getProviderInfo(new ComponentName(this.c.getPackageName(), InitializationProvider.class.getName()), PackageParser.PARSE_IS_PRIVILEGED).metaData);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new vw0(e2);
            }
        } finally {
            o11.f();
        }
    }

    public void b(Bundle bundle) {
        String string = this.c.getString(an0.a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b50.class.isAssignableFrom(cls)) {
                            this.b.add(cls);
                        }
                    }
                }
                for (Class cls2 : this.b) {
                    d(cls2, hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new vw0(e2);
            }
        }
    }

    public Object c(Class cls) {
        Object obj;
        synchronized (e) {
            try {
                obj = this.a.get(cls);
                if (obj == null) {
                    obj = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final Object d(Class cls, Set set) {
        Object obj;
        if (o11.h()) {
            try {
                o11.c(cls.getSimpleName());
            } catch (Throwable th) {
                o11.f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.a.containsKey(cls)) {
            obj = this.a.get(cls);
        } else {
            set.add(cls);
            b50 b50Var = (b50) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            List<Class> a = b50Var.a();
            if (!a.isEmpty()) {
                for (Class cls2 : a) {
                    if (!this.a.containsKey(cls2)) {
                        d(cls2, set);
                    }
                }
            }
            obj = b50Var.b(this.c);
            set.remove(cls);
            this.a.put(cls, obj);
        }
        o11.f();
        return obj;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.b.contains(cls);
    }
}
