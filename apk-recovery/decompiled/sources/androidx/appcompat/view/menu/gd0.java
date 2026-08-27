package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class gd0 implements r7 {
    public final a a;
    public final ei b;
    public final Map c;

    /* loaded from: classes.dex */
    public static class a {
        public final Context a;
        public Map b = null;

        public a(Context context) {
            this.a = context;
        }

        public static Bundle d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), PackageParser.PARSE_IS_PRIVILEGED)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public final Map a(Context context) {
            Bundle d = d(context);
            if (d == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        public q7 b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (q7) Class.forName(str2).asSubclass(q7.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", str2);
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", str2);
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", str2);
                return null;
            }
        }

        public final Map c() {
            if (this.b == null) {
                this.b = a(this.a);
            }
            return this.b;
        }
    }

    public gd0(Context context, ei eiVar) {
        this(new a(context), eiVar);
    }

    @Override // androidx.appcompat.view.menu.r7
    public synchronized f21 a(String str) {
        if (this.c.containsKey(str)) {
            return (f21) this.c.get(str);
        }
        q7 b = this.a.b(str);
        if (b == null) {
            return null;
        }
        f21 create = b.create(this.b.a(str));
        this.c.put(str, create);
        return create;
    }

    public gd0(a aVar, ei eiVar) {
        this.c = new HashMap();
        this.a = aVar;
        this.b = eiVar;
    }
}
