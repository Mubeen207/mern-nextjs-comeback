package androidx.appcompat.view.menu;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class rt1 {
    public static HashMap g;
    public static Object l;
    public static boolean m;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean e = new AtomicBoolean();
    public static ContentResolver f = null;
    public static final HashMap h = new HashMap(16, 1.0f);
    public static final HashMap i = new HashMap(16, 1.0f);
    public static final HashMap j = new HashMap(16, 1.0f);
    public static final HashMap k = new HashMap(16, 1.0f);
    public static String[] n = new String[0];

    /* loaded from: classes.dex */
    public interface a {
        Map e(int i);
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (rt1.class) {
            try {
                if (g == null) {
                    e.set(false);
                    g = new HashMap(16, 1.0f);
                    l = new Object();
                    m = false;
                    contentResolver.registerContentObserver(a, true, new yt1(null));
                } else if (e.getAndSet(false)) {
                    g.clear();
                    h.clear();
                    i.clear();
                    j.clear();
                    k.clear();
                    l = new Object();
                    m = false;
                }
                Object obj = l;
                if (g.containsKey(str)) {
                    String str3 = (String) g.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : n) {
                    if (str.startsWith(str4)) {
                        if (!m) {
                            HashMap hashMap = (HashMap) b(contentResolver, n, new wt1());
                            if (hashMap != null) {
                                if (!hashMap.isEmpty()) {
                                    Set keySet = hashMap.keySet();
                                    keySet.removeAll(h.keySet());
                                    keySet.removeAll(i.keySet());
                                    keySet.removeAll(j.keySet());
                                    keySet.removeAll(k.keySet());
                                }
                                if (!hashMap.isEmpty()) {
                                    if (g.isEmpty()) {
                                        g = hashMap;
                                    } else {
                                        g.putAll(hashMap);
                                    }
                                }
                                m = true;
                            }
                            if (g.containsKey(str)) {
                                String str5 = (String) g.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
                if (query == null) {
                    if (query != null) {
                    }
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        d(obj, str, null);
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    d(obj, str, string);
                    if (string != null) {
                        return string;
                    }
                    return null;
                } finally {
                    query.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Map b(ContentResolver contentResolver, String[] strArr, a aVar) {
        Cursor query = contentResolver.query(b, null, null, strArr, null);
        if (query == null) {
            return null;
        }
        Map e2 = aVar.e(query.getCount());
        while (query.moveToNext()) {
            try {
                e2.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return e2;
    }

    public static void d(Object obj, String str, String str2) {
        synchronized (rt1.class) {
            try {
                if (obj == l) {
                    g.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
