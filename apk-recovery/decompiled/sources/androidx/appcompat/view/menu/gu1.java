package androidx.appcompat.view.menu;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class gu1 implements tu1 {
    public static final Map h = new o4();
    public static final String[] i = {"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public final ContentObserver d;
    public final Object e;
    public volatile Map f;
    public final List g;

    public gu1(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        ru1 ru1Var = new ru1(this, null);
        this.d = ru1Var;
        this.e = new Object();
        this.g = new ArrayList();
        qj0.i(contentResolver);
        qj0.i(uri);
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
        contentResolver.registerContentObserver(uri, false, ru1Var);
    }

    public static gu1 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        gu1 gu1Var;
        synchronized (gu1.class) {
            Map map = h;
            gu1Var = (gu1) map.get(uri);
            if (gu1Var == null) {
                try {
                    gu1 gu1Var2 = new gu1(contentResolver, uri, runnable);
                    try {
                        map.put(uri, gu1Var2);
                    } catch (SecurityException unused) {
                    }
                    gu1Var = gu1Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return gu1Var;
    }

    public static synchronized void d() {
        synchronized (gu1.class) {
            try {
                for (gu1 gu1Var : h.values()) {
                    gu1Var.a.unregisterContentObserver(gu1Var.d);
                }
                h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map b() {
        Map map = this.f;
        if (map == null) {
            synchronized (this.e) {
                try {
                    map = this.f;
                    if (map == null) {
                        map = f();
                        this.f = map;
                    }
                } finally {
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final /* synthetic */ Map c() {
        Cursor query = this.a.query(this.b, i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map o4Var = count <= 256 ? new o4(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                o4Var.put(query.getString(0), query.getString(1));
            }
            return o4Var;
        } finally {
            query.close();
        }
    }

    public final void e() {
        synchronized (this.e) {
            this.f = null;
            this.c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.g.iterator();
                if (it.hasNext()) {
                    my0.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map map = (Map) zu1.a(new xu1() { // from class: androidx.appcompat.view.menu.eu1
                @Override // androidx.appcompat.view.menu.xu1
                public final Object a() {
                    return gu1.this.c();
                }
            });
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.tu1
    public final /* synthetic */ Object h(String str) {
        return (String) b().get(str);
    }
}
